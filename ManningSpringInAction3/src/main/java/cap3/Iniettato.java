package cap3;

import org.springframework.beans.factory.annotation.Value;


public class Iniettato {
	
	@Value("#{systemEnvironment.JAVA_HOME}")
	private String val ="iniettato";
	
	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}

	
}
