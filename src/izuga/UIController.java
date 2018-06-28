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
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

/**
 *
 * @author Gian
 */
public class UIController implements Initializable {

    //Name Panels
    @FXML
    private AnchorPane pn_popup;

    @FXML
    private Pane pn_library, pn_history, pn_browse, pn_down, pn_settings;

    //Name Buttons
    @FXML
    private JFXButton btn_popupx, btn_start, btn_library, btn_history, btn_browse, btn_download, btn_settings;

    //Close application on click on x
    @FXML
    private void handleClose(MouseEvent event) {
        System.exit(0);
    }

    //Popup Close on Button X
    @FXML
    private void handleButtonAction(MouseEvent event) {
        if (event.getTarget() == btn_popupx || event.getTarget() == btn_start) {
            pn_popup.setVisible(false);
        }
    }

    @FXML
    private void newButtonClick(ActionEvent event) {
        if (event.getSource() == btn_library) {
            pn_library.toFront();
        } else if (event.getSource() == btn_history) {
            pn_history.toFront();
        } else if (event.getSource() == btn_browse) {
            pn_browse.toFront();
        } else if (event.getSource() == btn_download) {
            pn_down.toFront();
        } else if (event.getSource() == btn_settings) {
            pn_settings.toFront();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb
    ) {
        // TODO
    }

}
