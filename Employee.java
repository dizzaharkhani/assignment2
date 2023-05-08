class Employee {
    int emp_id;
    char emp_name;
    char emp_designation;
    int salary;

    void display() {
        System.out.println("Employee id is=123" + emp_id);
        System.out.println("Employee name is=Om" + emp_name);
        System.out.println("Employee designation is=Manager" + emp_designation);
        System.out.println("Employee salary is=30,000"+ salary);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.display();
    }
}