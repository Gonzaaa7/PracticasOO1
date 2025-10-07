package io.github.unlp_oo.Presupuesto;

import java.time.LocalDate;

public class Presupuesto {
	private String cliente;
	private LocalDate fecha;
	private Item i;
	
public void agregarItem(Item item) {
	this.i = item;
}
public double calcularTotal() {
	return 0;
}
public void setFecha() {
	this.fecha = LocalDate.now();
}

public String getCliente() {
	return this.cliente ;
}
public LocalDate getFecha() {
	return this.fecha;
}
}
