package com.example.demo2;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Objects;

public class HelloController {
    @FXML
    private Label welcomeText1;
   // private TextField txtUname;

    @FXML
    protected void onSigninButtonClick() {
       // myLabel.setText("shjdsajk");
        welcomeText1.setText("");
        //txtUname.setText("Gayith");
    }

    @FXML
    protected void onCloseButtonClick(){
        //welcomeText.setText("");

    }

    @FXML
    protected void onForgotPasswordButtonClick(){//welcomeText.setText("");
         }

    @FXML
    ImageView Image;
    Image myImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("icons8.png")));
}