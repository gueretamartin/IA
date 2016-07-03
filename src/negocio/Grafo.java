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
		if(ciudad.compareToIgnoreCase("Ciudad 1")==0)
		{
			return 0;
		}
		else if(ciudad.compareToIgnoreCase("Ciudad 2")==0)
		{
			return 1;
		}
		else if(ciudad.compareToIgnoreCase("Ciudad 3")==0)
		{
			return 2;
		}
		else if(ciudad.compareToIgnoreCase("Ciudad 4")==0)
		{
			return 3;
		}
		else if(ciudad.compareToIgnoreCase("Ciudad 5")==0)
		{
			return 4;
		}
		else if(ciudad.compareToIgnoreCase("Ciudad 6")==0)
		{
			return 5;
		}
		else
		{
			return 99;
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
