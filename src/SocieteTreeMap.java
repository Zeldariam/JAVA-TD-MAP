import sun.reflect.generics.tree.Tree;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class SocieteTreeMap implements InterfaceSociete{
    TreeMap<Employe,Departement> map = new TreeMap<Employe, Departement>();
    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        map.put(e, d);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        map.remove(e);
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        for (Map.Entry<Employe,Departement> emp: map.entrySet()){
            System.out.println(emp.getKey() + " " + " : " + emp.getValue());
        }
    }

    @Override
    public void afficherLesEmployes() {
        for (Map.Entry<Employe,Departement> emp: map.entrySet()) {
            System.out.println(emp.getKey());
        }
    }

    @Override
    public void afficherLesDepartements() {
        for (Map.Entry<Employe,Departement> emp: map.entrySet()) {
            System.out.println(emp.getValue());
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SocieteTreeMap that = (SocieteTreeMap) o;
        return Objects.equals(map, that.map);
    }

}
