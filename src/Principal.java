import java.util.ArrayList;

public class Principal {

	
public static void main(String [] args)  {

	ArrayList<Pregunta> lista_preguntas=AccesoXML.leerXML();
	
	EntradaSalida.jugar(lista_preguntas);

}
	
}