package br.com.treinar.avancado.aula.swing;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SwingGridLayout {
   private JFrame mainFrame;
   private JLabel headerLabel;
   private JLabel statusLabel;
   private JPanel controlPanel;

   public SwingGridLayout(){
      prepareGUI();
   }

   public static void main(String[] args){
      SwingGridLayout swingLayoutDemo = new SwingGridLayout();  
      swingLayoutDemo.showGridLayoutDemo();       
   }
      
   private void prepareGUI(){
      mainFrame = new JFrame("Java SWING Examples");
      mainFrame.setSize(400,400);
      mainFrame.setLayout(new GridLayout(3, 1));

      headerLabel = new JLabel("",JLabel.CENTER );
      statusLabel = new JLabel("",JLabel.CENTER);        

      statusLabel.setSize(350,100);
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });    
      controlPanel = new JPanel();
      controlPanel.setLayout(new FlowLayout());

      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);  
   }
   
   private void showGridLayoutDemo(){
      headerLabel.setText("Layout in action: GridLayout");      

      JPanel panel = new JPanel();
      panel.setBackground(Color.darkGray);
      panel.setSize(300,300);
      GridLayout layout = new GridLayout(0,4);
      layout.setHgap(5);
      layout.setVgap(5);
      
      panel.setLayout(layout);        
      panel.add(new JButton("Button 1"));
      panel.add(new JButton("Button 2")); 
      panel.add(new JButton("Button 3")); 
      panel.add(new JButton("Button 4")); 
      panel.add(new JButton("Button 5")); 
      panel.add(new JButton("Button 6")); 
      panel.add(new JButton("Button 7")); 
      controlPanel.add(panel);
      mainFrame.setVisible(true);  
   }
}