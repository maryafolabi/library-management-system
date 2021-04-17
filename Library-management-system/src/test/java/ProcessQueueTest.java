import com.maryafolabi.Designation;
import com.maryafolabi.LibraryFirstImplementation;
import com.maryafolabi.LibrarySecondImplementation;
import com.maryafolabi.User;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class ProcessQueueTest {
    LibraryFirstImplementation libraryFirstImplementation = new LibraryFirstImplementation();
    User teacher = new User("Olusola", Designation.TEACHER);
    User seniorstudent = new User("Damilola", Designation.SENIORSTUDENT);
    User juniorstudent = new User("Stephen", Designation.JUNIORSTUDENT);

    LibrarySecondImplementation lib = new LibrarySecondImplementation();

    @Test
    public void processQueue() {
    libraryFirstImplementation.addUserToQueue(teacher);
    libraryFirstImplementation.addUserToQueue(seniorstudent);
    libraryFirstImplementation.addUserToQueue(juniorstudent);


    libraryFirstImplementation.addBook("The Alchemist", 5);
    libraryFirstImplementation.addBook("The Outlier", 5);
    libraryFirstImplementation.addBook("Atomic Habits", 5);
    libraryFirstImplementation.addBook("Blink", 5);
    libraryFirstImplementation.addBook("The art of not giving a fuck", 5);

    lib.addUserToQueue(teacher);
    lib.addUserToQueue(seniorstudent);
    lib.addUserToQueue(juniorstudent);


    lib.addBook("The Alchemist", 5);
    lib.addBook("The Outlier", 5);
    lib.addBook("Atomic Habits", 5);
    lib.addBook("Blink", 5);
    lib.addBook("The art of not giving a fuck", 5);


    libraryFirstImplementation.processQueue("Blink", teacher, seniorstudent, juniorstudent);
    lib.processQueue("The Alchemist", teacher, seniorstudent, juniorstudent);

    assertEquals(4, (int) libraryFirstImplementation.getListOfBooks().get("Blink"));
    assertEquals(4, (int)lib.getListOfBooks().get("The Alchemist"));
    }
}
