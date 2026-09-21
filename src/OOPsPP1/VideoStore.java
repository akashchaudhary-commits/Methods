package OOPsPP1;
class VideoStore {

    // Array to store videos
    Video[] videos = new Video[10];
    // Video v = new Video();

    // Number of videos currently stored
    int count = 0;

    // Add a new video
    void addVideo(String title) {

        if (count < videos.length) {
            videos[count] = new Video(title);
            //
            count++;

            System.out.println(title + " added successfully.");
        } else {
            System.out.println("Inventory is full.");
        }
    }

    // Check out a video
    void checkOut(String title) {

        for (int i = 0; i < count; i++) {

            if (videos[i].title.equals(title)) {

                if (!videos[i].checkedOut) {
                    videos[i].checkOut();
                    System.out.println(title + " checked out.");
                } else {
                    System.out.println(title + " is already checked out.");
                }

                return;
            }
        }

        System.out.println(title + " not found.");
    }

    // Return a video
    void returnVideo(String title) {

        for (int i = 0; i < count; i++) {

            if (videos[i].title.equals(title)) {

                videos[i].returnVideo();
                System.out.println(title + " returned.");

                return;
            }
        }

        System.out.println(title + " not found.");
    }

    // Give rating to a video
    void receiveRating(String title, int rating) {

        for (int i = 0; i < count; i++) {

            if (videos[i].title.equals(title)) {

                videos[i].receiveRating(rating);

                System.out.println(
                        "Rating " + rating + " given to " + title
                );

                return;
            }
        }

        System.out.println(title + " not found.");
    }

    // Display complete inventory
    void listInventory() {

        for (int i = 0; i < count; i++) {
            videos[i].display();
        }
    }
}