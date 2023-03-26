package ro.sda.advanced._4_arrayList;

//array list folosim mai mult in cautare, in adaugare/stergere merge mai incet ca linkedList

import java.util.ArrayList;
import java.util.List;

// You job is to create a simple banking application.
// There should be a Bank class
// It should have an arraylist of Branches
// Each Branch should have an arraylist of Customers
// The Customer class should have an arraylist of Doubles (transactions)
// Customer:
// Name, and the ArrayList of doubles.
// Branch:
// Need to be able to add a new customer and initial transaction amount.
// Also needs to add additional transactions for that customer/branch
// Bank:
// Add a new branch
// Add a customer to that branch with initial transaction
// Add a transaction for an existing customer for that branch
// Show a list of customers for a particular branch and optionally a list
// of their transactions
// Demonstration autoboxing and unboxing in your code
// Hint: Transactions
// Add data validation.
// e.g. check if exists, or does not exist, etc.
// Think about where you are adding the code to perform certain actions
public class Main {
    public static void main(String[] args) {

        /*List<Double> array = new ArrayList<>();

        Customer c1 = new Customer("Messi", 850);
        Branch b = new Branch("ING piata Unirii");
        b.addCustomer("Catalin", 100);
        b.addCustomer("Mihai", 250);
        // b.addCustomer("Catalin", 200);

        b.addCustomerTransaction("Catalin", 500);*/

        Bank ing = new Bank("ING Bank");
        ing.addBranch("Piata Victoriei");
        ing.addBranch("Piata Unirii");
        ing.addBranch("Piata Unirii");

        ing.addCustomer("Piata Unirii", "Catalin",100.5);
        ing.addCustomer("Piata Unirii", "Mihai",150.2);
        ing.addCustomer("Piata Victoriei", "Ion",200.5);
        ing.addCustomer("Piata Victoriei", "Andrei",288.7);
        ing.addCustomer("Piata Victoriei", "Ion",700.5);

        ing.addCustomerTransaction("Piata Victoriei", "Ion", 25);
        ing.addCustomerTransaction("Piata Victoriei", "Andrei", 70);
        ing.addCustomerTransaction("Piata Victoriei", "Mihai", 95.5);
        ing.addCustomerTransaction("Piata Unirii", "Mihai", 5.5);

        System.out.println("-------------------------------------");

        ing.listAllCustomers("Piata Unirii", true);
        ing.listAllCustomers("Piata Victoriei", true);




    }
}
