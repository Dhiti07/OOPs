import java.util.*;
class SeatsnotbookedException extends Exception{
    public SeatsnotbookedException(String message){
        super(message);
    }
}
class ReservedTickets{
        private int seatsAvailable;
        public ReserveTicket(int seats){
            this.seatsAvailable = seats;
          }
        public void reserve(int numberofseats)throws SeatsnotbookedException{
            if(numberofseats<1){
              throw new SeatsnotbookedException("Invalid no. of seats");
            }
            else if(numberofSeats> seatsAvailable){
                throw new SeatsnotbookedException("Seats not available");
            }
            else{
                seatsAvailable = seatsAvailable-numberofseats;
                System.out.println(nuberofSeats+"seats reserved successfully");
            }
        }
            public int getSeatsAvailable(){
                return seatsAvailable;
            }
   }
        public class ReserveTicket{
            public static void main(String[] args){
                ReserveTicket reserveticket = new ReserveTicket(10);
            try{
                reserveTicket.reserve(5);
                reserveticket.reserve(6);
            }
            catch(SeatNotBookedException e){
                System.out.println("Reservation failed:" + e.getMessage());
            } 
            System.out.println("Seats available: "+ reserveTicket.getSeatsAvailable());
       }
    }

