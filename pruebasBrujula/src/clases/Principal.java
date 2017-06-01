package clases;

import java.util.*;

public class Principal {

	public static void main(String[] args) {

		List<Figura> figuras= new ArrayList<Figura>(); //Creación del ArrayList
		
		Triangulo triangulo1 = new Triangulo(); //Creación de objeto de clase
		figuras.add(triangulo1); //Addición de dicho objeto al ArrayList creado
		
		Rectangulo rectangulo1= new Rectangulo();
		figuras.add(rectangulo1);
		
		Triangulo triangulo2 = new Triangulo();
		figuras.add(triangulo2);
		
		Rectangulo rectangulo2= new Rectangulo();
		figuras.add(rectangulo2);
		
		Rombo rombo = new Rombo();
		figuras.add(rombo);
		
		
		
		for (Figura recorrido1: figuras){
			
			if(recorrido1.getClass().getSuperclass().getSimpleName().equals("Cuadrado")){
				recorrido1.pintar();
			   }
					
			}
   System.out.println("--------------");
      
   for (Figura recorrido2: figuras){
			
			if(recorrido2.getClass().getSimpleName().equals("Triangulo")){
				recorrido2.pintar();
			   }
					
			}
	}

}
