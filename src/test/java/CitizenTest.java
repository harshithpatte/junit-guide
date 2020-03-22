import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class CitizenTest {
    private Citizen citizen;

    private String firstName;
    private String lastName;
    private String expectedFullNames;

    public CitizenTest(String firstName, String lastName, String expectedFullNames) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.expectedFullNames = expectedFullNames;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return asList(new Object[][]{
                {"Johnny","Depp","Johnny Depp"}, {"Natalie","Portman","Natalie Portman"},
                {"Harshith","Patte","Harshith Patte"}
        });
    }

    @Test
    public void shouldReturnFullName() {
        citizen = new Citizen(this.firstName, this.lastName, 0);

        assertEquals(this.expectedFullNames, citizen.getFullName());
    }
}