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
			JL0 = new JLabel("合同编号	："); JL0.setBounds(50,30,100,40);
			JL1 = new JLabel("邀标书编号	："); JL1.setBounds(50,65,100,40);
			JL2 = new JLabel("投标编号	："); JL2.setBounds(50,100,100,40);
			JL3 = new JLabel("甲方名称	："); JL3.setBounds(50,135,100,40);
			JL4 = new JLabel("乙方名称	："); JL4.setBounds(50,170,100,40);
			JL5 = new JLabel("开始时间	："); JL5.setBounds(50,205,100,40);
			JL6 = new JLabel("年	");			  JL6.setBounds(210,205,100,40);
			JL7 = new JLabel("月");			  JL7.setBounds(285,205,100,40);
			JL8 = new JLabel("日");			  JL8.setBounds(360,205,100,40);
			JL9 = new JLabel("结束时间	："); JL9.setBounds(50,240,80,40);
			JL10 = new JLabel("年");			  JL10.setBounds(210,240,80,40);
			JL11 = new JLabel("月");		  	  JL11.setBounds(285,240,100,40);
			JL12 = new JLabel("日");			  JL12.setBounds(360,240,120,40);
			JL13 = new JLabel("合同金额	："); JL13.setBounds(50,275,80,40);
			JL14 = new JLabel("人民币"); 	  JL14.setBounds(340,275,80,40);
			JL15 = new JLabel("甲方代表	："); JL15.setBounds(50,310,80,40);
			JL16 = new JLabel("乙方代表	："); JL16.setBounds(50,345,80,40);
			JL17 = new JLabel("合同内容	："); JL17.setBounds(450,30,80,40);
			JL18 = new JLabel("附件   	："); JL18.setBounds(450,240,80,40);
			
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
			
			btn1 = new JButton("下一步(N)");			btn1.setBounds(80,200,100,20);
			btn2 = new JButton("导入(C)");			btn2.setBounds(210,200,140,20);
			btn3 = new JButton("导出(C)");			btn3.setBounds(340,200,180,20);
				
			
			
			ImageIcon img = new ImageIcon("C:\\\\Users\\\\杨\\\\Desktop\\\\5.png");
			//要设置的背景图片
			JLabel imgLabel = new JLabel(img);
			//将背景图放在标签里。
			this.getLayeredPane().add(imgLabel, new Integer(Integer.MIN_VALUE));
			//将背景标签添加到jfram的LayeredPane面板里。
			imgLabel.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
			// 设置背景标签的位置
			Container contain = this.getContentPane();
			((JPanel) contain).setOpaque(false); 
			// 将内容面板设为透明。将LayeredPane面板中的背景显示出来。
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
			
			this.setTitle("合同签订");		
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
									
							Class.forName("com.mysql.cj.jdbc.Driver");//加载数据库驱动
						    System.out.println("加载数据库驱动成功");
						    String url="jdbc:mysql://localhost:3306/demo?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false";//声明数据库test的url
						    String user="root";//数据库用户名
						    String password="124058040";//数据库密码
						    //建立数据库连接，获得连接对象conn
						    Connection conn=DriverManager.getConnection(url, user, password);
						    System.out.println("连接数据库驱动成功");
						    //生成一条SQL语句
						    String sql="insert into 用户(ID,PASSWORD,NickName) values (?,?, ?)";
						    PreparedStatement ps=conn.prepareStatement(sql);//创建一个Statement对象
						    ps.setNString(3,Nickname);//为sql语句中第一个问号赋值
						    ps.setInt(1,account);//为sql语句中第二个问号赋值
						    ps.setString(2,Password);//为sql语句第三个问号赋值
						    ps.executeUpdate();//执行sql语句
						    conn.close();//关闭数据库连接对象
						    System.out.println("关闭数据库连接对象");
						         } catch (ClassNotFoundException e1) {
						             // TODO Auto-generated catch block
						             e1.printStackTrace();
						         } catch (SQLException e1) {
						             // TODO Auto-generated catch block
						             e1.printStackTrace();
						         }
					JOptionPane.showMessageDialog(null,"恭喜你已注册成功");
				}
						        
			});
			
			btn2.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null,"按确定后关闭窗口");
					System.exit(0);
				}
			});
		}*/
		@SuppressWarnings("unused")
		public static void main(String[] args) throws Exception {
			new View(); 	     
		}
}