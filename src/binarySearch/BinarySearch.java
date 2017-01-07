package binarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import algorism.interfaces.Runner;
import algorism.interfaces.Search;

public class BinarySearch implements Search<Integer>, Runner {


	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Test
	@Override
	public void testRun() {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(5);
		numbers.add(7);
		numbers.add(10);
		numbers.add(15);
		numbers.add(17);
		numbers.add(20);
		numbers.add(21);
		//System.out.println(numbers.subList(5, numbers.size()));
		//System.out.println(search(numbers, 1));
		System.out.println(search(numbers, 3));
		System.out.println(search(numbers, 25));
		System.out.println(search(numbers, 21));
		
		
	}

	@Override
	public Integer search(List<Integer> list, Integer value) {
		int pivot = list.size() / 2;
		Integer temp;
		
		if (list.size() == 1 && list.get(0) != value) {
			return null;
		}
		
		while(list.get(pivot) != value) {
			if (list.get(pivot) > value) {
				if ((temp = search(list.subList(0, pivot), value)) == null) {
					return null;
				}
				pivot = temp;
			} else if(list.get(pivot) <= value){
				if ((temp = search(list.subList(pivot, list.size()), value)) == null) {
					return null;
				}
				pivot += search(list.subList(pivot, list.size()), value);
			}
		}
		return pivot;
	}

}
