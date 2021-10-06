ExAnoBis.java
import.java.awt.*;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.*;

class ExAnoBis extends JFrame implements ActionListener
{
	JLabel L1;
	JButton B1,B2,B3;
	JTextField T1, T2;
	
	public static void main(String args[])
	{
		JFrame JAnoBis = new ExAnoBis();
		JAnoBis.setVisible(true);
	}
	
        @SuppressWarnings({"OverridableMethodCallInConstructor", "LeakingThisInConstructor"})
	ExAnoBis()
	{
		setTitle("Quer verificar se Ã© ano bissexto?");
		setSize(350,90);
		setLocation(50,50);
		L1=new JLabel("Digite o ano:");
		L1.setForeground(Color.cyan);
	
		
		B1=new JButton("Verificar Ano");
		B1.addActionListener(this);
                
		
		B2=new JButton("Limpar");
		B2.addActionListener(this);
		
		B3=new JButton("Sair");
		B3.addActionListener(this);
		
		T1=new JTextField();
		
		T2=new JTextField();
		T2.setEditable(false);
		T2.setForeground(Color.yellow);
		
		
		getContentPane().setBackground(Color.cyan);
		getContentPane().setLayout(new GridLayout(3,2));
		
		getContentPane().add(L1);
		getContentPane().add(T1);
		getContentPane().add(T2);
		getContentPane().add(B1);
		getContentPane().add(B2);
		getContentPane().add(B3);
	}
        @Override
	public void actionPerformed(ActionEvent e)
	{
		int ano = 0;
            
	{
		T1.setText("");T2.setText("");
	}
	if(ano % 400 == 0)static {
        String ano = null;
        System.out.println(ano + " Ano bissexto.");
    }
        elsestatic static {
        String ano = null;
            System.out.println(ano + " Não é ano bissexto");
			}
	    }


