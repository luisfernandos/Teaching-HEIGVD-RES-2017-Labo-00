package ch.heigvd.res.lab00;

/**
 * @author zeller quentin qrzeller
 */

public class  Bugle implements IInstruments{

    Bugle(){}

    String play(){
        return "pouetpouet";
    }

    int getSoundVolume(){
        return 20;
    }

    String getColor(){
        return "Shine like a diamond";
    }

}