/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gioco.indovina.la.parola;

import java.util.Scanner;

/**
 *
 * @author sara.paolo
 */
public class GIOCOINDOVINALAPAROLA {

    static String [] vocabolario = { "ciao", "gioco", "informatica", "matematica", "astuccio", "tastiera", "mouse", "felpa", "fazzoletti", "computer",
                                     "dodici", "monitor", "cavo", "rete", "occhiali", "sole", "luna", "proiettore", "orologio", "mascherina",
                                     "occhi", "bocca", "mani", "logo", "audio", "video", "bracciale", "casse", "guanti", "scarpe",
                                     "igenizzante", "gel", "finestra", "porta", "preside", "penna", "matita", "forbici", "foglio", "tasto",
                                     "scheda", "corrente", "alimentatore", "naso", "telefono", "iphone", "android", "circuito", "capelli", "cancelletto",
                                     "interrogazione", "verifica", "scuola", "ore", "lattice", "italia", "ufficio", "portatile", "nastro", "rose",
                                     "calze", "calcio", "basket", "pallavolo", "camicia", "completo", "quadro", "prete", "suora", "guerra",
                                     "europa", "mondo", "salesiani", "casa", "garage", "macchina", "teletrasporto", "data", "server", "documenti",
                                     "sistemi", "telecomunicazioni", "incendio", "sapone", "crocifisso", "esame", "sangue", "cibo", "pollo", "nonna",
                                     "persone", "oratorio", "satellite", "maturità", "geometra", "dottore", "insegnante", "avvocato", "nonno", "mamma",
                                     };
    
    static String [] vocabolarioceck = new String [100];
    
    public static int vite = 10, index = 0, lungh = 0;
    
    static char men [];
    static char par [];
    static boolean ceck = true;
    public static String menfin = "";
    
    
    public static String estrazione (){
        int n = 0, i = 0;
        boolean ins = false;
        String parola = "";
        
        n = (int)(Math.random()*(100) +1);
            parola = vocabolario[n];
            
        while(ins == false){
            if(vocabolarioceck[i] == null){
                if(vocabolarioceck[99] != null){
                    ceck = false;
                    return parola;
                }
               vocabolarioceck[i] = parola;
                ins = true;
            }else{
                i++;
            }
        }
        return parola;
    }
        
    public static String stampameno (String parola){
        String meno = "";
        
        for (int i = 0; i <= lungh; i++) {
            meno = meno + "-";
        }
        men = new char [lungh];
        par = new char [lungh];
        men = meno.toCharArray();
        par = parola.toCharArray();
        
        return meno;
    }
    
    public static boolean vercar (String carattere, String parola, String meno){
        boolean ver = false;
        index = parola.indexOf(carattere);
        for (int i = 0; i < 10; i++) {
            if(index < 0){
                ver = false;
            }else{
                ver = true;
            }
        }
        return ver;
    }
    public static boolean incar (String carattere, String parola, String meno){
        boolean in = false;
        char car = carattere.charAt(0);
        menfin = "";
        
        for (int i = 0; i < lungh; i++) {
            if(car == par[i]){
                men[i] = car;
                in = true;
            }
            menfin = menfin + men[i];
        }
        return in;
    }
    
    public static void omino (){
        switch(vite){
            case 1:
                System.out.println("    |");
                break;
                
            case 2:
                System.out.println("___|");
                break;

                
            case 3:
                System.out.println("|  ");
                System.out.println("|  ");
                System.out.println("|  ");
                System.out.println("|  ");
                System.out.println("|  ");
                System.out.println("|  ");
                System.out.println("|___|");
                break;
                
            case 4:
                System.out.println("_____");
                System.out.print("|  ");
                System.out.println(" |");
                System.out.println("|  ");
                System.out.println("|  ");
                System.out.println("|  ");
                System.out.println("|  ");
                System.out.println("|  ");
                System.out.println("|___|");
                break;
                
            case 5:
                System.out.println("_____");
                System.out.print("|  ");
                System.out.println(" |");
                System.out.print("|  ");
                System.out.println(" O");
                System.out.println("|  ");
                System.out.println("|  ");
                System.out.println("|  ");
                System.out.println("|  ");
                System.out.println("|___|");
                break;
               
            case 6:
                System.out.println("_____");
                System.out.print("|  ");
                System.out.println(" |");
                System.out.print("|  ");
                System.out.println(" O");
                System.out.print("|  ");
                System.out.println(" |");
                System.out.print("|  ");
                System.out.println("/");
                System.out.println("|  ");
                System.out.println("|  ");
                System.out.println("|___|");
                break;
            
            case 7:
                System.out.println("_____");
                System.out.print("|  ");
                System.out.println(" |");
                System.out.print("|  ");
                System.out.println(" O");
                System.out.print("|  ");
                System.out.println(" |");
                System.out.print("|  ");
                System.out.println("/|");
                System.out.println("|  ");
                System.out.println("|  ");
                System.out.println("|___|");
                break;
             
            case 8:
                System.out.println("_____");
                System.out.print("|  ");
                System.out.println(" |");
                System.out.print("|  ");
                System.out.println(" O");
                System.out.print("|  ");
                System.out.println(" |");
                System.out.print("|  ");
                System.out.println("/|\\");
                System.out.println("|  ");
                System.out.println("|  ");
                System.out.println("|___|");
                break;
              
            case 9:
                System.out.println("_____");
                System.out.print("|  ");
                System.out.println(" |");
                System.out.print("|  ");
                System.out.println(" O");
                System.out.print("|  ");
                System.out.println(" |");
                System.out.print("|  ");
                System.out.println("/|\\");
                System.out.print("|  ");
                System.out.println(" |");
                System.out.println("|  ");
                System.out.println("|___|");
                break;
                
            case 10:
                System.out.println("_____");
                System.out.print("|  ");
                System.out.println(" |");
                System.out.print("|  ");
                System.out.println(" O");
                System.out.print("|  ");
                System.out.println(" |");
                System.out.print("|  ");
                System.out.println("/|\\");
                System.out.print("|  ");
                System.out.println(" |");
                System.out.print("|  ");
                System.out.println("/ \\");
                System.out.println("|___|");
                break;
        }
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        boolean ver = false, in = false, menfinver = true;
        int punti = 0, i = 0;
        String parola = "", carattere = "", meno = "", esc = "";
        
        System.out.println("SARA PAOLO 3AI");
        
        while((i != 100)&&(vite != 0)&&(ceck == true)){
            
            parola = estrazione ();

            lungh = parola.length();
            System.out.println("_________________________________________________________________________________");
            System.out.println("");
            System.out.println("INDOVINA LA PAROLA:");

            meno = stampameno(parola);

            System.out.println(meno);

            do{
                omino();
                
                System.out.println("TI RIMANGONO " + vite + " VITE");
                System.out.println("INSERISCI UNA LETTERA CHE POTREBBE ESSERE CONTENUTA NELLA PAROLA DA INDOVINARE");

                carattere = sc.next();

                ver = vercar(carattere, parola, meno);

                if (ver == true){
                    in = incar (carattere, parola, meno);
                    System.out.println(menfin);
                    punti = punti + 10;
                    System.out.println("PUNTI: "+ punti);
                }else{
                    vite = vite - 1;
                    if(vite == 0){
                        System.out.println("HAI PERSO!");
                        System.out.println("LE VITE A TUA DISPOSIZIONE SONO TERMINATE");
                    }else{
                        System.out.println("IL CARATTERE INSERITO NON É PRESENTE NELLA PAROLA DA INDOVINARE");
                    }                    
                }
                if(menfin.equals(parola)){
                    menfinver = false;
                }
            }while((vite != 0)&&(menfinver == true));
            i++;
        }
        
    }
    
}
