/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.logging.Level;
import java.util.logging.Logger;
import view.v_Menu;
import view.v_Loading;


/**
 *
 * @author Habibullah
 */
public class c_Loading {
    public static void main(String[] args) {
        v_Menu m = new v_Menu();
        v_Loading l = new v_Loading();
        l.setVisible(true);
        
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(25);
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
