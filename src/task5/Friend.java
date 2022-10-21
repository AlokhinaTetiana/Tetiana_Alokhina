package task5;

public class Friend {
    public String firstName;
    public String lastName;
    public Friend(String name_str){
        String[] name=name_str.split(":");
        this.firstName = name[0];
        this.lastName = name[1];
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "("+lastName+", "+firstName+")";
    }
}
