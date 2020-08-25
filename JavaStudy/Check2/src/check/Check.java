package check;
import constants.Constants;

public class Check {

	//フィールド変数firstNameとlastNameを宣言し、自分の名前で初期化
	private String firstName = "坊田";
	private String lastName = "裕貴";
	//firstNameとlastNameを連結させるメソッド
	private String printName() {
		return firstName + lastName;
	}
	//連結させたprintNameを出力するメソッド
	public void print() {
		System.out.println("printNameメソッド → " + printName());
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//インスタンスを作成
		Check pn = new Check();
		pn.print();

		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		pet.introduce();

		RobotPet rob = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		rob.introduce();
	}

}
