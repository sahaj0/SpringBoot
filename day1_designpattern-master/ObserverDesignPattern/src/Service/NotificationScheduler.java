package Service;

import Model.UserModel;
import Service.Notification;
import ServiceImp.EmailNotification;
import ServiceImp.InAppMesssage;
import ServiceImp.PushNotification;

public class NotificationScheduler {
    public Notification scheduleNotification(UserModel user,String message){

        switch(user.getPreferencedChannel()){
            case "Push":return new PushNotification(message);
            case "Email": return new EmailNotification(message);
            case "InApp": return  new InAppMesssage(message);
            default: System.out.println("Something went wrong");
        }
        return null;
    }
}
