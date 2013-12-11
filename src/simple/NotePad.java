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
    private MenuBar menuBar = new MenuBar(); // first, create a MenuBar item
    private Menu file = new Menu(); // our File menu
    // what's going in File? let's see...
    private MenuItem openFile = new MenuItem();  // an open option
    private MenuItem saveFile = new MenuItem(); // a save option
    private MenuItem close = new MenuItem(); // and a close option!
    
    public NotePad() {
	this.setSize(500, 300); // set the initial size of the window
	this.setTitle("Java NotePad Tutorial"); // set the title of the window
	setDefaultCloseOperation(EXIT_ON_CLOSE); // set the default close operation (exit when it gets closed)
	this.textArea.setFont(new Font("Century Gothic", Font.BOLD, 12)); // set a default font for the TextArea
	// this is why we didn't have to worry about the size of the TextArea!
	this.getContentPane().setLayout(new BorderLayout()); // the BorderLayout bit makes it fill it automatically
	this.getContentPane().add(textArea);

	// add our menu bar into the GUI
	this.setMenuBar(this.menuBar);
	this.menuBar.add(this.file); // we'll configure this later
	
	// first off, the design of the menuBar itself. Pretty simple, all we need to do
	// is add a couple of menus, which will be populated later on
	this.file.setLabel("File");
	
	// now it's time to work with the menu. I'm only going to add a basic File menu
	// but you could add more!
	
	// now we can start working on the content of the menu~ this gets a little repetitive,
	// so please bare with me!
	
	// time for the repetitive stuff. let's add the "Open" option
	this.openFile.setLabel("Open"); // set the label of the menu item
	this.openFile.addActionListener(this); // add an action listener (so we know when it's been clicked
	this.openFile.setShortcut(new MenuShortcut(KeyEvent.VK_O, false)); // set a keyboard shortcut
	this.file.add(this.openFile); // add it to the "File" menu
	
	// and the save...
	this.saveFile.setLabel("Save");
	this.saveFile.addActionListener(this);
	this.saveFile.setShortcut(new MenuShortcut(KeyEvent.VK_S, false));
	this.file.add(this.saveFile);
	
	// and finally, the close option
	this.close.setLabel("Close");
	// along with our "CTRL+F4" shortcut to close the window, we also have
	// the default closer, as stated at the beginning of this tutorial.
	// this means that we actually have TWO shortcuts to close:
	// 1) the default close operation (example, Alt+F4 on Windows)
	// 2) CTRL+F4, which we are about to define now: (this one will appear in the label)
	this.close.setShortcut(new MenuShortcut(KeyEvent.VK_F4, false));
	this.close.addActionListener(this);
	this.file.add(this.close);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /*public static void main(String[] args){
        NotePad n1=new NotePad();
    }
    public NotePad(){
        JFrame mi=new JFrame("Simple NotePad");
        mi.setSize(200,300);
        mi.setVisible(true);
        mi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }*/
    
    
}
