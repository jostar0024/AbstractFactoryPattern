package factory;

import abstractfactory.AbstractDrink;
import abstractfactory.AbstractFactory;
import abstractfactory.AbstractFood;

public class Factory extends AbstractFactory{

	@Override
	public AbstractFood createFood(final String name) {
		// TODO 自動生成されたメソッド・スタブ
		return new Food(name);
	}

	@Override
	public AbstractDrink createDrink(final String name) {
		// TODO 自動生成されたメソッド・スタブ
		return new Drink(name);
	}

}
