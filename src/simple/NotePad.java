/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//tutorial for notepad
//http://www.dreamincode.net/forums/topic/66176-creating-a-basic-notepad-application/
package simple;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.MenuShortcut;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 *
 * @author mc13mt49
 */
public class NotePad extends JFrame implements ActionListener{
    private TextArea tA=new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
    private MenuBar mB=new MenuBar();
    private Menu file=new Menu("File");
    private MenuItem save=new MenuItem("Save");
    private MenuItem open=new MenuItem("Open");
    
    public static void main(String[] args){
        NotePad st=new NotePad();
    }
    
    public NotePad(){
        this.setTitle("Notepad");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,300);
        this.add(tA);
        this.setMenuBar(mB);
        this.mB.add(file);
        this.file.add(save);
        this.file.setShortcut(new MenuShortcut(KeyEvent.VK_F));
        this.save.setShortcut(new MenuShortcut(KeyEvent.VK_S));
        this.save.addActionListener(this);
        this.file.add(open);
        this.open.setShortcut(new MenuShortcut(KeyEvent.VK_O));
        this.open.addActionListener(this);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==save){
            JFileChooser jc=new JFileChooser("save");
            int rslt=jc.showOpenDialog(this);
            if(rslt==JFileChooser.APPROVE_OPTION){
                try {
                    BufferedWriter wr=new BufferedWriter(new FileWriter(jc.getSelectedFile().getPath()));
                    wr.write(this.tA.getText());
                    wr.close();
                } catch (IOException ex) {
                    Logger.getLogger(NotePad.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        else if(e.getSource()==open){
            JFileChooser op=new JFileChooser();
            int rslt=op.showOpenDialog(this);
            if(rslt==JFileChooser.APPROVE_OPTION){
                tA.setText("");
                try {
                    Scanner sc=new Scanner(new FileReader(op.getSelectedFile().getPath()));
                    while(sc.hasNext()){
                        this.tA.append(sc.nextLine()+"\n");
                    }
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(NotePad.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
   
}
