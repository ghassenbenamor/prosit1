import java.util.Date;

public class main {
    public static void main(String[] args) {
        produit p1 = new produit(1021,"lait","delice");
        produit p2 = new produit(2510,"yaourt","vitalait");
        produit p3 = new produit(3250,"tomate","sicam",1.250);
        p1.afficherProduit();
        p1.prix=0.700;
        p1.afficherProduit();
        p2.prix=1.700;
        p2.afficherProduit();
        p1.dateExpiration= new Date("12/1/2023");
        System.out.println(p1.dateExpiration);

    }
}
