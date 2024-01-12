public class Logger {
    private static Logger instance;
    private Logger(){
    }

    //by using getInstance method we will get only one instance
    public  static Logger getInstance(){
        if(instance==null){
             instance=new Logger();
        }
        return  instance;
    }

    //Locking (only one thread will access this method)
    public synchronized void log(String msg){
        System.out.println(msg);
    }
}
