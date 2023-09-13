package lexicon.se.util;

import lexicon.se.exception.EmailSendException;

import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.util.Properties;

public class EmailSender {
    private static final String USERNAME ="YOUR_ADMIN_EMAIL";
    private  static  final String PASSWORD ="ADMIN_EMAIL_PASSWORD" ;
    public  static void sendEmail(String recipient, String subject, String message) {
        // set up email server properties
        Properties props = new Properties();
        props.put("mail.smtp.auth.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");

        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return super.getPasswordAuthentication(USERNAME, PASSWORD);
            }
        });
        try {
            Message message = new MimeMessage(session);
            Address myAddress = new InternetAddress(USERNAME);

            message.setSubject(subject);
            message.setText(messageContent);
            Transport.send(message);
            try {
                message.setFrom(myAddress);


            } catch (AddressException e) {
                // todo: throw a custom exception
                throw new EmailSendException("AddressException" + e.getMessage());


            } catch (MessagingException e) {
                // todo:throw a custom exception
                throw new EmailSendException("MessagingException" + e.getMessage());
            }

            // tido: throw a custom exception
        }


    }
}
