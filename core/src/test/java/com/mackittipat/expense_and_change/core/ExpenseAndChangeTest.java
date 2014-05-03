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
        changeModelExpectedList.add(new ChangeModel(2, 1));
        changeModelExpectedList.add(new ChangeModel(5, 4));
        changeModelExpectedList.add(new ChangeModel(10, 9));
        changeModelExpectedList.add(new ChangeModel(20, 19));
        changeModelExpectedList.add(new ChangeModel(50, 49));
        changeModelExpectedList.add(new ChangeModel(100, 99));
        changeModelExpectedList.add(new ChangeModel(500, 499));
        changeModelExpectedList.add(new ChangeModel(1000, 999));

        Assert.assertEquals(changeModelExpectedList.size(), changeModelList.size());
        for(int i=0; i<changeModelExpectedList.size(); i++) {
            Assert.assertEquals("Expense", changeModelExpectedList.get(i).getPossibleExpense(), changeModelList.get(i).getPossibleExpense());
            Assert.assertEquals("Change", changeModelExpectedList.get(i).getChange(), changeModelList.get(i).getChange());
        }
    }

    @Test
    public void testCalculate9() {
        List<ChangeModel> changeModelList = expenseAndChange.calculate(9);

        List<ChangeModel> changeModelExpectedList = new ArrayList<ChangeModel>();
        changeModelExpectedList.add(new ChangeModel(10, 1));
        changeModelExpectedList.add(new ChangeModel(20, 11));
        changeModelExpectedList.add(new ChangeModel(50, 41));
        changeModelExpectedList.add(new ChangeModel(100, 91));
        changeModelExpectedList.add(new ChangeModel(500, 491));
        changeModelExpectedList.add(new ChangeModel(1000, 991));

        Assert.assertEquals(changeModelExpectedList.size(), changeModelList.size());
        for(int i=0; i<changeModelExpectedList.size(); i++) {
            Assert.assertEquals("Expense", changeModelExpectedList.get(i).getPossibleExpense(), changeModelList.get(i).getPossibleExpense());
            Assert.assertEquals("Change", changeModelExpectedList.get(i).getChange(), changeModelList.get(i).getChange());
        }
    }

    @Test
    public void testCalculate13() {
        List<ChangeModel> changeModelList = expenseAndChange.calculate(13);

        List<ChangeModel> changeModelExpectedList = new ArrayList<ChangeModel>();
        changeModelExpectedList.add(new ChangeModel(14, 1));
        changeModelExpectedList.add(new ChangeModel(15, 2));
        changeModelExpectedList.add(new ChangeModel(20, 7));
        changeModelExpectedList.add(new ChangeModel(50, 37));
        changeModelExpectedList.add(new ChangeModel(100, 87));
        changeModelExpectedList.add(new ChangeModel(500, 487));
        changeModelExpectedList.add(new ChangeModel(1000, 987));

        Assert.assertEquals(changeModelExpectedList.size(), changeModelList.size());
        for(int i=0; i<changeModelExpectedList.size(); i++) {
            Assert.assertEquals("Expense", changeModelExpectedList.get(i).getPossibleExpense(), changeModelList.get(i).getPossibleExpense());
            Assert.assertEquals("Change", changeModelExpectedList.get(i).getChange(), changeModelList.get(i).getChange());
        }
    }

    @Test
    public void testCalculate66() {
        List<ChangeModel> changeModelList = expenseAndChange.calculate(66);

        List<ChangeModel> changeModelExpectedList = new ArrayList<ChangeModel>();
        changeModelExpectedList.add(new ChangeModel(70, 4));
        changeModelExpectedList.add(new ChangeModel(80, 14));
        changeModelExpectedList.add(new ChangeModel(100, 34));
        changeModelExpectedList.add(new ChangeModel(500, 434));
        changeModelExpectedList.add(new ChangeModel(1000, 934));

        Assert.assertEquals(changeModelExpectedList.size(), changeModelList.size());
        for(int i=0; i<changeModelExpectedList.size(); i++) {
            Assert.assertEquals("Expense", changeModelExpectedList.get(i).getPossibleExpense(), changeModelList.get(i).getPossibleExpense());
            Assert.assertEquals("Change", changeModelExpectedList.get(i).getChange(), changeModelList.get(i).getChange());
        }
    }

    @Test
    public void testCalculate74() {
        List<ChangeModel> changeModelList = expenseAndChange.calculate(74);

        List<ChangeModel> changeModelExpectedList = new ArrayList<ChangeModel>();
        changeModelExpectedList.add(new ChangeModel(75, 1));
        changeModelExpectedList.add(new ChangeModel(80, 6));
        changeModelExpectedList.add(new ChangeModel(100, 26));
        changeModelExpectedList.add(new ChangeModel(500, 426));
        changeModelExpectedList.add(new ChangeModel(1000, 926));

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
        changeModelExpectedList.add(new ChangeModel(168, 1));
        changeModelExpectedList.add(new ChangeModel(170, 3));
        changeModelExpectedList.add(new ChangeModel(180, 13));
        changeModelExpectedList.add(new ChangeModel(200, 33));
        changeModelExpectedList.add(new ChangeModel(500, 333));
        changeModelExpectedList.add(new ChangeModel(1000, 833));

        Assert.assertEquals(changeModelExpectedList.size(), changeModelList.size());
        for(int i=0; i<changeModelExpectedList.size(); i++) {
            Assert.assertEquals("Expense", changeModelExpectedList.get(i).getPossibleExpense(), changeModelList.get(i).getPossibleExpense());
            Assert.assertEquals("Change", changeModelExpectedList.get(i).getChange(), changeModelList.get(i).getChange());
        }
    }

    @Test
    public void testCalculate274() {
        List<ChangeModel> changeModelList = expenseAndChange.calculate(274);

        List<ChangeModel> changeModelExpectedList = new ArrayList<ChangeModel>();
        changeModelExpectedList.add(new ChangeModel(275, 1));
        changeModelExpectedList.add(new ChangeModel(280, 6));
        changeModelExpectedList.add(new ChangeModel(300, 26));
        changeModelExpectedList.add(new ChangeModel(500, 226));
        changeModelExpectedList.add(new ChangeModel(1000, 726));

        Assert.assertEquals(changeModelExpectedList.size(), changeModelList.size());
        for(int i=0; i<changeModelExpectedList.size(); i++) {
            Assert.assertEquals("Expense", changeModelExpectedList.get(i).getPossibleExpense(), changeModelList.get(i).getPossibleExpense());
            Assert.assertEquals("Change", changeModelExpectedList.get(i).getChange(), changeModelList.get(i).getChange());
        }
    }

    @Test
    public void testCalculate1726() {
        List<ChangeModel> changeModelList = expenseAndChange.calculate(1726);

        List<ChangeModel> changeModelExpectedList = new ArrayList<ChangeModel>();
        changeModelExpectedList.add(new ChangeModel(1730, 4));
        changeModelExpectedList.add(new ChangeModel(1740, 14));
        changeModelExpectedList.add(new ChangeModel(1750, 24));
        changeModelExpectedList.add(new ChangeModel(1800, 74));
        changeModelExpectedList.add(new ChangeModel(2000, 274));

        Assert.assertEquals(changeModelExpectedList.size(), changeModelList.size());
        for(int i=0; i<changeModelExpectedList.size(); i++) {
            Assert.assertEquals("Expense", changeModelExpectedList.get(i).getPossibleExpense(), changeModelList.get(i).getPossibleExpense());
            Assert.assertEquals("Change", changeModelExpectedList.get(i).getChange(), changeModelList.get(i).getChange());
        }
    }
}