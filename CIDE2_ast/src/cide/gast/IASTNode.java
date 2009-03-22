package cide.gast;

import java.util.List;

public interface IASTNode {

	public void accept(IASTVisitor visitor);

	public Property getProperty(String name);

	public ISourceFile getRoot();

	public IASTNode getParent();

	public String getId();
	
	public void setId(String id);

	public int getStartPosition();

	public int getLength();

	public IASTNode deepCopy();

	public String getDisplayName();

	public boolean isOptional();

	public Property getLocationInParent();

	public void notifyPropertyChanged(Property property);

	/**
	 * ATTENTION: Never call from outside this package!
	 * 			  Never call from a Property!
	 *
	 * @param parentNode
	 * @param parentProperty
	 */
	void setParent(IASTNode parentNode, Property parentProperty);
	
	void setParentProperty(Property parentProperty);

	public List<Property> getProperties();

	public String render();

	public void remove();
	
	/**
	 * Ersetzt diesen Knoten durch den gegebenen Knoten.
	 * 
	 * ACHTUNG: Die �nderungen von Offsets, die durch ein Austauschen eines Knotens passieren k�nnen, werden
	 * 			NICHT durchgef�hrt, so dass der AST unbrauchbar werden k�nnte.
	 * 			Zur Zeit wird diese Methode nur auf einer DeepCopy des AST ausgef�hrt, die dann gerendered wird.
	 * 
	 * @param newNode
	 */
	public void replaceSubtreeWith(IASTNode newNode);
	
	public List<IASTNode> getChildren();
}
