public class Comedy extends Ticket implements Movie, Theatre{
    @Override
    public void printMovieTitle(String movieTitle) {
        System.out.println("Comedy Movie Title="+movieTitle);
    }

    @Override
    public void printMovieTheatre(String theateName) {
        System.out.println("comedy movie running on "+theateName+" theatre");
    }

    @Override
    void printTicketCounterNumber(int counterNumber) {
        System.out.println("comedy movie running on theatre  in counter Number="+counterNumber);

    }
}
