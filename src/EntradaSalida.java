import java.util.ArrayList;
import java.util.Scanner;

public class EntradaSalida {

static 	Scanner sc=new Scanner(System.in);
	
public static void jugar(ArrayList<Pregunta> lista_preguntas) {
	
		System.out.println("PASAPALABRA:");
		
		for(int i=0; i<lista_preguntas.size(); i++)
		{
			Pregunta p=lista_preguntas.get(i);
			System.out.println("Pregunta nº "+(i+1));
		    System.out.println(p.getPosicion()+" ("+p.getLetra()+") "+p.getDefinicion());
            String solucion=sc.nextLine();
            if(solucion.equalsIgnoreCase(p.getSolucion()))
            {
            	System.out.println("CORRECTO.");
            }
            else 
            {
            	System.out.println("FALSO. La solución era :  "+p.getSolucion());
            }
		
		}
		
	}

}
