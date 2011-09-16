package com.habuma.spitter.remoting.jaxws.SEI;

import java.util.List;

import javax.jws.WebMethod;

public interface SpitterService {
  @WebMethod
  List<Spittle> getRecentSpittles(int count);
  
  @WebMethod
  void saveSpittle(Spittle spittle);
  @WebMethod
  void saveSpitter(Spitter spitter);
  @WebMethod
  Spitter getSpitterById(long id);
  @WebMethod
  void startFollowing(Spitter follower, Spitter followee);
  @WebMethod
  List<Spittle> getSpittlesForSpitterBySpitter(Spitter spitter);
  @WebMethod
  List<Spittle> getSpittlesForSpitter(String username);
  @WebMethod
  Spitter getSpitter(String username);
  @WebMethod
  Spittle getSpittleById(long id);
  @WebMethod
  void deleteSpittle(long id);
  @WebMethod
  List<Spitter> getAllSpitters();
}
