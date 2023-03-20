public class CeaiCald extends Reteta {

  public CeaiCald(){}

  public void preparareReteta() {
    adaugatApa();
    adaugareIngredient();
    adaugaMiere(400);
  }

  public void adaugaMiere(float cantitate) {
        cantitate = 4;
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