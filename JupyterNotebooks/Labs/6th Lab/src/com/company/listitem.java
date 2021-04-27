package com.company;

import java.util.LinkedList;

public class listitem {
    LinkedList listitem;
    String value;
    listitem itemafter;

    public listitem(String value){
        this.value = value;
        this.itemafter = null;
        this.listitem = listitem;
    }
}
