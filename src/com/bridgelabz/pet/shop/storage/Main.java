package com.bridgelabz.pet.shop.storage;

import java.util.List;
import java.util.Set;
import java.util.Scanner;

public class Main {
    petRepository petRepository = new petRepository();
    public static void main(String [] args) {
        // System.out.println("welcome to the pet shop");
        // userInterface userInterface=new userInterface();
        // int value = userInterface.showUserMenu();
        // Main main = new Main();
        // main.handleUserSelection(value);
        Main main = new Main();
        userInterface ui = new userInterface();
        int value = 0;
        while(value != 5) {
            value = ui.showUserMenu();
            main.handleUserSelection(value);
        }
        System.out.println("bye to every one");
    }

        /*UserInterface userInterface=new UserInterface();
        userInterface.print(petRepository.getPetList());*/



    void handleUserSelection(int value){
        switch (value){
            case 1:
                addPet();
                break;
            case 2:
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter name of the bird");
                String name =sc.nextLine();
                Pet getPet = petRepository.getPet(name);
                petRepository.remove(getPet);
                break;
            case 3:
                break;
            case 4:
                petRepository.showAllPets();
                break;
            case 5:
                break;
            default:
                System.out.println("Please choose correct option !!!!");
        }
    }

    void addPet() {

        Dog dog = new Dog();
        dog.id = "D001";
        dog.price = 2000;
        Cat cat = new Cat();
        cat.id = "C001";
        cat.price = 1000;
        Duck duck = new Duck();
        duck.id = "DU001";
        duck.price = 3000;
        LoveBirds lovebirds = new LoveBirds();
        lovebirds.id = "LB001";
        lovebirds.price = 4000;
        Parrot parrot = new Parrot();
        parrot.id = "P001";
        parrot.price = 5000;

        petRepository petRepository = new petRepository();
        petRepository.add(dog);
        petRepository.add(cat);
        petRepository.add(duck);
        petRepository.add(lovebirds);
        petRepository.add(parrot);


    }
}