import java.util.List;

public abstract class Reteta {

  public int timp_preparare;

  public float temperatura;

    public List<Ingredient> ingredient;
  
  public abstract void preparare_reteta();

  public abstract void adaugat_apa();

  public abstract void fierbere_apa();

  public abstract void adaugare_ingredient();

  public abstract void infuzie();

}