package lexicon.se;

import lexicon.se.data.NotificationManager;
import lexicon.se.data.NotificationManagerImpl;
import lexicon.se.exception.InvalidEmailException;
import lexicon.se.exception.NotificationExceptionHandler;
import lexicon.se.model.EmailNotification;
import lexicon.se.model.Notification;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        try {
            NotificationManager notificationManager= new NotificationManagerImpl();
            Notification notification2 = new EmailNotification("Merdad.javan@lexicon.se","Meeting Reinder","Do the meeting at 9:00 " );
            Notification notification1 = new EmailNotification("Mehrdad.javan@lexicon.se", "Meeting Reminder", "Don't forget the meeting at 15:00");
     notificationManager.createNotification(notification1);
     notificationManager.createNotification(notification2);
     notification1.send();
     notification2.send();

     notificationManager.findAll().forEach(notification -> System.out.println(notification.summary()));


        } catch (Exception e) {
            NotificationExceptionHandler.handleException(e);
            System.out.println(e.getMessage());
        }

    }


}

