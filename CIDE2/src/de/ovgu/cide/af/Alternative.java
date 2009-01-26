package de.ovgu.cide.af;

import java.util.List;
import java.util.Set;

import de.ovgu.cide.features.IFeature;

/**
 * Einfache Struktur zur Repraesentation einer Alternative, z.B. eines alternativen Sourcecode-Fragments
 * 
 * @author Malte Rosenthal
 */
public class Alternative {

	/**
	 * ID der Alternative
	 */
	public String altID;
	
	/**
	 * ID der zugrunde liegenden Entit�t (z.B. ID des AST-Knotens)
	 */
	public String entityID;
	
	/**
	 * Liste von IDs der Eltern-Entit�ten
	 */
	public List<String> entityParentIDs;
	
	/**
	 * Menge von Features, mit der die Alternative annotiert ist
	 */
	public Set<IFeature> features;
	
	/**
	 * Text der Alternative, z.B. Sourcecode
	 */
	public String text;
	
	/**
	 * Indikator: Alternative ist aktiv
	 */
	public boolean isActive;
	
	public Alternative(String altID, String entityID, List<String> entityParentIDs, Set<IFeature> features) {
		this.altID = altID;
		this.entityID = entityID;
		this.entityParentIDs = entityParentIDs;
		this.features = features;
		
		this.text = null;
		this.isActive = true;
	}
	
	public Alternative setEntityID(String entityID) {
		this.entityID = entityID;
		return this;
	}
	
	public Alternative setActive(boolean isActive) {
		this.isActive = isActive;
		return this;
	}
	
	public Alternative setText(String text) {
		this.text = text;
		return this;
	}
}
