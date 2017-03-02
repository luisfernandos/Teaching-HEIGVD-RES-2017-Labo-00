/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author arthur
 */
public class Maracas {
 
    
    
	private int soundVolume = 18;
	private String color = "brown";
	private String sound = "TshTsh";

	public String getColor(){

		return color;	
	}

	public String play(){

		return sound;
	}

	public int getSoundVolume(){

			return soundVolume;
		}
}

