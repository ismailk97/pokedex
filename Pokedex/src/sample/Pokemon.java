package sample;


import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.List;

public class Pokemon{

private String Name;
private int Number;
private Image image;

List<Pokemon> list = new ArrayList<>();


javafx.scene.image.Image bulbasaurImage= new javafx.scene.image.Image(getClass().getResource("/Bulbasaur.png").toString());

    public Pokemon(String name, int number, Image image) {
this.Name = name;
this.Number= number;
this.image = image;
    }


    Pokemon bulbasaur = new Pokemon("bulb",0,bulbasaurImage);
    }







