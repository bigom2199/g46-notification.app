package lexicon.se.data;

import lexicon.se.model.Notification;

import java.util.Collection;
import java.util.stream.Collectors;

public interface NotificationManager {
    void createNotification(Notification notification);
    Notification findNotification(String requestId);
        Collection<Notification> findAll();
        //...
}
