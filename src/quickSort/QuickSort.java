package quickSort;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import algorism.interfaces.Runner;
import algorism.interfaces.Sort;

public class QuickSort implements Runner, Sort<int[]> {

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Test
	@Override
	public void testRun() {
		List<Integer> numbers = new ArrayList<>();
		List<Integer> expected = new ArrayList<>();
		numbers.add(8);
		numbers.add(5);
		numbers.add(6);
		numbers.add(3);
		numbers.add(1);
		numbers.add(2);
		numbers.add(4);
		numbers.add(7);
		System.out.println(numbers);
		System.out.println(quickSort(numbers));
		
	}
	
	@Override
	public int[] sort(int[] t) {
		
		return null;
	}
	
	public List<Integer> quickSort(List<Integer> numbers) {
		//3 4 5 1 2 
		if (numbers.size() < 2) {
			return numbers;
		}
		
		int pivot = numbers.get(0);
		List<Integer> lowerList = new ArrayList<>();
		List<Integer> higherList = new ArrayList<>();
		
		for (int i = 1; i < numbers.size(); i++) {
			if (pivot > numbers.get(i)) {
				lowerList.add(numbers.get(i));
			} else {
				higherList.add(numbers.get(i));
			}
		}
		
		List<Integer> sortedList = quickSort(lowerList);
		sortedList.add(pivot);
		sortedList.addAll(quickSort(higherList));
		return sortedList;
	}

}
