import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StudentManagement implements Management{
    List<Etudiant> et=new ArrayList<>();
    Consumer<Etudiant> con = s -> System.out.println(s);
    Predicate<Etudiant> pre = s->s.getId()==1;
    Function<Etudiant, String> fun = s -> s.getNom();
    Supplier<Etudiant> sup = () -> new Etudiant();
    Comparator<Etudiant> comp = Comparator.comparingInt(Etudiant::getId);

    @Override
    public void displayStudents(List<Etudiant> students, Consumer<Etudiant> con) {
        students.forEach((s) -> con.accept(s));
    }

    @Override
    public void displayStudentsByFilter(List<Etudiant> students, Predicate<Etudiant> pre, Consumer<Etudiant> con) {
        students.forEach((s) -> {
            if(pre.test(s)){
                con.accept(s);
            }

        });
    }

    @Override
    public String returnStudentsNames(List<Etudiant> students, Function<Etudiant, String> fun) {
        String m="";
        students.forEach((s)->fun.apply(s));
        return null;
    }

    @Override
    public Etudiant createStudent(Supplier<Etudiant> sup) {
        Etudiant et=sup.get();
        return et;
    }

    @Override
    public List<Etudiant> sortStudentsById(List<Etudiant> students, Comparator<Etudiant> com) {
       // s= Collections.sort(students,com.compare());
        return null;
    }

    @Override
    public Stream<Etudiant> convertToStream(List<Etudiant> students) {
        return students.stream();
    }

    public static void main(String[] args) {
        StudentManagement st=new StudentManagement();
        st.et.add(new Etudiant(1,"kong",15));
        st.et.add(new Etudiant(2,"kong",15));
        st.et.add(new Etudiant(3,"kong",15));
        st.displayStudents(st.et,st.con);
        st.displayStudentsByFilter(st.et,st.pre,st.con);

    }
}
