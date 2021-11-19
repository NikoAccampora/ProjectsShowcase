package aula_20_hospitalColecoes;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		ListaDeMedicos exec_ListaDeMedicos = new ListaDeMedicos();
		ListaDePacientes exec_ListaDePacientes = new ListaDePacientes();
		ListaDeInternacoes exec_ListaDeInternacoes = new ListaDeInternacoes();
		//------------------------------------------------------------
		
		Endereco end1 = new Endereco("Av. João Barcelos", "22", "São José", "9999-99");
		Endereco end2 = new Endereco("Av. Maria Santos", "79", "Sarandi", "3333-33");
		Endereco end3 = new Endereco("Av. do Forte", "14", "Cristo Redentor", "1111-11");
		Endereco end4 = new Endereco("Av. Salvador", "36", "Cacheatas", "5555-55");
		
		
		
////--------------------------=MÉDICOS=-----------------------------		
		
		Medico laercio = new Medico("Laércio dos Santos", "999999","000-RS", end1);
		Medico mara = new Medico("Mara Núbia", "333333","005-RS", end2);
		
		// Adicinar na lista
		exec_ListaDeMedicos.addMedicos(laercio);
		exec_ListaDeMedicos.addMedicos(mara);
		
		
		System.out.println(exec_ListaDeMedicos.listar());
		
		// Modificar mara
		Medico mara2 = new Medico("Mara Núbia", "333444","006-RS", end3); 
     	
		exec_ListaDeMedicos.editar(mara2);
		
		System.out.println(exec_ListaDeMedicos.listar());
		
		
		// Remoção
      //exec_ListaDeMedicos.removeMedicos(mara2); //TANTO FAZ!!
		exec_ListaDeMedicos.removeMedicos(mara);
		
		System.out.println(exec_ListaDeMedicos.listar());
		
////---------------------=PACIENTES=-----------------------------
		
		Paciente joao = new Paciente("João Vitor", "11122233355","141414", end3);
		Paciente ana = new Paciente("Ana Maria", "99988877722","323232", end4);
		
		// Adicinar na lista
		exec_ListaDePacientes.addPacientes(joao);
		exec_ListaDePacientes.addPacientes(ana);
		
		
		System.out.println(exec_ListaDePacientes.listar());
		
     	// Modificar ana
		Paciente ana2 = new Paciente("Ana Júlia", "99988877722","969696", end1); 
     	
		exec_ListaDePacientes.editar(ana2);
		
		System.out.println(exec_ListaDePacientes.listar());
		
		// Remoção
      //exec_ListaDePacientes.removePacientes(ana2); //TANTO FAZ!!
		exec_ListaDePacientes.removePacientes(ana);
		
		System.out.println(exec_ListaDePacientes.listar());
		
////---------------------=INTERNAÇÕES=-----------------------------
		
		//ADD
	    Internacao intern1 = new Internacao(laercio, joao, LocalDate.of(2020, 4, 12));
		Internacao intern2 = new Internacao(mara, ana, LocalDate.of(2019, 11, 23));
		
		exec_ListaDeInternacoes.addInterns(intern1);
		exec_ListaDeInternacoes.addInterns(intern2);
		
		System.out.println(exec_ListaDeInternacoes.listar());
		
		//EDIT
		Internacao intern2a = new Internacao(laercio, ana, LocalDate.of(2021, 11, 23));
		
		exec_ListaDeInternacoes.editar(intern2a);
		
		System.out.println(exec_ListaDeInternacoes.listar());
		
		//REMOVE
		exec_ListaDeInternacoes.removeInterns(intern1);
			
		System.out.println(exec_ListaDeInternacoes.listar());
	}

}
