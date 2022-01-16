package com.company;

public class Main {

    public static void main(String[] args) {
	    Hospital hospital = new Hospital();
        ER er = new ER();
        Client c1 = new Client("Jack", "Richer", "0554321456", false, new Animals("COCI", "CAT", 1));
        Client c2 = new Client("Mor", "Tobi", "055435346", true, new Animals("snopi", "Dog", 2));
        hospital.addClient(c1);
        hospital.addClient(c2);
        hospital.removeClient(c2);
        c1.isAds();
        c1.sendMessageToDogOwners();
        er.addAnimalToBed(c1.pets);















    }
}
