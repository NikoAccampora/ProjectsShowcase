package aula_20_hospitalColecoes;

import java.util.ArrayList;

public class ListaDeMedicos {
	
private ArrayList<Medico> ListMedicos = new ArrayList<Medico>();
	

	
	public void addMedicos(Medico obj_medico) {
		if(obj_medico != null) {
		ListMedicos.add(obj_medico);
		}
	}
	
	public void removeMedicos(Medico obj_medico) {	
		ListMedicos.removeIf((list_thing)->list_thing.getNome().equalsIgnoreCase(obj_medico.getNome()));
	}
	
	public Medico buscar(Medico obj_medico) {
		for(Medico list_thing : ListMedicos) {
			if(list_thing.getNome().equalsIgnoreCase(obj_medico.getNome())) {
				return list_thing;
			}
		}
		
		return null;
	}
	
	public void editar(Medico obj_medico) { 
		int my_index = ListMedicos.indexOf(this.buscar(obj_medico));
		if(my_index != -1) {
		ListMedicos.set(my_index, obj_medico);
		}
	}
	
	public String listar(){
	    StringBuilder builder = new StringBuilder();
	    for(Medico obj_medico : this.ListMedicos) {
	    	builder.append(obj_medico.toString());
	    }
		return builder.toString();
	} 

}
