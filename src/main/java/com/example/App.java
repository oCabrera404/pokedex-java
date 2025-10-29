package com.example;

import com.example.entities.Pokemon;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import com.example.database.Database;

import java.io.IOException;
import java.util.List;

public class App extends Application {

    private Label label2 = new Label();
    private List<Pokemon> pokemons;
    private Pokemon pokemonsEscolhidos;

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        Database db = new Database();
        db.inicialize();


        Button Pikachu = new Button(db.buscaPokemon(25).getNome());
        Pikachu.setOnAction(e -> atualizao());
        Label Raichu = new Label(db.buscaPokemon(26).getNome());

        ScrollPane tela = new ScrollPane();

        VBox listaDePokemons = new VBox();
        for (int i = 1; i < 151; i++) {
            listaDePokemons.getChildren().add(new Button(db.buscaPokemon(i).getNome()));
        }
        tela.setContent(listaDePokemons);

        var scene = new Scene(tela, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public void atualizao(){
        label2 = new Label("Atualizei");
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}