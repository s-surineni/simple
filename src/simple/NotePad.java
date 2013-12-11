/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//tutorial for notepad
//http://www.dreamincode.net/forums/topic/66176-creating-a-basic-notepad-application/
package simple;

import javax.swing.JFrame;

/**
 *
 * @author mc13mt49
 */
public class NotePad {
    public static void main(String[] args){
        NotePad n1=new NotePad();
    }
    public NotePad(){
        JFrame mi=new JFrame("Simple Notepad");
        mi.setSize(200,300);
        mi.setVisible(true);
        mi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
