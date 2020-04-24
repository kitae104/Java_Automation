package qna.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class B반_201945055_조원정 extends JFrame {

	public B반_201945055_조원정(String title, int width, int height) {
		this.setTitle(title);
		setSize(width, height);
		setLocationRelativeTo(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 레이아웃
		setLayout(null);
		
		JPanel p = new JPanel();
		p.setLayout(null);
		p.setBackground(Color.black);
		p.setBounds(0, 0, 350, 350);
		

		JPanel pa = new JPanel();
		pa.setLayout(new FlowLayout());
		pa.setBackground(Color.yellow);
		pa.setBounds(10, 10, 150, 150);

		p.add(pa);

		JPanel pb = new JPanel();
		pb.setBackground(Color.green);
		pb.setBounds(180, 10, 150, 150);
		p.add(pb);

		JLabel jl1 = new JLabel("Type ID");		
		pa.add(jl1);

		JTextField T1 = new JTextField(10);
		pa.add(T1);

		JLabel jl3 = new JLabel("Type Password");
		pa.add(jl3);

		JTextField T2 = new JTextField(10);
		pa.add(T2);

		JLabel jl2 = new JLabel("Please Check!!");
		pb.add(jl2);

		JCheckBox box1 = new JCheckBox("C# JCheckBox");
		pb.add(box1);

		JCheckBox box2 = new JCheckBox("C++ JCheckBox");
		pb.add(box2);

		JButton Button = new JButton("OK");
		Button.setBounds(140,180, 60, 25);
		p.add(Button);
		
		add(p);
		setVisible(true);

	}

	public static void main(String[] args) {
		new B반_201945055_조원정("B반_201945055_조원정", 360, 260);
	}

}
