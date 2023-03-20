/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ 
/*    */ public class AutomatCafea {
/*    */   public List<Portofel> portofel;
/*    */   
/*    */   public List<Reteta> reteta;
/*    */   
/*    */   public AutomatCafea() {
/* 11 */     Portofel portofel = new Portofel();
/* 12 */     this.portofel = new ArrayList<>();
/* 13 */     this.portofel.add(portofel);
/*    */   }
/*    */   
/*    */   public void adaugaReteta(Reteta paramReteta) {
/* 17 */     this.reteta.add(paramReteta);
/*    */   }
/*    */ }


/* Location:              /home/tedy/Git/IP_Lab_4/Code/!/AutomatCafea.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */