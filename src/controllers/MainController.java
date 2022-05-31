/*
* File: MainController.java
* Author: Farkas Csaba
* Copyright: 2022,Farkas Csaba
* Group: Szoft I/N
* Date: 2022-05-31
* Github: https://github.com/fcsabi/
* Licenc: GNU GPL
*/
package controllers;

import models.MainModel;
import views.MainFrame;

public class MainController {
    MainFrame mainFrame;
    MainModel mainModel;
    public MainController() {
        this.mainFrame = new MainFrame();
        this.mainModel = new MainModel();
    }
    
}
