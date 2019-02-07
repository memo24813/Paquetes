package pruebas;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		paquete1.Persona p= new paquete1.Persona(21,"Guillermo");
		paquete2.Persona m= new paquete2.Persona(21,"Diana","Femenino");
		System.out.println("Inicio de impresion: ");
		System.out.println(p.toString());
		System.out.println(m.toString());
		System.out.println("Fin!....");
	}

}
