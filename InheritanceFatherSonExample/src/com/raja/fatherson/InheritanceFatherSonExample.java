package com.raja.fatherson;

public class InheritanceFatherSonExample {
    public static void main(String[] args) {
//        Son son = new Son();
//        Phone ios = new Phone("iphone14", "apple", "black");
//        son.setPhone( ios);
//        son.phoneCall();
//        son.sendMessage();


        Father grandSon = new GrandSon();
        Phone iosmax = new Phone("iphone16 max", "apple", "red");
        grandSon.setPhone( iosmax);
        grandSon.phoneCall();
        grandSon.sendMessage();
        System.out.println(grandSon.dressCode);
    }
}
