import java.util.ArrayList;
import java.util.List;

public class Shop {
  private List<String> products;

  public Shop(List<String> products){ //her flyttes instantieringen af arraylisten til Main klassen
    //sådan vil man gøre. Man vil ikke have arraylisten i denne klasse
    //i "controlleren" skal man kunne bestemme hvilken type liste man vil bruge
    this.products = products;
  }

  public boolean add(String product){
    this.products.add(product);
    return true;
  }
}
