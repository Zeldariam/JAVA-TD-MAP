import java.util.HashMap;
import java.util.Objects;

public class SocieteHashMap implements InterfaceSociete{
    HashMap<Employe,Departement> map = new HashMap<Employe, Departement>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SocieteHashMap that = (SocieteHashMap) o;
        return Objects.equals(map, that.map);
    }

    @Override
    public int hashCode() {
        return Objects.hash(map);
    }

    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        map.put(e,d);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        map.remove(e);
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        for (Employe emp: map.keySet()) {
            System.out.println(emp + " || " +map.get(emp) );
        }
    }

    @Override
    public void afficherLesEmployes() {
        for (Employe emp: map.keySet()) {
            System.out.println(emp + " ");
        }
    }

    @Override
    public void afficherLesDepartements() {
        for (Employe emp: map.keySet()) {
            System.out.println(map.get(emp) );
        }
    }

    @Override
    public void afficherDepartement(Employe e) {
        System.out.println(map.get(e));
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return map.containsKey(e);
    }

    @Override
    public boolean rechercherDepartement(Departement e) {
        return map.containsValue(e);
    }
}
