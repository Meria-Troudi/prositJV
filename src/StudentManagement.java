import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StudentManagement implements Management {

    public StudentManagement(){}

    public void addEtudiant(List<Student> etudiants, Student student){
        etudiants.add(student);
    }

    @Override
    public void displayStudents(List<Student> etudiants, Consumer<Student> con) {
        for(Student etudiant : etudiants){
            con.accept(etudiant);
        }
    }

    @Override
    public void displayStudentsByFilter(List<Student> etudiants, Predicate<Student> pre, Consumer<Student> con) {
        for(Student etudiant : etudiants){
            if(pre.test(etudiant)){ //Tests
                con.accept(etudiant); //Displays
            }
        }
    }

    @Override
    public String returnStudentsNames(List<Student> students, Function<Student, String> fun) {
        String names = "";
        for (Student s : students) {
            names += " " + fun.apply(s);
        }
        return names;
    }

    @Override
    public Student createStudent(Supplier<Student> sup) {
        return sup.get();
    }

    @Override
    public List<Student> sortStudentsById(List<Student> etudiants, Comparator<Student> com) {
        Collections.sort(etudiants, com);
        return etudiants;
    }

    @Override
    public Stream<Student> convertToStream(List<Student> etudiants) {
        return etudiants.stream();
    }
}
