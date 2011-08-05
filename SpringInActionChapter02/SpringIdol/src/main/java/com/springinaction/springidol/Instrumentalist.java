package com.springinaction.springidol;


public class Instrumentalist implements Performer {
  public Instrumentalist() {}
  
  public void perform() throws PerformanceException {
    System.out.print("Playing " + song + " : ");
    instrument.play();
  }
  
  public String getSong() {
	return song;
}

private String song;
  public void setSong(String song) {
    this.song = song;
  }
  
  private Instrument instrument;
  public void setInstrument(Instrument instrument) {
    this.instrument = instrument;
  }
  
  public String selectSong(){
	  return "pippo";
  }
  
}
