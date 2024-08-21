package Orientacao_Obj_21_08;

public class Computador {
	String modelo;
	String capacidadememoria;
	String cor;
	String marca;
	double valor;

public   String getCapacidadememoria() {
	return capacidadememoria;
}
public void setCapacidadememoria(String capacidadememoria) {
	this.capacidadememoria = capacidadememoria;
}
public String getcor(){
	return cor;
}
public void setCor(String cor) {
	this.cor =cor;
}
public String getMarca(){
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public String getModelo(){
	return modelo;
}
public void setModelo(String modelo) {
	this.modelo = modelo;
}
public double getValor(){
	return valor;
}
public void setValor(double valor) {
	this.valor = valor;
}
public String ligar(){
	return "Ligando o computador";
}
public String desligar() {
	return "deligando";
}
public String reniciar() {
	return "reniciando";
}
public String suspender() {
	return "Sistema suspenso";
}
public String bloquear() {
	return "Sistema bloqueado";
}
}
