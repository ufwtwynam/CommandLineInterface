public class Passenger {

    private String name;
    private int phoneNumber;
    private String emailAddress;
    private int passportNumber;

    public Passenger(String name, int phoneNumber, String emailAddress, int id) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.passportNumber = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getId() {
        return passportNumber;
    }

    public void setId(int id) {
        this.passportNumber = id;
    }
}
