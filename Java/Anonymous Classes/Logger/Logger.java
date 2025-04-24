
public interface Logger {
    void log(String message);
    public static void main(String[] args) {
        Logger log= new Logger(){
            public void log(String mess){
                System.out.println("Log : "+mess);
            }
        };
        log.log("I'm Logger");
      }
}
