/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;
import java.util.List;

/**
 *
 * @author macbook
 */
public class MyThread extends Thread{
    Bandeau band;
    List<ScenarioElement> myElements;
    
    
    public MyThread(Bandeau band, List<ScenarioElement> myElements) {
        this.band=band;
        this.myElements=myElements;
        
    }
     public void run(){
         synchronized(band){
         for (ScenarioElement element: myElements){
             for (int repeats = 0; repeats <element.repeats; repeats++) {
                 element.effect.playOn(band);
             }
             
         }
        }
     }
    
    
    
    
}
