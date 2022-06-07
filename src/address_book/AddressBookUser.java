package address_book;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookUser {
    static ArrayList<UserContactInformation> infoArrayList = new ArrayList<>();
    static final int EDIT_CONTACT = 1;

    public static void main(String[] args) {
        System.out.println("WELCOME TO ADDRESS_BOOK");

        Scanner scanner = new Scanner(System.in);

        UserContactInformation user1 = new UserContactInformation();
        System.out.print("Enter name: ");
        user1.setFirstName(scanner.next());

        System.out.print("Enter last name: ");
        user1.setLastName(scanner.next());

        System.out.print("Enter locality name: ");
        user1.setLocality(scanner.next());

        System.out.print("Enter city name: ");
        user1.setCity(scanner.next());

        System.out.print("Enter state name: ");
        user1.setState(scanner.next());

        System.out.print("Enter email: ");
        user1.setEmail(scanner.next());

        System.out.print("Enter zip: ");
        user1.setZip(scanner.nextInt());

        System.out.print("Enter mobile number: ");
        user1.setNumber(scanner.nextLong());

        System.out.println("Details of User" + "\n" + "FirstName = " + user1.getFirstName() + "\n" + "LastName = "
                + user1.getLastName() + "\n" + "Locality = " + user1.getLocality() + "\n" + "City = " + user1.getCity()
                + "\n" + "State = " + user1.getState() + "\n" + "Email =" + user1.getEmail() + "\n" + "Zip ="
                + user1.getZip() + "\n" + "Number = " + user1.getNumber());

        infoArrayList.add(user1);

        System.out.println("Enter the choice 1: Edit Contact 2: Delete Contact");
        int option = scanner.nextInt();

        switch (option) {
            case EDIT_CONTACT:
                AddressBookUser editContact = new AddressBookUser();
                editContact.editContact();
                break;
        }
    }
    void editContact() {
        UserContactInformation contactInfo = new UserContactInformation();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name  : ");
        String firstName = scanner.next();

        for (int i = 0; i < infoArrayList.size(); i++) {
            if (firstName.equals(infoArrayList.get(i).getFirstName())) {
                contactInfo = infoArrayList.get(i);
            } else {
                System.out.println("Put valid data");
            }
        }
        System.out.print("Enter new name: ");
        contactInfo.setFirstName(scanner.next());

        System.out.print("Enter new last name: ");
        contactInfo.setLastName(scanner.next());

        System.out.print("Enter new  locality name: ");
        contactInfo.setLocality(scanner.next());

        System.out.print("Enter new city name: ");
        contactInfo.setCity(scanner.next());

        System.out.print("Enter new state name: ");
        contactInfo.setState(scanner.next());

        System.out.print("Enter new email: ");
        contactInfo.setEmail(scanner.next());

        System.out.print("Enter new zip: ");
        contactInfo.setZip(scanner.nextInt());

        System.out.print("Enter new mobile number: ");
        contactInfo.setNumber(scanner.nextLong());
    }
}