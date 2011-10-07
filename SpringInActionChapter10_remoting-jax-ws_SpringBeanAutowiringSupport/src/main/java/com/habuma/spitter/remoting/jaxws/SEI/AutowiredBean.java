package com.habuma.spitter.remoting.jaxws.SEI;

import java.util.List;

import com.habuma.spitter.remoting.jaxws.server.Spitter;
import com.habuma.spitter.remoting.jaxws.server.Spittle;



public class AutowiredBean implements SpitterService{

	public AutowiredBean(){
		System.out.println("SpitterServiceInterfImpl costruttore");
	}

	@Override
	public Spitter getSpitterById(long id) {
		System.out.println("getSpitterById");
		Spitter out = new Spitter(); 
		out.setFullName("Creato da AutowiredBean.getSpitterById");
		return out;
	}


}
