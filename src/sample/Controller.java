package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Observable;

public class Controller {

    public Tab tabQuestions;
    public Tab tabStart;
    public Button btnStart;
    public TextArea txtQ1;
    public CheckBox checkBoxQ1A;
    public CheckBox checkBoxQ1B;
    public CheckBox checkBoxQ1C;
    public CheckBox checkBoxQ1D;
    public TextArea txtQ2;
    public CheckBox checkBoxQ2A;
    public CheckBox checkBoxQ2B;
    public CheckBox checkBoxQ2C;
    public CheckBox checkBoxQ2D;
    public TextArea txtQ3;
    public CheckBox checkBoxQ3A;
    public CheckBox checkBoxQ3B;
    public CheckBox checkBoxQ3C;
    public CheckBox checkBoxQ3D;
    public TextArea txtQ4;
    public CheckBox checkBoxQ4A;
    public CheckBox checkBoxQ4B;
    public CheckBox checkBoxQ4C;
    public CheckBox checkBoxQ4D;
    public TextArea txtQ5;
    public CheckBox checkBoxQ5A;
    public CheckBox checkBoxQ5B;
    public CheckBox checkBoxQ5C;
    public CheckBox checkBoxQ5D;
    public TextArea txtQ6;
    public CheckBox checkBoxQ6A;
    public CheckBox checkBoxQ6B;
    public CheckBox checkBoxQ6C;
    public CheckBox checkBoxQ6D;
    public TextArea txtQ7;
    public CheckBox checkBoxQ7A;
    public CheckBox checkBoxQ7B;
    public CheckBox checkBoxQ7C;
    public CheckBox checkBoxQ7D;
    public TextArea txtQ8;
    public CheckBox checkBoxQ8A;
    public CheckBox checkBoxQ8B;
    public CheckBox checkBoxQ8C;
    public CheckBox checkBoxQ8D;
    public TextArea txtQ9;
    public CheckBox checkBoxQ9A;
    public CheckBox checkBoxQ9B;
    public CheckBox checkBoxQ9C;
    public CheckBox checkBoxQ9D;
    public TextArea txtQ10;
    public CheckBox checkBoxQ10A;
    public CheckBox checkBoxQ10B;
    public CheckBox checkBoxQ10C;
    public CheckBox checkBoxQ10D;
    public Tab tabResults;
    public TabPane tabPane;

    int count=0;


    public void initialize(){
        readQuestions();
    }

    Map<>
    List<TextArea> questions = new ArrayList<TextArea>();
    List<CheckBox> answerQ1 = new ArrayList<>();

    public boolean assignAnswer() {
        txtQ1.is
    }

    public void readQuestions() {
       questions.add(txtQ1);
       questions.add(txtQ2);
       questions.add(txtQ3);
       questions.add(txtQ4);
       questions.add(txtQ5);
       questions.add(txtQ6);
       questions.add(txtQ7);
       questions.add(txtQ8);
       questions.add(txtQ9);
       questions.add(txtQ10);
    }

//    public void checkAnswer() {
//        for (TextArea t: questions
//             ) {
//            if (txtQ1.){
//                checkBoxQ1A.isSelected()
//                 count++;
//            }
//        }
//    }


    public void startQuiz(ActionEvent actionEvent) {
    tabPane.getTabs().clear();
    tabPane.getTabs().add(tabQuestions);
    }

    public void takeAnswer(){
        CheckBox checkBox = new CheckBox();
        checkBox.selectedProperty().addListener((observable, oldValue, newValue) -> {
        });
    }

    public void seeResults(ActionEvent actionEvent) {
//        actiunea pentru butonul de submit
    }
}
