package NguyenNhatQuan.JavaCore.IO.CSVtoObject;

public class Person {
    private String id;
    private String name;
    private int age;
    private String city;
    private String jobName;

    public Person(String id, String name, int age, String city, String jobName) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.city = city;
        this.jobName = jobName;
    }

    public Person() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", jobName='" + jobName + '\'' +
                '}';
    }
}
