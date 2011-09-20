package com.habuma.spitter.remoting.jaxws.SEI;

import java.util.List;


public class SpitterServiceInterfImpl implements SpitterService{

	public SpitterServiceInterfImpl(){
		System.out.println("SpitterServiceInterfImpl costruttore");
	}
	
	@Override
	public List<Spittle> getRecentSpittles(int count) {
		System.out.println("getRecentSpittles");
		return null;
	}

	@Override
	public void saveSpittle(Spittle spittle) {
		System.out.println("saveSpittle");
		
	}

	@Override
	public void saveSpitter(Spitter spitter) {
		System.out.println("saveSpittle");
		
	}

	@Override
	public Spitter getSpitterById(long id) {
		System.out.println("getSpitterById");
		return null;
	}

	@Override
	public void startFollowing(Spitter follower, Spitter followee) {
		System.out.println("startFollowing");
		
	}

	@Override
	public List<Spittle> getSpittlesForSpitterBySpitter(Spitter spitter) {
		System.out.println("getSpittlesForSpitterBySpitter");
		return null;
	}

	@Override
	public List<Spittle> getSpittlesForSpitter(String username) {
		System.out.println("getSpittlesForSpitter");
		return null;
	}

	@Override
	public Spitter getSpitter(String username) {
		System.out.println("getSpitter");
		return null;
	}

	@Override
	public Spittle getSpittleById(long id) {
		System.out.println("getSpittleById");
		return null;
	}

	@Override
	public void deleteSpittle(long id) {
		System.out.println("deleteSpittle");
		
	}

	@Override
	public List<Spitter> getAllSpitters() {
		System.out.println("getAllSpitters");
		return null;
	}

}
