import java.util.*;

public class Main {
    static int brojKafa = 0;
    static int brojKolaca = 0;
    static double ukupnaCijena = 0;

    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
        boolean radi = true;
        while (radi) {
            System.out.println("Dobrodosli u nas kafic! Molimo odaberite opciju:");
            System.out.println("1. Pogledaj meni");
            System.out.println("2. Naruci kafu");
            System.out.println("3. Naruci kolac");
            System.out.println("4. Plati i izadji");
            int izbor = ulaz.nextInt();
            System.out.println(" ");
            switch (izbor) {
                case 1:
                    ispisiMeni();
                    break;
                case 2:
                    naruciKafu();
                    break;
                case 3:
                    naruciKolac();
                    break;
                case 4:
                    plati();
                    break;
                default:
                    System.out.println("Unijeli ste nevalidan izbor. Pokusajte ponovo.\n");
            }
        }
        ulaz.close();
    }

    public static void naruciKafu() {
        Scanner ulaz = new Scanner(System.in);
        System.out.println("Odaberite vrstu kafe (1-3):");
        int izbor = ulaz.nextInt();
        switch (izbor) {
            case 1:
                ukupnaCijena += 2;
                break;
            case 2:
                ukupnaCijena += 3;
                break;
            case 3:
                ukupnaCijena += 3.5;
                break;
            default:
                System.out.println("Unijeli ste nevalidan izbor.");
                naruciKafu();
                return;
        }
        brojKafa++;
        System.out.println("Vasa kafa je narucena!\n");
    }

    public static void naruciKolac() {
        Scanner ulaz = new Scanner(System.in);
        System.out.println("Odaberite vrstu kolaca (1-3):");
        int izbor = ulaz.nextInt();
        switch (izbor) {
            case 1:
                ukupnaCijena += 3.5;
                break;
            case 2:
                ukupnaCijena += 4;
                break;
            case 3:
                ukupnaCijena += 5;
                break;
            default:
                System.out.println("Unijeli ste nevalidan izbor.");
                naruciKolac();
                return;
        }
        brojKolaca++;
        System.out.println("Vas kolac je narucen!\n");
    }

    public static void ispisiMeni() {
        System.out.println("----- MENI -----");
        System.out.println("KAFA:");
        System.out.println("1. Espresso - 2 KM");
        System.out.println("2. Bosanska kafa - 3 KM");
        System.out.println("3. Latte - 3.5 KM");
        System.out.println("KOLACI:");
        System.out.println("1. Nutella kolac - 3.5 KM");
        System.out.println("2. Honeybee kolac - 4 KM");
        System.out.println("3. Kraljevski kolac - 5 KM");
        System.out.println("-----------------\n");
    }

    public static void pregledajKorpu() {
        System.out.println("----- KORPA -----");
        System.out.println("Broj kafa: " + brojKafa);
        System.out.println("Broj kolaca: " + brojKolaca);
        System.out.println("Ukupna cijena: " + ukupnaCijena + " KM");
        System.out.println("-----------------\n");
    }
    

    public static void plati() {
        if(ukupnaCijena == 0) {
            System.out.println("Niste nista narucili! Želite li nastaviti s narucivanjem?");
            System.out.println("1. Da");
            System.out.println("2. Ne");
            Scanner ulaz = new Scanner(System.in);
            int izbor = ulaz.nextInt();
            System.out.println(" ");
            switch (izbor) {
                case 1:
                    return;
                case 2:
                    System.out.println("Hvala vam na posjeti! Vidimo se opet!");
                    System.exit(0); 
                default:
                    System.out.println("Unijeli ste nevalidan izbor.\n");
                    plati();
                    return; 
            }
        }    
        else{
            Scanner ulaz = new Scanner(System.in);
            System.out.println("Ukupna cijena za platiti: " + ukupnaCijena + " KM");
            System.out.println("Molimo unesite informacije o svojoj kartici.\n");
            System.out.println("Broj kartice:");
            String brojKartice = ulaz.next();
            System.out.println("CVV:");
            int cvv = ulaz.nextInt();
            System.out.println("Datum isteka (MJ/GO):");
            String datumIsteka = ulaz.next(); 
            System.out.println(" ");
            System.out.println("Uspjesno ste platili!");
            System.out.println("Hvala vam na posjeti! Vidimo se opet!");
            System.exit(0);
        }
        
    }
}
