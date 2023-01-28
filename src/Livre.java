import java.util.Date;

public class Livre {
    private String titre;
    private boolean disponibilite = true;
    private String date_emprunt;
    private String date_retour;
    public Livre (String titre , boolean dispo){
        this.titre = titre;
        this.disponibilite = dispo;
    }
    public boolean emprunter(String date){
        if(disponibilite){
            disponibilite=false;
            this.date_emprunt = date;
            return true;
        }else
            return  false;
    }
    public boolean retour(String date){
        if (disponibilite == false){
            disponibilite = true;
            this.date_retour = date;
            System.out.printf("Date de Retour   : " + date + "  - " );
        }else {
            System.out.printf("le livre etait deja la ");
        }
            return true;
    }

    @Override
    public String toString() {
        if(disponibilite){
            return "Le livre "+ titre + " est disponible";
        }else
            return "Le livre "+ titre + " est emprunté le " + date_emprunt;
    }
}