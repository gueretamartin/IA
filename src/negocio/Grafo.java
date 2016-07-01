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

	public boolean conexion(String origen, String termino) {
		
		Ciudades inicio = this.getCiudad(origen);
		Ciudades fin = this.getCiudad(termino);
		String ciudadesPartida = grafo.get(inicio.getIndice());
		boolean existe = false;
		
		if(ciudadesPartida.charAt(fin.getIndice())=='1')
		{
			existe = true;
		}
		
		if(!(existe))
		{
			for(int i=0;i<ciudadesPartida.length();i++)
			{
				if(ciudadesPartida.charAt(i)=='1')
				{
					String ciudadesSiguientes = grafo.get(i);
					if(ciudadesSiguientes.charAt(fin.getIndice())=='1')
					{					
						existe = true;
						break;
					}	

					for(int j=0;j<ciudadesSiguientes.length();j++)
					{						
						if(ciudadesSiguientes.charAt(j)=='1')
						{
							String ciudadesSiguientes1 = grafo.get(j);
							if(ciudadesSiguientes1.charAt(fin.getIndice())=='1')
							{					
								existe = true;
								break;
							}
							
							for(int k=0;k<ciudadesSiguientes1.length();k++)
							{
								if(ciudadesSiguientes1.charAt(k)=='1')
								{
									String ciudadesSiguientes2 = grafo.get(k);
									if(ciudadesSiguientes2.charAt(fin.getIndice())=='1')
									{					
										existe = true;
										break;
									}
									
									for(int l=0;l<ciudadesSiguientes2.length();l++)
									{
										if(ciudadesSiguientes2.charAt(l)=='1')
										{
											String ciudadesSiguientes3 = grafo.get(l);
											if(ciudadesSiguientes3.charAt(fin.getIndice())=='1')
											{					
												existe = true;
												break;
											}
											
											for(int m=0;m<ciudadesSiguientes3.length();m++)
											{
												if(ciudadesSiguientes3.charAt(m)=='1')
												{
													String ciudadesSiguientes4 = grafo.get(m);
													if(ciudadesSiguientes4.charAt(fin.getIndice())=='1')
													{					
														existe = true;
														break;
													}			
													
													for(int n=0;n<ciudadesSiguientes4.length();n++)
													{
														if(ciudadesSiguientes4.charAt(n)=='1')
														{
															String ciudadesSiguientes5 = grafo.get(n);
															if(ciudadesSiguientes5.charAt(fin.getIndice())=='1')
															{					
																existe = true;
																break;
															}	
														}								
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		
		return existe;		
		
	}

}
