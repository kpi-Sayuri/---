import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;

public class method {
	public void CreatAgreement(Agreement agreement) throws IOException
	{
		String agreeword = new String();
		//д���ļ�ʱ�������������
		String Enter=System.getProperty("line.separator");
		agreeword+="��ͬ��ţ� "+agreement.getAgreeNum()+Enter;
		agreeword+="�������ţ� "+agreement.getYaobiaoNum()+Enter;
		agreeword+="Ͷ���ţ� "+agreement.getToubiaoNum()+Enter;
		agreeword+="�׷����ƣ� "+agreement.getJiaName()+Enter;
		agreeword+="�ҷ����ƣ� "+agreement.getYiName()+Enter;
		String starttime = agreement.getStartTime().getYear()+" �� " + agreement.getStartTime().getMonth() + " �� " +agreement.getStartTime().getDay() +" �� ";
		String endtime = agreement.getEndTime().getYear()+" �� " + agreement.getEndTime().getMonth() + " �� " +agreement.getEndTime().getDay() +" �� ";
		agreeword+="��ʼʱ�䣺 "+ starttime +Enter;
		agreeword+="����ʱ�䣺 "+ endtime + Enter;
		agreeword+="��ͬ�� "+agreement.getAgreeMoney()+Enter;
		agreeword+="�׷����� "+agreement.getJiaRepresent()+Enter;
		agreeword+="�ҷ����� "+agreement.getYiRepresent()+Enter+Enter;
		agreeword+="��ͬ���ݣ� "+agreement.getAgreeContent()+Enter;
		agreeword+="��ͬ��ע�� "+agreement.getAgreeBeizhu()+Enter;
		
		FileSystemView fsv = FileSystemView.getFileSystemView();
		String path = fsv.getHomeDirectory().toString()+"\\"+agreement.getAgreeNum()+".txt";
		FileWriter fw = new FileWriter(path);
		fw.write(agreeword,0,agreeword.length());
		fw.flush();
		JOptionPane.showMessageDialog(null,"��ͬ���ɳɹ���","��ʾ",JOptionPane.INFORMATION_MESSAGE);
	}
	public Agreement InputAgreement() throws FileNotFoundException, IOException
	{
		Agreement agreement = null;
		Properties p = new Properties();
		JFileChooser fc = new JFileChooser();
		int rVal = fc.showOpenDialog(this);
		if (rVal == JFileChooser.APPROVE_OPTION){
			 String path = fc.getCurrentDirectory().toString()+"\\"+fc.getSelectedFile().getName();
			 p.load(new FileInputStream(path));
			 agreement = new Agreement();
			 agreement.setAgreeNum(p.getProperty("AgreeNum"));
			 agreement.setYaobiaoNum(p.getProperty("yaobiaoNum"));
			 agreement.setToubiaoNum(p.getProperty("toubiaoNum"));
			 agreement.setJiaName(new String(p.getProperty("jiaName").getBytes("ISO-8859-1"),"gbk"));
			 agreement.setYiName(new String(p.getProperty("yiName").getBytes("ISO-8859-1"),"gbk"));
			 agreement.setAgreeContent(new String(p.getProperty("AgreeContent").getBytes("ISO-8859-1"),"gbk"));
			 agreement.setAgreeMoney(Float.parseFloat(p.getProperty("AgreeMoney")));
			 agreement.setJiaRepresent(new String(p.getProperty("jiaRepresent").getBytes("ISO-8859-1"),"gbk"));
			 agreement.setYiRepresent(new String(p.getProperty("yiRepresent").getBytes("ISO-8859-1"),"gbk"));
			 agreement.setAgreeBeizhu(new String(p.getProperty("AgreeBeizhu").getBytes("ISO-8859-1"),"gbk"));
			 Time starttime = new Time();
			 Time endTime = new Time();
			 starttime.setYear(Integer.parseInt(p.getProperty("startTime.year")));
			 starttime.setMonth(Integer.parseInt(p.getProperty("startTime.month")));
			 starttime.setDay(Integer.parseInt(p.getProperty("startTime.day")));
			 endTime.setYear(Integer.parseInt(p.getProperty("endTime.year")));
			 endTime.setMonth(Integer.parseInt(p.getProperty("endTime.month")));
			 endTime.setDay(Integer.parseInt(p.getProperty("endTime.day")));
			 agreement.setStartTime(starttime);
			 agreement.setEndTime(endTime);
		}
		if (agreement == null) JOptionPane.showMessageDialog(null,"�����ļ�ʧ�ܣ�","����",JOptionPane.INFORMATION_MESSAGE);
		return agreement;
	}

}
