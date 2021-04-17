import com.maryafolabi.LibraryFirstImplementation;
import com.maryafolabi.LibrarySecondImplementation;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class ReturnBookTest {
    LibraryFirstImplementation libraryFirstImplementation = new LibraryFirstImplementation();
    LibrarySecondImplementation lib = new LibrarySecondImplementation();


    @Test
    public void returnBook() {

        libraryFirstImplementation.addBook("The Alchemist", 5);
        libraryFirstImplementation.addBook("The Outlier", 5);
        libraryFirstImplementation.addBook("Atomic Habits", 5);
        libraryFirstImplementation.addBook("Blink", 5);
        libraryFirstImplementation.addBook("The art of not giving a fuck", 5);
        libraryFirstImplementation.returnBook("Blink");

        lib.addBook("The Alchemist", 5);
        lib.addBook("The Outlier", 5);
        lib.addBook("Atomic Habits", 5);
        lib.addBook("Blink", 5);
        lib.addBook("The art of not giving a fuck", 5);
        lib.returnBook("Blink");


        assertEquals(6, (int) libraryFirstImplementation.getListOfBooks().get("Blink"));
        assertEquals(6, (int)lib.getListOfBooks().get("Blink"));
    }
}
