package ch.heigvd.res.lab00;

/**
 *
 * @author dorianekaffo
 */
public class Trumpet implements IInstrument {
    private String sound = "pouet";
    public String play(){
      return this.sound;  
    }

    @Override
    public int getSoundVolume() {
        return 15;
    }
    
    public String getColor() {
        return "golden";
    }
}
