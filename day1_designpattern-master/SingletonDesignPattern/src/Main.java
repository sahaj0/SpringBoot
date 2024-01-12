// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

     //Functional Interface
     Runnable Task=()->{
         Logger logger=Logger.getInstance();
         for(int i=1;i<=5;i++){
             logger.log("Current msg "+ i +"from "+Thread.currentThread().getName());
         }
     };
        Thread t1=new Thread(Task);
        Thread t2=new Thread(Task);
        t1.start();
        t2.start();
    }
}