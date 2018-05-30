package vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {
	
	
	PanelBotonera botonera=new PanelBotonera();
	
	public VentanaPrincipal() {
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.add(botonera);
		pack();
		
	}
}
