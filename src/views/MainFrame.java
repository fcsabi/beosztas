/*
* File: MainFrame.java
* Author: Farkas Csaba
* Copyright: 2022,Farkas Csaba
* Group: Szoft I/N
* Date: 2022-05-31
* Github: https://github.com/fcsabi/
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
        System.out.println("Farkas Csaba, 2022-05-31 ");
        this.setMainComponent();
        this.setMainPanel();
        this.setMainFrame();
        List<String> myList = new ArrayList<>(10);
        for (int index = 0; index < 10;index=10 ) {
            myList.add("Takaritó ");
            myList.add("Mosogató ");
            myList.add("Programozó ");
            myList.add("Asztalos ");
            myList.add("Villanyszerelő ");
            myList.add("Épités mérnők");
            myList.add("szakosztály vezető ");
            myList.add("Kovács ");
            myList.add("Sepergető ");
            myList.add("Kertész ");
         }
         final JList<String> list = new JList<String>(myList.toArray(new String[myList.size()]));

        mainScrollPane.setViewportView(list);
      
    }
    private void setMainComponent() {
        this.goButton = new JButton("Gomb,nem csinál semmit");
        this.mainPanel=new JPanel();
        this.mainScrollPane=new JScrollPane(mainPanel);
        System.out.println("Farkas Csaba, 2022-05-31 ");
       
        
        
        
    }
    private void setMainPanel() {
        this.mainPanel = new JPanel();
        this.mainPanel.setLayout(new BorderLayout());
        this.mainPanel.add(mainScrollPane,BorderLayout.CENTER);     
        this.mainPanel.add(this.goButton, BorderLayout.SOUTH); 
        //this.mainScrollPane.add(new ArrayList <String>());
        System.out.println("Farkas Csaba, 2022-05-31 ");


       
        
    }
    private void setMainFrame() {
        this.add(this.mainPanel);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 400);
        this.setVisible(true);
        System.out.println("Farkas Csaba, 2022-05-31 ");
    }
}
