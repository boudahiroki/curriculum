package lesson_class_2;

public class Staff {
	public String affiliation_store = "赤坂店";
	public int hourly_wage = 1100;
	public String name;
	public int age;

	public static int count_Staff = 0;

	public Staff (String name_data, int age_data) {
		this.name = name_data;
		this.age = age_data;
	}

	public void dishWashing() {
		System.out.println("皿を1枚洗った");
	}

	public static void printStaffNum(int staff_num_data) {
		System.out.println(staff_num_data + "人");
	}

}
