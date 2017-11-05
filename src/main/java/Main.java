import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        String country;
        Continents continent;
        System.out.println("in which country do you live?");
        Scanner scanner = new Scanner(System.in);
        country = scanner.nextLine();

        switch (country) {
            case "Algeria" : case "Kenya" : case "Uganda" : case "Zambia" : case "Zimbabwe" : case "Egypt" :
                continent = Continents.AFRICA;
                System.out.println("your country is in Africa"); break;
            case "Taiwan" : case "Thailand" : case "Afghanistan" : case "Nepal" : case "North Korea" : case "Uzbekistan" :
                continent = Continents.ASIA;
                System.out.println("your country is in Asia"); break;
            case "Italy" : case "San Marino" : case "Poland" : case "Turkey" : case "Latvia" : case "Ukraine" :
                continent = Continents.EUROPE;
                System.out.println("your country is in Europe"); break;
            case "Grenada" : case "Mexico" : case "Panama" : case "Cuba" : case "Dominica" : case "Haiti" :
                continent = Continents.NORTH_AMERICA;
                System.out.println("your country is in North America"); break;
            case "Argentina" : case "Paraguay" : case "Suriname" : case "Venezuela" : case "Colombia" : case "Ecuador" :
                continent = Continents.SOUTH_AMERICA;
                System.out.println("your country is in South America");break;
            case "Australia" : case "Palau" : case "Tonga" : case "Tuvalu" : case "Vanuatu" : case "Samoa" :
                continent = Continents.AUSTRALIA_AND_OCEANIA;
                System.out.println("your country in Australia, or in Oceania");break;
        }
    }
}

enum Continents {
    NORTH_AMERICA, SOUTH_AMERICA, ASIA, EUROPE, AFRICA, AUSTRALIA_AND_OCEANIA;
}
