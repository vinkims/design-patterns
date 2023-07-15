public class Company {
    
    public static void main(String[] args) {

        Developer dev1 = new Developer(100, "Vincent Kigen", "Backend Engineer");
        Developer dev2 = new Developer(101, "Jeremy Kiptoo", "Junior Developer");
        CompanyDirectory engDirector = new CompanyDirectory();
        engDirector.addEmployee(dev1);
        engDirector.addEmployee(dev2);

        Manager man1 = new Manager(200, "Frank Kigen", "Engineering Manager");
        Manager man2 = new Manager(201, "Brian Kigen", "Finance Director");
        CompanyDirectory accDirector = new CompanyDirectory();
        accDirector.addEmployee(man1);
        accDirector.addEmployee(man2);

        CompanyDirectory director = new CompanyDirectory();
        director.addEmployee(engDirector);
        director.addEmployee(accDirector);
        director.showEmployeeDetails();
    }
}
