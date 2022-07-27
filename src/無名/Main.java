package 無名;
import abstractfactory.AbstractDrink;
import abstractfactory.AbstractFactory;
import abstractfactory.AbstractFood;
public class Main {

	public static void main(String[] args) {
		final AbstractFactory factory = AbstractFactory.getFactory("listfactory.Factory");
		
		final AbstractFood food = factory.createFood("ブラックサンダー");
		final AbstractDrink drink  = factory.createDrink("コカコーラ");
		System.out.println(food.makeItem());
		System.out.println(drink.makeItem());

	}
}
