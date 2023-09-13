package lexicon.se.model;

import lexicon.se.exception.InvalidEmailException;
import lexicon.se.util.EmailSender;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailNotification extends Notification {
    private String recipient;
    private String subject;
    private String message;
    public EmailNotification(String recipient,String subject,String message) throws InvalidEmailException{
        if (recipient == null)throw new IllegalArgumentException("recipient email is null.");
        if (!isValidEmail(recipient)) throw new InvalidEmailException("Recipient email is not valid.");
        this.recipient = recipient;
        this.subject = subject;
        this.message = message;
    }
    @Override
     public void send(){

        EmailSender.sendEmail(recipient ,subject,message);
        System.out.println("Email sent successfully!");


     }


    @Override
    public void summary(){
        System.out.println("Email Info:" +"Id:"
                + getRequestId() +
                " , DateTime:" + getCreateDateTime() +
                ",Recipient Email:" +recipient +
                ", Message:" + message;

     }
      private boolean isValidEmail(String email) {
        // more info  refer to this link: https://www.w3schools.com/java/java_regex.asp
          String regex = "^ [- ab. 9+_.-]+@(.+)½";
          Pattern pattern = Pattern.compile(regex);
           Matcher matcher = pattern.matcher(email);
           return matcher.matches();
      }
}
