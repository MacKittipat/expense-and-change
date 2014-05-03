package com.mackittipat.expense_and_change.core;

import com.mackittipat.expense_and_change.core.model.ChangeModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class ExpenseAndChange {

    public static final Logger log = LoggerFactory.getLogger(ExpenseAndChange.class);

    long[] thaiMonies = new long[] {1000, 500, 100, 50, 40, 20, 10, 5, 1};

    public List<ChangeModel> calculate(long expense) {

        List<ChangeModel> result = new ArrayList<ChangeModel>();
        log.debug("Calculating expense and change, expense = {}", expense);
        for(long thaiMoney : thaiMonies) {
            log.debug("possible expense = {}", thaiMoney);
            if(thaiMoney > expense) {
                ChangeModel changeModel = new ChangeModel();
                changeModel.setPossibleExpense(thaiMoney);
                changeModel.setChange(thaiMoney - expense);
                result.add(changeModel);
                log.debug("possible expense ({}) > expense ({}), change = {}",
                        changeModel.getPossibleExpense(), expense, changeModel.getChange());
            }
        }

        return result;
    }
}
