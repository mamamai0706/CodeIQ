import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Masuipeo0513 {

	static int input; //入力したノード数

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print("ノード数を入力してください。：");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try{
			String buf = br.readLine();
			input = Integer.parseInt(buf);
		}catch(Exception e){
			input = 0;
		}

		for (int i=0;i<input;i++){
			HumanNode node = new HumanNode(i);
			System.out.println(node.getId());
		}
	}

}
