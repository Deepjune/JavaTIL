package fc.java.model;

public class PersonVO {
    private String name;
    private int age;
    private String phone;

    public PersonVO(){}
    public PersonVO(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        if(age > 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("유요하지않은 나이 입니다.");
        }

    }
    public int getAge(){
        return age;
    }

    public void setPhone(String phone){
       this.phone = phone;
    }
    public String getPhone(){
        return phone;
    }
    public String toString(){
        return name + "\t" + age + "\t" + phone;
    }
}