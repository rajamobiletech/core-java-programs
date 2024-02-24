package com.raja.fatherson;

public class Father {
    protected Phone phone;

    String dressCode = "classic";

    public Father() {
        System.out.println("Father Constructor called");
    }

    public void phoneCall() {
        System.out.println("Father Phone is ringing");
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public void sendMessage() {
        System.out.println(getPhone().getModel()+" receiving message in  phone");
    }
}
