package ch.heigvd.res.lab00;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lognaume
 */
public class SteelDrum implements IInstrument {

    @Override
    public String play() {
        return "drum-drum";
    }

    @Override
    public int getSoundVolume() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getColor() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
