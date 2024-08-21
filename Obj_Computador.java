package Orientacao_Obj_21_08;

public class Obj_Computador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 Computador computador1= new Computador();
 
 
computador1.setModelo("Inspiron 24 All in One");
computador1.setCor("preta");
computador1.setMarca("Dell");
computador1.setCapacidadememoria("16GB 3200MHz 2x8GB");
computador1.setValor(5000);

System.out.println("--------------------------------");
System.out.println(computador1.getModelo());
System.out.println(computador1.getMarca());
System.out.println(computador1.getCapacidadememoria());
System.out.println(computador1.getcor());
System.out.println(computador1.getValor());
System.out.println(computador1.ligar());
System.out.println(computador1.bloquear());
	}

}
