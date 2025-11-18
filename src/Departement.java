public class Departement implements Comparable<Departement> {
    private int id;
    private String nomDepartement;
    private int nombreEmployes;

    public Departement() {}

    public Departement(int id, String nomDepartement, int nombreEmployes) {
        this.id = id;
        this.nomDepartement = nomDepartement;
        this.nombreEmployes = nombreEmployes;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }
    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public int getNombreEmployes() {
        return nombreEmployes;
    }
    public void setNombreEmployes(int nombreEmployes) {
        this.nombreEmployes = nombreEmployes;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj instanceof Departement departement) {
            return id == departement.id && nomDepartement.equals(departement.nomDepartement);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + id;
        result = 31 * result + nomDepartement.hashCode();
        return result;
    }


    @Override
    public String toString() {
        return "Departement{" + "id=" + id + ", nomDepartement='" + nomDepartement + ", nombreEmployes=" + nombreEmployes + '}';
    }

    @Override
    public int compareTo(Departement autre) {
        return this.id - autre.id;
    }
}
