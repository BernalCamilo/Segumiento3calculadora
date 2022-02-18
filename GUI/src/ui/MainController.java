package ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MainController {
	public MainController() {
		// TODO Auto-generated constructor stub
	}

	 @FXML
	    private Button botton0;

	    @FXML
	    private TextArea historialArea;

	    @FXML
	    private Button botton1;

	    @FXML
	    private Button botton2;

	    @FXML
	    private Button botton3;

	    @FXML
	    private Button botton4;

	    @FXML
	    private Button botton5;

	    @FXML
	    private Button botton6;

	    @FXML
	    private Button botton7;

	    @FXML
	    private Button botton8;

	    @FXML
	    private Button botton9;

	    @FXML
	    private Button bottonSumar;

	    @FXML
	    private Button bottonRestar;

	    @FXML
	    private Button calcularBotton;

	    @FXML
	    private TextField textFieldResultado;

	    @FXML
	    private Button bottonBorrar;

	    @FXML
	    private TextField textFieldResultado1;


    @FXML
    void letraOprimida(ActionEvent event) {
    	Button operationButton = (Button) event.getSource();
    	String texto = operationButton.getText();
    	
    	textFieldResultado.appendText(texto);
    }
    
    @FXML
    void calcular (ActionEvent event) {
    	String operacionString=textFieldResultado.getText();
    	String[] sumaStrings = operacionString.split("\\+");
    	String[] restaStrings = operacionString.split("-");
    	String[] multiplicacionStrings = operacionString.split("\\*");
    	
    	int primerOperador = 0;
    	int segundoOperador = 0;
    	int resultado=0;
    	String resultadoString="";
    	String historialString="";
    	
    	if (sumaStrings.length>1) {
    		primerOperador=Integer.parseInt(sumaStrings[0]);
    		segundoOperador=Integer.parseInt(sumaStrings[1]);
    		resultado=primerOperador+segundoOperador;
    		resultadoString=resultado+"";
    		historialString=operacionString+"="+resultadoString;
    		
    		historialArea.appendText(historialString+"\n");
    		textFieldResultado1.setText(resultadoString);

    	} else if (restaStrings.length>1) {
    		primerOperador=Integer.parseInt(restaStrings[0]);
    		segundoOperador=Integer.parseInt(restaStrings[1]);
    		resultado=primerOperador-segundoOperador;
    		resultadoString=resultado+"";
    		historialString=operacionString+"="+resultadoString;
    		
    		historialArea.appendText(historialString+"\n");
    		textFieldResultado1.setText(resultadoString);
    		
    	} else if(multiplicacionStrings.length>1) {
    		primerOperador=Integer.parseInt(multiplicacionStrings[0]);
    		segundoOperador=Integer.parseInt(multiplicacionStrings[1]);
    		resultado=primerOperador*segundoOperador;
    		resultadoString=resultado+"";
    		historialString=operacionString+"="+resultadoString;
    		
    		historialArea.appendText(historialString+"\n");
    		textFieldResultado1.setText(resultadoString);
    	}
    }
    
    @FXML
    void borrar (ActionEvent event) {
    	textFieldResultado.setText("");
    	textFieldResultado1.setText("");
    }
}
