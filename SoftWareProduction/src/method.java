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
		//写入文件时候换行用这个代码
		String Enter=System.getProperty("line.separator");
		agreeword+="合同编号： "+agreement.getAgreeNum()+Enter;
		agreeword+="邀标书编号： "+agreement.getYaobiaoNum()+Enter;
		agreeword+="投标编号： "+agreement.getToubiaoNum()+Enter;
		agreeword+="甲方名称： "+agreement.getJiaName()+Enter;
		agreeword+="乙方名称： "+agreement.getYiName()+Enter;
		String starttime = agreement.getStartTime().getYear()+" 年 " + agreement.getStartTime().getMonth() + " 月 " +agreement.getStartTime().getDay() +" 日 ";
		String endtime = agreement.getEndTime().getYear()+" 年 " + agreement.getEndTime().getMonth() + " 月 " +agreement.getEndTime().getDay() +" 日 ";
		agreeword+="开始时间： "+ starttime +Enter;
		agreeword+="结束时间： "+ endtime + Enter;
		agreeword+="合同金额： "+agreement.getAgreeMoney()+Enter;
		agreeword+="甲方代表： "+agreement.getJiaRepresent()+Enter;
		agreeword+="乙方代表： "+agreement.getYiRepresent()+Enter+Enter;
		agreeword+="合同内容： "+agreement.getAgreeContent()+Enter;
		agreeword+="合同备注： "+agreement.getAgreeBeizhu()+Enter;
		
		FileSystemView fsv = FileSystemView.getFileSystemView();
		String path = fsv.getHomeDirectory().toString()+"\\"+agreement.getAgreeNum()+".txt";
		FileWriter fw = new FileWriter(path);
		fw.write(agreeword,0,agreeword.length());
		fw.flush();
		JOptionPane.showMessageDialog(null,"合同生成成功！","提示",JOptionPane.INFORMATION_MESSAGE);
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
		if (agreement == null) JOptionPane.showMessageDialog(null,"导入文件失败！","错误",JOptionPane.INFORMATION_MESSAGE);
		return agreement;
	}

}
