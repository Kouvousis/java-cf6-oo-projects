package gr.aueb.cf.ch12;

import gr.aueb.cf.ch12.model.User;
import gr.aueb.cf.ch12.model.UserCredentials;

public class Main {

    public static void main(String[] args) {
        User jim = new User(123456789, "Dimitrios", "Kouvousis");
        UserCredentials userJim = new UserCredentials(123456789, "dimikou", "12AUEB34");

        System.out.println("User Jim Id: " + jim.getId() + " Firstname: " + jim.getFirstname() + " Lastname: " + jim.getLastname());
        System.out.println("User Credentials id: " + userJim.getId() + " Username: " + userJim.getUsername() + " Password: " + userJim.getPassword());
    }
}
