import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        String country;
        System.out.println("in which country do you live?");
        Scanner scanner = new Scanner(System.in);
        country = scanner.nextLine().toLowerCase();

        switch (country) {
            case "algeria" : case "kenya" : case "uganda" : case "zambia" : case "zimbabwe" : case "egypt" :
                System.out.println("your country is in " + Continents.AFRICA.toString().toLowerCase()); break;
            case "taiwan" : case "thailand" : case "afghanistan" : case "nepal" : case "north korea" : case "uzbekistan" :
                System.out.println("your country is in " + Continents.ASIA.toString().toLowerCase()); break;
            case "italy" : case "san marino" : case "poland" : case "turkey" : case "latvia" : case "ukraine" :
                System.out.println("your country is in " + Continents.EUROPE.toString().toLowerCase()); break;
            case "grenada" : case "mexico" : case "panama" : case "cuba" : case "dominica" : case "haiti" :
                System.out.println("your country is in " + Continents.NORTH_AMERICA.toString().toLowerCase()); break;
            case "argentina" : case "paraguay" : case "suriname" : case "venezuela" : case "colombia" : case "ecuador" :
                System.out.println("your country is in " + Continents.SOUTH_AMERICA.toString().toLowerCase());break;
            case "australia" : case "palau" : case "tonga" : case "tuvalu" : case "vanuatu" : case "samoa" :
                System.out.println("your country in " + Continents.AUSTRALIA_AND_OCEANIA.toString().toLowerCase());break;
        }
    }
}

enum Continents {
    NORTH_AMERICA, SOUTH_AMERICA, ASIA, EUROPE, AFRICA, AUSTRALIA_AND_OCEANIA;
}