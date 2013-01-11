package controlle;

import javax.swing.JOptionPane;

import entidades.Aluno;

public class Controlle {
	
	public Aluno popularAluno (Aluno aluno){
		aluno.setNome(JOptionPane.showInputDialog("Nome do Aluno: "));
		aluno.setNota1(Double.parseDouble(JOptionPane.showInputDialog("Nota 1: ")));
		aluno.setNota2(Double.parseDouble(JOptionPane.showInputDialog("Nota 2: ")));
		aluno.setMedia(aluno.calcularMedia());
		return aluno;
	}

}
