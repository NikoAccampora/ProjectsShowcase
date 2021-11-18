package aula_20_hospitalColecoes;

import java.util.ArrayList;

public class ListaDePacientes {
	
private ArrayList<Paciente> ListPacientes = new ArrayList<Paciente>();
	

	
	public void addPacientes(Paciente obj_paciente) {
		if(obj_paciente != null) {
		ListPacientes.add(obj_paciente);
		}
	}
	
	public void removePacientes(Paciente obj_paciente) {	
		ListPacientes.removeIf((list_thing)->list_thing.getCPF().equals(obj_paciente.getCPF()));
	}
	
	public Paciente buscar(Paciente obj_paciente) {
		for(Paciente list_thing : ListPacientes) {
			if(list_thing.getCPF().equals(obj_paciente.getCPF())) {
				return list_thing;
			}
		}
		
		return null;
	}
	
	public void editar(Paciente obj_paciente) { 
		int my_index = ListPacientes.indexOf(this.buscar(obj_paciente));
		if(my_index != -1) {
		ListPacientes.set(my_index, obj_paciente);
		}
	}
	
	public String listar(){
	    StringBuilder myBuilder = new StringBuilder();
	    for(Paciente obj_paciente : this.ListPacientes) {
	    	myBuilder.append(obj_paciente.toString());
	    }
		return myBuilder.toString();
	} 

}
