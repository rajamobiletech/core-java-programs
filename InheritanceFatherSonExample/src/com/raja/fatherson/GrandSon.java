package com.raja.fatherson;

public class GrandSon extends Father {

    String dressCode = "western";

    public GrandSon() {
        super();
        System.out.println("Grandson Constructor called");
    }

    public void phoneCall() {
        System.out.println("GrandSon Phone is ringing");
    }

    public void sendMessage() {
        System.out.println(super.getPhone().getModel()+" receiving message in  instagram");
    }
}
