package Jtable_municipio_6_3;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.*;
import javax.swing.table.TableModel;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class VentanaTablaDatos extends JFrame{
	
	private JTable tablaDatos;
	private DataSetMunicipios datosmunis;
	private TableModel modeloDatos;
	
	public VentanaTablaDatos( JFrame ventOrigen) {
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(800,600);
		
		tablaDatos = new JTable();
		add( new JScrollPane(tablaDatos), BorderLayout.CENTER);
		JPanel pInferior = new JPanel();
		JButton bAnyiadir = new JButton("Añadir");
		JButton bBorrar = new JButton("Borrar");
		pInferior.add(bAnyiadir);
		pInferior.add(bBorrar);
		add(pInferior,BorderLayout.SOUTH);
		
		//Paso 2
		
		this.addWindowListener(new WindowAdapter() {
			
			
			@Override
			public void windowOpened(WindowEvent e) {
				ventOrigen.setVisible(false);				
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				ventOrigen.setVisible(true);				
				
			}
			
		});
	}
	
	public void setDatos(DataSetMunicipios datosmunis) {
		
		this.datosmunis = datosmunis;
		modeloDatos = new MitableModel();
		tablaDatos.setModel(modeloDatos);
		
		
	}
	private class MitableModel implements TableModel {

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public String getColumnName(int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		// TODO Auto-generated method stub
		return Object.class;
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub
		
	}}
	
}
