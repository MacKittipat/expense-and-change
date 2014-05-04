package com.mackittipat.expense_and_change.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
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

        if(!validateForm(eTextTotalExpense, eTextNumPeople)) {
            return;
        }

        long expense = (long) Math.ceil(
                Double.parseDouble(eTextTotalExpense.getText().toString()) /
                        Double.parseDouble(eTextNumPeople.getText().toString()));

        intent.putExtra(EXPENSE, expense);

        startActivity(intent);
    }

    /**
     * @param eTextNumPeople
     * @param eTextTotalExpense
     * @return true if validate success, otherwise false.
     */
    private boolean validateForm(EditText eTextTotalExpense, EditText eTextNumPeople ) {
        boolean validateSuccess = true;
        if(eTextTotalExpense.getText().toString().length() == 0) {
            eTextTotalExpense.setError(getString(R.string.total_expense_required));
            validateSuccess = false;
        }
        if(eTextNumPeople.getText().toString().length() == 0) {
            eTextNumPeople.setError(getString(R.string.num_people_required));
            validateSuccess = false;
        }
        if(eTextNumPeople.getText().toString().length() > 0 &&
                Long.parseLong(eTextNumPeople.getText().toString()) == 0) {
            eTextNumPeople.setError(getString(R.string.num_people_zero));
            validateSuccess = false;
        }
        return validateSuccess;
    }
}
