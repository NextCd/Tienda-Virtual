import javax.swing.JOptionPane;
import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		ArrayList<Producto> productos;
		ArrayList<Carrito> carritos;
		int opc0, opc1;
		Producto producto1 = new Producto(Leche,Alpura,32,13,lchalp);
		Carrito carro = new Carrito();

		productos.add(producto1);

		while(opc0!=5)
		{
			JOptionPane.showMessageDialog(null,"Tienda Virtual",
				"En esta aplicacion usted elijira el carrito que guste y podra meter el ticket de compra de lo que guste llevar"
				,JOptionPane.INFORMATION_MESSAGE);
			String[] possibleValues = { "1", "2", "3","4","5","Salir" };
			int carrito_index=JOptionPane.showOptionDialog(null,"Elija a continuacion con cual carrito trabajara:",
				"Carrito",0,JOptionPane.QUESTION_MESSAGE,null,possibleValues,0);
			JOptionPane.showMessageDialog(null,"Hora de comprar","A continuacion se le mostrara los productos que hay en sotck",
				JOptionPane.INFORMATION_MESSAGE);
			ans[0]= possibleValues[carrito_index];
			while(opc1!=0)
			{
				String[] opciones_tienda = { "Regresar", "Agregar Producto", "Borrar Producto","Modificar Compra","Calcular Total",
				"Vaciar Carrito","CheckOut" };
				int tienda_index=JOptionPane.showOptionDialog(null,"Elija la opcion deseada:",
				"Opciones",0,JOptionPane.QUESTION_MESSAGE,null,opciones_tienda,0);
				ans[0]= opciones_tienda[tienda_index];
				JOptionPane.showMessageDialog();		
			}
		}
	}
		
}