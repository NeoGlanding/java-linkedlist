package com.ihsan.id;

public class Main {
    public static void main (String args[]) {
        Customer ihsan = new Customer("Ihsan", 20.29);
        Customer ihsan2 = ihsan;

        ihsan.setBalance(200);

        System.out.println("Ihsan 2 has balance " + ihsan2.getBalance());
    }
}
