import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Tom", 30, "UX/UI", "EMP001");
        Employee employee2 = new Employee("Tim", 30, "FrontEnd", "EMP002");
        Project project1 = new Project("Web A : ", "Developing a web application");
        Project project2 = new Project("Mobile app A : ", "Developing a mobile app");
        Project project3 = new Project("Web A : ", "Developing a web application");

        employee1.addProject(project1);
        employee1.addProject(project2);
        employee2.addProject(project3);
        employee1.ShowDetails();
        employee2.ShowDetails();
    }
}

class Person {
    String name;
    int age;

    public Person(String name) {
        this.name = name;
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
}

class Job {
    String position;
    String empID;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }
}

class Employee {
    String name;
    double age;
    String position;
    String empID;
    ArrayList<Project> myproject;

    public Employee(String name, double age, String position, String empID) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.empID = empID;
        this.myproject = new ArrayList<>();
    }

    public void addProject(Project project) {
        myproject.add(project);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public ArrayList<Project> getMyproject() {
        return myproject;
    }

    public void setMyproject(ArrayList<Project> myproject) {
        this.myproject = myproject;
    }

    public void ShowDetails() {
        System.out.println("************");
        System.out.println("Name : " + name);
        System.out.println("Position : " + position);
        System.out.println("EmpID : " + empID);
        System.out.println("Projects: ");
        for (Project project : myproject) {
            System.out.println("    " + project.getProjectName() + project.getDescription());
        }
    }
}

class Project {
    String ProjectName;
    String description;

    public Project(String ProjectName, String description) {
        this.ProjectName = ProjectName;
        this.description = description;
    }

    public String getProjectName() {
        return ProjectName;
    }

    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
