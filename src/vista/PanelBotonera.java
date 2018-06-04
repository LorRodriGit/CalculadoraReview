package vista;

import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelBotonera extends JPanel{

	JButton[] numerico=new JButton[10];
	JButton [] operadores=new JButton[12];
	JButton btComa,btTotal,btRetroceso,btDividir,btMMAs, btMult,butSqrt,btMMenos,btSuma,btResta,btMC
			,btAC,btMasMenos,btMR;
	JPanel panelNumerico,panelOperadores;
	
	
	
	public PanelBotonera() {
		 crearNumeradores();
		 crearOperadores();
		 crearPanelBotonera();
	}

	private void crearNumeradores() {
		for (int i = 0; i <= 9; i++) {
			numerico[i]=new JButton(String.valueOf(i));
		}
		
	}

	private void crearOperadores() {
		btRetroceso=new JButton("◄");
		btDividir=new JButton("/");
		btMMAs=new JButton("M+");
		btMult=new JButton("X");
		butSqrt=new JButton("√");
		btMMenos=new JButton("M-");
		btSuma=new JButton("+");
		btResta=new JButton("-");
		btMC=new JButton("MC");
		btAC=new JButton("A/C");
		btMasMenos=new JButton("+/-");
		btMR=new JButton("MR");
		operadores[0]=btRetroceso;
		operadores[1]=btDividir;
		operadores[2]=btMMAs;
		operadores[3]=btMult;
		operadores[4]=butSqrt;
		operadores[5]=btMMenos;
		operadores[6]=btSuma;
		operadores[7]=btResta;
		operadores[8]=btMC;
		operadores[9]=btAC;
		operadores[10]=btMasMenos;
		operadores[11]=btMR;
	}


	private void crearPanelBotonera() {
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		aniadirBotones();
		aniadirOperadores();
		
	}


	private void aniadirOperadores() {
		panelOperadores=new JPanel();
		panelOperadores.setLayout(new GridLayout(4, 3,4,4));
		for (int i = operadores.length; i < 0 ; i++) {
			panelOperadores.add(operadores[i]);
		}
		this.add(panelOperadores);
	}


	private void aniadirBotones() {
		panelNumerico=new JPanel();
		panelNumerico.setLayout(new GridLayout(4, 3,4,4));
		for (int i = 0; i < numerico.length; i++) {
			panelNumerico.add(numerico[i]);
		}
		
		btComa=new JButton(".");
		 btTotal=new JButton("=");
		panelNumerico.add(btComa);
		panelNumerico.add(btTotal);
		this.add(panelNumerico);
	}


}
