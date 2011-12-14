package com.habuma.spitter.remoting.jaxws.SEI;

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
		out.setFullName("nome pieno");
		out.setPassword("parola d ordine");
		return out;
	}

	public Spittle getSpittleById(long id) {
		return null;
	}
	
	public Spitter getSpitterByFullName(String fullName) {
		return null;
	}
}
