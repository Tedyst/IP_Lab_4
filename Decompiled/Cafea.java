/*    */ public class Cafea extends Reteta {
/*    */   public void preparareReteta() {
/*  6 */     adaugatApa();
/*  7 */     adaugareIngredient();
/*  8 */     adaugaZahar(10.0F);
/*    */   }
/*    */   
/*    */   public void adaugaZahar(float paramFloat) {
/* 12 */     paramFloat = 30.0F;
/*    */   }
/*    */   
/*    */   public void adaugatApa() {
/* 16 */     System.out.println("Am adaugat apa");
/*    */   }
/*    */   
/*    */   public void fierbereApa() {
/* 20 */     System.out.println("Am fiert apa");
/*    */   }
/*    */   
/*    */   public void adaugareIngredient() {
/* 24 */     System.out.println("Am adaugat Ingredient");
/*    */   }
/*    */   
/*    */   public void infuzie() {
/* 28 */     System.out.println("Se realizeaza infuzia");
/*    */   }
/*    */ }


/* Location:              /home/tedy/Git/IP_Lab_4/Code/!/Cafea.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */