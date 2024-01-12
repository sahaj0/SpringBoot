package ServiceImp;

import Service.Notification;

public class EmailNotification implements Notification {
    private String message;

    public EmailNotification(String message){
        this.message=message;
    }
    @Override
    public void SendNotify() {
        System.out.println("EmailNotification:" +this.message);
    }
}
