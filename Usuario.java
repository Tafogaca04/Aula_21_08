package Orientacao_Obj_21_08;

public class Usuario {

	String nome;
	int password;
	String permissao;
	String usuario;
	int id;
	public   String getnome() {
		return nome;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	public String getpermissao(){
		return permissao;
	}
	public void setpermissao(String permissao) {
		this.permissao = permissao;
	}
	public String getUsuario(){
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public int getPassword(){
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public int getId(){
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String ligar(){
		return "Ligando o sistema";
	}
	public String cadratar() {
		return "casdrato concluído";
	}
	public String pesquisar() {
		return "pesquisando ";
	}
	public String excluir() {
		return "excluir conta";
	}
	public String mudar() {
		return "mudando senha";
	}
	}


