package factory;
import abstractfactory.AbstractFood;

public class Food extends AbstractFood {
	public Food(final String name) {
		super(name);
	}

	@Override
	public String makeItem() {
		return m_name + "は食品です。";
	}

}
