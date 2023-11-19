import java.lang.instrument.ClassDefinition;

public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Ксения", "Мельникова", "Витальевна", 10000, 1);
        employees[1] = new Employee("София", "Иванова", "Ивановна", 11000, 2);
        employees[2] = new Employee("Юлия", "Буракшаева", "Сергеевна", 12000, 1);
        employees[3] = new Employee("Елизавета", "Фурсова", "Владимировна", 13000, 3);
        employees[4] = new Employee("Иван", "Сапсай", "Алексеевич", 14000, 4);
        employees[5] = new Employee("Артём", "Богословский", "Михайлович", 15000, 2);
        employees[6] = new Employee("Юлия", "Самбикина", "Владимировна", 16000, 5);
        employees[7] = new Employee("Ангелина", "Шпак", "Эдуардовна", 17000, 3);
        employees[8] = new Employee("Пименов", "Максим", "Евгеньевич", 18000, 4);
        employees[9] = new Employee("Валерия", "Сигида", "Романовна", 19000, 1);

printEmployees();
        System.out.println(sumSalary());
        System.out.println(minimumSalary());
        System.out.println(maximumSalary());
        System.out.println(averageSalary());
     printEmployeeFull();
    }

    private static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
private static int sumSalary(){
        int sum=0;
        for(Employee employee: employees){
            sum +=employee.getSalary();
        }
        return sum;
}
private static Employee minimumSalary() {
    Employee minimum = employees[0];
    for (Employee employee : employees) {
        if (employee.getSalary() < minimum.getSalary()) {
            minimum = employee;
        }
    }
    return minimum;
}
    private static Employee maximumSalary(){
        Employee maximum=employees[0];
        for(Employee employee: employees){
            if(employee.getSalary()> maximum.getSalary()){
                maximum=employee;
            }
        }
        return maximum;
}
private static float averageSalary(){
        return sumSalary()/ employees.length;
}
private static void printEmployeeFull(){
        for(Employee employee: employees) {
            System.out.println(employee.getLastName() + " "+ employee.getFirstName()+ " "+ employee.getMiddleName());
        }
}





    }
