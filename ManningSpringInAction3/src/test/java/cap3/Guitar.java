package cap3;

import org.springframework.stereotype.Component;


@Component("chitarra")
public class Guitar implements Instrument{
	
	public void play() {
		System.out.println("Strum strum strum");
	}
}
