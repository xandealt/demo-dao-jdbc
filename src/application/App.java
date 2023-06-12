package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class App {
    public static void main(String[] args) throws Exception {
        Department obj = new Department(1, "Test");

        Seller seller = new Seller(21, "bob", "bob@gamil", new Date(), 3000.0, obj);

        System.out.println(seller);
    }
}
