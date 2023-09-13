package lexicon.se.data;

import lexicon.se.exception.DataNotFoundException;
import lexicon.se.model.Notification;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class NotificationManagerImpl implements NotificationManager {
   private List<Notification> notificationsList= new ArrayList<>();
    @Override
    public void createNotification(Notification notification) {
        if (notification== null) throw  new IllegalArgumentException("Notification object was null.");
        notificationsList.add(notification);

    }

    @Override
    public Notification findNotification(String requestId) {
        notificationsList.stream()
                .filter(notification -> notification.getRequestId().equals(requestId))
        .findFirst()
                .orElseThrow(() ->  new DataNotFoundException("Notification data not found",requestId));
    }

    @Override
    public Collection<Notification> findAll() {
        return null;
    }
}
