/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.my.first.gui.app;
import view.AppView;
import model.AppModel;
import controller.AppController;


/**
 *s
 * @author jvela
 */
public class MyFirstGUIApp {

    public static void main(String[] args) {        
        AppView theView = new AppView();
        AppModel theModel = new AppModel();
        AppController theController = new AppController(theView,theModel);
        theView.setVisible(true);
        

    }
}
