import java.util.Comparator;

public class EmployeComparator implements Comparator<Employe> {

    @Override
    public int compare(Employe o1, Employe o2) {
        int departmentComparison = o1.getDepartement().compareTo(o2.getDepartement());
        if (departmentComparison != 0) {
            return departmentComparison;
        }

        return o1.getGrade() - o2.getGrade();
    }
}
