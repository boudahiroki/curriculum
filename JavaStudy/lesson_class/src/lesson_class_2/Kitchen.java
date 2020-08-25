package lesson_class_2;

public class Kitchen extends Staff {
	public static int count_Kitchen_Staff = 0;
	public int count_Kitchen_Staff_non = 0;

	public Kitchen(String name_data, int age_data) {
		super(name_data, age_data);
		// TODO 自動生成されたコンストラクター・スタブ

		this.count_Kitchen_Staff++;
		this.count_Kitchen_Staff_non++;
		super.count_Staff++;
	}
	public String cooking (String order) {
		System.out.println(name + "は" + order + "を作った");
		return order;
	}
	public void dishWashing() {
		System.out.println("皿を3枚洗った");
	}

}
