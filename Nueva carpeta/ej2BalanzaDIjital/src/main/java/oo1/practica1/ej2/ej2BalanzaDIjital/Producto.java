package oo1.practica1.ej2.ej2BalanzaDIjital;

public class Producto {
	private String descripcion;
	private double peso;
	private double precioPorKilo;
	private double precio;
		

public Producto(String desc, double pe, double prexk){
	this.descripcion = desc;
	this.peso = pe;
	this.precioPorKilo = prexk;
}
public String getDescripcion() {
	return this.descripcion;
}
public void setPeso(double pe) {
	this.peso = pe;
}
public double getPeso() {
	return this.peso;
}
public	double getPrecioPorKG() {
	return this.precioPorKilo;
}
public void setPrecioPorKG(double pre) {
	this.precioPorKilo = pre;
}
public	double getPrecio() {
	return this.precio;
}

public void setPrecio(double pre) {
	this.precio = pre * this.peso;
}
public void setPrecioPorKilo(int i) {
	// TODO Auto-generated method stub
	
}
}
