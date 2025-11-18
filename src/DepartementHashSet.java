import java.util.*;

public class DepartementHashSet implements IDepartement<Departement> {
    private Set<Departement> departements = new HashSet<>();

    @Override
    public void ajouterDepartement(Departement d) {
        departements.add(d);
    }

    @Override
    public boolean rechercherDepartement(String nomDepartement) {
        for (Departement d : departements) {
            if (d.getNomDepartement().equals(nomDepartement)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        return departements.contains(d);
    }

    @Override
    public void supprimerDepartement(Departement d) {
        departements.remove(d);
    }

    @Override
    public void afficherDepartements() {
        for (Departement d : departements) {
            System.out.println(d);
        }
    }

    @Override
    public void trierDepartementsParId() {
        List<Departement> list = new ArrayList<>();
        for (Departement d : departements) {
            list.add(d);
        }
        Collections.sort(list);
        for (Departement d : list) {
            System.out.println(d);
        }
    }

    @Override
    public void trierDepartementsParNomEtNombreEmployes() {
        List<Departement> listeTriee = new ArrayList<>(departements);
        Collections.sort(listeTriee, new Comparator<Departement>() {
            @Override
            public int compare(Departement d1, Departement d2) {
                int nomComp = d1.getNomDepartement().compareTo(d2.getNomDepartement());
                if (nomComp != 0) {
                    return nomComp;
                } else {
                    return d1.getNombreEmployes() - d2.getNombreEmployes();
                }
            }
        });
        for (Departement d : listeTriee) {
            System.out.println(d);
        }
    }
}
