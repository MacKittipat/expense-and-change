package com.mackittipat.expense_and_change.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import com.mackittipat.expense_and_change.app.listview.adapter.ChangeListViewAdapter;
import com.mackittipat.expense_and_change.core.model.ChangeModel;

import java.util.ArrayList;
import java.util.List;

public class ResultActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);

        Intent intent = getIntent();
        long expense = intent.getLongExtra(MainActivity.EXPENSE, 0);
        System.out.println("Expense = " + expense);

        List<ChangeModel> changeModelList = new ArrayList<ChangeModel>();
        changeModelList.add(new ChangeModel(1, 2));
        changeModelList.add(new ChangeModel(3, 4));

        ChangeListViewAdapter changeListViewAdapter = new ChangeListViewAdapter(this, changeModelList);
        ListView listViewChange = (ListView) findViewById(R.id.lview_result);
        listViewChange.setAdapter(changeListViewAdapter);
    }
}
