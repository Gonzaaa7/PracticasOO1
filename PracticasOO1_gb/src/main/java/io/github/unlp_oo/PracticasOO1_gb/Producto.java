package io.github.unlp_oo.PracticasOO1_gb;

public class Producto {
	private String descripcion;
	private double peso;
	private double precioPorKilo;
		

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
	return this.precioPorKilo * this.peso;
}

public void setPrecioPorKilo(int i) {
	// TODO Auto-generated method stub
	
}
}
