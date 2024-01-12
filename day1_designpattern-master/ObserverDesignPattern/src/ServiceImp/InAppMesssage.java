package ServiceImp;

import Service.Notification;

public class InAppMesssage implements Notification {
    private String message;

    public InAppMesssage(String message){
        this.message=message;
    }
    @Override
    public void SendNotify() {
        System.out.println("InAppNotification:" +this.message);
    }
}
