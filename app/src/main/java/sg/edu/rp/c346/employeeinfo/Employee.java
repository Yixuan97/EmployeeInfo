package sg.edu.rp.c346.employeeinfo;

/**
 * Created by 15031660 on 17/7/2017.
 */

public class Employee {
        private String name;
        private String title;
        private double salary;

        public Employee(String name, String title, double salary) {
            this.name = name;
            this.title = title;
            this.salary = salary;
        }

        public String getName() {

            return name;
        }

        public void setName(String name) {

            this.name = name;
        }

        public String getTitle() {

            return title;
        }

        public void setTitle(String title){

            this.title = title;
        }

        public double getSalary(){

            return salary;
        }
        public String getDoubleString() {
            String str = Double.valueOf(salary).toString();
            return str;
        }
        @Override
        public String toString() {
            return "ToDoItem{" +
                    "name=" + name + ", title=" + title + ", salary=" + getDoubleString() + '}';
        }
    }