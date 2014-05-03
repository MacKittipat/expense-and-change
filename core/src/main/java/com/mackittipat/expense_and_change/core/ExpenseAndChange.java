package com.mackittipat.expense_and_change.core;

import com.mackittipat.expense_and_change.core.model.ChangeModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class ExpenseAndChange {

    public static final Logger log = LoggerFactory.getLogger(ExpenseAndChange.class);

    long[] coinAndPapers = new long[] {2, 5, 10, 20, 50, 100, 500, 1000};

    /**
     * Calculate possible expense and change.
     * @param expense
     * @return List of ChangeModel
     */
    public List<ChangeModel> calculate(long expense) {
        log.debug("Calculating expense and change, expense = {}", expense);

        List<Long> possibleExpenseList = new ArrayList<Long>();
        List<ChangeModel> changeModelList = new ArrayList<ChangeModel>();

        for(long coinAndPaper : coinAndPapers) {
            long tmp = (long) Math.ceil((double)expense / (double)coinAndPaper);
            long possibleExpense = coinAndPaper * tmp;
            if(possibleExpense == expense) {
                continue;
            }
            ChangeModel changeModel = new ChangeModel();
            changeModel.setPossibleExpense(possibleExpense);
            changeModel.setChange(possibleExpense - expense);
            if(!possibleExpenseList.contains(possibleExpense)) {
                changeModelList.add(changeModel);
                possibleExpenseList.add(possibleExpense);
            }
            log.debug("tmp = {}, coinAndPaper = {}, possibleExpense = {}, change = {}",
                    tmp, coinAndPaper, changeModel.getPossibleExpense(), changeModel.getChange());
        }
        log.debug("changeModelList's size = {}", changeModelList.size());

        return changeModelList;
    }
}
