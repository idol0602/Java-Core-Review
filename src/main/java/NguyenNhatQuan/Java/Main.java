package NguyenNhatQuan.Java;

public class Main {
    public static void main(String[] args) {
        MyList<Student> studentMyList = new MyList<>();
        studentMyList.add(new Student(1L,"A",4.0));
        studentMyList.add(new Student(2L,"B",3.9));
        studentMyList.add(new Student(1L,"A",4.0));

        studentMyList.remove(new Student(2L,"B",3.9));

        for(Student s : studentMyList.getAll()) {
            System.out.println(s);
        }
    }
}
