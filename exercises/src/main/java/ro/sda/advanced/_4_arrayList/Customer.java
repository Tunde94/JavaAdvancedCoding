package ro.sda.advanced._4_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Customer {
    private String name;
    private List<Double> transactions;

    public Customer(String name, double initAmount) {
        this.name = name;
        this.transactions = new ArrayList<>();
        addTransactions(initAmount);
    }

    public void addTransactions(Double transactions){
        this.transactions.add(transactions);
    }

    public String getName() {
        return name;
    }

    public List<Double> getTransactions() {
        //return transactions;//returneaza referinta
        //return Collections.unmodifiableList(transactions);-> nu permite modificarea listei
        return new ArrayList<>(transactions);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return name.equals(customer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
