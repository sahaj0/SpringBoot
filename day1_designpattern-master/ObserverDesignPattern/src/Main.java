import Model.UserModel;
import Service.Notification;
import Service.NotificationScheduler;
import Service.NotificationService;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


public class Main {

    public static void main(String[] args) {

        UserModel user1=new UserModel(1,"Push");
        UserModel user2=new UserModel(2,"Email");
        UserModel user3=new UserModel(3,"InApp");

        //Creating notification service object
        NotificationService notificationService=new NotificationService();

        user1.subscribe(notificationService);
        user2.subscribe(notificationService);
        user3.subscribe(notificationService);

        //Creating Notification Scheduler object for calling  method to scheduling notification
        NotificationScheduler notificationScheduler=new NotificationScheduler();

        Notification notification1=notificationScheduler.scheduleNotification(user1,"Hi from User "+user1.getUserId());
        Notification notification2=notificationScheduler.scheduleNotification(user2,"Hi from User "+user2.getUserId());
        Notification notification3=notificationScheduler.scheduleNotification(user3,"Hi from User "+user3.getUserId());
        notificationService.SendNotification(notification1);
        notificationService.SendNotification(notification2);
        notificationService.SendNotification(notification3);
    }
}