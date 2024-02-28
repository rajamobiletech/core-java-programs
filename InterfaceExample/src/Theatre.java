public interface Theatre {

    String name = "raja";

    void printMovieTheatre(String theateName);


    default void printTheatreSeatCount() {
        System.out.println("Theatre Seat Count 100");
    }

    static void printTheatreSeatCount1() {
        System.out.println("Theatre Seat Count 1000");
    }

}
