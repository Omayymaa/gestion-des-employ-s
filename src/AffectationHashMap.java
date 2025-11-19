import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class AffectationHashMap {
    private HashMap<Employe, Departement> map = new HashMap<>();

    public void ajouterEmployeDepartement(Employe e, Departement d) {
        if (map.containsKey(e)) {
            System.out.println("Erreur : Employé déjà affecté à un département !");
        } else {
            map.put(e, d);
            System.out.println("Affectation ajoutée : " + e.getNom() + " affecté au département " + d.getNomDepartement());
        }
    }

    public void afficherEmployesEtDepartements() {
        if (map.isEmpty()) {
            System.out.println("Aucune affectation.");
            return;
        }

        for (Map.Entry<Employe, Departement> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " affecté au " + entry.getValue());
        }
    }

    public void supprimerEmploye(Employe e) {
        if (map.remove(e) != null) {
            System.out.println("Employé supprimé.");
        } else {
            System.out.println("Employé introuvable.");
        }
    }

    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        if (map.containsKey(e) && map.get(e).equals(d)) {
            map.remove(e);
            System.out.println("Affectation supprimée.");
        } else {
            System.out.println("Cette affectation n’existe pas.");
        }
    }

    public void afficherEmployes() {
        if (map.isEmpty()) {
            System.out.println("Aucun employé.");
            return;
        }

        for (Employe e : map.keySet()) {
            System.out.println(e);
        }
    }

    public void afficherDepartements() {
        if (map.isEmpty()) {
            System.out.println("Aucun département.");
            return;
        }

        for (Departement d : map.values()) {
            System.out.println(d);
        }
    }

    public boolean rechercherEmploye(Employe e) {
        return map.containsKey(e);
    }

    public boolean rechercherDepartement(Departement d) {
        return map.containsValue(d);
    }

    public TreeMap<Employe, Departement> trierMap() {
        return new TreeMap<>(map);
    }
}
