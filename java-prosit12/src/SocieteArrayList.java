import java.util.ArrayList;
import java.util.Collections;

public class SocieteArrayList implements IGestion{
    ArrayList<Employe> em=new ArrayList<Employe>();
    @Override
    public void ajouterEmploye(Object o) {
        if(o instanceof Employe)
            this.em.add((Employe)o);
    }

    @Override
    public boolean rechercherEmploye(String nom) {

        return false;
    }

    @Override
    public boolean rechercherEmploye(Object o) {
        if(this.em.contains(o))
            return true;
        return false;
    }

    @Override
    public void supprimerEmploye(Object o) {
        if(o instanceof Employe)
            this.em.remove((Employe) o);

    }

    @Override
    public void displayEmploye() {
        this.em.forEach((e) -> System.out.println(e.toString()));
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(this.em);
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Collections.sort(this.em,new EmployeComparator());
    }

    public static void main(String[] args) {
        SocieteArrayList s=new SocieteArrayList();
        s.ajouterEmploye(new Employe(1,"kong","kones","info",5));
        s.ajouterEmploye(new Employe(2,"kong","kones","info",4));
        s.ajouterEmploye(new Employe(3,"kong","kones","info",6));
        s.displayEmploye();

    }

}
