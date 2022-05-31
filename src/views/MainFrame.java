/*
* File: MainFrame.java
* Author: Farkas Csaba
* Copyright: 2021, Nagy János
* Group: Szoft V
* Date: 2021-09-03
* Github: https://github.com/janos/
* Licenc: GNU GPL
*/









package views;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.PopupMenu;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.plaf.ComboBoxUI;

public class MainFrame extends JFrame {
    JPanel mainPanel;
    JScrollPane  mainScrollPane;
    JFrame frame;
    JButton goButton;
    
    
    public MainFrame() {
        this.setMainComponent();
        this.setMainPanel();
        this.setMainFrame();
        List<String> myList = new ArrayList<>(10);
        for (int index = 0; index < 10;index++ ) {
            myList.add("Sashegyi Zoltán ");
            myList.add("Nagy Krisztián ");
            myList.add("Kiss Béla ");
            myList.add("Erős Pista ");
            myList.add("Vicc Elek ");
            myList.add("Nagy István ");
            myList.add("Béla Bá ");
            myList.add("Farkas Csaba ");
            myList.add("Iványi Áron ");
            myList.add("Géza ");
         }
         final JList<String> list = new JList<String>(myList.toArray(new String[myList.size()]));

        mainScrollPane.setViewportView(list);
      
    }
    private void setMainComponent() {
        this.goButton = new JButton("Gomb,nem csinál semmit");
        this.mainPanel=new JPanel();
        this.mainScrollPane=new JScrollPane(mainPanel);
       
        
        
        
    }
    private void setMainPanel() {
        this.mainPanel = new JPanel();
        this.mainPanel.setLayout(new BorderLayout());
        this.mainPanel.add(mainScrollPane,BorderLayout.CENTER);     
        this.mainPanel.add(this.goButton, BorderLayout.SOUTH); 
        //this.mainScrollPane.add(new ArrayList <String>());
        


       
        
    }
    private void setMainFrame() {
        this.add(this.mainPanel);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 400);
        this.setVisible(true);
    }
}
