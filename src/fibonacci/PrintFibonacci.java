package fibonacci;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import algorism.interfaces.SimpleInput;

public class PrintFibonacci {
	private SimpleInput in;
	
	public PrintFibonacci() {
		in = new SimpleInput();
	}
	
	@Test
	public void test() {
		int caseNum = in.readInt();
		printFibonacci(caseNum);
	}
	
	public void printFibonacci(int index) {
		List<Integer> resultList = getFibonacciList(index);
		System.out.println(resultList.toString());
	}
	
	public List<Integer> getFibonacciList(int index) {
		if (index == 0) {
			return new ArrayList<Integer>();
		}
		if (index == 1) {
			return Arrays.asList(0);
		}
		if (index == 2) {
			return Arrays.asList(0,1);
		}
		
		List<Integer> list = new ArrayList<>(index);
		list.add(0);
		list.add(1);
		index--;
		index--;
		while(index > 0) {
			list.add(list.get(list.size() - 1) + list.get(list.size() - 2));
			index--;
		}
		return list;
	}
}
