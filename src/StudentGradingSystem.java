import java.util.Scanner;

public class StudentGradingSystem {
    public static void main(String[] args) {
        Teacher fevzi = new Teacher("Fevzi Hoca", "REH", "05368159745");
        Teacher graham = new Teacher("Graham Bell", "FZK", "05455632100");
        Teacher ugur = new Teacher("Uğur Hoca", "BLG", "05458779865");

        Course rehberlik = new Course("Rehberlik", "101", "REH");
        Course fizik = new Course("Fizik", "102", "FZK");
        Course bilgisayar = new Course("Bilgisayar", "101", "BLG");

        rehberlik.addTeacher(fevzi);
        fizik.addTeacher(graham);
        bilgisayar.addTeacher(ugur);

        Student s1 = new Student("Şaban", "123", "4", rehberlik, fizik, bilgisayar);
        s1.addBulkExamNote(85, 80, 100, 85, 55, 45);
        s1.isPass();
    }
}


class Teacher {
    String name;
    String mpNo;
    String branch;

    Teacher(String name, String branch, String mpNo) {
        this.name = name;
        this.mpNo = mpNo;
        this.branch = branch;
    }

    void print() {
        System.out.println("---------------------------------");
        System.out.println("Eklenen Öğretmen");
        System.out.println("Adı : " + this.name);
        System.out.println("Bölümü : " + this.branch);
        System.out.println("Telefonu : " + this.mpNo);
    }
}

class Course {
    String name;
    String code;
    String prefix;
    int note, verbalNote;
    Teacher teacher;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.verbalNote = 0;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
            printTeacherInfo();
        } else {
            System.out.println("Öğretmen ve Ders bölümleri uyuşmuyor.");
        }
    }

    void printTeacherInfo() {
        this.teacher.print();
    }
}

class Student {
    Course c1, c2, c3;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int verbalNote1, int note2, int verbalNote2, int note3, int verbalNote3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
            this.c1.verbalNote = verbalNote1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
            this.c2.verbalNote = verbalNote2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
            this.c3.verbalNote = verbalNote3;
        }
    }


    void isPass() {
        double firstNote = (this.c1.note * 0.8) + (this.c1.verbalNote * 0.2);
        double secondNote = (this.c2.note * 0.8) + (this.c2.verbalNote * 0.2);
        double thirdNote = (this.c3.note * 0.8) + (this.c3.verbalNote * 0.2);
        this.average = (firstNote + secondNote + thirdNote) / 3.0;
        if (this.average > 55) {
            System.out.println("---------------------------------");
            System.out.println("Sınıfı başarılı şekilde geçtiniz.");
            this.isPass = true;
        } else {
            System.out.println("---------------------------------");
            System.out.println("Sınıfta kaldınız");
            this.isPass = false;
        }
        printNote();
    }

    void printNote() {
        System.out.println(this.c1.name + " notu : " + this.c1.note + " - Sözlü notu : " + this.c1.verbalNote);
        System.out.println(this.c2.name + " notu : " + this.c2.note + " - Sözlü notu : " + this.c2.verbalNote);
        System.out.println(this.c3.name + " notu : " + this.c3.note + " - Sözlü notu : " + this.c3.verbalNote);
        System.out.println("Ortalamanız : " + this.average);
    }
}
