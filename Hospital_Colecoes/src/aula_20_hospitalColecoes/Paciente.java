package aula_20_hospitalColecoes;

public class Paciente {

	private String nome;
	private String cpf;
	private String rg;
	private Endereco endereco;
	
	
	Paciente(String nome, String cpf, String rg, Endereco endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.endereco = endereco;
	}
	
	Paciente(String cpf) {
		this.nome = cpf;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCPF() {
		return this.cpf;
	}
	
	public String getRG() {
		return this.rg;
	}
	
	public String getEndereco() {
		return this.rg;
	}
	
	@Override
	public String toString() {
		return String.format("Paciente: %s\nCPF: %s\nRegistro Geral: %s\nEndereço: %s - %s\n\n", this.nome, this.cpf, this.rg, this.endereco.getRua(), this.endereco.getNumero());
	}
	
}
