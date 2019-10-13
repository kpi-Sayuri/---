import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import 

import javax.swing.JOptionPane;

public class ButtonListener implements ActionListener
	{

		public void actionPerformed(ActionEvent e) 

		{

			//读取填写的信息，并判断是否为空
			
			boolean finish = true;
			
			if (!jTextField0.getText().equals("")) (new Agreement()).setAgreeNum(jTextField0.getText()); 
				else finish = false;

			if (!jTextField1.getText().equals("")) (new Agreement()).setYaobiaoNum(jTextField1.getText()); 
				else finish = false;
			
			if (!jTextField2.getText().equals("")) (new Agreement()).setToubiaoNum(jTextField2.getText()); 
				else finish = false;

			if (!jTextField3.getText().equals("")) (new Agreement()).setJiaName(jTextField3.getText()); 
				else finish = false;

			if (!jTextField4.getText().equals("")) (new Agreement()).setYiName(jTextField4.getText());
				 else finish = false;
	
			if (!jTextField5.getText().equals("") && !jTextField6.getText().equals("") && !jTextField7.getText().equals("")) 
	
			{
					
				Time starttime = new Time(); 
	
				starttime.setYear(Integer.parseInt(jTextField5.getText()));

				starttime.setMonth(Integer.parseInt(jTextField6.getText()));

				starttime.setDay(Integer.parseInt(jTextField7.getText()));

				greement.setStartTime(starttime);

			} 
				else finish = false;

			if (!jTextField8.getText().equals("") && !jTextField9.getText().equals("") && !jTextField10.getText().equals("")) 

			{

				Time endtime = new Time(); 
	
				endtime.setYear(Integer.parseInt(jTextField8.getText()));

				endtime.setMonth(Integer.parseInt(jTextField9.getText()));
	
				endtime.setDay(Integer.parseInt(jTextField10.getText()));

				(new Agreement()).setEndTime(endtime);

			}	
				 else finish = false;
			
			if (!jTextField11.getText().equals("")) (new Agreement()).setAgreeMoney(Float.parseFloat(jTextField11.getText()));
				 else finish = false;

			if (!jTextField12.getText().equals("")) (new Agreement()).setJiaRepresent(jTextField12.getText());
				 else finish = false;

			if (!jTextField13.getText().equals("")) (new Agreement()).setYiRepresent(jTextField13.getText()); 
				else finish = false;

			if (!jTextArea0.getText().equals("")) (new Agreement()).setAgreeContent(jTextArea0.getText());
				 else finish = false;
			agreement.setAgreeBeizhu(jTextArea1.getText());
	
			
			//监听按键

			String input = e.getActionCommand();

				if (input.equals("确定生成") && finish){

					//生成合同写入文件

					try {

						CreatAgreement(agreement);

						OutputAgreement(agreement);

					} catch (IOException e1) {

						e1.printStackTrace();

					}
				
				}
					else if (input.equals("导入合同")){

					try {

						Agreement agreement = InputAgreement();

						jTextField0.setText(agreement.getAgreeNum());

						jTextField1.setText(agreement.getYaobiaoNum());

						jTextField2.setText(agreement.getToubiaoNum());

						jTextField3.setText(agreement.getJiaName());

						jTextField4.setText(agreement.getYiName());

						jTextField5.setText(Integer.toString(agreement.getStartTime().getYear()));

						jTextField6.setText(Integer.toString(agreement.getStartTime().getMonth()));

						jTextField7.setText(Integer.toString(agreement.getStartTime().getDay()));

						jTextField8.setText(Integer.toString(agreement.getEndTime().getYear()));

						jTextField9.setText(Integer.toString(agreement.getEndTime().getMonth()));

						jTextField10.setText(Integer.toString(agreement.getEndTime().getDay()));

						jTextField11.setText(agreement.getAgreeMoney().toString());

						jTextField12.setText(agreement.getJiaRepresent());

						jTextField13.setText(agreement.getYiRepresent());

						jTextArea0.setText(agreement.getAgreeContent());

						jTextArea1.setText(agreement.getAgreeBeizhu());

					} catch (FileNotFoundException e1) {

						e1.printStackTrace();

					} catch (IOException e1) {

						e1.printStackTrace();

					}

				
}
				else if(input.equals("导出合同") && finish){

						try {

							OutputAgreement(agreement);

							JOptionPane.showMessageDialog(null,"合同导出到D盘成功！","成功",JOptionPane.INFORMATION_MESSAGE);
	
					} catch (IOException e1) {

							e1.printStackTrace();

						}

					}else if (!finish) JOptionPane.showMessageDialog(null,"除备注外所有项均不能为空！","警告",JOptionPane.INFORMATION_MESSAGE);

			}

		}