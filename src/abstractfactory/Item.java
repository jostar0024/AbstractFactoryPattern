package abstractfactory;

public abstract class Item {
	protected final String m_name;
	
	public Item(final String name) {
		m_name = name;
	}
	
	public abstract String makeItem();	
}
