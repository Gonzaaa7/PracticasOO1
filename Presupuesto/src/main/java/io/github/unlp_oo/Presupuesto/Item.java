package io.github.unlp_oo.Presupuesto;

public class Item {
	private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	
public void setDetalle(String det) {
	this.detalle = det;
}
public void setCantidad(int can) {
	this.cantidad = can;
}
public void setCostoUnitario(double cst) {
	this.costoUnitario = cst;
}

public String getDetalle() {
	return this.detalle;
}
public int getCantidad() {
	return this.cantidad;
}
public double getCostoUnitario() {
	return this.costoUnitario;
}

public double costo() {
	return this.costoUnitario * this.cantidad;
}




}
