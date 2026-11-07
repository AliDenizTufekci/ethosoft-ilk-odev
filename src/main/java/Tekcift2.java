
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author yasar
 */
public class Tekcift2 {

    public static void main(String[] args) {
          Scanner scanner=new Scanner(System.in);
       
        
        System.out.print("sayı giriniz.");
   
    scanner.nextInt();
   
    int sayi=scanner.nextInt();
  
    int abc;
      
    abc = sayi%2;
   
    if (abc==0){
        
        System.out.println(sayi + "sayısı tek sayıdır");
                 
    }         
   else {
        
        System.out.println(sayi + "sayısı çift sayıdır") ;
    } 
    }
    }
    
