package ServiceImp;

import Service.Notification;

public class PushNotification implements Notification {

    private String message;

    public PushNotification(String message){
        this.message=message;
    }
    @Override
    public void SendNotify() {
    System.out.println("PushNotification:" +this.message);
    }
}
