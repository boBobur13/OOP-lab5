class BoardingPass {
    private String seatNumber;
    private String gate;
    public BoardingPass(String seatNumber, String gate) {
        this.seatNumber = seatNumber;
        this.gate = gate;
    }
    @Override
    public String toString() {
        return "Seat: " + seatNumber + ", Gate: " + gate;
    }
}
class Flight {
    private String flightID;
    private String destination;
    private BoardingPass boardingPass;
    public Flight(String flightID, String destination, String seat, String gate) {
        this.flightID = flightID;
        this.destination = destination;
        this.boardingPass = new BoardingPass(seat, gate);
    }
    public void display() {
        System.out.println("Flight Id: " + flightID);
        System.out.println("Destination:  " + destination);
        System.out.println(boardingPass);
    }
}
public class Main {
    public static void main(String[] args) {
        Flight f1 = new Flight("ACC123", "Samarkand", "11C", "G5");
        f1.display();

    }
}
