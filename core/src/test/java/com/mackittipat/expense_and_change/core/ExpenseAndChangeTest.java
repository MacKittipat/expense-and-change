package com.mackittipat.expense_and_change.core;

import com.mackittipat.expense_and_change.core.model.ChangeModel;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ExpenseAndChangeTest {

    private ExpenseAndChange expenseAndChange;

    @Before
    public void setUp() {
        expenseAndChange = new ExpenseAndChange();
    }

    @Test
    public void testCalculate1() {
        List<ChangeModel> changeModelList = expenseAndChange.calculate(1);

        List<ChangeModel> changeModelExpectedList = new ArrayList<ChangeModel>();
        changeModelExpectedList.add(new ChangeModel(1000, 999));
        changeModelExpectedList.add(new ChangeModel(500, 499));
        changeModelExpectedList.add(new ChangeModel(100, 99));
        changeModelExpectedList.add(new ChangeModel(50, 49));
        changeModelExpectedList.add(new ChangeModel(20, 19));
        changeModelExpectedList.add(new ChangeModel(10, 9));
        changeModelExpectedList.add(new ChangeModel(5, 4));

        Assert.assertEquals(changeModelExpectedList.size(), changeModelList.size());
        for(int i=0; i<changeModelExpectedList.size(); i++) {
            Assert.assertEquals("Expense", changeModelExpectedList.get(i).getPossibleExpense(), changeModelList.get(i).getPossibleExpense());
            Assert.assertEquals("Change", changeModelExpectedList.get(i).getChange(), changeModelList.get(i).getChange());
        }
    }

    @Test
    public void testCalculate167() {
        List<ChangeModel> changeModelList = expenseAndChange.calculate(167);

        List<ChangeModel> changeModelExpectedList = new ArrayList<ChangeModel>();
        changeModelExpectedList.add(new ChangeModel(1000, 833));
        changeModelExpectedList.add(new ChangeModel(500, 333));

        Assert.assertEquals(changeModelExpectedList.size(), changeModelList.size());
        for(int i=0; i<changeModelExpectedList.size(); i++) {
            Assert.assertEquals("Expense", changeModelExpectedList.get(i).getPossibleExpense(), changeModelList.get(i).getPossibleExpense());
            Assert.assertEquals("Change", changeModelExpectedList.get(i).getChange(), changeModelList.get(i).getChange());
        }
    }
}