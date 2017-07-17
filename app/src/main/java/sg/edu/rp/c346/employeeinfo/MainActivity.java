package sg.edu.rp.c346.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvEmployee;
    ArrayList<Employee> EmployeeList;
    CustomAdapter caEmployee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvEmployee = (ListView)findViewById(R.id. listViewEmployee);
        EmployeeList = new ArrayList<Employee>();

        caEmployee = new CustomAdapter(this, R.layout.todoitem_row, EmployeeList);
        lvEmployee.setAdapter(caEmployee);


        Employee item1= new Employee("John","Software Technical Leader",3400.0);
        EmployeeList.add(item1);

        Employee item2 =new  Employee("May", "Programmer", 2200.0);
        EmployeeList.add(item2);
    }
}

