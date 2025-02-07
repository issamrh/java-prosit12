import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Departement>{

    Set dep=new HashSet<Departement>();
    @Override
    public void ajouterDepartement(Departement departement) {
        dep.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        if(dep.contains(nom))
            return true;
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        if(dep.contains(departement))
            return true;
        return false;
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        this.dep.remove(departement);
    }

    @Override
    public void displayDepartement() {
        this.dep.forEach((d)-> System.out.println(d.toString()));
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {

        TreeSet ts=new TreeSet<Departement>(this.dep);


        return ts;
    }

    public static void main(String[] args) {
        DepartementHashSet d=new DepartementHashSet();
        d.ajouterDepartement(new Departement(1,"info",15));
        d.ajouterDepartement(new Departement(2,"mecanique",15));
        d.ajouterDepartement(new Departement(3,"logistique",15));
        d.displayDepartement();
        TreeSet<Departement> sortedDepartments = d.trierDepartementById();
        sortedDepartments.forEach(System.out::println);
       
    }
}
