package OOPsPP1;
class Video {

    // Instance variables
    String title;
    boolean checkedOut;
    double rating;

    // Constructor
    Video(String title) {
        this.title = title;
        this.checkedOut = false;
        this.rating = 0.0;
    }

    // Method to check out the video
    void checkOut() {
        checkedOut = true;
    }

    // Method to return the video
    void returnVideo() {
        checkedOut = false;
    }

    // Method to receive rating
    void receiveRating(int rating) {
        this.rating = rating;
    }

    // Display video details
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Checked Out: " + checkedOut);
        System.out.println("Rating: " + rating);

    }
}