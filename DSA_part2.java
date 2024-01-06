package DSA;
// Cấu trúc dữ liệu sinh viên

// Tạo một sinh viên có thông tin: Tên là Nguyễn Văn A, 6 tuổi và học lớp 1A3
// In thông tin sinh viên đó ra màn hình với định dạng như sau
//Name: Nguyễn Văn A - Age 6 - Class 1A3
// Chuyển sinh viên đó sang lớp 1A7
// Xóa bỏ dữ liễn của sinh viên A

// Part 1: Import and Main Class
import java.util.Scanner;
import java.util.ArrayList;

public class DSA_part2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        // `Scanner` được tạo để người dùng nhập vào và một `ArrayList` có tên
        // `students` được khởi tạo để lưu trữ các phiên bản của lớp `Student`.

        // Part 3: Main Method - Adding and Printing Students
        // Add students

        students.add(new Student("Nguyen Van A", 6, "1A3"));
        students.add(new Student("Nguyen Thi B", 6, "1A3"));
        // Thông tin sinh viên ban đầu được in bằng phương thức
        // `printStudentInformation`.
        // Print initial student information
        System.out.println("Initial Student Information:");
        printStudentInformation(students);
        // Part 4: Transfer Student to a New Class
        // Phương thức `transferStudentToClass` được gọi để chuyển một học sinh cụ thể
        // ("Nguyen Van A") sang lớp mới ("1A7").
        // Transfer Nguyen Van A to class 1A7
        transferStudentToClass(students, "Nguyen Van A", "1A7");

        // Print after transfer
        System.out.println("\nStudent Information After Transfer:");
        printStudentInformation(students);
        // Part 6: Closing the Scanner
        scanner.close();
    }

    // Part 5: Transfer Student Method and Print Method
    // Phương thức `transferStudentToClass` tìm kiếm một sinh viên theo tên trong
    // `students` ArrayList và cập nhật lớp của họ
    private static void transferStudentToClass(ArrayList<Student> students, String studentName, String newClass) {
        for (Student student : students) {
            if (student.getName().equals(studentName)) {
                // Update the class for the found student
                student.setClassName(newClass);
                System.out.println(studentName + " transferred to class " + newClass);
                return;
                // Exit the loop once the student is found and updated
            }
        }
        // Print a message if the student is not found
        System.out.println(studentName + " not found in the student list.");
    }

    //
    private static void printStudentInformation(ArrayList<Student> students) {
        if (students.isEmpty()) {
            System.out.println("No students available.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
}

// Part 2: Student Class
class Student {
    private String name;
    private int age;
    private String className;

    public Student(String name, int age, String className) {
        this.name = name;
        this.age = age;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String newClass) {
        this.className = newClass;
    }

    // Phương thức `toString` được ghi đè để cung cấp biểu diễn chuỗi có ý nghĩa của
    // đối tượng `Student`
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Class: " + className;
    }
}
