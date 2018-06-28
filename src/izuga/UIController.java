/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package izuga;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Gian
 */
public class UIController implements Initializable {
    
    //Name Panels
    @FXML
    private AnchorPane pn_popup;
    
    //Name Buttons
    @FXML
    private JFXButton btn_popupx, btn_start;
    
    //Popup Close on Button X
    @FXML
    private void handleButtonAction(MouseEvent event) {
        if(event.getTarget() == btn_popupx || event.getTarget() == btn_start) {
            pn_popup.setVisible(false);
        }
    }

    //Close application on click on x
    @FXML
    private void handleClose(MouseEvent event) {
        System.exit(0);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
