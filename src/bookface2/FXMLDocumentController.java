/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookface2;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javax.imageio.ImageIO;

/**
 *
 * @author asabul
 */
public class FXMLDocumentController implements Initializable {

    private Label label;

    Button UpdateStatusButton;
    @FXML
    TextArea StatusTxtBox;
    @FXML
    Label StatusLabel;
    @FXML
    TitledPane titledPane;

    @FXML
    Label name;
    @FXML
    Label RegNum;
    @FXML
    Label Course;

    @FXML
    TextField NameTxtField;
    @FXML
    TextField StudentNumberTxtField;
    @FXML
    TextField ProgrammeTxtField;

    @FXML
    ImageView imageSpot;
    @FXML
    private Button EditProfileButton;
    @FXML
    private Button ProfileUpdateButton;
    @FXML
    private Button ProfileCancelButton;

    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void handleStatusButtonAction(ActionEvent event) {
        StatusTxtBox.getText();
        StatusLabel.setText(StatusTxtBox.getText());
    }

    @FXML
    private void handleProfileButtonAction(ActionEvent event) {
        titledPane.setVisible(true);
    }

    @FXML
    private void handleProfileUpdateButton(ActionEvent event) {
        name.setText(NameTxtField.getText());
        RegNum.setText(StudentNumberTxtField.getText());
        Course.setText(ProgrammeTxtField.getText());
    }

    @FXML
    private void handleProfileCancelButton(ActionEvent event) {
        titledPane.setVisible(false);
    }

    @FXML
    private void handleImageEditAction(ActionEvent event) {
        final FileChooser fileChooser = new FileChooser();
        File file = fileChooser.showOpenDialog(null);
        if (file != null) {
            try {
                // openFile(file);
                // where my problem is
                BufferedImage bufferedImage;
                bufferedImage = ImageIO.read(new File(file.getAbsoluteFile().toString()));
                Image image = SwingFXUtils.toFXImage(bufferedImage, null);
                this.imageSpot.setImage(image);
                //Image image1 = new Image(file.getCanonicalFile().toString().replaceAll('\','\\'));
                // what I tried to do

      
            } catch (IOException ex) {
                Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
