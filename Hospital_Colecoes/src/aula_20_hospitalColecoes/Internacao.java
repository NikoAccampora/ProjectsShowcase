package aula_20_hospitalColecoes;

import java.time.LocalDate;

public class Internacao {
	
	private LocalDate data;
	private Medico medico;
	private Paciente paciente;
	
	Internacao(Medico medico, Paciente paciente, LocalDate data) {
		this.medico = medico;
		this.paciente = paciente;
		this.data = data;
	}
	
	Internacao(LocalDate data) {
		this.data = data;
	}
	
	public LocalDate getData() {
		return this.data;
	}
	
	public Medico getMedico() {
		return this.medico;
	}
	
	public Paciente getPaciente() {
		return this.paciente;
	}
	
	@Override
	public String toString() {
		return String.format("Médico: %s\nPaciente: %s\nData: %s\n\n", this.medico.getNome(), this.paciente.getNome(), this.data);
	}

}
