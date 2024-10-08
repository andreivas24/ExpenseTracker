package com.vasilache.ExpenseTracker.dto;

import com.vasilache.ExpenseTracker.entity.Expense;
import com.vasilache.ExpenseTracker.entity.Income;
import lombok.Data;

import java.util.List;

@Data
public class GraphDTO {
    private List<Expense> expenseList;
    private List<Income> incomeList;
}
