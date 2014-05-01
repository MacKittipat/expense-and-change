package com.mackittipat.expense_and_change.app.core;

import com.mackittipat.expense_and_change.app.listview.model.ChangeModel;

import java.util.ArrayList;
import java.util.List;

public class ExpenseAndChange {

    long[] thaiMonies = new long[] {1000, 500, 100, 50, 40, 20, 10, 5, 1};

    public List<ChangeModel> calculate(long expense) {

        List<ChangeModel> result = new ArrayList<ChangeModel>();

        for(long thaiMoney : thaiMonies) {
            if(thaiMoney > expense) {
                ChangeModel changeModel = new ChangeModel();
                changeModel.setPossibleExpense(thaiMoney);
                changeModel.setChange(thaiMoney - expense);
                result.add(changeModel);
            }
        }

        return result;
    }
}
