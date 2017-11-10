/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversion.celsisus.fahrenheit;

import java.util.Scanner;

/**
 *
 * @author Administrateur
 */
public class ConversionCelsisusFahrenheit {
    
    Scanner sc = new Scanner(System.in);
    
     public void afficheMenu(){
         
        boolean quitter = false;
        while(quitter != true){
            
            System.out.println("CONVERTISSEUR DEGRES CELSIUS ET DEGRES FAHRENHEIT");
            System.out.println("-------------------------------------------------");
            System.out.println("Choisissez le mode de conversion : ");
            System.out.println("1. Convertisseur Celsius en Fahrenheit");
            System.out.println("2. Convertisseur Fahrenheit en Celsius");
            int a = sc.nextInt();
        
            switch(a){
                case 1:
                    convertisseurCelsiusFahrenheit();
                    System.out.println("Souhaitez-vous continuer ? 1/0");
                    int re = sc.nextInt();
                    if (re == 0)
                        quitter = true;
                    
                break;
                case 2:
                    convertisseurFahrenheitCelsius();
                    System.out.println("Souhaitez-vous continuer ? 1/0");
                    int ret = sc.nextInt();
                    if (ret == 0)
                        quitter = true;
                break;
                default:
                System.out.println("Choix incorrect, merci de bien choisir entre la solution '1' et '0'");
                    
            }
        }
    }
    
    public void convertisseurCelsiusFahrenheit(){
        System.out.println("Température à convertir: ");
        int celsius  = sc.nextInt();
        int fahr;
        fahr = 9/5*celsius +32;
        System.out.println( celsius + "°C est egal à " + fahr +"°F.");
                
                
    }
    
    public void convertisseurFahrenheitCelsius(){
        System.out.println("Température à convertir: ");
        int fahr = sc.nextInt();
        int celsius;
        celsius = (fahr-32)*5/9;
        System.out.println( fahr + "°F est egal à " + celsius +"°C.");
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static  void main(String[] args) {
        ConversionCelsisusFahrenheit c = new ConversionCelsisusFahrenheit();
        c.afficheMenu();
        
        
        // TODO code application logic here
    }
   
    
}
