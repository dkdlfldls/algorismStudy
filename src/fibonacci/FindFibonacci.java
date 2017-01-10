package fibonacci;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import algorism.interfaces.SimpleInput;

public class FindFibonacci {
	
	private List<Integer> cacheList;
	private SimpleInput in;
	
	public FindFibonacci() {
		cacheList = new LinkedList<Integer>();
		cacheList.add(0);
		cacheList.add(1);
		in = new SimpleInput();
	}
	//[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]

	@Test
	public void test() throws Exception {
		int caseNum = in.readInt();
		int goal = alternativeFibonacci(caseNum);
		System.out.println(goal);
	}
	
	public int alternativeFibonacci(int caseNum) throws Exception {
		if (caseNum < 0) {
			throw new Exception("input number is wrong");
		}
		
		if (cacheList.get(caseNum) == null) {
			return cacheList.get(caseNum);
		}
		if (cacheList.get(caseNum -1) != null && cacheList.get(caseNum - 2) != null) {
			cacheList.add(cacheList.get(caseNum - 1) + cacheList.get(caseNum - 2));
			return cacheList.get(caseNum - 1) + cacheList.get(caseNum - 2);
		}
		return alternativeFibonacci(caseNum -1) + alternativeFibonacci(caseNum - 2);
	}
}
