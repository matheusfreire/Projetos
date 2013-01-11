package mainAluno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

import controlle.Controlle;
import entidades.Aluno;

public class MainAluno {

	public static void main(String[] args) {
		
		Controlle ctr = new Controlle();
		
		
		List<Aluno> listaAlunos = new ArrayList <Aluno>();
		
		int cadastro = 0;
		int volta = 0;
		int ordenar;
		String alunoRel = "";
		
				
		Object[] escolhas = {"Cadastro de Aluno"};
		
		cadastro = JOptionPane.showOptionDialog(null, "Opções Disponíveis", "Opções Disponíveis",JOptionPane.YES_OPTION, JOptionPane.NO_OPTION, null, escolhas, null);
		
		if(cadastro == JOptionPane.YES_OPTION){
			while(volta == JOptionPane.YES_OPTION){
			Aluno aluno = new Aluno();
			ctr.popularAluno(aluno);
			listaAlunos.add(aluno);
			//Collections.sort(listaAlunos);
						
			volta = JOptionPane.showConfirmDialog(null,"Deseja cadastrar novos Alunos?");
			}
			if(volta == JOptionPane.NO_OPTION){
				Object [] ordenacao = {"Por Nome", "Em Relação a Média"};
				ordenar = JOptionPane.showOptionDialog(null, "Tipos de Ordenação", "Escolha sua Ordenação", JOptionPane.YES_OPTION, JOptionPane.NO_OPTION, null, ordenacao, null);
				
						if(ordenar == JOptionPane.YES_OPTION){
							for (Aluno aluno : listaAlunos) {
								aluno.setTipoOrdenacao("Nome");
							}
							Collections.sort(listaAlunos);
							for(int i=0; i<listaAlunos.size();i++){
								alunoRel += listaAlunos.get(i).toString();
											
							}
							JOptionPane.showMessageDialog(null, alunoRel);
						}
						else if(ordenar == JOptionPane.NO_OPTION){
							for (Aluno aluno: listaAlunos) {
								aluno.setTipoOrdenacao("Media");
							}
							Collections.sort(listaAlunos);
							Collections.reverse(listaAlunos);
							for(int i=0; i<listaAlunos.size();i++){
								alunoRel += listaAlunos.get(i).toString();
							}
							JOptionPane.showMessageDialog(null, alunoRel);
						}
			}
		}
		
		else if(cadastro == JOptionPane.NO_OPTION){
			JOptionPane.showMessageDialog(null, "Obrigado por testar");
		}

	}

}
