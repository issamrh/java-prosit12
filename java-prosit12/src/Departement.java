import java.util.Objects;

public class Departement implements Comparable<Departement> {
    private int id;
    private String nomDepartement;
    private int nbEmploye;

    public Departement() {
    }

    public Departement(int id, String nomDepartement, int nbEmploye) {
        this.id = id;
        this.nomDepartement = nomDepartement;
        this.nbEmploye = nbEmploye;
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

    public int getNbEmploye() {
        return nbEmploye;
    }

    public void setNbEmploye(int nbEmploye) {
        this.nbEmploye = nbEmploye;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departement that = (Departement) o;
        return id == that.id && Objects.equals(nomDepartement, that.nomDepartement);
    }


    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nomDepartement='" + nomDepartement + '\'' +
                ", nbEmploye=" + nbEmploye +
                '}';
    }
    @Override
    public int compareTo(Departement other) {

        return this.getId() - other.getId();
    }
}
