import util.InputString;

public class Masuipeo0513 {

	static int input; //入力したノード数

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print("ノード数を入力してください。：");
		input = InputString.inputString();

		//入力された数だけノード作成
		for (int i=0;i<input;i++){
			HumanNode node = new HumanNode(i);
			System.out.println(node.getId());
		}


	}

}
