package fc.java.part4;
// 사원(VO, DTO)
public class Employee extends Object{ // 생략되어있음
    private String name;
    private int age;
    private String phone;
    private String empDate;
    private String dept;
    private boolean marrige;

    public Employee(String name, int age, String phone, String empDate, String dept, boolean marrige) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.empDate = empDate;
        this.dept = dept;
        this.marrige = marrige;
    }

    public Employee() {
        // 생략가능
        // 상위클래스의 생성자를 호출 -> object(최상위 클래스) -> new Object()
        super();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", empDate='" + empDate + '\'' +
                ", dept='" + dept + '\'' +
                ", marrige=" + marrige +
                '}';
    }
}
