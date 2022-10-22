import com.sun.source.tree.UsesTree;

public class Person extends Customer{
    public String firstname;
    public String lastName;
    public String nationalIdentity;

    Person(String firstname, String lastName, String nationalIdentity)
    {
        this.firstname= firstname;
        this.lastName= lastName;
        this.nationalIdentity= nationalIdentity;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalIdentity() {
        return nationalIdentity;
    }

    public void setNationalIdentity(String nationalIdentity) {
        this.nationalIdentity= nationalIdentity;
    }
}
