package io.github.unlp_oo.PracticasOO1_gb;

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
	return this.precioTotal;
}
public int getCantidadDeProductos() {
	return this.cantidadDeProductos;
}
public void agregarProducto(Producto pro){
	this.cantidadDeProductos++;
	this.precioTotal= this.precioTotal+ pro.getPrecio();
	this.pesoTotal= this.pesoTotal +  pro.getPeso();
}
public Ticket emitirTicket() {
	Ticket t1 = new Ticket(1,this.cantidadDeProductos,this.pesoTotal,this.precioTotal);
	return t1;
}}