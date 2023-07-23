/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import Comp_Decomp.Compressor;
import Comp_Decomp.Decompressor;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author KEVIN
 */
public class Appframe extends  JFrame implements ActionListener {
    JButton compress;
    JButton decompress;
    
    Appframe(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        compress = new JButton("Select File to Compress");
        compress.setBounds(20,100,200,30);
        compress.addActionListener(this);
        decompress = new JButton("Select File to Decompress");
        decompress.setBounds(250,100,200,30);
        decompress.addActionListener(this);
        this.add(compress);
                this.add(decompress);
                this.setSize(1000,500);
                this.getContentPane().setBackground(Color.green);
                this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==compress)
        {
            JFileChooser filechooser = new JFileChooser();
            int response = filechooser.showSaveDialog(null);
            if(response == JFileChooser.APPROVE_OPTION)
            {
               File file = new File(filechooser.getSelectedFile().getAbsolutePath());
               System.out.print(file);
               try{
                   Compressor.method(file);
               }
               catch(Exception ee){
                   JOptionPane.showMessageDialog(null,ee.toString());
                   
               }
            
        }
    }
        if(e.getSource()==decompress)
        {
            JFileChooser filechooser = new JFileChooser();
            int response = filechooser.showSaveDialog(null);
            if(response == JFileChooser.APPROVE_OPTION)
            {
               File file = new File(filechooser.getSelectedFile().getAbsolutePath());
               System.out.print(file);
               try{
                   Decompressor.method(file);
               }
               catch(Exception ee){
                   JOptionPane.showMessageDialog(null,ee.toString());
                   
               }
            }
        }
    }
}
        
            
        
    

