package com.clm.exam;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by jbt on 7/12/2016.
 */
public class studentListAdapter extends ArrayAdapter<student> {
    List<student> studentList;

    public studentListAdapter(Context context, int resource, List<student> objects) {
        super(context, resource, objects);
        studentList=(List<student>) objects;


    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
            View v=convertView;
        if (v==null) {
            LayoutInflater viewInflater = LayoutInflater.from(getContext());
            v = viewInflater.inflate(R.layout.list_item_1, null);
        }

        student currentStudent = studentList.get(position);

        TextView nameTV= (TextView) v.findViewById(R.id.nameTV);
        nameTV.setText(currentStudent.getName());

        TextView gradeTV = (TextView) v.findViewById(R.id.gradeTV);
        gradeTV.setText( ""+ currentStudent.getGrade() );

        if (currentStudent.getGrade() < 60){
            ImageView imageIV = (ImageView) v.findViewById(R.id.imageIV);
            imageIV.setImageResource(R.drawable.sad);
        } else
        {
            ImageView imageIV = (ImageView) v.findViewById(R.id.imageIV);
            imageIV.setImageResource(R.drawable.happy);
        }
       return v;
    }
}
