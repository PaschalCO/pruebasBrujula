package clases;

public class Cuadrado extends Figura{

	@Override
	protected void pintar() {
         System.out.println(this.getClass().getSimpleName());		
	}

}
