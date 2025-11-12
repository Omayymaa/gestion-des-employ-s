public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(1, "Ali", "Kacem", "IT", 3);
        Employe e2 = new Employe(3, "Sami", "Messaoud", "RH", 2);
        Employe e3 = new Employe(2, "Leila", "Ben Ali", "IT", 1);
        Employe e4 = new Employe(4, "Amira", "Trabelsi", "Finance", 2);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);
        societe.ajouterEmploye(e4);

        System.out.println(" Liste des employés : ");
        societe.displayEmploye();

        System.out.println(" Tri par ID : ");
        societe.trierEmployeParId();
        societe.displayEmploye();

        System.out.println(" Tri par Département, Grade et Nom : ");
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();

        System.out.println(" Recherche par département (IT) : ");
        for (Employe e : societe.rechercherParDepartement("IT")) {
            System.out.println(e);
        }
    }
}
