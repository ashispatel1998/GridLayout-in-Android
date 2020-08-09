package com.example.gridlayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.zip.Inflater;

public class GridAdapter extends BaseAdapter {

    private Context context;
    private String[] numberWord;
    private LayoutInflater inflater;

    public GridAdapter(Context c,String[] numberWord) {
        context=c;
        this.numberWord=numberWord;
    }

    @Override
    public int getCount() {
        return numberWord.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(inflater==null){
            inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if(view==null){
            view=inflater.inflate(R.layout.row_item,null);
        }
        TextView number=view.findViewById(R.id.number);
        number.setText(numberWord[i]);
        return view;
    }
}
