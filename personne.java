public class personne implements ipersonne{
    public String nom;
    public String pnom;
    public String date_n;

    public personne(String nom,String pnom,String date_n){
        this.nom = nom;
        this.pnom = pnom;
        this.date_n = date_n;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public String getPnom() {
        return pnom;
    }

    @Override
    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public void setPnom(String pnom) {
        this.pnom = pnom;
    }

    @Override
    public String getDate_naissance() {
        return date_n;
    }

    @Override
    public void setDate_naissance(String date_n) {
        this.date_n = date_n;
    }
}
