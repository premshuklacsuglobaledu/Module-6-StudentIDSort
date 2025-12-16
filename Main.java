public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(5, "Jack", "Ritter"));
        students.add(new Student(3, "John", "Ritter"));
        students.add(new Student(9, "Clark", "Kent"));
        students.add(new Student(1, "Bruce", "Wayne"));
        students.add(new Student(7,"Barry", "Allen"));
        students.add(new Student(4, "Wally", "West"));
        students.add(new Student(10,"Victor", "Stone"));
        students.add(new Student(6, "James", "Bond"));
        students.add(new Student(8, "Peter", "Parker"));
        students.add(new Student(2,"Indiana", "Jones"));

        System.out.println("Original List: ");
        printStudents(students);

        SelectionSort.selectionSort(students, new SortByRollNo());
        System.out.println("\nSorted by Roll Number: ");
        printStudents(students);

        SelectionSort.selectionSort(students, new SortByName());
        System.out.println("\nSorted by Name:");
        printStudents(students);
    }

    private static void printStudents(ArrayList<Student> students) {
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
