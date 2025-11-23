package abstraction;

public abstract class TrainTicket {
    final int pnr ;
    String coachType ;

    TrainTicket(int p, String coachType){
        this.pnr = p;
        this.coachType = coachType;
    }

    public abstract int fare (int km);

    public String coachType(){
        return coachType;
    }
}
