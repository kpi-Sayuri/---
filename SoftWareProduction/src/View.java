import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

	@SuppressWarnings("serial")
	public class View extends JFrame {	
		//implements ActionListener, TextListener, KeyListener, ItemListener
		JLabel JL0;
		JLabel JL1;
		JLabel JL2;
		JLabel JL3;
		JLabel JL4;
		JLabel JL5;
		JLabel JL6;
		JLabel JL7;
		JLabel JL8;
		JLabel JL9;
		JLabel JL10;
		JLabel JL11;
		JLabel JL12;
		JLabel JL13;
		JLabel JL14;
		JLabel JL15;
		JLabel JL16;
		JLabel JL17;
		JLabel JL18;
		
		JTextField JTextField0;
		JTextField JTextField1;
		JTextField JTextField2;
		JTextField JTextField3;
		JTextField JTextField4;
		JTextField JTextField5;
		JTextField JTextField6;
		JTextField JTextField7;
		JTextField JTextField8;
		JTextField JTextField9;
		JTextField JTextField10;
		JTextField JTextField11;
		JTextField JTextField12;
		JTextField JTextField13;
	
	
		JButton btn1;
		JButton btn2;
		JButton btn3;
		
		public View(){
			init();
			}
		@SuppressWarnings("deprecation")
		private void init() {
			JL0 = new JLabel("��ͬ���	��"); JL0.setBounds(50,30,100,40);
			JL1 = new JLabel("��������	��"); JL1.setBounds(50,65,100,40);
			JL2 = new JLabel("Ͷ����	��"); JL2.setBounds(50,100,100,40);
			JL3 = new JLabel("�׷�����	��"); JL3.setBounds(50,135,100,40);
			JL4 = new JLabel("�ҷ�����	��"); JL4.setBounds(50,170,100,40);
			JL5 = new JLabel("��ʼʱ��	��"); JL5.setBounds(50,205,100,40);
			JL6 = new JLabel("��	");			  JL6.setBounds(210,205,100,40);
			JL7 = new JLabel("��");			  JL7.setBounds(285,205,100,40);
			JL8 = new JLabel("��");			  JL8.setBounds(360,205,100,40);
			JL9 = new JLabel("����ʱ��	��"); JL9.setBounds(50,240,80,40);
			JL10 = new JLabel("��");			  JL10.setBounds(210,240,80,40);
			JL11 = new JLabel("��");		  	  JL11.setBounds(285,240,100,40);
			JL12 = new JLabel("��");			  JL12.setBounds(360,240,120,40);
			JL13 = new JLabel("��ͬ���	��"); JL13.setBounds(50,275,80,40);
			JL14 = new JLabel("�����"); 	  JL14.setBounds(340,275,80,40);
			JL15 = new JLabel("�׷�����	��"); JL15.setBounds(50,310,80,40);
			JL16 = new JLabel("�ҷ�����	��"); JL16.setBounds(50,345,80,40);
			JL17 = new JLabel("��ͬ����	��"); JL17.setBounds(450,30,80,40);
			JL18 = new JLabel("����   	��"); JL18.setBounds(450,240,80,40);
			
			JTextField0 = new JTextField(18); JTextField0.setBounds(150, 40, 220, 20);
			JTextField1 = new JTextField(18); JTextField1.setBounds(150, 75, 220, 20);
			JTextField2 = new JTextField(18); JTextField2.setBounds(150, 110, 220, 20);
			JTextField3 = new JTextField(18); JTextField3.setBounds(150, 145, 220, 20);
			JTextField4 = new JTextField(18); JTextField4.setBounds(150, 180, 220, 20);
			JTextField5 = new JTextField(4);  JTextField5.setBounds(150, 215, 60, 20);
			JTextField6 = new JTextField(4);  JTextField6.setBounds(225, 215, 60, 20);
			JTextField7 = new JTextField(4);  JTextField7.setBounds(300, 215, 60, 20);
			JTextField8 = new JTextField(4); JTextField8.setBounds(150, 250, 60, 20);
			JTextField9 = new JTextField(4); JTextField9.setBounds(225, 250, 60, 20);
			JTextField10 = new JTextField(4); JTextField10.setBounds(300, 250, 60, 20);
			JTextField11 = new JTextField(12); JTextField11.setBounds(150, 285, 180, 20);
			JTextField12 = new JTextField(12); JTextField12.setBounds(150, 320, 220, 20);
			JTextField13 = new JTextField(12); JTextField13.setBounds(150, 355, 220, 20);
			
			btn1 = new JButton("��һ��(N)");			btn1.setBounds(80,200,100,20);
			btn2 = new JButton("����(C)");			btn2.setBounds(210,200,140,20);
			btn3 = new JButton("����(C)");			btn3.setBounds(340,200,180,20);
				
			
			
			ImageIcon img = new ImageIcon("C:\\\\Users\\\\��\\\\Desktop\\\\5.png");
			//Ҫ���õı���ͼƬ
			JLabel imgLabel = new JLabel(img);
			//������ͼ���ڱ�ǩ�
			this.getLayeredPane().add(imgLabel, new Integer(Integer.MIN_VALUE));
			//��������ǩ��ӵ�jfram��LayeredPane����
			imgLabel.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
			// ���ñ�����ǩ��λ��
			Container contain = this.getContentPane();
			((JPanel) contain).setOpaque(false); 
			// �����������Ϊ͸������LayeredPane����еı�����ʾ������
			this.setLayout(null);
			
			this.add(JL0);
			this.add(JL1);
			this.add(JL2);
			this.add(JL3);
			this.add(JL4);
			this.add(JL5);
			this.add(JL6);
			this.add(JL7);
			this.add(JL8);
			this.add(JL9);
			this.add(JL10);
			this.add(JL11);
			this.add(JL12);
			this.add(JL13);
			this.add(JL14);
			this.add(JL15);
			this.add(JL16);
			this.add(JL17);
			this.add(JL18);
			
			this.add(JTextField0);
			this.add(JTextField1);
			this.add(JTextField2);
			this.add(JTextField3);
			this.add(JTextField4);
			this.add(JTextField5);
			this.add(JTextField6);
			this.add(JTextField7);
			this.add(JTextField8);
			this.add(JTextField9);
			this.add(JTextField10);
			this.add(JTextField11);
			this.add(JTextField12);
			this.add(JTextField13);
			
						
			//this.add(btn1);
			//this.add(btn2);
			//this.add(btn3);
			
			this.setTitle("��ͬǩ��");		
			this.setBounds(10,10,1000,600);		
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setResizable(false);
			this.setVisible(true);
			
			
		}
			
			
			/*.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					
					try {
						             
							String Nickname = txt.getText();
							int account = Integer.parseInt(idcod.getText());
							String Password = pasw1.getText();
									
							Class.forName("com.mysql.cj.jdbc.Driver");//�������ݿ�����
						    System.out.println("�������ݿ������ɹ�");
						    String url="jdbc:mysql://localhost:3306/demo?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false";//�������ݿ�test��url
						    String user="root";//���ݿ��û���
						    String password="124058040";//���ݿ�����
						    //�������ݿ����ӣ�������Ӷ���conn
						    Connection conn=DriverManager.getConnection(url, user, password);
						    System.out.println("�������ݿ������ɹ�");
						    //����һ��SQL���
						    String sql="insert into �û�(ID,PASSWORD,NickName) values (?,?, ?)";
						    PreparedStatement ps=conn.prepareStatement(sql);//����һ��Statement����
						    ps.setNString(3,Nickname);//Ϊsql����е�һ���ʺŸ�ֵ
						    ps.setInt(1,account);//Ϊsql����еڶ����ʺŸ�ֵ
						    ps.setString(2,Password);//Ϊsql���������ʺŸ�ֵ
						    ps.executeUpdate();//ִ��sql���
						    conn.close();//�ر����ݿ����Ӷ���
						    System.out.println("�ر����ݿ����Ӷ���");
						         } catch (ClassNotFoundException e1) {
						             // TODO Auto-generated catch block
						             e1.printStackTrace();
						         } catch (SQLException e1) {
						             // TODO Auto-generated catch block
						             e1.printStackTrace();
						         }
					JOptionPane.showMessageDialog(null,"��ϲ����ע��ɹ�");
				}
						        
			});
			
			btn2.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null,"��ȷ����رմ���");
					System.exit(0);
				}
			});
		}*/
		@SuppressWarnings("unused")
		public static void main(String[] args) throws Exception {
			new View(); 	     
		}
}