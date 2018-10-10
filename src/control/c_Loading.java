/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.logging.Level;
import java.util.logging.Logger;
import view.Menu;
import view.Loading;


/**
 *
 * @author Habibullah
 */
public class c_Loading {
    public static void main(String[] args) {
        Menu m = new Menu();
        Loading l = new Loading();
        l.setVisible(true);
        
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(50);
                l.P.setText(Integer.toString(i)+"%");
                l.LBar.setValue(i);
                if(i==100){
                    l.setVisible(false);
                    m.setVisible(true);
                }
            }
            } catch (InterruptedException e) {  
            }
        
    }

}
