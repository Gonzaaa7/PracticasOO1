package oo1.practica1.ej2.ej2BalanzaDIjital;

public class Ticket {
		private int fecha;
		private int cantidadDeProductos;
		private double pesoTotal;
		private double precioTotal;
}
public Ticket(int fe, int cant, double peso, double pre ){
	this.cantidadDeProductos = cant;
	this.fecha = fe;
	this.pesoTotal = peso;
	this.precioTotal = pre;
}

public double impuesto() {
	return this.precioTotal *0.21
}