public class Woman {
    private String name;
    private int age;
    private int salary;

    public Woman(String name,int age,int salary){
        this.name = name;
        this.age = age;
        this.salary= salary;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        this.age = a;
    }

    public int getAge() {
        return age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isTarget(){
        if (salary >= 8000000){
            return true;
        }else{
            return false;
        }
    }
}
