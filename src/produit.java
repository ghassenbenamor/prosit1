import java.util.Date;

public class produit {
 int id;
 double prix;
 String label;
 String marque;
 Date dateExpiration = new Date();


 public produit(){
 }
 public produit(int id, String label, String marque) {
     this.id=id;
     this.label=label;
     this.marque=marque;
 }
    public produit(int id, String label, String marque, double prix) {
        this.id=id;
        this.label=label;
        this.marque=marque;
        this.prix=prix;
    }

    public produit(int id, String label, String marque, double prix , Date dateExpiration) {
        this.id=id;
        this.label=label;
        this.marque=marque;
        this.prix=prix;
        this.dateExpiration = dateExpiration;
    }

    public void afficherProduit() {
        System.out.println(this.toString());
    }

    @Override
    public String  toString() {
        return ("produit =  { " + "" + id + "," + label +"," + marque + ","+ prix + " }" );
    }
}
