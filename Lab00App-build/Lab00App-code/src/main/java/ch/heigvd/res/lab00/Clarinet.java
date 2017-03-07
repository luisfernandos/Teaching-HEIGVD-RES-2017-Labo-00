/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author Lara Chauffoureaux
 */
public class Clarinet implements IInstrument {

   private String color = "black";
   private String sound = "fiii";	
   private int soundVolume = 5;

   @Override
   public String play() {

      return sound;

   }

   @Override
   public int getSoundVolume() {

      return soundVolume;

   }


   @Override
   public String getColor() {

      return color;

   }
}
