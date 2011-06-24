package org.springframework.reference.cap3;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component
public class SimpleComponent {

	public SimpleComponent(){
		System.out.println("SimpleComponent constr");
	}
	
	
}
