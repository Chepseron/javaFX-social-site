package bookface2;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javax.imageio.ImageIO;

public class FXMLDocumentBase extends Application {

    TitledPane titledPane;
    AnchorPane anchorPane;
    TextArea StatusTxtBox;
    Label label;
    Button button;
    Button EditProfileButton;
    ImageView imageSpot;
    Button button0;
    Label name;
    Label RegNum;
    Label Course;
    Label StatusLabel;
    TitledPane titledPane0;
    AnchorPane anchorPane0;
    TextField NameTxtField;
    TextField StudentNumberTxtField;
    TextField ProgrammeTxtField;
    Label label0;
    Label label1;
    Label label2;
    Button ProfileUpdateButton;
    Button ProfileCancelButton;

    protected void handleStatusButtonAction(ActionEvent actionEvent) {
        StatusTxtBox.getText();
        StatusLabel.setText(StatusTxtBox.getText());
    }

    protected void handleProfileButtonAction(ActionEvent actionEvent) {
        titledPane.setVisible(true);
    }

    protected void handleImageEditAction(ActionEvent actionEvent) {
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

    protected void handleProfileUpdateButton(ActionEvent actionEvent) {
        name.setText(NameTxtField.getText());
        RegNum.setText(StudentNumberTxtField.getText());
        Course.setText(ProgrammeTxtField.getText());
    }

    protected void handleProfileCancelButton(ActionEvent actionEvent) {
        titledPane.setVisible(false);
    }

    public FXMLDocumentBase() {

    }

    public static void main(String[] args) {
        try {
            Application.launch(args);
        } catch (Exception ex) {
            Logger.getLogger(FXMLDocumentBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("BookFace - The new Social media platform ");
        StackPane root = new StackPane();
        primaryStage.setScene(new Scene(root, 900, 750));
        titledPane = new TitledPane();
        anchorPane = new AnchorPane();
        StatusTxtBox = new TextArea();
        label = new Label();
        button = new Button();
        EditProfileButton = new Button();
        imageSpot = new ImageView();
        button0 = new Button();
        name = new Label();
        RegNum = new Label();
        Course = new Label();
        StatusLabel = new Label();
        titledPane0 = new TitledPane();
        anchorPane0 = new AnchorPane();
        NameTxtField = new TextField();
        StudentNumberTxtField = new TextField();
        ProgrammeTxtField = new TextField();
        label0 = new Label();
        label1 = new Label();
        label2 = new Label();
        ProfileUpdateButton = new Button();
        ProfileCancelButton = new Button();

        titledPane.setAnimated(false);
        titledPane.setPrefHeight(711.0);
        titledPane.setPrefWidth(834.0);
        titledPane.setText("BookFace - The new Social media platform ");

        anchorPane.setMinHeight(0.0);
        anchorPane.setMinWidth(0.0);
        anchorPane.setPrefHeight(685.0);
        anchorPane.setPrefWidth(606.0);

        StatusTxtBox.setLayoutX(26.0);
        StatusTxtBox.setLayoutY(83.0);
        StatusTxtBox.setPrefHeight(36.0);
        StatusTxtBox.setPrefWidth(408.0);

        label.setLayoutX(26.0);
        label.setLayoutY(54.0);
        label.setText("How do you feel?");

        button.setId("UpdateStatusButton");
        button.setLayoutX(26.0);
        button.setLayoutY(134.0);
        button.setMnemonicParsing(false);
        button.setOnAction(this::handleStatusButtonAction);
        button.setStyle("-fx-background-color: blue;");
        button.setText("Update Status");
        button.setTextFill(javafx.scene.paint.Color.valueOf("#eee7e7"));

        EditProfileButton.setLayoutX(589.0);
        EditProfileButton.setLayoutY(506.0);
        EditProfileButton.setMnemonicParsing(false);
        EditProfileButton.setOnAction(this::handleProfileButtonAction);
        EditProfileButton.setStyle("-fx-background-color: blue;");
        EditProfileButton.setText("Edit Profile");
        EditProfileButton.setTextFill(javafx.scene.paint.Color.valueOf("#fcf7f7"));

        imageSpot.setFitHeight(212.0);
        imageSpot.setFitWidth(200.0);
        imageSpot.setLayoutX(584.0);
        imageSpot.setLayoutY(19.0);
        imageSpot.setPickOnBounds(true);
        imageSpot.setPreserveRatio(true);
//        imageSpot.setImage(new Image(getClass().getResource("../../../../../Desktop/amon.jpg").toExternalForm()));

        button0.setId("imageEditButton");
        button0.setLayoutX(589.0);
        button0.setLayoutY(267.0);
        button0.setMnemonicParsing(false);
        button0.setOnAction(this::handleImageEditAction);
        button0.setStyle("-fx-background-color: blue;");
        button0.setText("Change picture");
        button0.setTextFill(javafx.scene.paint.Color.valueOf("#fcfcfc"));

        name.setLayoutX(581.0);
        name.setLayoutY(326.0);
        name.setText("Dominic Ng'ethe Maina");

        RegNum.setLayoutX(582.0);
        RegNum.setLayoutY(368.0);
        RegNum.setText("HDC_MSCC 3079360");

        Course.setLayoutX(582.0);
        Course.setLayoutY(385.0);
        Course.setPrefHeight(51.0);
        Course.setPrefWidth(220.0);
        Course.setText("Computing Science");

        StatusLabel.setLayoutX(26.0);
        StatusLabel.setLayoutY(531.0);
        StatusLabel.setText("Today i feel..");

        titledPane0.setAnimated(false);
        titledPane0.setLayoutX(87.0);
        titledPane0.setLayoutY(223.0);
        titledPane0.setPrefHeight(206.0);
        titledPane0.setPrefWidth(526.0);
        titledPane0.setText("Please update your details");
        titledPane0.setVisible(false);

        anchorPane0.setMinHeight(0.0);
        anchorPane0.setMinWidth(0.0);
        anchorPane0.setPrefHeight(231.0);
        anchorPane0.setPrefWidth(524.0);
        anchorPane0.setVisible(false);

        NameTxtField.setLayoutX(173.0);
        NameTxtField.setLayoutY(33.0);
        NameTxtField.setPrefHeight(25.0);
        NameTxtField.setPrefWidth(272.0);

        StudentNumberTxtField.setLayoutX(173.0);
        StudentNumberTxtField.setLayoutY(78.0);
        StudentNumberTxtField.setPrefHeight(25.0);
        StudentNumberTxtField.setPrefWidth(270.0);

        ProgrammeTxtField.setLayoutX(173.0);
        ProgrammeTxtField.setLayoutY(130.0);
        ProgrammeTxtField.setPrefHeight(25.0);
        ProgrammeTxtField.setPrefWidth(271.0);

        label0.setLayoutX(20.0);
        label0.setLayoutY(46.0);
        label0.setText("Full Names");

        label1.setLayoutX(20.0);
        label1.setLayoutY(82.0);
        label1.setText("Student Number");

        label2.setLayoutX(20.0);
        label2.setLayoutY(134.0);
        label2.setText("programme of study");

        ProfileUpdateButton.setLayoutX(318.0);
        ProfileUpdateButton.setLayoutY(154.0);
        ProfileUpdateButton.setMnemonicParsing(false);
        ProfileUpdateButton.setOnAction(this::handleProfileUpdateButton);
        ProfileUpdateButton.setText("OK");

        ProfileCancelButton.setLayoutX(210.0);
        ProfileCancelButton.setLayoutY(154.0);
        ProfileCancelButton.setMnemonicParsing(false);
        ProfileCancelButton.setOnAction(this::handleProfileCancelButton);
        ProfileCancelButton.setText("Cancel");
        titledPane0.setContent(anchorPane0);
        titledPane.setContent(anchorPane);

        anchorPane.getChildren().add(StatusTxtBox);
        anchorPane.getChildren().add(label);
        anchorPane.getChildren().add(button);
        anchorPane.getChildren().add(EditProfileButton);
        anchorPane.getChildren().add(imageSpot);
        anchorPane.getChildren().add(button0);
        anchorPane.getChildren().add(name);
        anchorPane.getChildren().add(RegNum);
        anchorPane.getChildren().add(Course);
        anchorPane.getChildren().add(StatusLabel);
        anchorPane0.getChildren().add(NameTxtField);
        anchorPane0.getChildren().add(StudentNumberTxtField);
        anchorPane0.getChildren().add(ProgrammeTxtField);
        anchorPane0.getChildren().add(label0);
        anchorPane0.getChildren().add(label1);
        anchorPane0.getChildren().add(label2);
        anchorPane0.getChildren().add(ProfileUpdateButton);
        anchorPane0.getChildren().add(ProfileCancelButton);
        anchorPane.getChildren().add(titledPane0);
        root.getChildren().add(anchorPane);
        primaryStage.show();

    }

    @Override
    public void init() {

    }

}
