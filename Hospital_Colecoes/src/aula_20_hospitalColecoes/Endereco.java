package aula_20_hospitalColecoes;

public class Endereco {
	
	private String rua;
    private String numero;
    private String bairro;
    private String cep;
    
    public Endereco(String rua, String numero, String bairro, String cep) {
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cep = cep;
	}
    
    
    //GETTERS
	public String getRua() {
		return rua;
	}

	public String getNumero() {
		return numero;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCep() {
		return cep;
	}
	
    //SETTERS
	public void setRua(String rua) {
		this.rua = rua;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
    
    

}
