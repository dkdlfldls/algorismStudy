package algorism3020;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Main main = new Main();
		main.run();
	}

	public void run() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] option = br.readLine().split(" ");
		int caseNum = Integer.parseInt(option[0]);
		int high = Integer.parseInt(option[1]);
		
		Map<String, Integer> downStone = new TreeMap<>();
		initMap(downStone, high);
		Map<String, Integer> upStone = new TreeMap<>();
		initMap(upStone, high);
		
		List<Integer> result = new ArrayList<>(high);
		
		String input;
		for (int i = 0; i < caseNum; i++) {
			input = br.readLine();
			if (i % 2 == 0) {
				downStone.put(input, downStone.get(input) + 1);
			} else {
				upStone.put(input, downStone.get(input) + 1);
			}
		}
		
		int temp;
		for (int i = 0; i < high; i++) {
			temp = downStone.get(String.valueOf(i)) + upStone.get(String.valueOf(high - i));
			result.add(temp);
		}
		System.out.println(result);
		
	}
	
	public void initMap(Map<String, Integer> map, int high) {
		for (int i = 1; i < high; i++) {
			map.put(String.valueOf(i), 0);
		}
	}
	
}
