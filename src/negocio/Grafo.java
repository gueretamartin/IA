package negocio;

import java.util.ArrayList;

public class Grafo {
	
	ArrayList<String> grafo;
	
	public enum Ciudades
	{
		C1 ("Ciudad 1",0),
		C2 ("Ciudad 2",1),
		C3 ("Ciudad 3",2),
		C4 ("Ciudad 4",3),
		C5 ("Ciudad 5",4),
		C6 ("Ciudad 6",5);
		
		private final String nombre; 
	    private final int indice; 
	    
	    Ciudades (String nombre, int ind) { 
	        this.nombre = nombre;
	        this.indice = ind;
	    }
	    
	    public String getNombre() 
	    { 
	    	return this.nombre; 
	    }
	    
	    public int getIndice() 
	    { 
	    	return this.indice; 
	    }	    
	}	
	
	public Grafo()
	{
		grafo = new ArrayList<String>();
		grafo.add("010100");
		grafo.add("001000");
		grafo.add("000000");
		grafo.add("000011");
		grafo.add("000001");
		grafo.add("000000");
	}
	
	public Grafo(String[] rutas)
	{
		grafo = new ArrayList<String>();
		for(int i=0;i<rutas.length;i++)
		{
			grafo.add(rutas[i]);
		}
	}
	
	public Ciudades getCiudad(String nombre)
	{
		if(Ciudades.C1.getNombre().compareToIgnoreCase(nombre)==0)
		{
			return Ciudades.C1;
		}
		else if(Ciudades.C2.getNombre().compareToIgnoreCase(nombre)==0)
		{
			return Ciudades.C2;
		}
		else if(Ciudades.C3.getNombre().compareToIgnoreCase(nombre)==0)
		{
			return Ciudades.C3;
		}
		else if(Ciudades.C4.getNombre().compareToIgnoreCase(nombre)==0)
		{
			return Ciudades.C4;
		}
		else if(Ciudades.C5.getNombre().compareToIgnoreCase(nombre)==0)
		{
			return Ciudades.C5;
		}
		else
		{
			return Ciudades.C6;
		}
	}
	
	public boolean existe(String origen, String termino){
		Ciudades inicio = this.getCiudad(origen);
		Ciudades fin = this.getCiudad(termino);
		
		return existeConexion(inicio.getIndice(),fin.getIndice());		
		
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
