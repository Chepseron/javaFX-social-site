package application;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.image.Image;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class Bookface extends Application {

    // declaration for title pane
    TitledPane MainTitledPane;
    AnchorPane mainAnchorPane;
    //declaration for personal details pane
    TitledPane ProfileDetailsPane;
    AnchorPane ProfileAnchorPane;

    //declaration for text box and text label
    TextArea StatusTxtBox;
    Label StatusUpdatedLabel;

    //declaration for update status button
    Button UpdateStatusButton;

    //declaration for editing profile button pop up 
    Button EditProfileButton;

    //declaration for the image holder
    ImageView ImageHolder;

    //declaration button for change image
    Button ChangeImageButton;

    //declaration labels for personal details on title pane
    Label NameLabel;
    Label RegNumLabel;
    Label CourseLabel;

    //declaration for actual status
    Label StatusLabel;

    //declaration TextFields for personal 
    TextField NameTxtField;
    TextField RegNumTxtField;
    TextField CourseTxtField;

    //declaration labels for personal update details
    Label NamesMainPaneLabel;
    Label RegNumMainPaneLabel;
    Label CourseMainPaneLabel;

    // declaration button for "Ok" and "Cancel" on profile update 
    Button ProfileOkButton;
    Button ProfileCancelButton;

    File file;

    // Constructor - instantiate components
    public Bookface() {
        //instantiate main pane
        MainTitledPane = new TitledPane();
        mainAnchorPane = new AnchorPane();
        //instantiate profile pane
        ProfileDetailsPane = new TitledPane();
        ProfileAnchorPane = new AnchorPane();
        //instantiate status box text area
        StatusTxtBox = new TextArea();
        //instantiate status labels on main pane
        StatusUpdatedLabel = new Label();
        StatusLabel = new Label();
        //instantiate update status button
        UpdateStatusButton = new Button();
        EditProfileButton = new Button();
        //instantiate image holder image view
        ImageHolder = new ImageView();
        //instantiate change image button
        ChangeImageButton = new Button();
        //instantiate Profile Anchor Pane profile labels
        RegNumLabel = new Label();
        CourseLabel = new Label();
        NameLabel = new Label();
        //Instantiate Profile Anchor Pane profile text fields
        NameTxtField = new TextField();
        RegNumTxtField = new TextField();
        CourseTxtField = new TextField();
        //instantiate main pane profile labels
        NamesMainPaneLabel = new Label();
        RegNumMainPaneLabel = new Label();
        CourseMainPaneLabel = new Label();
        //instantiate "Ok" and "Cancel" on profile buttons 
        ProfileOkButton = new Button();
        ProfileCancelButton = new Button();
    }

    //The function to handle status update on clicking the UpdateStatusButton
    public void UpdateStatusButtonAction(ActionEvent actionEvent) {
        //get the actual status from Status text box
        StatusTxtBox.getText();
        //set the status on the status label
        StatusLabel.setText(StatusTxtBox.getText());
    }

    //The function to choose an image on clicking the UpdateStatusButton
    public void ImageEditAction(ActionEvent actionEvent) {
        //Create a file chooser
        final FileChooser fileChooser = new FileChooser();
        //limit the extensions to image files alone
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Image Files", "*.jpeg", ".jpg", "*.png"));
        //display the choose file dialog
        file = fileChooser.showOpenDialog(null);
        //check if the file is not selected/is null
        if (file != null) {
            try {
                //set the image selected to be displayed by the image holder
                this.ImageHolder.setImage(new Image(file.toURI().toString()));
            } catch (Exception ex) {
                //handle exceptions
                Logger.getLogger(Bookface.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    //The function to update the main pane profile (NameLabel,RegNumLabel,CourseLabel) on clicking the ProfileOkButton 
    public void handleProfileUpdateButton(ActionEvent actionEvent) {
        //get the name from the textbox and display on the Name label
        NameLabel.setText(NameTxtField.getText());
        //get the registration number from the textbox and display on the Registration number label
        RegNumLabel.setText(RegNumTxtField.getText());
        //get the course from the textbox and display on the course label
        CourseLabel.setText(CourseTxtField.getText());
    }

    //A fuction to exit the profiles dialog on clicking the ProfileCancelButton
    public void handleProfileCancelButton(ActionEvent actionEvent) {
        //Exit the profiles pane dialog(pane)
        ProfileDetailsPane.setVisible(false);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("BookFace - The new Social media platform ");
        // layout - stackpane
        StackPane root = new StackPane();
        // set the scene
        primaryStage.setScene(new Scene(root, 800, 650));
        //set the main title pane height and width
        MainTitledPane.setPrefHeight(711.0);
        MainTitledPane.setPrefWidth(834.0);

        //set the main title pane title
        MainTitledPane.setText("BookFace - The new Social media platform ");

        //set height and width
        mainAnchorPane.setPrefHeight(685.0);
        mainAnchorPane.setPrefWidth(606.0);

        //set the position of X and Y axis in the layout
        StatusTxtBox.setLayoutX(26.0);
        StatusTxtBox.setLayoutY(83.0);

        //set preffered height and width of the status box
        StatusTxtBox.setPrefHeight(36.0);
        StatusTxtBox.setPrefWidth(408.0);

        //set the position of X and Y axis in the layout
        StatusUpdatedLabel.setLayoutX(26.0);
        StatusUpdatedLabel.setLayoutY(54.0);
        //set the text of the label
        StatusUpdatedLabel.setText("How do you feel?");

        //set the position of X and Y axis in the layout
        UpdateStatusButton.setLayoutX(26.0);
        UpdateStatusButton.setLayoutY(134.0);
        UpdateStatusButton.setMnemonicParsing(false);
        UpdateStatusButton.setStyle("-fx-background-color: blue;");
        UpdateStatusButton.setText("Update Status");
        UpdateStatusButton.setTextFill(javafx.scene.paint.Color.valueOf("#eee7e7"));
        //set the position of X and Y axis in the layout
        EditProfileButton.setLayoutX(623.0);
        EditProfileButton.setLayoutY(546.0);
        EditProfileButton.setMnemonicParsing(false);
        EditProfileButton.setStyle("-fx-background-color: blue;");
        EditProfileButton.setText("Edit Profile");
        EditProfileButton.setTextFill(javafx.scene.paint.Color.valueOf("#fcf7f7"));
        //set height and width of the image holder
        ImageHolder.setFitHeight(200.0);
        ImageHolder.setFitWidth(190.0);
        //set the position of X and Y axis in the layout
        ImageHolder.setLayoutX(578.0);
        ImageHolder.setLayoutY(108.0);
        ImageHolder.setPickOnBounds(true);
        ImageHolder.setPreserveRatio(true);
        //set the default place holder image of the image holder
        ImageHolder.setImage(new Image(new File("C:\\Users\\asabul\\Desktop\\ph.png").toURI().toString()));
        ChangeImageButton.setId("ImageEditButton");
        //set the position of X and Y axis in the layout
        ChangeImageButton.setLayoutX(578.0);
        ChangeImageButton.setLayoutY(314.0);
        ChangeImageButton.setMnemonicParsing(false);
        //set the back ground color of the button to blue
        ChangeImageButton.setStyle("-fx-background-color: blue;");
        //set default text on button to change image
        ChangeImageButton.setText("Change photo");
        //set the default color on text to white
        ChangeImageButton.setTextFill(javafx.scene.paint.Color.valueOf("#fcfcfc"));
        //set the position of X and Y axis in the layout
        NameLabel.setLayoutX(540.0);
        NameLabel.setLayoutY(395.0);
        //set default text of the name label
        NameLabel.setText("John Smith");
        //set the position of X and Y axis in the layout
        RegNumLabel.setLayoutX(540.0);
        RegNumLabel.setLayoutY(435.0);
        //set default text of the registration number label
        RegNumLabel.setText("12345678");
        //set the position of X and Y axis in the layout
        CourseLabel.setLayoutX(540.0);
        CourseLabel.setLayoutY(471.0);
        //set height and width of the course label
        CourseLabel.setPrefHeight(33.0);
        CourseLabel.setPrefWidth(215.0);
        CourseLabel.setText("Higher Diploma In Computing");
        //set the position of X and Y axis in the layout
        StatusLabel.setLayoutX(26.0);
        StatusLabel.setLayoutY(531.0);
        //set default text of the registration status label
        StatusLabel.setText("Today i feel..");
        //set the position of X and Y axis in the layout
        ProfileDetailsPane.setLayoutX(87.0);
        ProfileDetailsPane.setLayoutY(223.0);
        //set height and width of the profile pane
        ProfileDetailsPane.setPrefHeight(206.0);
        ProfileDetailsPane.setPrefWidth(526.0);
        //set default text of the profile details pane
        ProfileDetailsPane.setText("Please update your details");
        //set the profile display to not display on application launch 
        ProfileDetailsPane.setVisible(false);
        //set height and width of the profile anchor pane
        ProfileAnchorPane.setPrefHeight(231.0);
        ProfileAnchorPane.setPrefWidth(524.0);
        //set the profile display to not display on application launch 
        ProfileAnchorPane.setVisible(false);
        //set the position of X and Y axis in the layout
        NameTxtField.setLayoutX(173.0);
        NameTxtField.setLayoutY(33.0);
        //set the preffered height and width of the name text field
        NameTxtField.setPrefHeight(25.0);
        NameTxtField.setPrefWidth(272.0);
        //set the default text of the name text field
        NameTxtField.setText("John Smith");
        //set the position of X and Y axis in the layout
        RegNumTxtField.setLayoutX(173.0);
        RegNumTxtField.setLayoutY(78.0);
        //set the preffered height and width of the registration number text field
        RegNumTxtField.setPrefHeight(25.0);
        RegNumTxtField.setPrefWidth(270.0);
        //set the default text of the registration number
        RegNumTxtField.setText("12345678");
        //set the position of X and Y axis in the layout
        CourseTxtField.setLayoutX(173.0);
        CourseTxtField.setLayoutY(130.0);
        //set the preffered height and width of the course text field
        CourseTxtField.setPrefHeight(25.0);
        CourseTxtField.setPrefWidth(271.0);
        CourseTxtField.setText("Higher diploma in computing");
        //set the position of X and Y axis in the layout
        NamesMainPaneLabel.setLayoutX(20.0);
        NamesMainPaneLabel.setLayoutY(46.0);
        //set the default text on display for Registration number text field
        NamesMainPaneLabel.setText("Full Names");
        //set the position of X and Y axis in the layout
        RegNumMainPaneLabel.setLayoutX(20.0);
        RegNumMainPaneLabel.setLayoutY(82.0);
        //set the default text on display for student registration number text field
        RegNumMainPaneLabel.setText("Student Number");
        //set the position of X and Y axis in the layout
        CourseMainPaneLabel.setLayoutX(20.0);
        CourseMainPaneLabel.setLayoutY(134.0);
        CourseMainPaneLabel.setText("Programme Of Study");
        //set the position of X and Y axis in the layout
        ProfileOkButton.setLayoutX(318.0);
        ProfileOkButton.setLayoutY(154.0);
        //set the preffered height and width
        ProfileOkButton.setPrefHeight(25.0);
        ProfileOkButton.setPrefWidth(125.0);
        ProfileOkButton.setText("OK");
        //set the position of X and Y axis in the layout
        ProfileCancelButton.setLayoutX(262.0);
        ProfileCancelButton.setLayoutY(154.0);
        ProfileCancelButton.setText("Cancel");

        //add the profile anchor pane to the profile details pane
        ProfileDetailsPane.setContent(ProfileAnchorPane);
        //add the main anchor pane to the main titled pane
        MainTitledPane.setContent(mainAnchorPane);

        //add all the child elements to the main anchor pane
        mainAnchorPane.getChildren().add(StatusTxtBox);
        mainAnchorPane.getChildren().add(StatusUpdatedLabel);
        mainAnchorPane.getChildren().add(UpdateStatusButton);
        mainAnchorPane.getChildren().add(EditProfileButton);
        mainAnchorPane.getChildren().add(ImageHolder);
        mainAnchorPane.getChildren().add(ChangeImageButton);
        mainAnchorPane.getChildren().add(NameLabel);
        mainAnchorPane.getChildren().add(RegNumLabel);
        mainAnchorPane.getChildren().add(CourseLabel);
        mainAnchorPane.getChildren().add(StatusLabel);

        //add all the child elements including the name, reg , course text fields and labels to the profile anchor pane
        ProfileAnchorPane.getChildren().add(NameTxtField);
        ProfileAnchorPane.getChildren().add(RegNumTxtField);
        ProfileAnchorPane.getChildren().add(CourseTxtField);
        ProfileAnchorPane.getChildren().add(NamesMainPaneLabel);
        ProfileAnchorPane.getChildren().add(RegNumMainPaneLabel);
        ProfileAnchorPane.getChildren().add(CourseMainPaneLabel);
        ProfileAnchorPane.getChildren().add(ProfileOkButton);
        ProfileAnchorPane.getChildren().add(ProfileCancelButton);

        //add the profiles pane to the main anchor pane
        mainAnchorPane.getChildren().add(ProfileDetailsPane);
        //add the main anchor pane to the StackPane
        root.getChildren().add(mainAnchorPane);

        // show the stage
        primaryStage.show();

    }

    @Override
    public void init() {
        try {
            EditProfileButton.setOnAction((e) -> ProfileDetailsPane.setVisible(true));
            //button to display the file chooser on image edit
            ChangeImageButton.setOnAction(this::ImageEditAction);
            //button to show dialog to update the profile
            ProfileOkButton.setOnAction(this::handleProfileUpdateButton);
            //button to cancel the edit profile dialog
            ProfileCancelButton.setOnAction(this::handleProfileCancelButton);
            //button to update the status
            UpdateStatusButton.setOnAction(this::UpdateStatusButtonAction);
        } catch (Exception ex) {
        }
    }

    //Main method to launch the application
    public static void main(String[] args) {
        // launch the application
        launch(args);
    }

}
