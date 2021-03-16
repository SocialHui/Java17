public class User {
    private int salary_id;
    private int staff_id;
    private int salary;

    public User(int salary_id, int staff_id, int salary) {
        this.salary_id = salary_id;
        this.staff_id = staff_id;
        this.salary = salary;
    }

    public int getSalary_id() {
        return salary_id;
    }

    public void setSalary_id(int salary_id) {
        this.salary_id = salary_id;
    }

    public int getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(int staff_id) {
        this.staff_id = staff_id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "salary_id=" + salary_id +
                ", staff_id=" + staff_id +
                ", salary=" + salary +
                '}';
    }
}
