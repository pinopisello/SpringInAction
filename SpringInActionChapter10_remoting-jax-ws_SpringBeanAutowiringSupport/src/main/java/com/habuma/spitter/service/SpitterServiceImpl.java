package com.habuma.spitter.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.habuma.spitter.domain.Spitter;
import com.habuma.spitter.domain.Spittle;

@Service("spitterService")
public class SpitterServiceImpl implements SpitterService {

  public void saveSpittle(Spittle spittle) {
  
  }

 
  public List<Spittle> getRecentSpittles(int count) {
	  return null;
  }
  
  public void saveSpitter(Spitter spitter){
		  System.out.println("");
  }

  
  
  public Spitter getSpitter(long id) {
    return null;
  }

  public void startFollowing(Spitter follower, Spitter followee) {
    // TODO Auto-generated method stub  
  }
  
  public List<Spittle> getSpittlesForSpitter(Spitter spitter) {
	  return null;
  }

  public List<Spittle> getSpittlesForSpitter(String username) {
	  return null;
  }

  public Spitter getSpitter(String username) {
	  return null;
  }

  public void deleteSpittle(long id) {
    
  }
  
  public List<Spitter> getAllSpitters() {
	  return null;
  }

  public Spittle getSpittleById(long id) {
	  return null;
  }
}
