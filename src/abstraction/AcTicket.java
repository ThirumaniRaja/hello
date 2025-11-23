package abstraction;

public class AcTicket extends TrainTicket{

    AcTicket(int p, String coachType) {
        super(p, coachType);
    }

    @Override
    public int fare(int km) {
        if (km <= 0) return 0;
        return km * 2;
    }
}
