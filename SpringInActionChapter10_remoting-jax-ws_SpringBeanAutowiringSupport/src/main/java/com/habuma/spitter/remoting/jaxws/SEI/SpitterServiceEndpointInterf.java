package com.habuma.spitter.remoting.jaxws.SEI;

import java.util.List;

import com.habuma.spitter.domain.Spitter;
import com.habuma.spitter.domain.Spittle;


public interface SpitterServiceEndpointInterf  {


  public void addSpittle(Spittle spittle) ;


  public void deleteSpittle(long spittleId) ;

 
  public List<Spittle> getRecentSpittles(int spittleCount) ;

 
  public List<Spittle> getSpittlesForSpitter(Spitter spitter) ;
  
}
