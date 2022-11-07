import java.util.Hashtable;
import java.util.Scanner;
import java.util.*;

public class SimpleHTLib{
    Scanner input = new Scanner(System.in);
    Hashtable<Integer, String> books = new Hashtable<Integer, String>();
    
    SimpleHTLib(){
        books.put(1, "Data Structures and Algorithms in Java");
        books.put(2, "Discrete Mathematics");
        books.put(3, "Object-Oriented Programming in Java");
        books.put(4, "Fundamentals of Programming");
        books.put(5, "Intermediate Programming");
        books.put(6, "Data Science");
        books.put(7, "Machine Learning with Python");
        books.put(8, "The Pragmatic Programmer");
        books.put(9, "Clean Code");
        books.put(10, "Refactoring");
    }

    public void choices(){
        int userInput;
        while(true){
            System.out.println("1. Display all available books." 
            + "\n2. Borrow a book."
            + "\n3. Return a book."
            + "\n4. Search for a book if it exist."
            + "\n5. Add a book.");
            System.out.print("Enter a number to continue: ");
            userInput = input.nextInt();
            input.nextLine();

            switch(userInput){
                case 1:
                    displayAllBooks();
                    break;
                case 2:
                    removeABook();
                    break;
                case 3:
                    addABook();
                    break;
                case 4:
                    searchIfABookExist();
                    break;
                case 5:
                    addABook();
                    break;
                default:
                    System.out.println("You can only input from 1 to 5!");
                    break;
            }
            }
    }

    public void displayAllBooks(){
        System.out.println("Displaying all available books in the library of National University: "
        + "\nBook ID     Book Name");
        for (Map.Entry<Integer, String> entry : books.entrySet()){
            System.out.println("   " + entry.getKey() + "     |  " + entry.getValue());
        }
        continueOrNot();
    }

    public void addABook(){
        System.out.print("Input the Book ID for this book: ");
        int userInput2 = input.nextInt();
        input.nextLine();
        System.out.print("Input the Book Name of the book: ");
        String userInput3 = input.nextLine();
        books.put(userInput2, userInput3);
        continueOrNot();
    }

    public void searchIfABookExist(){
        System.out.print("Enter the Book Name if it's in the list of available books: ");
        String userInput4 = input.nextLine();
        if(books.contains(userInput4)){
            System.out.println("The book \"" + userInput4 + "\" is in the list of books in the library.");
        }
        else{
            System.out.println("The book \"" + userInput4 + "\" doesn't is not in the list of books in the library.");
        }
        continueOrNot();
    }

    public void removeABook(){
        System.out.println("Input the Book ID you want to borrow: ");
        int userInput6 = input.nextInt();
        input.nextLine();
        System.out.println("You have borrowed the book \"" + books.get(userInput6) + "\"");
        books.remove(userInput6);
        continueOrNot();
    }

    public void continueOrNot(){
        int userInput5;
        System.out.println("Do you want to continue or not?"
        + "\n1. Yes"
        + "\n0. No");
        userInput5 = input.nextInt();
        if (userInput5 == 0){
            System.exit(0);
        }
    }
}
