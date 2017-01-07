package mergeSort;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import algorism.interfaces.Runner;
import algorism.interfaces.Sort;

public class MergeSort implements Runner, Sort<List<Integer>>{



	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Test
	@Override
	public void testRun() {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(8);
		numbers.add(5);
		numbers.add(6);
		numbers.add(3);
		numbers.add(1);
		numbers.add(2);
		numbers.add(4);
		numbers.add(7);
		
		System.out.println(numbers);
		System.out.println(sort(numbers));
		
	}
	
	@Override
	public List<Integer> sort(List<Integer> t) {
		if (t.size() < 2) {
			return t;
		}
		int middle = t.size() / 2;
		
		List<Integer> leftList = t.subList(0, middle);
		List<Integer> rightList = t.subList(middle, t.size());
		
		return merge(sort(leftList), sort(rightList));
	}
	
	public List<Integer> merge(List<Integer> leftList, List<Integer> rightList) {
		 int leftPtr = 0;
		 int rightPtr = 0;
		 List<Integer> mergedList = new ArrayList<>();
		 
		 while(leftPtr < leftList.size() && rightPtr < rightList.size()) {
			 if(leftList.get(leftPtr) < rightList.get(rightPtr)) {
				 mergedList.add(leftList.get(leftPtr));
				 leftPtr++;
			 } else {
				 mergedList.add(rightList.get(rightPtr));
				 rightPtr++;
			 }
		 }
		 
		 //list의 남은 element추가 / add remained element of list
		 while(leftPtr < leftList.size()) {
			 mergedList.add(leftList.get(leftPtr));
			 leftPtr++;
		 }
		 while(rightPtr < rightList.size()) {
			 mergedList.add(rightList.get(rightPtr));
			 rightPtr++;
		 }
		
		return mergedList;
	}
}
