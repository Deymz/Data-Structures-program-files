package libmansys;
import java.util.Scanner;
import java.util.*;
/**
 */
public class Users {
    
    public static ArrayList<String> names = new ArrayList<String>();
    public static String currentUser;
    
    public static String list() {
        
        
        
        if (names.size()==0) {
                System.out.println("******NO USERS HAVE BEEN REGISTERED*****");
               
            }
        
        for (int i = 0; i < names.size(); i++) {
            if (names != null) {

                System.out.println("Name: " + names.get(i));


            }
        }
        return "";
    }

    public static String set() {
        Scanner dsa = new Scanner(System.in);
        System.out.println("\nPlease Enter your Username:");
        String input = dsa.nextLine();
        names.add(input);
        
        return "";
    }
    
    public static String select() {
        Scanner dsa = new Scanner(System.in);
        System.out.println("\nPlease Enter your username:");
        String input = dsa.nextLine();
        int success =0;
        for(String name : names){
            if(name.equals(input)){
                System.out.println("\nWelcome User : "+input);
                currentUser=input;
                success=1;
            }
            
        
        }
        if(success==0){
                System.out.println("\n"+input+" is not included in the list of users.");
            }
        
        return "";
    }

}