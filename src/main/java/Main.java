import java.util.ArrayList;

public class Main {
  //dependency injection
  //hvor instantieres objektet (her listen?) her gøres det i Main og ikke i Shop, så man er mere flexibel
  public static void main(String[] args) {
    Shop bilka = new Shop(new ArrayList<>()); //instantier liste her så man her bestemmer hvilken type
    //liste man bruger
    //giver flexibilitet
    //koden kan genbruges
    //dependency injection - der er ikke afhængighed af en bestemt type List,
    //kan være arraylist, linkedlist eller custom made list såsom DeckList.
    //så kan koden nemmere genbruges
    bilka.add("computer");
  }
}
