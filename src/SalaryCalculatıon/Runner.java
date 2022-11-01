package SalaryCalculatıon;

public class Runner {


    public static void main(String[] args) {

        Employee employee = new Employee("Drake",20000,41,2020);
        System.out.println("Odenecek Vergi: " + employee.tax() + "₺");
        System.out.println("Odenecek Bonus: " + employee.bonus() + "₺");
        System.out.println("Maaş Artışı: " + employee.raiseSalary() + "₺");



}
}