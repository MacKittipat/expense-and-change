package com.mackittipat.expense_and_change.app.listview.model;

public class ChangeModel {

    private long possibleExpense;
    private long change;

    public ChangeModel() {
    }

    public ChangeModel(long possibleExpense, long change) {
        this.possibleExpense = possibleExpense;
        this.change = change;
    }

    public long getPossibleExpense() {
        return possibleExpense;
    }

    public void setPossibleExpense(long possibleExpense) {
        this.possibleExpense = possibleExpense;
    }

    public long getChange() {
        return change;
    }

    public void setChange(long change) {
        this.change = change;
    }
}
