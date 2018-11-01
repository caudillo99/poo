package sample;
//package Audio;
import Audio.MusicPlayer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.stage.Stage;
import java.io.File;
import sun.nio.ch.ThreadPool;

import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
//import  javafx.swing.JFrame;
import javafx.application.Application;
import javafx.event.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.FileInputStream;
import java.io.IOException;
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        primaryStage.initStyle(StageStyle.TRANSPARENT);

/*
        File file = new File("C:\\Users\\David Moncivais\\IdeaProjects\\Juego\\src\\sample");
        String localUrl = file.toURI().toURL().toString();
        Image image = new Image(localUrl);
        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(image, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);
*/


        GridPane plano= new GridPane();// esto genera un plano invisible para guiarnos mas facil mente por la aplicacion

        //espacio donde se genera el fondo de pantalla
        plano.setId("pane");
        Scene scene = new Scene(plano, 1000, 600);//genera la ventana con la cuadrigula en el.
        scene.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());//llama al codigo en css y ahi se modifica el fondo para ponerlo en la ventana

        Image logo= new Image(new FileInputStream("C:\\Users\\caudi\\Documents\\Semestre5\\poo\\Juego\\src\\logo.png"));//selecciona el logo de la aplicacion
        ImageView logoView=new ImageView(logo);//Convierte la imagen a un tipo nodo para poder controlarla mas facilmente
        plano.setPadding(new Insets(10,10,10,10));//este es el espacio que hay entre las orillas de la ventana y el plano

        logoView.setFitHeight(60);//selecciono tamaño de la foto
        logoView.setFitWidth(500);
        plano.setAlignment(Pos.TOP_LEFT);//selecciono desde donde empieza el plano
        plano.setHgap(5);//genera un espacio entre columnas y renglones
        plano.setVgap(10);
        primaryStage.setScene(scene);

        //botones en el juego
        Button start = new Button("Iniciar");
        start.getStyleClass().add("button-yellow");
        GridPane.setConstraints(start,1,1);

        Button selectPlayer = new Button("Seleccion de jugadores");
        selectPlayer.getStyleClass().add("button-blue");
        GridPane.setConstraints(selectPlayer,1,2);

        Button options = new Button("Opciones");
        options.getStyleClass().add("button-red");
        GridPane.setConstraints(options,1,3);

        Button exit = new Button("Salir");
        exit.getStyleClass().add("button-green");
        GridPane.setConstraints(exit,1,4);

        //lo que dice cada boton
        /*btn1.setText("Iniciar juego.");
        btn2.setText("Seleccion de jugadores.");
        btn3.setText("Opciones.");
        btn4.setText("Salida");*/

        //agrega los elementos al plano en las coordenadas deseadas
        plano.add(logoView,16,10);
        plano.add(start, 1, 29);
        plano.add(selectPlayer, 1, 30);
        plano.add(options, 1, 31);
        plano.add(exit, 1, 32);

        DropShadow shadow = new DropShadow();

        //Agrega una sombra cuando el curso esta encima del boton
        start.addEventHandler(MouseEvent.MOUSE_ENTERED,new EventHandler<MouseEvent>() {
            @Override public void handle(MouseEvent e) {
                start.setEffect(shadow);
            }
        });

        //Quita la sombra cuando ya no esta el mouse encima del boton
        start.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override public void handle(MouseEvent e) {
                        start.setEffect(null);
                    }
                });

        //Agrega una sombra cuando el curso esta encima del boton
        selectPlayer.addEventHandler(MouseEvent.MOUSE_ENTERED,new EventHandler<MouseEvent>() {
            @Override public void handle(MouseEvent e) {
                selectPlayer.setEffect(shadow);
            }
        });

        //Quita la sombra cuando ya no esta el mouse encima del boton
        selectPlayer.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            @Override public void handle(MouseEvent e) {
                selectPlayer.setEffect(null);
            }
        });

        //Agrega una sombra cuando el curso esta encima del boton
        options.addEventHandler(MouseEvent.MOUSE_ENTERED,new EventHandler<MouseEvent>() {
            @Override public void handle(MouseEvent e) {
                options.setEffect(shadow);
            }
        });

        //Quita la sombra cuando ya no esta el mouse encima del boton
        options.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            @Override public void handle(MouseEvent e) {
                options.setEffect(null);
            }
        });

        //Agrega una sombra cuando el curso esta encima del boton
        exit.addEventHandler(MouseEvent.MOUSE_ENTERED,new EventHandler<MouseEvent>() {
            @Override public void handle(MouseEvent e) {
                exit.setEffect(shadow);
            }
        });

        //Quita la sombra cuando ya no esta el mouse encima del boton
        exit.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
            @Override public void handle(MouseEvent e) {
                exit.setEffect(null);
            }
        });




        //accion que pasara al momento de presionar el primer boton
        exit.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                primaryStage.close();
            }
        });

        primaryStage.setTitle("Mario Math");
        primaryStage.show();
        //primaryStage.setI

        MusicPlayer player = new MusicPlayer("Super Mario");
        player.run();

    }


    public static void main(String[] args)
    {

        launch(args);
    }
}// fin del main
