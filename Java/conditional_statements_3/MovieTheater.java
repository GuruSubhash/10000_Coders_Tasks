
public class MovieTheater {

    public double getTicketPrice(int age){
        if(age<5) return 0;
        else if(age<=12) return 5;
        else if(age<=60) return 10;
        else return 5;
    }
    public static void main(String[] args) {
        MovieTheater mt = new MovieTheater();
        System.out.println("get the tickect price for a person with age 5 : " + mt.getTicketPrice(5) );
        
    }
}
