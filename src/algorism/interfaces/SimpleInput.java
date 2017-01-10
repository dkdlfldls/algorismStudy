package algorism.interfaces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SimpleInput implements MyInput{
	BufferedReader br;
	
	public SimpleInput() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	@Override
	public int readInt() {
		try {
			return Integer.parseInt(br.readLine());
		} catch (Exception e) {
			return 0;
		}
	}

	@Override
	public String readStr() {
		try {
			return br.readLine();
		} catch (Exception e) {
			return null;
		}
	}
	
}
