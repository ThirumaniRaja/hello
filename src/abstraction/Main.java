package abstraction;

public class Main {
    public static void main(String[] args){
        AcTicket acTicket = new AcTicket(14056,"AC");
        System.out.println(acTicket.fare(10));
        System.out.println(acTicket.coachType());
    }
}
