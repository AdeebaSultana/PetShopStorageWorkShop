package com.bridgelabz.pet.shop.storage;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class userInterface {

    void print(Set set){
        for (Object obj: set){
            System.out.println(obj);
        }
    }
   public int showUserMenu() {
        
        System.out.println("Enter 1.Add Pet \n 2.Remove Pet \n 3.Modify Pet \n 4.Print Pet \n 5.Exit");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        return value;
    }

}

