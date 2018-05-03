/**
 * @file Producto.java
 * @Author Carlos Diego Sanchez Alvarez
 * @date 01/05/2018
 * @brief Programas principal de la implemetacion de un ordenador de productos.
 */
public class Producto
{
	private int id;
	private float precio;
	private String nombre;
	private int cantidad;
	private String marca;
	Producto (){
	}
	Producto(String nombre,String marca,int cantidad, float precio,int id){
		this.nombre=nombre;
		this.marca=marca;
		this.cantidad=cantidad;
		this.precio=precio;
		this.id=id;
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public String getNombre(){
		return this.nombre;
	}
	public void setMarca(String marca){
		this.marca=marca;
	}
	public String getMarca(){
		return this.marca;
	}
	public  void setCantidad(int cantidad){
		this.cantidad=cantidad;
	}
	public int getCantidad(){
		return this.cantidad;
	}
	public void setPrecio(float precio){
		this.precio=precio;
	}
	public float getPrecio(){
		return this.precio;
	}
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return this.id;
	}
}