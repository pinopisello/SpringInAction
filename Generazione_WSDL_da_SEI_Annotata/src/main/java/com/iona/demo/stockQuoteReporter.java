package com.iona.demo;

import java.util.*;

public class stockQuoteReporter implements quoteReporter {

	public Quote getQuote(String ticker) {
		Quote retVal = new Quote();
		retVal.setID(ticker);
		retVal.setVal(1);
		Date retDate = new Date();
		retVal.setTime(retDate.toString());
		return (retVal);
	}
}