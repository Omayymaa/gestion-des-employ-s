import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe>, IRechercheAvancee<Employe> {
    private List<Employe> listeEmployes = new ArrayList<>();

    @Override
    public void ajouterEmploye(Employe e) {
        listeEmployes.add(e);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe e : listeEmployes) {
            if (e.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return listeEmployes.contains(e);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        listeEmployes.remove(e);
    }

    @Override
    public void displayEmploye() {
        for (Employe e : listeEmployes) {
            System.out.println(e);
        }
    }

    @Override
    public void trierEmployeParId() {  // comparable
        Collections.sort(listeEmployes);
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() { //comparator
        Collections.sort(listeEmployes, new Comparator<Employe>() {
            @Override
            public int compare(Employe e1, Employe e2) {
                int depComp = e1.getNomDepartement().compareTo(e2.getNomDepartement());
                if (depComp != 0) return depComp;

                int gradeComp = Integer.compare(e1.getGrade(), e2.getGrade());
                if (gradeComp != 0) return gradeComp;

                return e1.getNom().compareTo(e2.getNom());
            }
        });
    }

    @Override
    public List<Employe> rechercherParDepartement(String nomDepartement) {
        List<Employe> result = new ArrayList<>();
        for (Employe e : listeEmployes) {
            if (e.getNomDepartement().equals(nomDepartement)) {
                result.add(e);
            }
        }
        return result;
    }
}
