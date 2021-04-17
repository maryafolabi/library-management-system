package com.maryafolabi;

// this interface handles all methods associated with the operations in my Library
public interface LibraryOperations {
    void addUserToQueue(User user);
    void processQueue(String title, User... user);
    void addBook(String title, Integer count);
    void returnBook(String title);
}
