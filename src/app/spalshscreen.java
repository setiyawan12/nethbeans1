/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;
/**
 *
 * @author setiyawan
 */
public class spalshscreen {
        public static void main(String[] args) {
        StartProgram sp = new StartProgram();
        sp.setVisible(true);
        Login menu = new Login();
        
        try {
            for (int i = 0; i<=50; i++){
                
                Thread.sleep(i);
                sp.txtTime.setText(Integer.toString(i)+"%");
                
                if (i == 50){
                    sp.setVisible(false);
                    menu.setVisible(true);
                }
            }
        } catch (Exception e) {
        }
    }  

    
}
