package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.*;
import hust.soict.dsai.aims.store.Store;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import java.util.ArrayList;

public class Aims {
    private static final Scanner sc = new Scanner(System.in);

    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }
    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }
    public static void mediaDetailsMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }
    public static void cartMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
    }
    public static void updateStoreMenu() {
        System.out.println("Options: ");
        System.out.println("-------------------------------");
        System.out.println("1. Add to Store");
        System.out.println("2. Remove from Store");
        System.out.println("0. Back");
        System.out.println("-------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }
    public static void ChooseTypeOfMedia() {
        System.out.println("Choose a media type: ");
        System.out.println("-------------------------------");
        System.out.println("1. Book");
        System.out.println("2. Digital Video Disc");
        System.out.println("3. Compact Disc");
        System.out.println("0. Back");
        System.out.println("-------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }
    public static void ChooseFilterMenu() {
        System.out.println("Choose a Filter: ");
        System.out.println("-------------------------------");
        System.out.println("1. Filter by ID");
        System.out.println("2. Filter by Title");
        System.out.println("0. Back");
        System.out.println("-------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }
    public static void ChooseSortMenu() {
        System.out.println("Choose a Sort: ");
        System.out.println("-------------------------------");
        System.out.println("1. Media Comparator By Title - Cost");
        System.out.println("1. Media Comparator By Cost - Title");
        System.out.println("0. Back");
        System.out.println("-------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }
    public static void main(String[] args)
    {
        Store store = new Store();
        Cart cart = new Cart();
        // Example media added to the store
        //Thêm Book vào Store
        Book book1 = new Book("Clean Code", "Programming", 45.5f, List.of("Robert C. Martin"));
        Book book2 = new Book("The Pragmatic Programmer", "Programming", 50.0f, List.of("Andrew Hunt David Thomas"));
        Book book3 = new Book("Introduction to Algorithms", "Computer Science", 60.0f, List.of("Thomas H. Cormen Charles E. Leiserson Ronald L. Rivest Clifford Stein"));
        Book book4 = new Book("Design Patterns", "Programming", 40.0f, List.of("Erich Gamma Richard Helm Ralph Johnson John Vlissides"));
        Book book5 = new Book("Artificial Intelligence: A Modern Approach", "AI", 70.0f, List.of("Stuart Russell Peter Norvig"));
        store.addMedia(book1);
        store.addMedia(book2);
        store.addMedia(book3);
        store.addMedia(book4);
        store.addMedia(book5);

        //Thêm DVD vào Store
        DigitalVideoDisc dvd1 = new DigitalVideoDisc( "The Matrix", "Science Fiction", "Lana Wachowski", 136, 15.0f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Inception", "Science Fiction", "Christopher Nolan", 148, 18.0f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Godfather", "Crime", "Francis Ford Coppola", 175, 20.0f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Pulp Fiction", "Crime", "Quentin Tarantino", 154, 16.0f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("The Lord of the Rings: The Fellowship of the Ring", "Fantasy", "Peter Jackson", 178, 25.0f);
        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(dvd3);
        store.addMedia(dvd4);
        store.addMedia(dvd5);

        //Thêm CD vào Store
        CompactDisc cd1 = new CompactDisc( "Thriller", "Music", 30.0f, 22, "Quincy Jones", "Michael Jackson"
                , new ArrayList<>(Arrays.asList(new Track(6,"Wanna Be Startin' Somethin'"),
                new Track(6,"Thriller"),
                new Track(5,"Beat It"),
                new Track(5,"Billie Jean"))));
        CompactDisc cd2 = new CompactDisc( "Back in Black", "Music", 25.0f, 14, "Robert John Lange", "AC/DC"
                , new ArrayList<>(Arrays.asList(new Track(5,"Hells Bells"),
                new Track(5,"Shout to Thrill"),
                new Track(4,"Blank in black"))));
        CompactDisc cd3 = new CompactDisc( "Abbey Road", "Music", 35.0f, 13, "George Martin", "The Beatles"
                , new ArrayList<>(Arrays.asList(new Track(4, "Come Together"),
                new Track(3, "Something"),
                new Track(3, "Here Comes the Sun"),
                new Track(3, "Octopus's Garden"))));
        CompactDisc cd4 = new CompactDisc("The Dark Side of the Moon", "Music", 40.0f, 17, "Alan Parsons", "Pink Floyd"
                , new ArrayList<>(Arrays.asList(new Track(1, "Speak to Me"),
                new Track(3, "Breathe"),
                new Track(7, "Time"),
                new Track(6, "Money"))));
        CompactDisc cd5 = new CompactDisc( "Rumours", "Music", 28.0f, 15, "Ken Caillat", "Fleetwood Mac"
                ,new ArrayList<>(Arrays.asList(new Track(4, "Dreams"),
                new Track(4, "Go Your Own Way"),
                new Track(4, "The Chain"),
                new Track(3, "Don't Stop"))));
        store.addMedia(cd1);
        store.addMedia(cd2);
        store.addMedia(cd3);
        store.addMedia(cd4);
        store.addMedia(cd5);
        //Start Menu

        do {
            showMenu();
            int choice1 = sc.nextInt();
            sc.nextLine();
            if(choice1 == 1) {
                do {
                    store.print();
                    storeMenu();
                    int choice11 = sc.nextInt();
                    sc.nextLine();
                    Media media = null;
                    if (choice11 == 1) {
                        while (true) {
                            System.out.println("Find with: ");
                            System.out.println("1. ID: ");
                            System.out.println("2. Title: ");
                            System.out.println("0. Back ");
                            int choice1111 = sc.nextInt();
                            sc.nextLine();
                            if (choice1111 == 1) {
                                System.out.println("Enter the ID of a media: ");
                                int mediaID = sc.nextInt();
                                sc.nextLine();
                                media = store.SearchById(mediaID);
                                break;
                            } else if (choice1111 == 2) {
                                System.out.println("Enter the name of a media: ");
                                String mediaName = sc.nextLine();
                                media = store.SearchByTitle(mediaName);
                                break;
                            } else if (choice1111 == 0) {
                                break;
                            } else System.out.println("Invalid choice");
                        }
                            if (media == null) System.out.println("Media not found");
                            else {
                                do {
                                    System.out.println(media.toString());
                                    mediaDetailsMenu();
                                    int choice111 = sc.nextInt();
                                    sc.nextLine();
                                    if (choice111 == 1) {
                                        cart.addMedia(media);
                                        break;
                                    } else if (choice111 == 2) {
                                        if (media instanceof Playable) {
                                            ((Playable) media).play();
                                        } else {
                                            System.out.println("This media cannot be played.");
                                        }
                                        break;
                                    } else if (choice111 == 0) {
                                        break;
                                    } else System.out.println("Invalid choice. Please try again.");

                                } while (true);
                            }
                    }
                    else if(choice11 == 2)
                    {
                        do {
                            System.out.println("Find with: ");
                            System.out.println("1. ID: ");
                            System.out.println("2. Title: ");
                            System.out.println("0. Back ");
                            int choice1111 = sc.nextInt();
                            sc.nextLine();
                            if (choice1111 == 1) {
                                System.out.println("Enter the ID of a media: ");
                                int mediaID = sc.nextInt();
                                sc.nextLine();
                                media = store.SearchById(mediaID);
                                cart.addMedia(media);
                                break;
                            } else if (choice1111 == 2) {
                                System.out.println("Enter the name of a media: ");
                                String mediaName = sc.nextLine();
                                media = store.SearchByTitle(mediaName);
                                cart.addMedia(media);
                                break;
                            } else if (choice1111 == 0) {
                                break;
                            } else System.out.println("Invalid choice");
                        }while(true);
                    }
                    else if(choice11 == 3)
                    {
                        do {
                            System.out.println("Find with: ");
                            System.out.println("1. ID: ");
                            System.out.println("2. Title: ");
                            System.out.println("0. Back ");
                            int choice1111 = sc.nextInt();
                            sc.nextLine();
                            if (choice1111 == 1) {
                                System.out.println("Enter the ID of a media: ");
                                int mediaID = sc.nextInt();
                                sc.nextLine();
                                media = store.SearchById(mediaID);
                                break;
                            } else if (choice1111 == 2) {
                                System.out.println("Enter the name of a media: ");
                                String mediaName = sc.nextLine();
                                media = store.SearchByTitle(mediaName);
                                break;
                            } else if (choice1111 == 0) {
                                break;
                            } else System.out.println("Invalid choice");
                        }while(true);
                        if (media instanceof Playable) {
                            ((Playable) media).play();
                        } else {
                            System.out.println("This media cannot be played.");
                        }
                    }
                    else if(choice11 == 4)
                    {
                        do {
                            ChooseSortMenu();
                            int choice312 = sc.nextInt();
                            sc.nextLine();
                            if (choice312 == 1) {
                                cart.sortTitleCost();
                                break;
                            } else if (choice312 == 2) {
                                cart.sortCostTitle();
                                break;
                            } else if (choice312 == 0) break;
                            else System.out.println("Invalid choice. Please try again.");
                        } while (true);
                        break;
                    }else if(choice11 == 0)
                    {
                        break;
                    }else System.out.println("Invalid choice. Please try again.");
                }while(true);
            }
            else if(choice1 == 2) {
                do {
                    updateStoreMenu();
                    int choice2 = sc.nextInt();
                    sc.nextLine();
                    if (choice2 == 1) {
                        do {
                            ChooseTypeOfMedia();
                            int choice21 = sc.nextInt();
                            sc.nextLine();
                            if (choice21 == 1) {
                                System.out.print("Enter title of new Book: ");
                                String title = sc.nextLine();
                                System.out.print("Enter category: ");
                                String category = sc.nextLine();
                                System.out.print("Enter cost:");
                                float cost = sc.nextFloat();
                                sc.nextLine();
                                System.out.print("Enter authors (separated by commas): ");
                                String authorsInput = sc.nextLine();
                                List<String> authors = new ArrayList<String>();
                                // Split string into list of authors
                                if (!authorsInput.isEmpty()) {
                                    String[] authorsArray = authorsInput.split(","); // Separate by comma
                                    for (String author : authorsArray) {
                                        authors.add(author.trim()); // Remove extra spaces
                                    }
                                }
                                Book media = new Book(title, category, cost, authors);
                                store.addMedia(media);
                                break;
                            } else if (choice21 == 2) {
                                System.out.print("Enter title of new DVD: ");
                                String title = sc.nextLine();
                                System.out.print("Enter category: ");
                                String category = sc.nextLine();
                                System.out.print("Enter Director: ");
                                String Director = sc.nextLine();
                                System.out.print("Enter length: ");
                                int length = sc.nextInt();
                                sc.nextLine();
                                System.out.print("Enter cost: ");
                                float cost = sc.nextFloat();
                                sc.nextLine();
                                DigitalVideoDisc media = new DigitalVideoDisc(title, category, Director, length, cost);
                                store.addMedia(media);
                                break;
                            } else if (choice21 == 3) {
                                System.out.print("Enter title of new CD: ");
                                String title = sc.nextLine();
                                System.out.print("Enter category: ");
                                String category = sc.nextLine();
                                System.out.print("Enter Director: ");
                                String director = sc.nextLine();
                                System.out.print("Enter length: ");
                                int length = sc.nextInt();
                                sc.nextLine();
                                System.out.print("Enter cost: ");
                                float cost = sc.nextFloat();
                                sc.nextLine();
                                System.out.print("Enter artist: ");
                                String artist = sc.nextLine();
                                System.out.print("Enter number of tracks: ");
                                int trackCount = sc.nextInt();
                                sc.nextLine();
                                List<Track> tracks = new ArrayList<Track>();
                                for (int i = 1; i <= trackCount; i++) {
                                    System.out.print("Enter title of track " + i + ": ");
                                    String trackTitle = sc.nextLine();

                                    System.out.print("Enter length of track " + i + ": ");
                                    int trackLength = sc.nextInt();
                                    sc.nextLine();
                                    tracks.add(new Track(trackLength, trackTitle));
                                }
                                CompactDisc media = new CompactDisc(title, category, cost, length, director, artist,tracks);
                                store.addMedia(media);
                                break;
                            } else if (choice21 == 0) {
                                break;
                            } else System.out.println("Invalid choice. Please try again.");
                        }while(true);
                    }
                    else if(choice2 == 2)
                    {
                        do {
                            System.out.println("Find with: ");
                            System.out.println("1. ID: ");
                            System.out.println("2. Title: ");
                            System.out.println("0. Back ");
                            int choice1111 = sc.nextInt();
                            sc.nextLine();
                            if (choice1111 == 1) {
                                System.out.println("Enter the ID of a media: ");
                                int mediaID = sc.nextInt();
                                sc.nextLine();
                                Media media = store.SearchById(mediaID);
                                store.removeMedia(media);
                                break;
                            } else if (choice1111 == 2) {
                                System.out.println("Enter the name of a media: ");
                                String mediaName = sc.nextLine();
                                Media media = store.SearchByTitle(mediaName);
                                store.removeMedia(media);
                                break;
                            } else if (choice1111 == 0) {
                                break;
                            } else System.out.println("Invalid choice");
                        }while(true);
                        break;
                    }else if(choice2 == 0)break;
                    else System.out.println("Invalid choice. Please try again.");
                }while(true);
            }
            else if(choice1 == 3) {
                do {
                    cartMenu();
                    int choice31 = sc.nextInt();
                    sc.nextLine();
                    if (choice31 == 1) {
                        ChooseFilterMenu();
                        int choice311 = sc.nextInt();
                        sc.nextLine();
                        if (choice311 == 1) {
                            System.out.print("Enter ID: ");
                            int id = sc.nextInt();
                            sc.nextLine();
                            cart.searchByID(id);
                            break;
                        } else if (choice311 == 2) {
                            System.out.print("Enter Title: ");
                            String title = sc.nextLine();
                            cart.searchByTitle(title);
                            break;
                        } else if (choice311 == 0) break;
                        else System.out.println("Invalid choice. Please try again.");
                    }
                    else if (choice31 == 2) {
                        do {
                            ChooseSortMenu();
                            int choice312 = sc.nextInt();
                            sc.nextLine();
                            if (choice312 == 1) {
                                cart.sortTitleCost();
                                break;
                            } else if (choice312 == 2) {
                                cart.sortCostTitle();
                                break;
                            } else if (choice312 == 0) break;
                            else System.out.println("Invalid choice. Please try again.");
                        } while (true);
                    }
                    else if (choice31 == 3) {
                        do {
                            System.out.println("Remove by:");
                            System.out.println("1. ID: ");
                            System.out.println("2. Title: ");
                            System.out.println("0. Back");
                            int choice313 = sc.nextInt();
                            sc.nextLine();
                            if (choice313 == 1) {
                                System.out.println("Enter ID: ");
                                int id = sc.nextInt();
                                sc.nextLine();
                                Media media = cart.searchByID(id);
                                cart.removeMedia(media);
                                break;
                            } else if (choice313 == 2) {
                                System.out.println("Enter Title: ");
                                String title = sc.nextLine();
                                Media media = cart.searchByTitle(title);
                                cart.removeMedia(media);
                                break;
                            } else if (choice313 == 0) break;
                            else System.out.println("Invalid choice. Please try again.");
                        } while (true);
                    } else if (choice31 == 4) {
                        do {
                            System.out.println("Search media by:");
                            System.out.println("1. ID: ");
                            System.out.println("2. Title: ");
                            System.out.println("0. Back");
                            int choice313 = sc.nextInt();
                            sc.nextLine();
                            if (choice313 == 1) {
                                System.out.println("Enter ID: ");
                                int id = sc.nextInt();
                                sc.nextLine();
                                Media media = cart.searchByID(id);
                                if (media instanceof Playable) {
                                    ((Playable) media).play();
                                } else {
                                    System.out.println("This media cannot be played.");
                                }
                            } else if (choice313 == 2) {
                                System.out.println("Enter Title: ");
                                String title = sc.nextLine();
                                Media media = cart.searchByTitle(title);
                                if (media instanceof Playable) {
                                    ((Playable) media).play();
                                } else {
                                    System.out.println("This media cannot be played.");
                                }
                            } else if (choice313 == 0) break;
                            else System.out.println("Invalid choice. Please try again.");
                        } while (true);
                    } else if (choice31 == 5) {
                        System.out.println("Order placed! Cart is now empty.");
                        cart.clear();
                        break;
                    } else if (choice31 == 0) {
                        break;
                    } else System.out.println("Invalid choice. Please try again.");
                }while(true);
            }
            else if(choice1 == 0) {
                System.out.println("Exiting AIMS. Goodbye!");
                break;
            }
            else System.out.println("Invalid choice. Please try again.");
        } while (true);
    }
}
