/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//tutorial for notepad
//http://www.dreamincode.net/forums/topic/66176-creating-a-basic-notepad-application/
package simple;

import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author mc13mt49
 */
public class NotePad extends JFrame implements ActionListener{
    
    private TextArea textArea=new TextArea("",0,0,TextArea.SCROLLBARS_VERTICAL_ONLY);

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /*public static void main(String[] args){
        NotePad n1=new NotePad();
    }
    public NotePad(){
        JFrame mi=new JFrame("Simple Notepad");
        mi.setSize(200,300);
        mi.setVisible(true);
        mi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }*/
    
    
}
