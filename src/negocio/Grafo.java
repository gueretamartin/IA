package negocio;

import java.util.ArrayList;

public class Grafo {
	
	ArrayList<String> grafo;
	
	public Grafo(String[] rutas)
	{
		grafo = new ArrayList<String>();
		for(int i=0;i<rutas.length;i++)
		{
			grafo.add(rutas[i]);
		}
	}
	
	public int dameIndiceCiudad(String ciudad)
	{		
		switch (ciudad)
		{
			case "Ciudad 1": return 0;
			case "Ciudad 2": return 1;
			case "Ciudad 3": return 2;
			case "Ciudad 4": return 3;
			case "Ciudad 5": return 4;
			case "Ciudad 6": return 5;
			default: return 99;
		}
	}
	
	public boolean existe(String origen, String termino){
		
		return existeConexion(this.dameIndiceCiudad(origen),this.dameIndiceCiudad(termino));
	}
	
	public boolean existeConexion(int origen, int termino){

		String ciudadesPartida = grafo.get(origen);
		boolean existe = false;
		
		if(ciudadesPartida.charAt(termino)=='1')
		{
			return true;
		}
		
		for(int n=0;n<ciudadesPartida.length();n++)
		{
			if(ciudadesPartida.charAt(n)=='1')
			{
				existe = existeConexion(n,termino);
			}
			if(existe)
			{
				return true;
			}
		}
		
		return existe;
	}

}
