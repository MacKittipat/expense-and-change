package com.mackittipat.expense_and_change.app.listview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.mackittipat.expense_and_change.app.R;
import com.mackittipat.expense_and_change.core.model.ChangeModel;

import java.util.ArrayList;
import java.util.List;

public class ChangeListViewAdapter extends BaseAdapter {

    private Context context;
    private List<ChangeModel> changeModelList = new ArrayList<ChangeModel>();

    public ChangeListViewAdapter(Context context, List<ChangeModel> changeModelList) {
        this.context = context;
        this.changeModelList = changeModelList;
    }

    @Override
    public int getCount() {
        return changeModelList.size();
    }

    @Override
    public Object getItem(int position) {
        return changeModelList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null) {
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            convertView = layoutInflater.inflate(R.layout.change_listview, parent, false);
        }
        ChangeModel changeModel = changeModelList.get(position);
        TextView textViewPossibleExpense = (TextView)convertView.findViewById(R.id.txtv_possible_expense);
        textViewPossibleExpense.setText(Long.toString(changeModel.getPossibleExpense()));
        TextView textViewChange = (TextView)convertView.findViewById(R.id.txtv_change);
        textViewChange.setText(Long.toString(changeModel.getChange()));
        return convertView;
    }
}
