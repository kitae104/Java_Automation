package qna.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LayoutEx extends JFrame {

	public LayoutEx(String title, int width, int height) {
		this.setTitle(title);
		setSize(width, height);
		setLocationRelativeTo(null);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 크기 변경 불가!
		setResizable(false);

		// 프레임의 기본 레이아웃 설정 
		setLayout(new BorderLayout());
		
		// 2개의 패널을 포함할 기본 패널 생성 
		JPanel panelBase = new JPanel();
		// 그리드 레이아웃으로 1줄에 2칸 짜리에 내부 간격을 10씩 주기 
		panelBase.setLayout(new GridLayout(1,2, 10, 10));
		// 패널에 상하좌우에 공간 띄우기(빈 공백의 보더 설정) 
		panelBase.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
			
		// 그리드 상 왼쪽 패널 생성 
		JPanel panelLeft = new JPanel();
		panelLeft.setLayout(new FlowLayout());
		panelLeft.setBackground(Color.yellow);
		
		// 왼쪽 패널에 컴포넌트 추가 
		JLabel lbl1 = new JLabel("Type ID");		
		panelLeft.add(lbl1);

		JTextField tf1 = new JTextField(10);
		panelLeft.add(tf1);

		JLabel lbl2 = new JLabel("Type Password");
		panelLeft.add(lbl2);

		JTextField tf2 = new JTextField(10);
		panelLeft.add(tf2);
		
		// 기본 패널에 왼쪽 패널 추가 
		panelBase.add(panelLeft);

		// 그리드상 오른쪽 패널 생성 
		JPanel panelRight = new JPanel();
		panelRight.setBackground(Color.green);
		
		// 오른쪽 패널에 컴포넌트 추가 
		JLabel lbl3 = new JLabel("Please Check!!");
		panelRight.add(lbl3);

		JCheckBox chkBox1 = new JCheckBox("C# JCheckBox");
		panelRight.add(chkBox1);

		JCheckBox chkBox2 = new JCheckBox("C++ JCheckBox");
		panelRight.add(chkBox2);

		// 기본 패널에 오른쪽 패널 추가 
		panelBase.add(panelRight);
		
		// 아래쪽 패널 생성 
		JPanel panelButtom = new JPanel();
		// 가운데 버튼이 올 수 있도록 FlowLayout 설정 
		panelButtom.setLayout(new FlowLayout());
		// 패널에 상하좌우에 공간 띄우기
		panelButtom.setBorder(BorderFactory.createEmptyBorder(5, 5, 10, 10));
		
		JButton btn = new JButton("OK");		
		panelButtom.add(btn);
		
		// 프레임 센터에 기본 패널 추가 
		add(panelBase);
		
		// 프레임에 아래쪽 패널 추가 
		add(panelButtom, BorderLayout.SOUTH);
		
		// 화면 보이기 
		setVisible(true);

	}

	public static void main(String[] args) {
		new LayoutEx("레이아웃 과제", 360, 260);
	}

}
