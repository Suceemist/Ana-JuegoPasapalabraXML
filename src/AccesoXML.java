import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class AccesoXML {
	
public static ArrayList<Pregunta> leerXML() {
	
   Pregunta p= null;
   SAXBuilder builder = new SAXBuilder();
   ArrayList<Pregunta> lista_preguntas=new ArrayList<>();
   try {
		Document documento = builder.build(new File("C:\\\\IFCT0609 Eclipse\\\\Worspace Eclipse\\\\JuegoPasapalabraXML\\\\Pasapalabra_XML\\\\pasapalabra.xml"));
		Element elemento_raiz=documento.getRootElement();//El xml
		Element elemento_jugador=elemento_raiz.getChild("jugador");
		
		List<Element> lista_elementos_pregunta=elemento_jugador.getChildren("pregunta");
		
	
		for (Element element: lista_elementos_pregunta) {
			Element elemento_letra=element.getChild("letra");
			Element elemento_posicion=element.getChild("posicion");
			Element elemento_definicion=element.getChild("definicion");
			Element elemento_solucion=element.getChild("solucion");
			
			String letra=elemento_letra.getValue();
			String posicion=elemento_posicion.getValue();
			String definicion=elemento_definicion.getValue();
			String solucion=elemento_solucion.getValue();
			
			p= new Pregunta(letra, posicion, definicion, solucion);
			lista_preguntas.add(p);
	       }
		
		} 
    catch (JDOMException e) 
        {
			e.printStackTrace();
	    } 
   catch (IOException e) 
        {
			e.printStackTrace();
		}
   
	return lista_preguntas;
	
   }


}
