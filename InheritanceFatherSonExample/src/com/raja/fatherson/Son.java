package com.raja.fatherson;

public class Son extends Father {

    String dressCode = "modern";
    public Son() {
        System.out.println("Son Constructor called");
    }

    public void phoneCall() {
        System.out.println("Son Phone is ringing");
    }

    public void sendMessage() {
        System.out.println(super.getPhone().getModel()+" receiving message in facebook");
    }

}
