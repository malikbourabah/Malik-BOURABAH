public class directeur implements ipersonne{

    public String nom;
    public String pnom;
    public String date_n;
    private String grade;
    private int experiance;


    public String getGrade() {
        return grade;
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
    public String getDate_naissance() {
        return date_n;
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
    public void setDate_naissance(String date_n) {
        this.date_n = date_n;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setExperiance(int experiance) {
        this.experiance = experiance;
    }
}
