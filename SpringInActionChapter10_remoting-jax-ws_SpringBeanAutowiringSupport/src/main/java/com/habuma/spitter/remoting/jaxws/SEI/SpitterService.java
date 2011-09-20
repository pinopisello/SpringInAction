package com.habuma.spitter.remoting.jaxws.SEI;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface SpitterService {

  List<Spittle> getRecentSpittles(int count);

  void saveSpittle(Spittle spittle);

  void saveSpitter(Spitter spitter);

  Spitter getSpitterById(long id);

  void startFollowing(Spitter follower, Spitter followee);

  List<Spittle> getSpittlesForSpitterBySpitter(Spitter spitter);

  List<Spittle> getSpittlesForSpitter(String username);

  Spitter getSpitter(String username);

  Spittle getSpittleById(long id);

  void deleteSpittle(long id);

  List<Spitter> getAllSpitters();
}
