/**
 * @file Carrito.java
 * @Author Carlos Diego Sanchez Alvarez
 * @date 01/05/2018
 * @brief Programas principal de la implemetacion de un ordenador de productos.
 asd
 */
import java.util.*;
public class Carrito
{
	private Item item;
	private ArrayList<Item> items;
	private int sumador,multiplicador;
	Carrito(){
		items=new ArrayList<Item>();
	}
	public void agregarItems(Item item){
		items.add(item);
	}
	public void borrarItem(int IdProd){
		for(Item aux : this.items){
			if(IdProd== aux.getIdProd())
			{
				items.remove(aux);
			}
		}
	}
	public boolean modificarItem(int IdProd, ArrayList<Producto> productos){
		for(Item aux : this.items){
			if(IdProd== aux.getIdProd())
			{
				//aux.get
			}
		}
		return false;
	}
	public float calcularTotal(){
		for(Item aux : this.items){
			multiplicador=aux.getCantidad();
			sumador=sumador+(aux.getPrecio())*multiplicador;
		}
		return sumador;
	}
	public boolean vaciarCarrito(){
		if(!this.items.isEmpty())
		{
		 	this.items.clear();
		 	return true;
		 }
		 else 
		 	return false;
	}
	public void CheckOut(){

	}
}
