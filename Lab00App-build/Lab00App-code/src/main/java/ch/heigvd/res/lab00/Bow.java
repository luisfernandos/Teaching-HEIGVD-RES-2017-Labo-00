package ch.heigvd.res.lab00;

/**
 * labo00
 * Implementation of class Bow and an interface IInstrument
 * @author Jérémie Zanone
 */

interface IInstrument{
	public int getSoundVolume();
	public String play();
	public String getColor();
}

public class Bow implements IInstrument {

	public Bow() {
	}

	public String play() {
		return "puet";
	}


	public String getColor() {
		return "wooden";
	}

}

