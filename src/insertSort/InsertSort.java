package insertSort;

import static org.junit.Assert.assertArrayEquals;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import algorism.interfaces.Runner;
import algorism.interfaces.Sort;

public class InsertSort implements Runner, Sort<int[]> {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Test
	@Override
	public void testRun() {
		// TODO Auto-generated method stub
		int[] numbers = {3,4,5,2,1};
		int[] expected = {1,2,3,4,5};
		
		int[] result = sort(numbers);
		for (int i : result) {
			System.out.print(i + " ");
		}
		assertArrayEquals(expected, result);
	}
	
	@Override
	public int[] sort(int[] t) {
		List<Integer> list = new LinkedList<>();
		
		for (int number : t) {
			if (!list.isEmpty()) {
				for (int i = 0 ; i < list.size(); i++) {
					if (number < list.get(i)) {
						list.add(i, number);
						break;
					}
					list.add(number);
					break;
				}
			} else {
				list.add(number);
			}
			
		}
		
		return convertListToArray(list);
	}
	
	public int[] convertListToArray(List<Integer> list) {
		int[] array = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			array[i] = list.get(i);
		}
		
		return array;
	}
	

}
