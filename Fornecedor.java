package Orientacao_Obj_21_08;

public class Fornecedor {

	String  razaosocial;
	String  nomefantasia;
	String cnpj;
	int id;
    String endereco;
    String telefone;
    String email;
    String inscricaoestadual;
    
    public   String getRazaosocial() {
		return razaosocial;
	}
	public void setRazaosocial(String razaosocial) {
		this.razaosocial = razaosocial;
	}
	public String getNomefantasia(){
		return nomefantasia;
	}
	public void setNomefantasia(String nomefantasia) {
		this.nomefantasia = nomefantasia;
	}
	public String getCnpj(){
		return cnpj;
	}
	public void setCpnj(String Cnpj) {
		this.cnpj = cnpj;
	}
	public String getendereco(){
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getId(){
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String gettelefone(){
		return telefone;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail(){
		return email;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getInscricaoestadual(){
		return inscricaoestadual;
	}
	public void setInscricaoestadual(String inscricaoestadual) { 
		this.inscricaoestadual = inscricaoestadual;
}
	public String agendar(){
		return "agendado";
	}
	public String contrato() {
		return "contarto realizado";
	}
	public String vender() {
		return "vendas concluídas ";
	}
	
}



    

