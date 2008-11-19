package de.ovgu.cide.typing.list;

import java.util.Set;

import cide.gast.IASTNode;
import de.ovgu.cide.features.IFeature;
import de.ovgu.cide.features.IFeatureModel;
import de.ovgu.cide.typing.model.IEvaluationStrategy;

/**
 * this is a simple subset strategy for the List feature model. A implies B if A
 * has less or the same colors than B.
 * 
 * the check is so simple that caching is not needed
 * 
 * 
 * @author ckaestne
 * 
 */
public class SubsetStrategy implements IEvaluationStrategy {

	public boolean equal(IFeatureModel featureModel, Set<IFeature> source,
			Set<IFeature> target) {
		return source.equals(target);
	}

	public boolean implies(IFeatureModel featureModel, Set<IFeature> source,
			Set<IFeature> target) {
		return source.containsAll(target);
	}

	public void clearCache(IFeatureModel featureModel) {
		// not needed
	}

}
