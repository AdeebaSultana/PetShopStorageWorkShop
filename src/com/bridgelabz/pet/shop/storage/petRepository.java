package com.bridgelabz.pet.shop.storage;

import java.util.ArrayList;
//import java.util.Set;
//import java.util.HashSet;
//import java.util.List;

public class petRepository{
    //private  List petList = new Set();
    private ArrayList<Pet> PetList = new ArrayList<Pet>();
    // private  Set petList = new HashSet();

    // public Set getPetList() {
       // return PetList;
  //  }

   public void add(Pet pet) {
        PetList.add(pet);
    }

   public void remove(Pet pet) {
        PetList.remove(pet);
    }

    Pet getPet(String id){

        for(Object pet: PetList){
            Pet petObj = (Pet)pet;
            if (id.equals(petObj.id)){
                return petObj;
            }
        }
        return null;
    }

    public void showAllPets() {
            for(Pet pet : PetList) {
                System.out.println(pet + " ");
            }
        }
    }

