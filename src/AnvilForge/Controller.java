package AnvilForge;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;

public class Controller implements Initializable {

    private int escolha;

    @FXML
    private FlowPane layout;

    @FXML
    private FlowPane layout2;

    @FXML
    private Button item;

    @FXML
    private Button block;

    @FXML
    private Button tool;

    @FXML
    private Button item3d;

    @FXML
    private Button criar_arquivo;

    @FXML
    private TextField nome_arquivo;

    @FXML
    private void criarItem(ActionEvent event) {
        switchVisible();
        setEscolha(1);
    }

    @FXML
    private void criarBloco(ActionEvent event) {
        switchVisible();
        setEscolha(2);
    }

    @FXML
    private void criarFerramenta(ActionEvent event) {
        switchVisible();
        setEscolha(3);
    }

    @FXML
    private void criarItem3D(ActionEvent event) {
        switchVisible();
        setEscolha(4);
    }

    private void switchVisible() {
        if(layout.isVisible()) {
            layout.setVisible(false);
            layout2.setVisible(true);
        }
        else {
            layout.setVisible(true);
            layout2.setVisible(false);
        }
    }

    @FXML
    private void createFile(ActionEvent event) {
        String nomeArquivo = nome_arquivo.getText();
        Choice.returnChoice(escolha, nomeArquivo);
        switchVisible();
    }

    private void setEscolha(int escolha) {
        this.escolha = escolha;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO Auto-generated method stub
    }
}