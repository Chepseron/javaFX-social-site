package bookface;

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

public class Bookface extends Application {

    TitledPane titledPane;
    AnchorPane mainAnchorPane;
    TextArea StatusTxtBox;
    Label StatusUpdatedLabel;
    Button UpdateStatusButton;
    Button EditProfileButton;
    ImageView ImageSpot;
    Button ImageEditButton;
    Label name;
    Label RegNum;
    Label Course;
    Label StatusLabel;
    TitledPane ProfileDetailsPane;
    AnchorPane mainAnchorPane0;
    TextField NameTxtField;
    TextField StudentNumberTxtField;
    TextField ProgrammeTxtField;
    Label fullNamesLabel;
    Label studentNumberLabel;
    Label programmeLabel;
    Button ProfileUpdateButton;
    Button ProfileCancelButton;

    protected void handleStatusButtonAction(ActionEvent actionEvent) {
        StatusTxtBox.getText();
        StatusLabel.setText(StatusTxtBox.getText());
    }

    public void handleProfileButtonAction(ActionEvent actionEvent) {
        ProfileDetailsPane.setVisible(true);
        
    }

    protected void handleImageEditAction(ActionEvent actionEvent) {
        final FileChooser fileChooser = new FileChooser();
        File file = fileChooser.showOpenDialog(null);
        if (file != null) {
            try {
                BufferedImage bufferedImage;
                bufferedImage = ImageIO.read(new File(file.getAbsoluteFile().toString()));
                Image image = SwingFXUtils.toFXImage(bufferedImage, null);
                this.ImageSpot.setImage(image);

            } catch (IOException ex) {
                Logger.getLogger(Bookface.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    protected void handleProfileUpdateButton(ActionEvent actionEvent) {
        name.setText(NameTxtField.getText());
        RegNum.setText(StudentNumberTxtField.getText());
        Course.setText(ProgrammeTxtField.getText());
    }

    protected void handleProfileCancelButton(ActionEvent actionEvent) {
        ProfileDetailsPane.setVisible(false);
    }

    public Bookface() {

    }

    public static void main(String[] args) {
        try {
            Application.launch(args);
        } catch (Exception ex) {
            Logger.getLogger(Bookface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("BookFace - The new Social media platform ");
        StackPane root = new StackPane();
        primaryStage.setScene(new Scene(root, 900, 750));
        titledPane = new TitledPane();
        mainAnchorPane = new AnchorPane();
        StatusTxtBox = new TextArea();
        StatusUpdatedLabel = new Label();
        UpdateStatusButton = new Button();
        EditProfileButton = new Button();
        ImageSpot = new ImageView();
        ImageEditButton = new Button();
        name = new Label();
        RegNum = new Label();
        Course = new Label();
        StatusLabel = new Label();
        ProfileDetailsPane = new TitledPane();
        mainAnchorPane0 = new AnchorPane();
        NameTxtField = new TextField();
        StudentNumberTxtField = new TextField();
        ProgrammeTxtField = new TextField();
        fullNamesLabel = new Label();
        studentNumberLabel = new Label();
        programmeLabel = new Label();
        ProfileUpdateButton = new Button();
        ProfileCancelButton = new Button();

        titledPane.setAnimated(false);
        titledPane.setPrefHeight(711.0);
        titledPane.setPrefWidth(834.0);
        titledPane.setText("BookFace - The new Social media platform ");

        mainAnchorPane.setMinHeight(0.0);
        mainAnchorPane.setMinWidth(0.0);
        mainAnchorPane.setPrefHeight(685.0);
        mainAnchorPane.setPrefWidth(606.0);

        StatusTxtBox.setLayoutX(26.0);
        StatusTxtBox.setLayoutY(83.0);
        StatusTxtBox.setPrefHeight(36.0);
        StatusTxtBox.setPrefWidth(408.0);

        StatusUpdatedLabel.setLayoutX(26.0);
        StatusUpdatedLabel.setLayoutY(54.0);
        StatusUpdatedLabel.setText("How do you feel?");

        UpdateStatusButton.setId("UpdateStatusButton");
        UpdateStatusButton.setLayoutX(26.0);
        UpdateStatusButton.setLayoutY(134.0);
        UpdateStatusButton.setMnemonicParsing(false);
        UpdateStatusButton.setOnAction(this::handleStatusButtonAction);
        UpdateStatusButton.setStyle("-fx-background-color: blue;");
        UpdateStatusButton.setText("Update Status");
        UpdateStatusButton.setTextFill(javafx.scene.paint.Color.valueOf("#eee7e7"));

        EditProfileButton.setLayoutX(589.0);
        EditProfileButton.setLayoutY(506.0);
        EditProfileButton.setMnemonicParsing(false);
        EditProfileButton.setStyle("-fx-background-color: blue;");
        EditProfileButton.setText("Edit Profile");
        EditProfileButton.setTextFill(javafx.scene.paint.Color.valueOf("#fcf7f7"));

        ImageSpot.setFitHeight(212.0);
        ImageSpot.setFitWidth(200.0);
        ImageSpot.setLayoutX(584.0);
        ImageSpot.setLayoutY(19.0);
        ImageSpot.setPickOnBounds(true);
        ImageSpot.setPreserveRatio(true);
//        ImageSpot.setImage(new Image(getClass().getResource("../../../../../Desktop/dominic.jpg").toExternalForm()));

        ImageEditButton.setId("ImageEditButton");
        ImageEditButton.setLayoutX(589.0);
        ImageEditButton.setLayoutY(267.0);
        ImageEditButton.setMnemonicParsing(false);
        ImageEditButton.setOnAction(this::handleImageEditAction);
        ImageEditButton.setStyle("-fx-background-color: blue;");
        ImageEditButton.setText("Change picture");
        ImageEditButton.setTextFill(javafx.scene.paint.Color.valueOf("#fcfcfc"));

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

        ProfileDetailsPane.setAnimated(false);
        ProfileDetailsPane.setLayoutX(87.0);
        ProfileDetailsPane.setLayoutY(223.0);
        ProfileDetailsPane.setPrefHeight(206.0);
        ProfileDetailsPane.setPrefWidth(526.0);
        ProfileDetailsPane.setText("Please update your details");
        ProfileDetailsPane.setVisible(false);

        mainAnchorPane0.setMinHeight(0.0);
        mainAnchorPane0.setMinWidth(0.0);
        mainAnchorPane0.setPrefHeight(231.0);
        mainAnchorPane0.setPrefWidth(524.0);
        mainAnchorPane0.setVisible(false);

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

        fullNamesLabel.setLayoutX(20.0);
        fullNamesLabel.setLayoutY(46.0);
        fullNamesLabel.setText("Full Names");

        studentNumberLabel.setLayoutX(20.0);
        studentNumberLabel.setLayoutY(82.0);
        studentNumberLabel.setText("Student Number");

        programmeLabel.setLayoutX(20.0);
        programmeLabel.setLayoutY(134.0);
        programmeLabel.setText("programme of study");

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
        ProfileDetailsPane.setContent(mainAnchorPane0);
        titledPane.setContent(mainAnchorPane);

        mainAnchorPane.getChildren().add(StatusTxtBox);
        mainAnchorPane.getChildren().add(StatusUpdatedLabel);
        mainAnchorPane.getChildren().add(UpdateStatusButton);
        mainAnchorPane.getChildren().add(EditProfileButton);
        mainAnchorPane.getChildren().add(ImageSpot);
        mainAnchorPane.getChildren().add(ImageEditButton);
        mainAnchorPane.getChildren().add(name);
        mainAnchorPane.getChildren().add(RegNum);
        mainAnchorPane.getChildren().add(Course);
        mainAnchorPane.getChildren().add(StatusLabel);
        mainAnchorPane0.getChildren().add(NameTxtField);
        mainAnchorPane0.getChildren().add(StudentNumberTxtField);
        mainAnchorPane0.getChildren().add(ProgrammeTxtField);
        mainAnchorPane0.getChildren().add(fullNamesLabel);
        mainAnchorPane0.getChildren().add(studentNumberLabel);
        mainAnchorPane0.getChildren().add(programmeLabel);
        mainAnchorPane0.getChildren().add(ProfileUpdateButton);
        mainAnchorPane0.getChildren().add(ProfileCancelButton);
        mainAnchorPane.getChildren().add(ProfileDetailsPane);
        //mainAnchorPane.getChildren().add(titledPane);
        
        
        
        //Button to edit profile/update name, programme and registration number
        EditProfileButton.setOnAction(this::handleProfileButtonAction); 
        //button to update the profile picture
        ImageEditButton.setOnAction(this::handleImageEditAction);
        //button to show dialog to update the profile
        ProfileUpdateButton.setOnAction(this::handleProfileUpdateButton);
        //button to cancel the edit profile dialog
        ProfileCancelButton.setOnAction(this::handleProfileCancelButton);
        //button to update the status
        UpdateStatusButton.setOnAction(this::handleStatusButtonAction);
        
        
        
        root.getChildren().add(mainAnchorPane);
        primaryStage.show();

    }

    @Override
    public void init() {
    
    }

}
