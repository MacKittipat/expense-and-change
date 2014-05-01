package com.mackittipat.expense_and_change.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    public static final String EXPENSE = "com.mackittipat.expense_and_change.app.expense";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void onClickBtnCalculate(View view) {
        Intent intent = new Intent(this, ResultActivity.class);

        EditText eTextTotalExpense = (EditText) findViewById(R.id.etxt_total_expense);
        EditText eTextNumPeople = (EditText) findViewById(R.id.etxt_num_people);

        long expense = (long) Math.ceil(
                Double.parseDouble(eTextTotalExpense.getText().toString()) /
                        Double.parseDouble(eTextNumPeople.getText().toString()));

        intent.putExtra(EXPENSE, expense);

        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
