package ch.heigvd.res.lab00;

public class ThumbPiano implements IInstrument {

	private String sound;

	public ThumbPiano() {
		sound = "cling";
		
	}

	public String play() {
		return sound;
	}
}