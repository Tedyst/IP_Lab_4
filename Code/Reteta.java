import java.util.List;

public abstract class Reteta {

  public Reteta(){}

  public int timpPreparare;

  public float temperatura;

    public List<Ingredient> ingredient;
  
  public abstract void preparareReteta();

  public abstract void adaugatApa();

  public abstract void fierbereApa();

  public abstract void adaugareIngredient();

  public abstract void infuzie();

}