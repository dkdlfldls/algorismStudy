package builderPattern;

public class BuilderPatternTest {
	
	public static void main(String[] args) {
		TestClass.Builder builder = new TestClass.Builder();
		try {
			TestClass testClass = builder.withInt(10).withStr("sss").build();
			System.out.println(testClass.toString());
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
	}
}
