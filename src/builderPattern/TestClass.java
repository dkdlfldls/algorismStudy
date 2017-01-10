package builderPattern;

public class TestClass {
	
	private int intField;
	private String StringField;
	
	private TestClass(int i, String str) {
		this.intField = i;
		this.StringField = str;
	}
	
	public static class Builder {
		private Integer intField;
		private String StringField;
		
		public Builder withInt(int i) {
			intField = i;
			return this;
		}
		
		public Builder withStr(String str) {
			StringField = str;
			return this;
		}
		
		public TestClass build() throws Exception {
			if (intField == null || StringField == null) {
				throw new Exception("error");
			}
			return new TestClass(this.intField, this.StringField);
			  
		}
	}

	public int getIntField() {
		return intField;
	}

	public void setIntField(int intField) {
		this.intField = intField;
	}

	public String getStringField() {
		return StringField;
	}

	public void setStringField(String stringField) {
		StringField = stringField;
	}

	@Override
	public String toString() {
		return "TestClass [intField=" + intField + ", StringField=" + StringField + "]";
	}
	
	
	
}
