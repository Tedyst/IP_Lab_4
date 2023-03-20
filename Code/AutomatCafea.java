import java.util.ArrayList;
import java.util.List;

public class AutomatCafea {

    public List<Portofel> portofel;
    public List<Reteta> reteta;

    public AutomatCafea(){

        Portofel p = new Portofel();
        this.portofel = new ArrayList<Portofel>();
        this.portofel.add(p);
    }

    public void adaugaReteta (Reteta r){
        reteta.add(r);
    }

  public void addReteta(Reteta r) {
  }

}