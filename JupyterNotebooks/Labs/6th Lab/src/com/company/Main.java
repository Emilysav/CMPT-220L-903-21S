package com.company;

public class Main {

    public static void main(String[] args) {
	    listitem one = new listitem("hi");
        listitem two = new listitem("hey");
        listitem three = new listitem("howdy");
        listitem four = new listitem ("hello");

        one.itemafter = two;
        two.itemafter = three;
        three.itemafter = four;
    }
}
