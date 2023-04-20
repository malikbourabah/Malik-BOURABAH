public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        //personne p1 = new personne("sadi","massinissa","10/02/1992");
        //p1.setNom("harir");
        //System.out.println(p1.nom);
        etudiant E1 = new etudiant("sadi","massinissa","10/02/1992", "M2");
        System.out.println(E1.getClasse());
    }
}