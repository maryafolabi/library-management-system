package com.maryafolabi;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

// this class handles the implementation of the queue FIFO
public class LibrarySecondImplementation implements LibraryOperations {
    private Map<String, Integer> listOfBooks = new HashMap<>();
    private static Queue<User> queue;
    private List<String> listOfBorrowers = new ArrayList<>();
    public LibrarySecondImplementation() {
        queue = new ConcurrentLinkedQueue<>();
    }

    // the getters return values from the program and the setters set based on input values
    public Map<String, Integer> getListOfBooks() {
        return listOfBooks;
    }

    public Queue<User> getQueue() {
        return queue;
    }

    public List<String> getListOfBorrowers() {
        return listOfBorrowers;
    }

    // this methods overide the methods of the first implementation
    @Override
    public void addUserToQueue(User user) {
        queue.add(user);
    }

    @Override
    public void processQueue(String title, User... user) {
        if (!listOfBooks.containsKey(title) || title == null) {
            throw new NullPointerException("Dude what the fuck!! How do you expect me to find your book without a title?");
        }
        else if (listOfBooks.containsKey(title)) {
            int remainingBooks =  listOfBooks.get(title) - 1;
            listOfBooks.put(title, remainingBooks);
            if (remainingBooks == 0) {
                System.out.println("There are no more copies of this book in the library for now");
            }
            String userName =  queue.poll().getName();
            System.out.println("Here you go dude!");
            System.out.printf("%s here's your book man!",userName);
            listOfBorrowers.add(userName);
        }
    }

    @Override
    public void addBook(String title, Integer count) {
        if (listOfBooks.containsKey(title)) {
            count = listOfBooks.get(title) + count;
        }
        listOfBooks.put(title, count);
    }

    @Override
    public void returnBook(String title) {
        if(listOfBooks.containsKey(title)) {
            int count = listOfBooks.get(title) + 1;
            listOfBooks.put(title,count);
        }
    }
}

