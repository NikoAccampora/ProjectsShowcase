package aula_20_hospitalColecoes;

import java.util.ArrayList;

public class ListaDeInternacoes {

private ArrayList<Internacao> ListInternacao = new ArrayList<Internacao>();
	

	public void addInterns(Internacao obj_internacao) {
		if(obj_internacao != null) {
		ListInternacao.add(obj_internacao);
		}
	}
	
	public void removeInterns(Internacao obj_internacao) {	
		ListInternacao.removeIf((list_thing)->list_thing.getData().equals(obj_internacao.getData()));
	}
	
	public Internacao buscar(Internacao obj_internacao) {
		for(Internacao list_thing : ListInternacao) {
			if(list_thing.getData().equals(obj_internacao.getData())) {
				return list_thing;
			}
		}
		
		return null;
	}
	
	public void editar(Internacao obj_internacao) { 
		int my_index = ListInternacao.indexOf(this.buscar(obj_internacao));
		if(my_index != -1) {
		ListInternacao.set(my_index, obj_internacao);
		}
	}
	
	public String listar(){
	    StringBuilder myBuilder = new StringBuilder();
	    for(Internacao obj_internacao : this.ListInternacao) {
	    	myBuilder.append(obj_internacao.toString());
	    }
		return myBuilder.toString();
	} 
	
}
