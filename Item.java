/**
 * @file Item.java
 * @Author Carlos Diego Sanchez Alvarez
 * @date 01/05/2018
 * @brief 
 */
public class Item
{
	private int IdProd;
	private int cantidad;
	private float precio;
	Item(int IdProd,int cantidad,int precio){
		this.IdProd=IdProd;
		this.cantidad=cantidad;
		this.precio=precio;
	}
	public void setIdProd(int IdProd){
		this.IdProd=IdProd;
	}
	public int getIdProd(){
		return this.IdProd;
	}
	public void setCantidad(){
		this.cantidad=cantidad;
	}
	public int getCantidad(){
		return this.cantidad;
	} 
	public void setPrecio(int precio){
		this.precio=precio;
	}
	public float getPrecio(){
		return this.precio;
	}
}