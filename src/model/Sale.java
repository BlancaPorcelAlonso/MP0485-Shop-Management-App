package model;

import java.util.Arrays;
import java.util.ArrayList;

public class Sale {
	Cliente client;
	ArrayList<Product> products;
	double amount;

	public Sale(Cliente client, Product[] products, double amount) {
		super();
		this.client = client;
                this.products = new ArrayList<>();
		this.amount = amount;
	}

	public Cliente getClient() {
		return client;
	}

	public void setClient(Cliente client) {
		this.client = client;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
        
	@Override
	public String toString() {
		return "Sale [client=" + client + ", products=" + products + ", amount=" + amount + "]";
	}
}