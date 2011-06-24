package cap3;

import javax.inject.Inject;
import javax.inject.Named;

public class SimpleBean {
	
	@Inject
	@Named("inietta")
	private Iniettato injected;

	
	public Iniettato getInjected() {
		return injected;
	}

	public void setInjected(Iniettato injected) {
		this.injected= injected;
	}

}
