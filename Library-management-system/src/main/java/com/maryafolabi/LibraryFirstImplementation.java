package com.maryafolabi;

import java.util.*;

// this class handles the operations of the Library that requires priority functions
public class LibraryFirstImplementation implements LibraryOperations {
    private Map<String, Integer> listOfBooks = new HashMap<>();
    private static Queue<User> queue;
    private List<String> listOfBorrowers = new ArrayList<>();

    //this constructor initializes the first-implementation field
    public LibraryFirstImplementation() {
        this.listOfBooks = listOfBooks;
        queue = new PriorityQueue<>(Comparator.comparingInt(p -> p.getRank()));
        this.listOfBorrowers = listOfBorrowers;
    }

    // these getters and setter  below sets a value and returns values from the program
    public Map<String, Integer> getListOfBooks() { return listOfBooks; }
    public List<String> getListOfBorrowers() {
        return listOfBorrowers;
    }
    public void setListOfBooks(Map<String, Integer> listOfBooks) {
        this.listOfBooks = listOfBooks;
    }
    public Queue<User> getQueue() {
        return queue;
    }

    // this method adds users to the queue as soon as they make a request
    public void addUserToQueue(User user) {
        queue.add(user);
    }

    //this method carries out the function of deciding who gets the book
    public void processQueue(String title, User... user) throws NullPointerException {
        if (!listOfBooks.containsKey(title) || title == null) {
            throw new NullPointerException("Dude what the fuck!! How do you expect me to find your book without a title?");
        }
        int i = 0;
        int userLength = user.length;
        while (i < userLength) {
            if (queue.peek() == user[i]) {
                int remainingBooks = listOfBooks.get(title) - 1;
                listOfBooks.put(title, remainingBooks);

                String userName = queue.poll().getName();
                System.out.println(userName);
                return;
            }
            i++;
        }
        if (listOfBooks.containsKey(title)) {
            int remainingBooks = listOfBooks.get(title) - 1;
            listOfBooks.put(title, remainingBooks);
            if (remainingBooks == 0) {
                System.out.println("There are no more copies of this book in the library for now");
            }
            String userName = queue.poll().getName();
            System.out.println("Here you go dude!");
            System.out.printf("%s here's your book man!", userName);
            listOfBorrowers.add(userName);
        }
    }

    // this method adds books to my Book catalog
    public void addBook(String title, Integer count) {
        if (listOfBooks.containsKey(title)) {
            count = listOfBooks.get(title) + count;
        }
        listOfBooks.put(title, count);
    }

    // this method takes book a user returns and adds it to my catalog
    public void returnBook(String title) {
        if (listOfBooks.containsKey(title)) {
            int count = listOfBooks.get(title) + 1;
            listOfBooks.put(title, count);
        }
    }
}
