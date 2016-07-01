package negocio;

public class Principal {

	public static void main(String[] args) {
		
		Grafo gr = new Grafo();
		
		System.out.println("Ciudad 1 a 6: "+gr.conexion("Ciudad 1","Ciudad 6"));
		System.out.println("Ciudad 2 a 6: "+gr.conexion("Ciudad 2","Ciudad 6"));
		System.out.println("Ciudad 3 a 6: "+gr.conexion("Ciudad 3","Ciudad 6"));
		System.out.println("Ciudad 4 a 6: "+gr.conexion("Ciudad 4","Ciudad 6"));
		System.out.println("Ciudad 5 a 6: "+gr.conexion("Ciudad 5","Ciudad 6"));
		System.out.println("Ciudad 1 a 3: "+gr.conexion("Ciudad 1","Ciudad 3"));
		System.out.println("Ciudad 2 a 4: "+gr.conexion("Ciudad 2","Ciudad 4"));
		System.out.println("Ciudad 5 a 2: "+gr.conexion("Ciudad 5","Ciudad 2"));
		System.out.println("Ciudad 6 a 2: "+gr.conexion("Ciudad 6","Ciudad 2"));
		System.out.println("Ciudad 5 a 1: "+gr.conexion("Ciudad 6","Ciudad 2"));

	}

}
