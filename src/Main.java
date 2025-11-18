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

        //Prosit 9
        DepartementHashSet gestionDep = new DepartementHashSet();

        Departement d1 = new Departement(1, "Informatique", 10);
        Departement d2 = new Departement(2, "RH", 5);
        Departement d3 = new Departement(3, "Finance", 8);
        Departement d4 = new Departement(4, "Marketing", 6);

        gestionDep.ajouterDepartement(d1);
        gestionDep.ajouterDepartement(d2);
        gestionDep.ajouterDepartement(d3);
        gestionDep.ajouterDepartement(d4);

        System.out.println(" Liste des départements : ");
        gestionDep.afficherDepartements();

        System.out.println(" Recherche par nom (RH) :");
        System.out.println(gestionDep.rechercherDepartement("RH") ? "Trouvé " : "Non trouvé ");

        System.out.println(" Tri par ID : ");
        gestionDep.trierDepartementsParId();

        System.out.println(" Tri par Nom puis Nombre d'employés : ");
        gestionDep.trierDepartementsParNomEtNombreEmployes();
    }
}
