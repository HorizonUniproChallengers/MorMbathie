import java.util.Date;

public class Main {
    public static void main(String[] args) {

       Livre L1 = new Livre("attfal",true);
        System.out.println(L1);
        L1.emprunter("11/05/2022");
        System.out.println(L1);
        L1.retour("11/05/2023");
        System.out.println(L1);


    }
}