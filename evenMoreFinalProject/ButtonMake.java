import java.awt.event.*;
import javax.swing.*;
import java.applet.*;

import java.awt.*;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.JPanel;
/**
 * Abstract class Button - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class ButtonMake extends JFrame implements ActionListener
{
    JPanel panel;
    
    int x;
    int y;
    
    int sizeX;
    int sizeY;
    
    String title = "";
    
    TextField t1 = new TextField(5);
    
    public ButtonMake(String t, JPanel tmpPane, int xT, int yT, int sX, int sY) 
    {
        x = xT;
        y = yT;
        
        sizeX = sX;
        sizeY = sY;
        
        title = t;
        
        panel = tmpPane;
        
        init();
    }
    
    public void init()
    {
        Button b1 = new Button(title);
        panel.add(b1);
        panel.add(t1);
        b1.addActionListener(this);
        Container contentHolder = getContentPane();
        contentHolder.add(panel, BorderLayout.SOUTH);
        t1.setText(title);
    }
    
    public abstract void actionPerformed(ActionEvent e);
}
