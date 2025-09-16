package oo1.practica1.ej2.ej2BalanzaDIjital;

public class Producto {
	private String descripcion;
	private double peso;
	private double precioPorKilo;
	private double precio; 
	}

public Producto(String desc, double pe, double prexk){
	this.descripcion = desc;
	this.peso = pe;
	this.precioPorKilo = prexk;
}

public void setPrecio(double pre) {
	this.precio = this.precioPorKilo * this.peso;
}
public double getPeso() {
	return this.peso;
}
public double getPrecio() {
	return this.precio;
	}
}

