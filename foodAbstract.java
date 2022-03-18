public class foodAbstract {
	public static void main(String [] args) {
		fruit apple = new fruit("Apple", 40, "Spring");
		System.out.println(apple.totalcalories(4) + "calories");
		liquid drink = new liquid("Soda", 20, 2);
		System.out.println(drink.totalcalories(2) + "calories");
		}
	}

	abstract class food {
		String description;
		int calories;
		
		public food(String name, int calories) {
			description = name;this.calories = calories;
		}
		public abstract int totalcalories(int sering);
	}

	class liquid extends food{
		int viscosity;
		
		public liquid(String name, int calories, int viscosity) {
			super(name, calories);this.viscosity = viscosity;
		}
		public int totalcalories(int serving) {
			return serving * super.calories;
		}
	}

	class fruit extends food{
		String season;
		
		public fruit(String name, int calories, String Season) {
			super(name, calories);
			this.season = season;
		}
		public int totalcalories(int serving) {
			return serving * super.calories;
		}
}