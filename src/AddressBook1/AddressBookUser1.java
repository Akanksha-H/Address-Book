package AddressBook1;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookUser1 {
    static final int ADD_CONTACT = 1;
    static final int EDIT_CONTACT = 2;
    static final int DELETE_CONTACT = 3;
    static ArrayList<UserContactInfo> infoArrayList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("WELCOME TO ADDRESS_BOOK");
        System.out.println("Enter the choice 1: Add Contact 2: Edit Contact 3: Delete Contact");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        switch (option) {
            case ADD_CONTACT:
                AddressBookUser1 addContact = new AddressBookUser1();
                addContact.addContact();
                break;

                case EDIT_CONTACT:
                AddressBookUser1 editContact = new AddressBookUser1();
                editContact.editContact();
                break;

                case DELETE_CONTACT:
                AddressBookUser1 deleteContact = new AddressBookUser1();
                deleteContact.deleteContact();
                break;
        }
    }

    void addContact(){
        UserContactInfo user1 = new UserContactInfo();
        Scanner scanner = new Scanner(System.in);
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
                + user1.getEmail() + "\n" + "Number = " + user1.getNumber());

        infoArrayList.add(user1);
    }

    void deleteContact(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name the contact you want to delete = ");
        String firstName1 = scanner.next();
        for (int i = 1; i < infoArrayList.size(); i++) {
            if (firstName1.equals(infoArrayList.get(i).getFirstName())) {
                infoArrayList.remove(infoArrayList.get(i));
                System.out.println("Contact deleted");
            } else {
                System.out.println("Put valid data");
            }
        }
    }

    void editContact(){
        UserContactInfo contactInfo = new UserContactInfo();
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