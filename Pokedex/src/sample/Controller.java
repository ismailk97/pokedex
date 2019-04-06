
package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;


public class Controller implements Initializable {


    int NextPic = 0;
    @FXML ImageView IM;
   @FXML private Label NM;
   @FXML private MenuButton menu;

    Button Btn;
    LinkedList<Pokemon> pokedex = new LinkedList<>();
    List<Image> array = new ArrayList<>();

    ArrayList<String> number = new ArrayList<>();

    Image bulbasaur= new Image(getClass().getResource("/Bulbasaur.png").toString());
    //object av pokemon




    Image pikachu = new Image(getClass().getResource("/pikachu.png").toString());

    Image charmander = new Image(getClass().getResource("/Charmander.png").toString());
    Image ivysaur = new Image(getClass().getResource("/ivysaur.png").toString());


    @FXML
    private void rightClick(ActionEvent event){
         {

             if(NextPic < array.size()){
                 IM.setImage(array.get(NextPic));
                 NM.setText(number.get(NextPic));
                 NextPic++;

             }

             else{


             }
        }
    }


    @FXML
    private void leftClick(ActionEvent ev){

        if ( NextPic > -1) {
            IM.setImage(array.get(NextPic-1));
            NM.setText(number.get(NextPic-1));
            NextPic--;



        }

        else{}
    }

    @FXML
    private void Menu(ActionEvent input){
        IM.setImage(array.get(1));

    }



public void SetImage(Image im){
        IM.setImage(im);
}


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        array.add(bulbasaur);
        array.add(ivysaur);

        array.add(charmander);
        array.add(pikachu);
        number.add("Bulbasaur");
        number.add("ivysaur");
        number.add("Charmander");
        number.add("Pikachu");



        for(int i =0; i<number.size(); i++) {
            menu.getItems().add(new MenuItem(number.get(i)));
        }




    }
}
