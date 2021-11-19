package com.CW2;/*
 * CW2 Lab Group Thu 11
 */




// The AuthoredBook class stores information of a book with author
//     including the name of the author
public class AuthoredBook extends Book {

    // Do not modify or add the instance variables
    private String author;


    // CW2 Lab Group Thu 11 Question 3
    // Complete the constructor of the class AuthoredBook
    // It initializes all its instance variables    
    public AuthoredBook(String title, String edition, String author, double price) {

		super(title,edition,price);
        this.author=author;

    }

    // CW2 Lab Group Thu 11 Question 4
    // Complete the method newer
    // It returns true iff both books have the same title, the same author,
    //     and this book is of newer edition than that of the other book
    public boolean newer(AuthoredBook other) {

return super.newer(other)&&(this.author.equals(other.author));
    }

    // Test Client
    public static void main(String[] args) {
        AuthoredBook book1 = new AuthoredBook("Intro Java", "2nd edition", "Andrew", 200.0);

        AuthoredBook book2 = new AuthoredBook("Intro Java", "1st edition", "Andrew", 150.0);
        System.out.println(book1.newer(book2));     // true

        AuthoredBook book3 = new AuthoredBook("Intro Java", "1st edition", "Erick", 150.0);
        System.out.println(book1.newer(book3));     // false
    }
}