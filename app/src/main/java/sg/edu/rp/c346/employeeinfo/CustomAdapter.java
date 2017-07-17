package sg.edu.rp.c346.employeeinfo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 15031660 on 17/7/2017.
 */

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;

    //Modify your data class name
    //Step 1:
    ArrayList<Employee> employeeList;;

    public CustomAdapter(Context context, int resource, ArrayList<Employee> objects)
    {
        super(context , resource, objects);

        parent_context = context;
        layout_id = resource;
        employeeList = objects;

    }

    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {
        //Standard code
        LayoutInflater inflater = (LayoutInflater) parent_context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);


        //Step 2
        TextView tvName=(TextView)rowView.findViewById(R.id.textViewName);
        TextView tvTitle=(TextView)rowView.findViewById(R.id.textViewTitle);
        TextView tvSalary=(TextView)rowView.findViewById(R.id.textViewSalary);


        //Obtain the to-do item based on the position
        Employee currentItem = employeeList.get(position);

        //Set the TextView to display corresponding information
        tvName.setText(currentItem.getName());
        tvTitle.setText(currentItem.getTitle());
        tvSalary.setText(currentItem.getDoubleString());


        return rowView;
    }
}
