package com.mail.trigger;

import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

public class EmailSend {
		
		public static void sendMail(String from,String password,String message,String to)
		{
			String host="smtp.gmail.com";
			Properties prop=System.getProperties();
			prop.put("mail.smtp.starttls.enable", "true");
			prop.put("mail.smtp.user", from);
			prop.put("mail.smtp.password", password);
			prop.put("mail.smtp.port", 587);
			prop.put("mail.smtp.auth", "true");
			
			Session session=Session.getDefaultInstance(prop,null);
			
			MimeMessage mime=new MimeMessage(session);
			try{
			mime.setFrom(new InternetAddress(from));
			mime.setRecipients(RecipientType.TO, to);

			mime.setSubject("Testing");
			mime.setText(message);
			Transport trans=session.getTransport();
			trans.connect(host,from,password);
			
			trans.sendMessage(mime, mime.getAllRecipients());
			trans.close();
			}catch(MessagingException me)
			{
			me.printStackTrace();
			}
		}

}
