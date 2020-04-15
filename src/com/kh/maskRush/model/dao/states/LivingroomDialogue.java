package com.kh.maskRush.model.dao.states;

import java.awt.EventQueue; 
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicEditorPaneUI;



public class LivingroomDialogue extends JFrame {
	
	
	private JLabel backGround;
	private JPanel contentPane;
	private String path;

	public void doRun() {

		
					LivingroomDialogue frame = new LivingroomDialogue();
					frame.setVisible(true);
			
	}


	public LivingroomDialogue() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 800, 600);
		contentPane = new JPanel();	
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);;
		
		contentPane.add(textPane);
		textPane.setFont(new Font("둥근모꼴", Font.PLAIN, 24));
		textPane.setBounds(88, 400, 446, 127);

		

		JLabel talk = new JLabel();
		talk.setIcon(new ImageIcon(InPharmacy.class.getResource("/textures/대화창2.png")));
		talk.setBounds(-10, -25, 800, 600);
		this.add(talk);
		
		path = "/textures/living1.png";
		
		backGround = new JLabel();
		backGround.setIcon(new ImageIcon(InBus.class.getResource(path)));
		contentPane.add(backGround);	

		
		String[] busChat = {"TV소리 : 최근 신종 코로나 바이러스가 극성입니다. 외출시 각별히 주의하시고...", "(삑! 치지직...)","아휴...", "바이러스가 난리인데 " + 
						"마스크가 없어서 걱정이네...", "광택나는 진호야 나가서 마스크좀 사오렴!", "엄마가 동생도 봐야하고 집안일로 바빠서 " + 
								"네가 좀 갔다 왔으면 좋겠구나.", "네 엄마. 마스크는 어디서 구하죠?", "우선 도시로 나가 마트에 들러 보거라.",
								"마트에 마스크가 없다면 편의점에도 " + 
								"마스크를 판단다!", "편의점에도 마스크가 없다면 약국에도 한번" + 
										" 들러보렴.", "네 엄마 다녀올게요!", "잠깐! 여기 마스크는 쓰고 가야지!", "(마스크을(를) 얻었다!)",
										"다른 사람들과 접촉을 최대한 피하고 " + 
										"마스크는 절대로 벗지 마렴!", "네 명심할게요 엄마. 다녀오겠습니다!", "조심히 다녀와야돼!", "에이 엄마 걱정마세요! 금방 다녀올게요!",
										"(밖으로 나가보자!)"};
		
		
		textPane.addKeyListener(new KeyAdapter() {
			
			int i = 0;
			@Override
			public void keyPressed(KeyEvent e) {
				
				
				if(i < busChat.length) {
				if(e.getKeyCode() == KeyEvent.VK_SPACE) {
					textPane.setText(busChat[i]);
						backGround.setIcon(new ImageIcon(InBus.class.getResource("/textures/living1.png")));
						backGround.setBounds(-16, -15, 800, 600);
						contentPane.add(backGround);
						if(i == 1) {
							backGround.setIcon(new ImageIcon(InBus.class.getResource("/textures/living2.png")));
							backGround.setBounds(-16, -15, 800, 600);
							contentPane.add(backGround);
						}
						if(i >= 2) {
							backGround.setIcon(new ImageIcon(InBus.class.getResource("/textures/living3.png")));
							backGround.setBounds(-16, -15, 800, 600);
							contentPane.add(backGround);
						}
					} 
			
			}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				i++;
			}

		});


	
		
//
//		JLabel bus = new JLabel();
//		bus.setIcon(new ImageIcon(InBus.class.getResource("/textures/.png")));
//		bus.setBounds(265, 100, 479, 448);
//		contentPane.add(bus);
		
		
		

	}
	
	

}
