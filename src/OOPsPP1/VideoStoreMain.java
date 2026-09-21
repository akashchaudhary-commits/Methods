package OOPsPP1;
public class VideoStoreMain {

    public static void main(String[] args) {

        // Create VideoStore object
        VideoStore store = new VideoStore();

        // 1. Add three videos
        store.addVideo("Dhurandhar");
        store.addVideo("Barfi");
        store.addVideo("Stree");

        // 2. Give ratings
        store.receiveRating("Dhurandhar", 5);
        store.receiveRating("Dharandhar", 4);

        store.receiveRating("Barfi", 5);
        store.receiveRating("Barfi", 4);

        store.receiveRating("Stree", 5);
        store.receiveRating("Stree", 3);

        // 3. Rent each video once
        store.checkOut("Dhurandhar");
        store.checkOut("Barfi");
        store.checkOut("Stree");

        // 4. Return each video
        store.returnVideo("Dhurandhar");

        // List inventory after Barfi has been rented out
        // Therefore, we display inventory BEFORE returning Barfi
        store.listInventory();

        // Return remaining videos
        store.returnVideo("Barfi");
        store.returnVideo("Stree");

        // Final inventory
        store.listInventory();
    }
}