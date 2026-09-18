public class Suspect {

    int suspectId;
    String name;
    String contact;
    String address;

    public Suspect(int suspectId, String name, String contact, String address) {
        this.suspectId = suspectId;
        this.name = name;
        this.contact = contact;
        this.address = address;
    }

    public void displaySuspect() {
        System.out.println("Suspect ID: " + suspectId);
        System.out.println("Name: " + name);
        System.out.println("Contact: " + contact);
        System.out.println("Address: " + address);
    }
}