package util;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputString {

	static int input;

	public InputString() {
		this.input = 0;
	}

	public static int inputString() {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try{
			String buf = br.readLine();
			input = Integer.parseInt(buf);
		}catch(Exception e){
			input = 0;
		}

	}




}
