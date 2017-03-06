package ch.heigvd.res.lab00;

interface IInstrument {

	public String play();
}

public class ThumbPiano implements IInstrument {

	private String sound;

	public ThumbPiano() {
		sound = "cling";
		
	}

	public String play() {
		return sound;
	}
}