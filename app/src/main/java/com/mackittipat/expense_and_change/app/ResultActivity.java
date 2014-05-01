package com.mackittipat.expense_and_change.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import com.mackittipat.expense_and_change.app.listview.adapter.ChangeListViewAdapter;
import com.mackittipat.expense_and_change.core.ExpenseAndChange;
import com.mackittipat.expense_and_change.core.model.ChangeModel;

import java.util.List;

public class ResultActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);

        Intent intent = getIntent();
        long expense = intent.getLongExtra(MainActivity.EXPENSE, 0);

        ExpenseAndChange expenseAndChange = new ExpenseAndChange();
        List<ChangeModel> changeModelList = expenseAndChange.calculate(expense);

        ChangeListViewAdapter changeListViewAdapter = new ChangeListViewAdapter(this, changeModelList);
        ListView listViewChange = (ListView) findViewById(R.id.lview_result);
        listViewChange.setAdapter(changeListViewAdapter);
    }
}
