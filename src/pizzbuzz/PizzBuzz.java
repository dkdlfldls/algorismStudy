package pizzbuzz;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.junit.Test;

public class PizzBuzz {
	
	private BufferedReader br;
	
	public PizzBuzz() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	
	@Test
	public void test() {
		int limitNum = inputLimitNum();
		alternativePizzBuzz(limitNum);
	}
	
	public void alternativePizzBuzz(int limit) {
		String temp;
		for (int i = 1; i <= limit; i++) {
			temp = toWord(i, 3, "Pizz") + toWord(i, 5, "Buzz");
			if (temp.isEmpty()) {
				temp = String.valueOf(i);
			}
			System.out.println(temp);
		}
	}
	
	private String toWord(int num, int divisor, String word) {
		return (num % divisor == 0) ? word : "";
	}
	
	public int inputLimitNum() {
		String enteredStr = inputString();
		
		return convertStrToInt(enteredStr);
		
	}
	
	private String inputString() {
		try {
			return br.readLine();
		} catch (Exception e) {
			return null;
		}
	}
	
	private int convertStrToInt(String str) {
		int limitNum;
		try {
			limitNum = Integer.parseInt(str);
		} catch (Exception e) {
			limitNum = 0;
		}
		return limitNum;
	}
	
}
