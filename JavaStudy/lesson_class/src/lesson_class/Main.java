package lesson_class;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Chef meatdish = new Chef("肉料理");
		String meat_dish = meatdish.grill("米沢牛");
		
		Waiter waiter = new Waiter();
		waiter.serving(meat_dish);

	}

}
