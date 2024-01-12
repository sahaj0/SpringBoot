package Service;

import Model.UserModel;
import Service.Notification;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {
    private List<UserModel> users= new ArrayList<>();
    public void addUser(UserModel user){
        this.users.add(user);
    }

    //Sending Notification to User
    public void SendNotification(Notification notification){

        //Fetching user
        for(UserModel u:users){
            u.getNotification(notification);
            break; // for traversing once
        }
        //if(user.getNotification>=1){
        // notification.notify()}

    }
}
