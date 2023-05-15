package aula11;

import java.util.List;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Gradebook {
    private List<Student> students;

    public Gradebook() {
        this.students = new ArrayList<>();
    }

    public void load(String filename) throws IOException {
        ArrayList<String> AlunosNotas3 = new ArrayList<>();
        Scanner input = new Scanner(new FileReader(filename));
        input.useDelimiter("[|\\n]+");
        while (input.hasNext()) {
            String word = input.next();
            AlunosNotas3.add(word);

        }
        for (int i = 0; i < AlunosNotas3.size(); i += 4) {
            ArrayList<Double> notas = new ArrayList<>();
            notas.add(Double.parseDouble(AlunosNotas3.get(i + 1)));
            notas.add(Double.parseDouble(AlunosNotas3.get(i + 2)));
            notas.add(Double.parseDouble(AlunosNotas3.get(i + 3)));
            this.students.add(new Student(AlunosNotas3.get(i), notas));
        }
        input.close();
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public List<Student> getStudents() {
        return this.students;
    }

    public void removeStudent(String studentName) {
        Student student = null;
        for (Student s : this.students) {
            if (s.getName().equals(studentName)) {
                student = s;
                break;
            }
        }
        if (student == null) {
            System.out.println("Student not found");
        }
        this.students.remove(student);
        System.out.println("Student removed");
    }

    public Student getStudent(String studentName) {
        Student student = null;
        for (Student s : this.students) {
            if (s.getName().equals(studentName)) {
                student = s;
                break;
            }
        }
        if (student == null) {
            System.out.println("Student not found");
        }
        return student;
    }

    public double calculateAverageGrade(String studentName) {
        Student student = null;
        for (Student s : this.students) {
            if (s.getName().equals(studentName)) {
                student = s;
                break;
            }
        }
        if (student == null) {
            System.out.println("Student not found");
            return 0;
        }
        IGradeCalculator simpleGradeCalculator = new SimpleGradeCalculator();
        return simpleGradeCalculator.calculate(student.getGrades());

    }

    public void printAllStudents() {
        String str = "";
        for (Student student : this.students) {
            str += student.toString() + ", Média: " + calculateAverageGrade(student.getName()) + "\n";
        }
        System.out.println(str);
    }


}
