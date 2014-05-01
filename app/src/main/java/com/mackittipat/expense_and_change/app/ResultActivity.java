package com.mackittipat.expense_and_change.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class ResultActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);

        Intent intent = getIntent();
        long expense = intent.getLongExtra(MainActivity.EXPENSE, 0);
        System.out.println("Expense = " + expense);
    }
}
