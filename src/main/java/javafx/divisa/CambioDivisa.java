package javafx.divisa;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CambioDivisa extends Application {

	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		TextField mon1 = new TextField();
		mon1.setMaxWidth(70);
		ComboBox moneda1 = new ComboBox();
		HBox hbox1 = new HBox();
		hbox1.getChildren().addAll(mon1, moneda1);
		
		TextField mon2 = new TextField();
		mon2.setMaxWidth(70);
		ComboBox moneda2 = new ComboBox();
		HBox hbox2 = new HBox();
		hbox2.getChildren().addAll(mon2, moneda2);
		
		Button boton = new Button("Cambiar");
		HBox hbox3 = new HBox();
		hbox3.getChildren().addAll(boton);
		
		VBox vbox1 = new VBox();
		vbox1.getChildren().addAll(hbox1, hbox2, hbox3);
		vbox1.setSpacing(5);
		vbox1.setFillWidth(false);
		vbox1.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(vbox1, 400, 250);
	    primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main (String[] args) {
		launch(args);
	}

}
