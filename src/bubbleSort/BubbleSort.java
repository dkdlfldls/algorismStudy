package bubbleSort;

import static org.junit.Assert.*;

import org.junit.Test;

import algorism.interfaces.Runner;

public class BubbleSort implements Runner {

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
	
	public int[] sort(int[] array) {
		
		boolean numberSwitch;
		int temp;
		do {
			numberSwitch = false;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					numberSwitch = true;
				}
			}
		} while(numberSwitch);
		
		return array;
	}

}
