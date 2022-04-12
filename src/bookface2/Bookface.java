package bookface;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
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
    Label NameLabel;
    Label RegNumLabel;
    Label CourseLabel;
    Label StatusLabel;
    TitledPane ProfileDetailsPane;
    AnchorPane mainAnchorPanePersonalDetails;
    TextField NameTxtField;
    TextField StudentNumberTxtField;
    TextField ProgrammeTxtField;
    Label fullNamesLabel;
    Label studentNumberLabel;
    Label programmeLabel;
    Button ProfileUpdateButton;
    Button ProfileCancelButton;

    public Bookface() {
        titledPane = new TitledPane();
        mainAnchorPane = new AnchorPane();
        StatusTxtBox = new TextArea();
        StatusUpdatedLabel = new Label();
        UpdateStatusButton = new Button();
        EditProfileButton = new Button();
        ImageSpot = new ImageView();
        ImageEditButton = new Button();
        NameLabel = new Label();
        RegNumLabel = new Label();
        CourseLabel = new Label();
        StatusLabel = new Label();
        ProfileDetailsPane = new TitledPane();
        mainAnchorPanePersonalDetails = new AnchorPane();
        NameTxtField = new TextField();
        StudentNumberTxtField = new TextField();
        ProgrammeTxtField = new TextField();
        fullNamesLabel = new Label();
        studentNumberLabel = new Label();
        programmeLabel = new Label();
        ProfileUpdateButton = new Button();
        ProfileCancelButton = new Button();

    }

    public void handleStatusButtonAction(ActionEvent actionEvent) {
        StatusTxtBox.getText();
        StatusLabel.setText(StatusTxtBox.getText());
    }

    public void handleImageEditAction(ActionEvent actionEvent) {
        final FileChooser fileChooser = new FileChooser();
        File file = fileChooser.showOpenDialog(null);
        if (file != null) {
            try {
                BufferedImage bufferedImage;

                System.out.println(file.getAbsoluteFile().toString());
                bufferedImage = ImageIO.read(new File(file.getAbsoluteFile().toString()));
                Image image = SwingFXUtils.toFXImage(bufferedImage, null);
                this.ImageSpot.setImage(image);

            } catch (IOException ex) {
                Logger.getLogger(Bookface.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void handleProfileUpdateButton(ActionEvent actionEvent) {
        NameLabel.setText(NameTxtField.getText());
        RegNumLabel.setText(StudentNumberTxtField.getText());
        CourseLabel.setText(ProgrammeTxtField.getText());
    }

    public void handleProfileCancelButton(ActionEvent actionEvent) {
        ProfileDetailsPane.setVisible(false);
    }

    public static void main(String[] args) {
        try {
            launch(args);
        } catch (Exception ex) {
            Logger.getLogger(Bookface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("BookFace - The new Social media platform ");
        StackPane root = new StackPane();
        primaryStage.setScene(new Scene(root, 900, 750));

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
        UpdateStatusButton.setStyle("-fx-background-color: blue;");
        UpdateStatusButton.setText("Update Status");
        UpdateStatusButton.setTextFill(javafx.scene.paint.Color.valueOf("#eee7e7"));

        EditProfileButton.setLayoutX(623.0);
        EditProfileButton.setLayoutY(546.0);
        EditProfileButton.setMnemonicParsing(false);
        EditProfileButton.setStyle("-fx-background-color: blue;");
        EditProfileButton.setText("Edit Profile");
        EditProfileButton.setTextFill(javafx.scene.paint.Color.valueOf("#fcf7f7"));

        ImageSpot.setFitHeight(200.0);
        ImageSpot.setFitWidth(190.0);
        ImageSpot.setLayoutX(578.0);
        ImageSpot.setLayoutY(108.0);
        ImageSpot.setPickOnBounds(true);
        ImageSpot.setPreserveRatio(true);

        BufferedImage bufferedImage = ImageIO.read(new File("C:/Users/asabul/Desktop/ph.png"));
        Image image = SwingFXUtils.toFXImage(bufferedImage, null);
        ImageSpot.setImage(image);

        ImageEditButton.setId("ImageEditButton");
        ImageEditButton.setLayoutX(578.0);
        ImageEditButton.setLayoutY(314.0);
        ImageEditButton.setMnemonicParsing(false);
        ImageEditButton.setStyle("-fx-background-color: blue;");
        ImageEditButton.setText("Change picture");
        ImageEditButton.setTextFill(javafx.scene.paint.Color.valueOf("#fcfcfc"));

        NameLabel.setLayoutX(540.0);
        NameLabel.setLayoutY(395.0);
        NameLabel.setText("Dominic Ng'ethe Maina");

        RegNumLabel.setLayoutX(540.0);
        RegNumLabel.setLayoutY(435.0);
        RegNumLabel.setText("HDC_MSCC 3079360");

        CourseLabel.setLayoutX(540.0);
        CourseLabel.setLayoutY(471.0);
        CourseLabel.setPrefHeight(33.0);
        CourseLabel.setPrefWidth(215.0);
        CourseLabel.setText("Computing Science");

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

        mainAnchorPanePersonalDetails.setMinHeight(0.0);
        mainAnchorPanePersonalDetails.setMinWidth(0.0);
        mainAnchorPanePersonalDetails.setPrefHeight(231.0);
        mainAnchorPanePersonalDetails.setPrefWidth(524.0);
        mainAnchorPanePersonalDetails.setVisible(false);

        NameTxtField.setLayoutX(173.0);
        NameTxtField.setLayoutY(33.0);
        NameTxtField.setPrefHeight(25.0);
        NameTxtField.setPrefWidth(272.0);
        NameTxtField.setText("John Smith");

        StudentNumberTxtField.setLayoutX(173.0);
        StudentNumberTxtField.setLayoutY(78.0);
        StudentNumberTxtField.setPrefHeight(25.0);
        StudentNumberTxtField.setPrefWidth(270.0);
        StudentNumberTxtField.setText("12345678");

        ProgrammeTxtField.setLayoutX(173.0);
        ProgrammeTxtField.setLayoutY(130.0);
        ProgrammeTxtField.setPrefHeight(25.0);
        ProgrammeTxtField.setPrefWidth(271.0);
        ProgrammeTxtField.setText("Higher diploma in computing");

        fullNamesLabel.setLayoutX(20.0);
        fullNamesLabel.setLayoutY(46.0);
        fullNamesLabel.setText("Full Names");

        studentNumberLabel.setLayoutX(20.0);
        studentNumberLabel.setLayoutY(82.0);
        studentNumberLabel.setText("Student Number");

        programmeLabel.setLayoutX(20.0);
        programmeLabel.setLayoutY(134.0);
        programmeLabel.setText("programme of study");

//        
//          <Button fx:id="ProfileUpdateButton" layoutX="318.0" layoutY="154.0" mnemonicParsing="false" onAction="#handleProfileUpdateButton" prefHeight="25.0" prefWidth="125.0" text="OK" />
//                                        <Button fx:id="ProfileCancelButton" layoutX="262.0" layoutY="154.0" mnemonicParsing="false" onAction="#handleProfileCancelButton" text="Cancel" />
//        
//        
        ProfileUpdateButton.setLayoutX(318.0);
        ProfileUpdateButton.setLayoutY(154.0);
        ProfileUpdateButton.setPrefHeight(25.0);
        ProfileUpdateButton.setPrefWidth(125.0);
        ProfileUpdateButton.setMnemonicParsing(false);
        ProfileUpdateButton.setText("OK");

        ProfileCancelButton.setLayoutX(262.0);
        ProfileCancelButton.setLayoutY(154.0);

        ProfileCancelButton.setMnemonicParsing(false);
        ProfileCancelButton.setText("Cancel");
        ProfileDetailsPane.setContent(mainAnchorPanePersonalDetails);
        titledPane.setContent(mainAnchorPane);

        mainAnchorPane.getChildren().add(StatusTxtBox);
        mainAnchorPane.getChildren().add(StatusUpdatedLabel);
        mainAnchorPane.getChildren().add(UpdateStatusButton);
        mainAnchorPane.getChildren().add(EditProfileButton);
        mainAnchorPane.getChildren().add(ImageSpot);
        mainAnchorPane.getChildren().add(ImageEditButton);
        mainAnchorPane.getChildren().add(NameLabel);
        mainAnchorPane.getChildren().add(RegNumLabel);
        mainAnchorPane.getChildren().add(CourseLabel);
        mainAnchorPane.getChildren().add(StatusLabel);

        mainAnchorPanePersonalDetails.getChildren().add(NameTxtField);
        mainAnchorPanePersonalDetails.getChildren().add(StudentNumberTxtField);
        mainAnchorPanePersonalDetails.getChildren().add(ProgrammeTxtField);
        mainAnchorPanePersonalDetails.getChildren().add(fullNamesLabel);
        mainAnchorPanePersonalDetails.getChildren().add(studentNumberLabel);
        mainAnchorPanePersonalDetails.getChildren().add(programmeLabel);
        mainAnchorPanePersonalDetails.getChildren().add(ProfileUpdateButton);
        mainAnchorPanePersonalDetails.getChildren().add(ProfileCancelButton);
        mainAnchorPane.getChildren().add(ProfileDetailsPane);

        root.getChildren().add(mainAnchorPane);
        primaryStage.show();

    }

    @Override
    public void init() {
        try {
            EditProfileButton.setOnAction((e) -> ProfileDetailsPane.setVisible(true));
            ImageEditButton.setOnAction(this::handleImageEditAction);
            //button to show dialog to update the profile
            ProfileUpdateButton.setOnAction(this::handleProfileUpdateButton);
            //button to cancel the edit profile dialog
            ProfileCancelButton.setOnAction(this::handleProfileCancelButton);
            //button to update the status
            UpdateStatusButton.setOnAction(this::handleStatusButtonAction);
        } catch (Exception ex) {
        }
    }

}
