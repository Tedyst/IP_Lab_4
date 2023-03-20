public class Cafea extends Reteta {

  public Cafea(){}

  public void preparareReteta() {
    adaugatApa();
    adaugareIngredient();
    adaugaZahar(10);
  }

  public void adaugaZahar(float cantitate) {
    cantitate = 30;
  }

  public void adaugatApa() {
    System.out.println("Am adaugat apa");
  }

  public void fierbereApa() {
    System.out.println("Am fiert apa");
  }

  public void adaugareIngredient() {
    System.out.println("Am adaugat Ingredient");
  }

  public void infuzie() {
    System.out.println("Se realizeaza infuzia");
  }

}