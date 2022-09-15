package bubble.test.ex02;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BubbleFrame extends JFrame{
	
	private JLabel backgroundMap;
	private Player player;
	
	public BubbleFrame() {
		initObject();
		initSetting();
		setVisible(true);

	}
	
	private void initObject() {
		backgroundMap = new JLabel(new ImageIcon("image/backgroundMap.png"));
		setContentPane(backgroundMap);
		
		player = new Player();
		add(player);
//		backgroundMap.setSize(1000,600);
//		backgroundMap.setLocation(300,300);
//		add(backgroundMap);//JFrame에 JLabel이 그려진다.
		
	}
	
	private void initSetting() {
		
		setSize(1000,640);
		setLayout(null);
		
		setLocationRelativeTo(null); //JFrame 가운데 배치하기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x 버튼으로 창를 끌 때 JVM 같이 종료하기
		
	}
	
	
	public static void main(String[] args) {
		new BubbleFrame();
		
		
	}
}
