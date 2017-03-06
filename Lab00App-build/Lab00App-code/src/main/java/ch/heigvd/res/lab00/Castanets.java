package ch.heigvd.res.lab00;

interface IInstrument {
	public int getSoundVolume();
	public String play();
	public String getColor();
}

public class castanets implements IInstrument {


	public castanets() 
	{
		volume = 10;
		sound = "chiki chiki";
		color = "golden";
	}
	
	public int getSoundVolume() 
	{
		return volume;
	}
	
	public String play() 
	{
		return sound;
	}


	public String getColor() {
		return color;
	}
 
	private int volume;
	private String sound;
	private String color;

}
	
