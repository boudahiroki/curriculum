package lesson_class_2;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Kitchen airo = new Kitchen("Y口I郎", 24);
		Hall aiko = new Hall("Y林I子", 21);

		int Kitchen_Staff_num = Kitchen.count_Kitchen_Staff;
		System.out.println(Kitchen_Staff_num + "人");

		int Kitchen_Staff_non_num = airo.count_Kitchen_Staff_non;
		System.out.println(Kitchen_Staff_non_num + "人");

		Kitchen jeiro = new Kitchen("Y口J郎", 22);

		Kitchen_Staff_num = Kitchen.count_Kitchen_Staff;
		System.out.println(Kitchen_Staff_num + "人");

		Kitchen_Staff_non_num = jeiro.count_Kitchen_Staff_non;
		System.out.println(Kitchen_Staff_non_num + "人");

		int count_Staff = Staff.count_Staff;
		Staff.printStaffNum(count_Staff);

		System.out.println(airo.affiliation_store);

		String order_1 = aiko.order("ビール");
		String order_2 = aiko.order("カシスオレンジ");
		String order_3 = aiko.order("厚焼き玉子");
		aiko.serving(order_1, order_2);
		String dish = airo.cooking(order_3);
		aiko.serving(dish);
	}

}
