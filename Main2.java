/**
 * @file Carrito.java
 * @Author Carlos Diego Sanchez Alvarez
 * @date 01/05/2018
 * @brief Programas principal de la implemetacion de un ordenador de productos.
 */
import java.io.*;
import java.util.*;
public class Main2
{
	public static void main(String[] args) {
		ArrayList<Producto> productos = new ArrayList<Producto>(10);
		ArrayList<Carrito> carritos = new ArrayList<Carrito>(5);
		int opc0=0, opc1=0,id=0,cantidad=0;
		float precio=0;

		Producto producto1 = new Producto("Leche","Alpura",32,13,123);
		productos.add(producto1);
		producto1 = new Producto("Mayonesa","Mcornic",10,30,345);
		productos.add(producto1);
		producto1 = new Producto("Sal","La Esperanza",13,25,234);
		productos.add(producto1);
		producto1 = new Producto("Cerveza","Bohemia",50,11,111);
		productos.add(producto1);
		producto1 = new Producto("Limon","Sin marca",67,5,440);
		productos.add(producto1);
		producto1 = new Producto("Avena","Herdez",14,35,365);
		productos.add(producto1);
		producto1 = new Producto("Botellas de Agua","Bonafont",135,11,321);
		productos.add(producto1);
		producto1 = new Producto("Cuaderno","Scribd",41,30,569);
		productos.add(producto1);
		producto1 = new Producto("Pasta de Dientes","Colgate",30,25,456);
		productos.add(producto1);
		producto1 = new Producto("Frituras","Sabritas",30,16,699);
		productos.add(producto1);

		Item item =new Item();
		Carrito carro = new Carrito();
		String texto=new String();
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader buffer=new BufferedReader(in);

		while(opc0!=6)
		{
			System.out.println("--------------------------------------------");
			System.out.println("                Tienda Virtual              ");
			System.out.println("Elija un carrito a continuacion: 1 , 2, 3, 4, 5      6)salir");
			try
		    {
		        texto=buffer.readLine();
		    }catch(IOException e){};
		    opc0=Integer.valueOf(texto);
		     if(opc0<=5){
		     	opc0=opc0-1;
		    	carritos.add(opc0,carro);
		     }
		     	
		    System.out.println("---------------------------------------------");
		    System.out.println("A continuacion se le presentara los productos que tenemos en estanteria");
		    System.out.println("Producto\tMarca\tPrecio\tCantidad\tId");

		    for(Producto aux : productos)
		    {
				System.out.println(aux.getNombre() +"\t"+aux.getMarca()+"\t"+aux.getPrecio()+"\t"+aux.getCantidad()+"\t"+aux.getId());
		    }
		   
		   System.out.println("-----------------------------------------------");
		    System.out.println("Acciones posibles a realizar:");
		    System.out.println(" 1 Agregar Producto, 2 Borrar Producto, 3 Modificar cantidad de Producto, 4, Calucar Total,5 Vaciar Carrito, 6 Check Out");
		    try
		    {
		        texto=buffer.readLine();
		    }catch(IOException e){};
		    opc1=Integer.valueOf(texto);
		    switch(opc1)
		    {
		    	case 1:
		    		carro=carritros.get(opc0);

		    		System.out.println("Ingrese el Id del producto a desear");
		    		try
		    		{
		       			texto=buffer.readLine();
		    		}catch(IOException e){};
		    		id=Integer.valueOf(texto);
		    		

		    		System.out.println("Cuantos desea obtener:");
		    		try
		    		{
		       			texto=buffer.readLine();
		    		}catch(IOException e){};
		    		cantidad=Integer.valueOf(texto);
		    		
		    		precio=productos.get();


		    	break;
		    	case 2:
		    	break;
		    	case 3:
		    	break;
		    	case 4:
		    	break;
		    	case 5:
		    	break;
		    	case 6:
		    	break;
		    	default:
		    	break;
		    }
		}
	}	
}