package factory;
import abstractfactory.AbstractDrink;

public class Drink extends AbstractDrink{

	public Drink(final String name) {
		super(name);
	}

	@Override
	public String makeItem() {
		// TODO 自動生成されたメソッド・スタブ
		return m_name + "は飲み物です。";
	}

}
