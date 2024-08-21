package Orientacao_Obj_21_08;

public class Obj_Usuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Usuario usuario1 = new Usuario();
 
  usuario1.setnome("Tainá");
  usuario1.setUsuario("Administrador");
  usuario1.setpermissao("navegar");
  usuario1.setPassword(20180402);
  usuario1.setId(1980876);
  
  
  System.out.println("--------------------------------");
  System.out.println(usuario1.getnome());
  System.out.println(usuario1.getUsuario());
  System.out.println(usuario1.getpermissao());
  System.out.println(usuario1.getnome());
  System.out.println(usuario1.getPassword());
  System.out.println(usuario1.cadratar());
  System.out.println(usuario1.mudar());
	}

}
