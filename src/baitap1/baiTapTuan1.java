package baitap1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class baiTapTuan1 extends JFrame implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	JTextField text1, text2, textkq;
	public baiTapTuan1() {
		super("Giai Phuong Trinh bac 2");

		JLabel td,soa,sob,soc;
		JTextField kq;

		//North
		JPanel northJP=new JPanel();
		td = new JLabel("Giai Phuong Trinh Bac 2");
		northJP.add(td);
		Color mau= new Color(0,255,255);
		northJP.setBackground(mau);
		add(northJP,BorderLayout.NORTH);
		//Center
		JPanel centerJP=new JPanel();
		centerJP.setLayout(new BoxLayout(centerJP, BoxLayout.Y_AXIS));
		JPanel box1 =new JPanel();
		box1.setLayout(new BoxLayout(box1,BoxLayout.X_AXIS));
		box1.add(soa=new JLabel("Nhap so a"));
		JTextField textsoa;
		box1.add(textsoa =new JTextField(12));
		JPanel box2 =new JPanel();
		box2.setLayout(new BoxLayout(box2,BoxLayout.X_AXIS));
		box2.add(new JLabel("Nhap so b"));
		box2.add(new JTextField(12));
		JPanel box3 =new JPanel();
		box3.setLayout(new BoxLayout(box3,BoxLayout.X_AXIS));
		box3.add(new JLabel("Nhap so c"));
		box3.add(new JTextField(12));
		JPanel boxkq =new JPanel();
		boxkq.setLayout(new BoxLayout(boxkq,BoxLayout.X_AXIS));
		boxkq.add(new JLabel("Ket Qua:"));
		boxkq.add(kq=new JTextField(12));
		kq.setEditable(false);
		centerJP.add(box1);
		centerJP.add(box2);
		centerJP.add(box3);
		centerJP.add(boxkq);
		//label_input
		add(centerJP);
		
	//	South
		JPanel southJP=new JPanel();
        southJP.setLayout(new BoxLayout(southJP,BoxLayout.X_AXIS));
        Border southborder=BorderFactory.createLineBorder(mau);
        southJP.setBorder(southborder);
        southJP.add(Box.createRigidArea(new Dimension(10,0)));
        southJP.add(new JButton("Giai"));
        southJP.add(Box.createRigidArea(new Dimension(10,0)));
        southJP.add(new JButton("Xoa Rong"));
        southJP.add(Box.createRigidArea(new Dimension(10,0)));
        southJP.add(new JButton("Thoat"));
        southJP.add(Box.createRigidArea(new Dimension(10,0)));
        add(southJP,BorderLayout.SOUTH);
                            

		setBounds(800,300,400,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new baiTapTuan1();
	}
}

