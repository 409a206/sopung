package com.kh.maskRush.model.dao.states;

import java.awt.Color; 
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import com.kh.maskRush.model.dao.entities.Creature.Player;

public class PlayerSetting extends JPanel {
	private JPanel contentPane;
	private JTextPane textPane;
	private String realName = "";
	private String randomName = null;
	private JTextField textField;
	private FirstMenuChoice mainChoice;

	public PlayerSetting(FirstMenuChoice mainChoice) {

		this.mainChoice = mainChoice;
		contentPane = this;
		setLayout(null);
		setBounds(100, 100, 800, 600);

		//����緣�� �迭
		String[] nameArr = { "������", "������", "���ù�����", "������", "������", "��¦�̴�", "������", "��û��", "�ູ��", "¥������", "��������", "������",
				"���ó���", "������", "�Ϳ���", "������", "�ٻ���", "������", "��������", "�����", "��ٷο�", "����", "�Ŵ���", "����", "������", "�����",
				"������", "ȭ����", "������", "�ɼ�����", "��ä���ϴ�", "�ҽ���", "����" };

		int random = (int) (Math.random() * 33);
		JLabel lblName = new JLabel();
		lblName.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/name.png")));
		lblName.setFont(new Font("����ǹ��� �ѳ��� ���ѻ�", Font.PLAIN, 27));
		lblName.setBounds(230, 357, 400, 53);
		this.add(lblName);

		//�ٽ��ϱ��ư
		JButton retryButton = new JButton();
		retryButton.setContentAreaFilled(false);
		retryButton.setBorderPainted(false);
		retryButton.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/retry.png")));
		retryButton.setBounds(271, 486, 114, 44);
		retryButton.setBackground(new Color(255, 255, 255));
		retryButton.setForeground(Color.BLACK);

		//����� ���� �ٽ�
		retryButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int random = (int) (Math.random() * 33);
				textField.setText("  " + nameArr[random]);
				textField.setFont(new Font("08���ﳲ��ü EB", Font.PLAIN, 22));
				randomName = textField.getText();
				System.out.println(randomName);
			}
		});
		this.add(retryButton);
		
		//�̸��Է�
		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 255));
		textField.setForeground(new Color(0, 0, 0));
		textField.setFont(new Font("08���ﳲ��ü EB", Font.PLAIN, 22));
		textField.setText(nameArr[random]);
		textField.setBounds(270, 422, 244, 44);
		textField.setColumns(10);
		this.add(textField);
		
		//�����ϱ��ư
		JButton startButton = new JButton("�����ϱ�");
		startButton.setBackground(new Color(255, 255, 255));
		startButton.setBorderPainted(false);
		startButton.setContentAreaFilled(false);
		startButton.setIcon(new ImageIcon(FirstMenu.class.getResource("/textures/start.png")));
		startButton.setFont(new Font("����ǹ��� �ѳ��� ���ѻ�", Font.PLAIN, 15));
		startButton.setBounds(400, 486, 114, 44);
		this.add(startButton);
		//������ ���⿡////////////////////////
		
		//���۽ð� ��ü����
		Date time = new Date();
		
		//���۹�ư Ŭ���׼�
		startButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				realName = textField.getText();
				System.out.println(realName);
				Player a = new Player();
				a.setStart(time);//���۽ð� �÷��̾�����
				a.setName("randomName");
			}
		});

	
		//����
		JLabel lblHome = new JLabel("���");
		lblHome.setForeground(new Color(0, 0, 0));
		lblHome.setIcon(new ImageIcon(PlayerSetting.class.getResource("/textures/background.png")));
		lblHome.setBounds(0, 0, 782, 553);
		this.add(lblHome);

		
	}
}