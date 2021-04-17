import com.maryafolabi.Designation;
import com.maryafolabi.LibraryFirstImplementation;
import com.maryafolabi.LibrarySecondImplementation;
import com.maryafolabi.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AddUserToQueueTest {
    LibraryFirstImplementation libraryFirstImplementation = new LibraryFirstImplementation();
    User teacher = new User("Olusola", Designation.TEACHER);
    User seniorstudent = new User("Damilola", Designation.SENIORSTUDENT);
    User juniorstudent = new User("Stephen", Designation.JUNIORSTUDENT);

    LibrarySecondImplementation lib = new LibrarySecondImplementation();


    @Test
   public void addUserToQueue() {
        libraryFirstImplementation.addUserToQueue(teacher);
        libraryFirstImplementation.addUserToQueue(seniorstudent);
        libraryFirstImplementation.addUserToQueue(juniorstudent);

        lib.addUserToQueue(teacher);
        lib.addUserToQueue(seniorstudent);
        lib.addUserToQueue(juniorstudent);

        assertEquals(3, libraryFirstImplementation.getQueue().size());
        assertEquals(3, lib.getQueue().size());
    }

}
