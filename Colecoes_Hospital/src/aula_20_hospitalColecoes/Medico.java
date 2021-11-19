package aula_20_hospitalColecoes;

public class Medico {
	
	private String nome;
	private String telefone;
	private String crm;
	private Endereco endereco;
	
	
	Medico(String nome, String telefone, String crm, Endereco endereco) {
		this.nome = nome;
		this.telefone = telefone;
		this.crm = crm;
		this.endereco = endereco;
	}
	
	Medico(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getTelefone() {
		return this.telefone;
	}
	
	public String getCRM() {
		return this.crm;
	}
	
	public String getEndereco() {
		return this.crm;
	}
	
	@Override
	public String toString() {
		return String.format("Médico: %s\nTelefone: %s\nCRM: %s\nEndereço: %s - %s\n\n", this.nome, this.telefone, this.crm, this.endereco.getRua(), this.endereco.getNumero());
	}

}
