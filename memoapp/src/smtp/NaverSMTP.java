package smtp;

import java.util.Map;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

// ���̹� SMTP ������ ���� �̸����� �����ϴ� Ŭ����
public class NaverSMTP {
    private final Properties serverInfo; // ���� ����
    private final Authenticator auth;    // ���� ����

    public NaverSMTP() {
        // ���̹� SMTP ���� ���� ����
        serverInfo = new Properties();
        serverInfo.put("mail.smtp.host", "smtp.naver.com");
        serverInfo.put("mail.smtp.port", "465");
        serverInfo.put("mail.smtp.starttls.enable", "true");
        serverInfo.put("mail.smtp.auth", "true");
        serverInfo.put("mail.smtp.debug", "true");
        serverInfo.put("mail.smtp.socketFactory.port", "465");
        serverInfo.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        serverInfo.put("mail.smtp.socketFactory.fallback", "false");

        // ����� ���� ����
        auth = new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("dlwodbeld", "dlwoansdlw272300");
            }
        };
    }
 // �־��� ���� ������ ���̹� SMTP ������ ���� �����մϴ�.
    public void emailSending(Map<String, String> mailInfo) throws MessagingException {
        // 1. ���� ����
        Session session = Session.getInstance(serverInfo, auth);
        session.setDebug(true);

        // 2. �޽��� �ۼ�
        MimeMessage msg = new MimeMessage(session);
        msg.setFrom(new InternetAddress(mailInfo.get("from")));     // ������ ���
        msg.addRecipient(Message.RecipientType.TO,
                         new InternetAddress(mailInfo.get("to")));  // �޴� ���
        msg.setSubject(mailInfo.get("subject"));                    // ����
        msg.setContent(mailInfo.get("content"), mailInfo.get("format"));  // ����

        // 3. ����
        Transport.send(msg);
    }
}