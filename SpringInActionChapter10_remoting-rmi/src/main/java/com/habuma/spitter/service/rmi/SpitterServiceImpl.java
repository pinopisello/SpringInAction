package com.habuma.spitter.service.rmi;

import java.util.ArrayList;
import java.util.List;

import com.habuma.spitter.domain.Spitter;
import com.habuma.spitter.domain.Spittle;
import com.habuma.spitter.service.SpitterService;

public class SpitterServiceImpl implements SpitterService {

	public List<Spittle> getRecentSpittles(int count) {
		List<Spittle> out = new ArrayList<Spittle>();
		return null;
	}

	public void saveSpittle(Spittle spittle) {
		System.out.println(spittle.getText());
		
	}

	public void saveSpitter(Spitter spitter) {
		System.out.println(spitter.getFullName());
		
	}

	public Spitter getSpitter(long id) {
		Spitter out = new Spitter();
		out.setFullName("pippo");
		return out;
	}

	public void startFollowing(Spitter follower, Spitter followee) {
		// TODO Auto-generated method stub
		
	}

	public List<Spittle> getSpittlesForSpitter(Spitter spitter) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Spittle> getSpittlesForSpitter(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	public Spitter getSpitter(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	public Spittle getSpittleById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteSpittle(long id) {
		// TODO Auto-generated method stub
		
	}

	public List<Spitter> getAllSpitters() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
