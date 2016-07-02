package negocio;

public class Principal {

	public static void main(String[] args) {
		
		String[] rutas = {"010100","001000","000000","000011","000001","000000"};
		Grafo gr = new Grafo(rutas);
		
		System.out.println("Ciudad 1 a 6: "+gr.existe("Ciudad 1","Ciudad 6"));
		System.out.println("Ciudad 2 a 6: "+gr.existe("Ciudad 2","Ciudad 6"));
		System.out.println("Ciudad 3 a 6: "+gr.existe("Ciudad 3","Ciudad 6"));
		System.out.println("Ciudad 4 a 6: "+gr.existe("Ciudad 4","Ciudad 6"));
		System.out.println("Ciudad 5 a 6: "+gr.existe("Ciudad 5","Ciudad 6"));
		System.out.println("Ciudad 2 a 3: "+gr.existe("Ciudad 2","Ciudad 3"));
		System.out.println("Ciudad 1 a 2: "+gr.existe("Ciudad 1","Ciudad 2"));
		System.out.println("Ciudad 3 a 5: "+gr.existe("Ciudad 3","Ciudad 5"));
		System.out.println("Ciudad 2 a 5: "+gr.existe("Ciudad 2","Ciudad 5"));
		System.out.println("Ciudad 1 a 3: "+gr.existe("Ciudad 1","Ciudad 3"));		
	}

}
