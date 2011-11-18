package com.habuma.spitter.remoting.jaxws.SEI;

import com.habuma.spitter.remoting.jaxws.server.Spitter;




public class AutowiredBean implements SpitterService{

	public AutowiredBean(){
		System.out.println("SpitterServiceInterfImpl costruttore");
	}

	@Override
	public Spitter getSpitterById(long id) {
		System.out.println("getSpitterById");
		Spitter out = new Spitter(); 
		out.setFullName("nome pieno");
		out.setPassword("parola d ordine");
		return out;
	}


}
