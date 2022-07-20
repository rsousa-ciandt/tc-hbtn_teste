import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Person {
    private String name;
    private String surname;
    private Date birtDate;
    private boolean anotherCompanyOwner;
    private boolean pensioner;
    private boolean publicServer;
    private float salary;

    public Person(String name, String surname, Date birtDate, boolean anotherCompanyOwner, boolean pensioner, boolean publicServer) {
        this.name = name;
        this.surname = surname;
        this.birtDate = birtDate;
        this.anotherCompanyOwner = anotherCompanyOwner;
        this.pensioner = pensioner;
        this.publicServer = publicServer;
    }

    public String fullName() {
        return name + " " + surname;
    }

    public boolean isMEI() {
        int minAge = 18;
        float maxSalary = 130000;

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(birtDate);

        int personAge = LocalDate.now().getYear() - calendar.get(Calendar.YEAR);

        boolean ageAllowed = personAge >= minAge;
        boolean salaryAllowed = calculateYearlySalary() <= maxSalary;

        return ageAllowed && salaryAllowed && !pensioner && !anotherCompanyOwner && !publicServer;
    }

    public float calculateYearlySalary() {
        return salary * 12;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public boolean isAnotherCompanyOwner() {
        return anotherCompanyOwner;
    }

    public void setAnotherCompanyOwner(boolean anotherCompanyOwner) {
        this.anotherCompanyOwner = anotherCompanyOwner;
    }

    public boolean isPensioner() {
        return pensioner;
    }

    public void setPensioner(boolean pensioner) {
        this.pensioner = pensioner;
    }

    public boolean isPublicServer() {
        return publicServer;
    }

    public void setPublicServer(boolean publicServer) {
        this.publicServer = publicServer;
    }
}
