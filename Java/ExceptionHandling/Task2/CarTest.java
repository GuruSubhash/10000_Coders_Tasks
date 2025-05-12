class CarStopped extends Exception {
    CarStopped(String mess){
        super(mess);
    }
}
class CarPuncture extends Exception {
    CarPuncture(String mess){
        super(mess);
    }
}
class CarHeat extends Exception {
    CarHeat(String mess){
        super(mess);
    }
}

public class CarTest extends Exception {

    static void stop(String s){

    }
    static puncture(String s){

    }
    static carheat(String s){

    }
    public static void main(String[] args) {
        String input="stop";
        if(input==stop){}
    }
}
