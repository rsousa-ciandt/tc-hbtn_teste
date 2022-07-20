
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    private Person person;

    @BeforeEach
    public void setup() {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(Calendar.YEAR, 2000);

        person = new Person("Paul", "McCartney", calendar.getTime(), true, true, true);
    }

    @Test
    public void show_full_name() {
        String fullNameResult = person.fullName();
        String fullNameExpected = "Paul McCartney";

        assertEquals(fullNameExpected, fullNameResult);
    }

    @Test
    public void test_calculateYearlySalary() {
        person.setSalary(1200);

        float salarayResult = person.calculateYearlySalary();
        float salaryExpected = 14400;

        assertEquals(salaryExpected, salarayResult, 0.0);
    }

    @Test
    public void person_is_MEI() {
        person.setSalary(1000);
        person.setPensioner(false);
        person.setPublicServer(false);
        person.setAnotherCompanyOwner(false);

        assertTrue(person.isMEI());
    }

    @Test
    public void person_is_not_MEI() {
        assertFalse(person.isMEI());
    }
}
