/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package players;

import TUIO.TuioCursor;
import TUIO.TuioListener;
import TUIO.TuioObject;
import TUIO.TuioTime;
import base.Player;
import java.awt.Point;

/**
 *
 * @author roland
 */
public class TouchPlayer extends Player implements TuioListener{
    private Point fingerLocation ; 
    private boolean hasFingerOnTable ;    

    @Override
    public void addTuioObject(TuioObject to) {
       
    }

    @Override
    public void updateTuioObject(TuioObject to) {
        
    }

    @Override
    public void removeTuioObject(TuioObject to) {
        
    }

    @Override
    public void addTuioCursor(TuioCursor tc) {
        
    }

    @Override
    public void updateTuioCursor(TuioCursor tc) {
        
    }

    @Override
    public void removeTuioCursor(TuioCursor tc) {
        
    }

    @Override
    public void refresh(TuioTime tt) {
        
    }
}
