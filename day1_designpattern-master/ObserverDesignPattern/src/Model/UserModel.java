package Model;

import Service.Notification;
import Service.NotificationService;

import java.util.ArrayList;
import java.util.List;

public class UserModel {
    private int UserId;
    private List <Notification> notifications;
    private String PreferencedChannel;

    public UserModel(int userId, String preferencedChannel) {
        UserId = userId;
        this.notifications = new ArrayList<>();
        PreferencedChannel = preferencedChannel;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public List<Notification> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
    }

    public String getPreferencedChannel() {
        return PreferencedChannel;
    }

    public void setPreferencedChannel(String preferencedChannel) {
        PreferencedChannel = preferencedChannel;
    }

    public  void  getNotification(Notification notification){
        notifications.add(notification);
        notification.SendNotify();
    }


    //Adding to notificationService
    public void subscribe(NotificationService notificationService){
        notificationService.addUser(this);
    }

}
