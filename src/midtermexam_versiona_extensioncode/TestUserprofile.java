/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author hannah
 */
import java.util.Scanner;
import java.util.Arrays;

public class TestUserprofile {
    
    public static void main (String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome! This is the list of the genres of the movie: ");
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        System.out.println(Arrays.asList(genres));
        
        System.out.println();
  
        System.out.println("Please enter your name: ");
        String name = input.nextLine();
        System.out.println("Choose your favourite genre from a displayed list: ");
        String favGenre = input.nextLine();
        
        
        System.out.println("Your user profile is created!");
        System.out.println();
        
        System.out.println("This is your user profile: ");
        System.out.print("Your name: " + name + "  ");
        System.out.println("Your favourite genre: " + favGenre);
        
        
    }
    
}
