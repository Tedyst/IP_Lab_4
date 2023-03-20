import java.util.List;

public abstract class Reteta {
  public int timpPreparare;
  
  public float temperatura;
  
  public List<Ingredient> ingredient;
  
  public abstract void preparareReteta();
  
  public abstract void adaugatApa();
  
  public abstract void fierbereApa();
  
  public abstract void adaugareIngredient();
  
  public abstract void infuzie();
}


/* Location:              /home/tedy/Git/IP_Lab_4/Code/!/Reteta.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */