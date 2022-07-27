package abstractfactory;

public abstract class AbstractFactory {
	public static AbstractFactory getFactory(final String classname) {
		AbstractFactory factory = null;
		try {
			factory = (AbstractFactory)Class.forName(classname).getDeclaredConstructor().newInstance();
		}catch(ClassNotFoundException e) {
			String.format("%sが見つかりませんでした", classname);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return factory;
	}
	
	public abstract AbstractFood createFood(final String name);
	public abstract AbstractDrink createDrink(final String name);

}
