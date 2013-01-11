package janelas;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import entidades.Aluno;

public class AlunoTableModel extends AbstractTableModel {

	private static final long serialVersionUID = 1L;

	private static final int COL_ID = 0;
	private static final int COL_NOME = 1;
	private static final int COL_NOTA = 2;
	
	private List <Aluno> lista;
	
	public AlunoTableModel(List<Aluno> listaAluno){
		this.lista = listaAluno;
	}
	
	
	@Override
	public int getColumnCount() {
		return 3;
	}

	@Override
	public int getRowCount() {
		return lista.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		
		Aluno titulo = lista.get(rowIndex);
		
		switch(columnIndex){
		case 0:
			return titulo.getId();
		case 1:
			return titulo.getNome();
		case 2:
			return titulo.getNota();
		default:
			throw new IndexOutOfBoundsException("column index out of bounds");
		}
	}
	
	
	public String getColumnName(int column){
		if (column == COL_ID) return "Id";
		else if(column == COL_NOME) return "Nome";
		else if(column == COL_NOTA) return "Nota";
		return "";
	}
	
	@Override
	public Class<?> getColumnClass(int columnIndex){
		switch(columnIndex){
		case 0:
			return Integer.class;
		case 1:
			return String.class;
		case 2:
			return Double.class;
		default:
			throw new IndexOutOfBoundsException("columnIndex out of bounds");
		}
	}
	
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex){
		return true;
	}

}
