import java.util.*;

public class AffectationHashMap {
    Map<Employe,Departement> empDep =new HashMap<>();

    public void ajouterEmployeDepartement(Employe e,Departement d){
        this.empDep.put(e,d);
    }

    public void afficherEmployesEtDepartements(){
        System.out.println("List des Employé " +this.empDep);
    }

    public Boolean supprimerEmploye(Employe e){
        if(this.empDep.containsKey(e)){
            this.empDep.remove(e);
            return true;
        }else
            return false;

    }
    public Boolean supprimerEmployeEtDepartement(Employe e,Departement d){
        if((this.empDep.containsKey(e))&&(this.empDep.containsValue(d))){
            this.empDep.remove(e,d);
            return true;
        }else
            return false;
    }

    public void afficherEmployes(){
        Set<Employe> keys = this.empDep.keySet();
        Iterator<Employe> iterator = keys.iterator();

        while (iterator.hasNext()) {

            System.out.println(iterator.next());

        }
    }
    public void afficherDepartements(){
        Collection<Departement> values=this.empDep.values();
        for (Departement value : values) {

            System.out.println(value);

        }
    }

    public boolean rechercherEmploye (Employe e){
        if(this.empDep.containsKey(e)){
            return true;
        }else
            return false;
    }

    public boolean rechercherDepartement (Departement d){
        if(this.empDep.containsValue(d)){
            return true;
        }else
            return false;
    }

    public TreeMap<Employe, Departement> trierMap(){
        TreeMap<Employe, Departement> empDepTrie=new TreeMap<>(this.empDep);
        return empDepTrie;
    }
    public static void main(String[] args) {
        AffectationHashMap a=new AffectationHashMap();
        a.ajouterEmployeDepartement(new Employe(1,"jon","jones","info",1),new Departement(1,"Departement Informatique",15));
        a.ajouterEmployeDepartement(new Employe(2,"bon","bones","info",1),new Departement(2,"Departement Informatique",15));
        a.ajouterEmployeDepartement(new Employe(3,"kong","kones","info",1),new Departement(3,"Departement Informatique",15));
       // a.ajouterEmployeDepartement(new Employe(1,"Omar","fitouri","info",1),new Departement(3,"Departement Informatique",15));

        a.afficherEmployesEtDepartements();
        a.afficherEmployes();
        a.afficherDepartements();
        a.rechercherDepartement(new Departement(3,"Departement Informatique",15));
        a.rechercherEmploye(new Employe(3,"kong","kones","info",1));
        System.out.println("Map Triée: "+a.trierMap());
    }

}
