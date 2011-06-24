package com.apress.coupling;

import javax.annotation.Resource;

public class SimpleMovieLister {
	
	private MovieFinder movieFinder;
	
	@Resource
	public void setMovieFinder(MovieFinder tuoMovieFinder) {
		this.movieFinder = movieFinder;
	}
}
