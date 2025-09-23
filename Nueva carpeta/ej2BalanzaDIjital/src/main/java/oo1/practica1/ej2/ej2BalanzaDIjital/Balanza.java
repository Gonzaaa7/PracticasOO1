package oo1.practica1.ej2.ej2BalanzaDIjital;

public class Balanza {
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;


public void ponerEnCero() {
	this.cantidadDeProductos = 0;
	this.precioTotal = 0;
	this.pesoTotal = 0;
}
public double getPesoTotal() {
	return this.pesoTotal;
}
public double getPrecioTotal() {
	return this.pesoTotal;
}
public int getCantidadDeProductos() {
	return this.cantidadDeProductos;
}
public void agregarProducto(Producto pro){
	this.cantidadDeProductos++;
	this.precioTotal= pro.getPrecio();
	this.pesoTotal= pro.getPeso();
}
public Ticket emitirTicket() {
	Ticket t1 = new Ticket(1,this.cantidadDeProductos,this.pesoTotal,this.precioTotal);
	return t1;
}}