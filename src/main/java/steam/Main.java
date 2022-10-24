package steam;

import java.util.*;

public class Main {
  //hashmap er ikke alfabetisk ordnet, TreeMap er. Keys er alfabetisk ordnet
  public static void main(String[] args) {
    Game hacknet = new Game();
    Game war = new Game();

    List<Game> steam = new ArrayList<>(); //starter med interface List

    steam.add(hacknet);
    steam.add(war);

    Map<String, Game> steams = new HashMap<>(); //tager først key og så value. key er String hr
    //og Game er value her.
    //konstanttidssøgning. Man looper ikke en hel arrayliste igennem, man finder value til keyen
    //put i Map er som Add i List
    steams.put("hacknet", hacknet); //normalt ville man have en getter og tage titlen frem for at hardcode keyen
    steams.put("war", war);
    steams.put("war1", war);
    steams.put("war", hacknet);
    steams.put("game", new Game());
    //steams.put("game", "game"); kan den ikke fordi value skal være Game men man kunne lave instantiering der
    //tager String som value
    Map<String, String > capitalCities = new HashMap<>();
    capitalCities.put("Copenhagen", "Denmark");
    //man kan kun have unikke keys men godt flere af samme objekt
    Map<String, Set<Double>> capital = new HashMap<>();
    capital.put("Copenhagen", new HashSet<>());

    if (capitalCities.containsKey("Copenhagen")) //containsKey bruges i condition
      //containsKey køre i konstanttid
      //keyen scrambles up og laves til en int, som så søges efter i hashmappet?





    steams.get("hacknet"); //find spil gennem dens key
    //i andre sprog kan maps kaldes dictionaries
    //alle søgefunktioner bruger dette. Søgning på google ligner
    // steams.get("britney spears", "html://www.britney.com");
    //og så er der mange keys til samme ting, så man kan søge på alt muligt og få samme resultat
    //fx søg "britney spears love songs"



  }
}
