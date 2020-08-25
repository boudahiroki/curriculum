package lesson_class_2;

public class Hall extends Staff {

	public Hall(String name_data, int age_data) {
		super(name_data, age_data);
		// TODO 自動生成されたコンストラクター・スタブ
		super.count_Staff++;
	}

	public String order (String order) {
		System.out.println(name + "は" + order + "の注文を受けた");
		return order;
	}
	 public void serving (String dish) {
		 System.out.println(name + "は" + dish + "を運んだ");
	 }

	 public void serving (String dish_1, String dish_2) {
		 System.out.println(name + "は" + dish_1 + "と" + dish_2 + "を運んだ");
	 }

}
