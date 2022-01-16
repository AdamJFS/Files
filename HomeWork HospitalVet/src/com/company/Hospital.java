package com.company;

import java.util.ArrayList;

public class Hospital {

    ArrayList<Client> clients = new ArrayList<>();

    public void addClient(Client client) {
        clients.add(client);
        System.out.println("Client Number: " + client.getClientNumber() + ", Client Full Name: " + client.getFirstName() +
                " " + client.getLastName() + ", Phone Number: " + client.getPhone()
                + ", Sand ADS: " + client.isAds() + ", Client Pet: " + client.animals.toString());

    }

    public void removeClient(Client client){
        clients.remove(client);
        System.out.println("Client: " + client.getClientNumber() + " is removed...");
    }

    public void addPetToClient(int clientNumber, Animals animals) {
        for (Client client : clients) {
            if (client.getClientNumber() == clientNumber) {
                client.getAnimals().add(animals);
            }
        }
    }

        public void removePetFromClient(int clientNumber, Animals animals){
        for (Client client : clients) {
            if (client.getClientNumber() == clientNumber){
                client.getAnimals().remove(animals);
            }
        }
    }



}
