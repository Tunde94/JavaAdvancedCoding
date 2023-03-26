package ro.sda.advanced._4_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Branch {
    private List<Customer> customerList;
    private String branchName;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customerList = new ArrayList<>();
    }


    public List<Customer> getCustomerList() {
        return Collections.unmodifiableList(customerList);
    }

    public String getBranchName() {
        return branchName;
    }

    //method CONTAINS iterates over the list and searches for the desired element by comparing them using EQUALS method
    public void addCustomer(String customerName, double initAmount) {
        Customer c = new Customer(customerName, initAmount);
        if (customerList.contains(c)) {
            throw new RuntimeException("Client already exists! ");
        }
        customerList.add(new Customer(customerName, initAmount));
    }

    public void addCustomerTransaction(String customerName, double amount) {
        //initial amount does not matter because in Customer class we' ve implemented aquals and hashcode
        //which check only if the customer names are equals
        /*Customer search = new Customer(customerName,0);
        if (customerList.contains(new Customer(customerName, 0))) {
            Customer found = customerList.get(customerList.indexOf(search));
            found.addTransactions(amount);
        }
        else throw new RuntimeException("Customer does not exists! ");
    }*/

        for (Customer c : customerList) {
            if (c.getName().equals(customerName)) {
                c.addTransactions(amount);
                return;//trebuie return ca sa iasa din aceasta functie, altfel iese doar din for si continua cu throw- ceea ce nu e ok :)
            }
        }
        throw new RuntimeException("Customer does not exists! ");

  /*  private Customer findCustomer(String name){
        for (Customer c : customerList){
            if(c.getName().equals(name)){
                return c;
            }
        }
        return null;
    }*/
        //pentru ca am generat equals cu hascCode, nu avem nevoie de metoda findCustomer(metoda muncitoresca)
    }
}
