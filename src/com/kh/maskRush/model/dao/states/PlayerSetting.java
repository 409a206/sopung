package com.kh.maskRush.model.dao.states;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Panel;
import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Button;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.JTabbedPane;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;

public class PlayerSetting extends JFrame {
	private ImageIcon bg = null;
	private JPanel contentPane;
	private JTextPane textPane;
	private String realName = "";
	private String randomName = null;
	private JTextField textField;
	private Cursor cursor;

	/*public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlayerSetting frame = new PlayerSetting();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	public PlayerSetting() {

		contentPane = new JPanel();
		getContentPane().add(contentPane);
		repaint();
		setVisible(true);
		
		setTitle("maskrush");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		bg = new ImageIcon("res/�����.jpg");

		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		String[] nameArr = { "������", "������", "���ù�����", "������", "������", "��¦�̴�", "�����", "��û��", "�ູ��", "¥������", "��������", "������",
				"���ó���", "������", "�Ϳ���", "������", "�ٻ���", "������", "��������", "�����", "��ٷο�", "����", "�Ŵ���", "����", "������", "�����",
				"������", "ȭ����", "������", "�ɼ�����", "��ä���ϴ�", "�ҽ���", "����" };

		int random = (int) (Math.random() * 33);

		JLabel lblName = new JLabel("�̸��� �Է��ϼ���");
		lblName.setFont(new Font("�ü�", Font.PLAIN, 27));
		lblName.setBounds(270, 357, 244, 53);
		contentPane.add(lblName);

		JButton retryButton = new JButton("�ٽ��ϱ�");
		retryButton.setBackground(new Color(255, 255, 255));
		retryButton.setContentAreaFilled(false);
		retryButton.setForeground(Color.BLACK);

		retryButton.setFont(new Font("���� ���", Font.PLAIN, 15));

		retryButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int random = (int) (Math.random() * 33);
				textField.setText(nameArr[random]);
				textField.setFont(new Font("����", Font.PLAIN, 24));

				randomName = textField.getText();
				System.out.println(randomName);

			}
		});
		retryButton.setBounds(271, 486, 114, 44);
		contentPane.add(retryButton);

		JButton startButton = new JButton("�����ϱ�");
		startButton.setBackground(new Color(255, 255, 255));
		startButton.setContentAreaFilled(false);
		startButton.setFont(new Font("���� ���", Font.PLAIN, 15));
		startButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				realName = textField.getText();
				System.out.println(realName);
			}
		});

		startButton.setBounds(400, 486, 114, 44);
		contentPane.add(startButton);

		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 255));
		textField.setForeground(new Color(0, 0, 0));
		textField.setFont(new Font("����", Font.PLAIN, 25));
		textField.setText(nameArr[random]);
		textField.setBounds(270, 422, 244, 44);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblHome = new JLabel("���");
		lblHome.setForeground(new Color(0, 0, 0));
		lblHome.setIcon(new ImageIcon(PlayerSetting.class.getResource("/textures/background.png")));
		lblHome.setBounds(0, 0, 782, 553);
		contentPane.add(lblHome);

		bg = new ImageIcon("�����.jpg");


		Toolkit tk = Toolkit.getDefaultToolkit();
		
		Image cursorImage = tk.createImage(getClass().getResource("/textures/cursor_w.png"));
		
		
		cursor = Toolkit.getDefaultToolkit().createCustomCursor(cursorImage, new Point(0, 0), "CustomCursor");

		setCursor(cursor);
	}
}
