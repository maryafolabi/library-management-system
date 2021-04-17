package com.maryafolabi;

// this class is responsible for the users
public class User {
    private String name;
    private Designation designation;
    private int rank;

    // this constructor initializes the field of the user class
    public User(String name, Designation designation) {
        this.name = name;
        this.designation = designation;

        assignRank();
    }

    // this method assigns ranks based on users designation
    public void assignRank() {
        if (this.designation.name().equalsIgnoreCase("teacher")) {
            rank = 1;
        }

        if (this.designation.name().equalsIgnoreCase("seniorstudent")) {
            rank = 2;
        }

        if (this.designation.name().equalsIgnoreCase("juniorstudent")) {
            rank = 3;
        }
    }

    // these setters set values based on input and the getters return set values
    public int getRank() {
        return rank;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Designation getDesignation() {
        return designation;
    }
}
