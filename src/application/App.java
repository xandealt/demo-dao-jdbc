package application;

import model.entities.Department;

public class App {
    public static void main(String[] args) throws Exception {
        Department obj = new Department(1, "Test");

        System.out.println(obj);
    }
}
