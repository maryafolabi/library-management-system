import com.maryafolabi.Designation;
import com.maryafolabi.LibraryFirstImplementation;
import com.maryafolabi.LibrarySecondImplementation;
import com.maryafolabi.User;


public class Main {

    public static void main(String[] args) {

        // FIRST IMPLEMENTATION
        LibraryFirstImplementation libraryFirstImplementation = new LibraryFirstImplementation();
        User teacher = new User("Olusola", Designation.TEACHER);
        User teacher2 = new User ("Olumide", Designation.TEACHER);
        User seniorstudent = new User("Damilola", Designation.SENIORSTUDENT);
        User juniorstudent = new User("Stephen", Designation.JUNIORSTUDENT);
        User juniorstudent2 = new User("John", Designation.JUNIORSTUDENT);

        libraryFirstImplementation.addUserToQueue(teacher);
        libraryFirstImplementation.addUserToQueue(teacher2);
        libraryFirstImplementation.addUserToQueue(seniorstudent);
        libraryFirstImplementation.addUserToQueue(juniorstudent);
        libraryFirstImplementation.addUserToQueue(juniorstudent2);

        //System.out.println(libraryFirstImplementation.getQueue().size());


        libraryFirstImplementation.addBook("The Alchemist", 5);
        libraryFirstImplementation.addBook("The Outlier", 5);
        libraryFirstImplementation.addBook("Atomic Habits", 5);
        libraryFirstImplementation.addBook("Blink", 5);
        libraryFirstImplementation.addBook("The art of not giving a fuck", 5);

        libraryFirstImplementation.processQueue("Blink", teacher, teacher2, juniorstudent, seniorstudent);
        libraryFirstImplementation.processQueue("Blink", teacher, teacher2, juniorstudent, seniorstudent);
        libraryFirstImplementation.processQueue("Blink", teacher, teacher2, juniorstudent, seniorstudent);
        libraryFirstImplementation.processQueue("Blink", teacher, teacher2, juniorstudent, seniorstudent);
        libraryFirstImplementation.returnBook("Blink");
        System.out.println(libraryFirstImplementation.getListOfBooks().get("Blink"));
        libraryFirstImplementation.processQueue("The Alchemist", teacher2, teacher, seniorstudent, juniorstudent);
        System.out.println(libraryFirstImplementation.getListOfBooks());


        // SECOND IMPLEMENTATION
        LibrarySecondImplementation lib = new LibrarySecondImplementation();
        lib.addUserToQueue(teacher);
        lib.addUserToQueue(teacher2);
        lib.addUserToQueue(seniorstudent);
        lib.addUserToQueue(juniorstudent);

        lib.addBook("Rich Dad Poor Dad", 5);
        lib.addBook("YingYang", 5);
        lib.addBook("Blink", 5);
        lib.addBook("Atomic Habits", 5);
        lib.addBook("The art of not giving a fuck", 5);
        lib.addBook("The Alchemist", 5);
        lib.returnBook("YingYang");

//        lib.processQueue("Blink");
//        lib.processQueue("The Alchemist");

        lib.processQueue("The Alchemist", teacher2, teacher, seniorstudent, juniorstudent);
        lib.returnBook("Blink");
        System.out.println(lib.getListOfBooks());
        //System.out.println(lib.getListOfBorrowers());
    }
}
