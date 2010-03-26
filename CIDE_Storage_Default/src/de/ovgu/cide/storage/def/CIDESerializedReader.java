package de.ovgu.cide.storage.def;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import de.ovgu.cide.features.FeatureModelNotFoundException;
import de.ovgu.cide.features.IFeature;
import de.ovgu.cide.features.IFeatureModelWithID;

/**
 * can read the old serialized format used until March 2010.
 * 
 * @author ckaestne
 * 
 */
public class CIDESerializedReader {

	final static long serialVersionUID = 2l;

	/**
	 * the features themselfs are not serialized, only their IDs. this method
	 * does the serialization
	 * 
	 * @param out
	 * @param featureModel
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 * @throws FeatureModelNotFoundException
	 */
	@SuppressWarnings("unchecked")
	static HashMap<String, Set<IFeature>> loadFeatureMap(ObjectInputStream out,
			IFeatureModelWithID featureModel) throws IOException,
			ClassNotFoundException {
		HashMap<String, Set<Long>> storedMap = (HashMap<String, Set<Long>>) out
				.readObject();

		HashMap<String, Set<IFeature>> result = emptyMap();
		for (Map.Entry<String, Set<Long>> entry : storedMap.entrySet()) {
			Set<Long> colorIds = entry.getValue();
			if (!colorIds.isEmpty()) {
				Set<IFeature> features = new HashSet<IFeature>();
				for (long id : colorIds) {
					IFeature feature = featureModel.getFeature(id);
					if (feature != null)
						features.add(feature);
					else
						System.out.println("Unknown feature: "
								+ id);
				}
				if (!features.isEmpty())
					result.put(entry.getKey(), features);
			}
		}
		return result;
	}

	private static HashMap<String, Set<IFeature>> emptyMap() {
		return new HashMap<String, Set<IFeature>>();
	}
}
