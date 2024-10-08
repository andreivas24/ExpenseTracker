package com.vasilache.ExpenseTracker.services.expense;

import com.vasilache.ExpenseTracker.dto.ExpenseDTO;
import com.vasilache.ExpenseTracker.entity.Expense;
import com.vasilache.ExpenseTracker.repository.ExpenseRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ExpenseServiceImpl implements ExpenseService {

    private final ExpenseRepository expenseRepository;
    //private final SimpleAsyncTaskExecutor applicationTaskExecutor;

    public Expense postExpense(ExpenseDTO expenseDTO) {
        return saveOrUpdateExpense(new Expense(), expenseDTO);
    }

    private Expense saveOrUpdateExpense(Expense expense, ExpenseDTO expenseDTO) {
        expense.setTitle(expenseDTO.getTitle());
        expense.setDate(expenseDTO.getDate());
        expense.setAmount(expenseDTO.getAmount());
        expense.setCategory(expenseDTO.getCategory());
        expense.setDescription(expenseDTO.getDescription());

        return expenseRepository.save(expense);
    }

    public Expense updateExpense(Long id, ExpenseDTO expenseDTO) {
        Optional<Expense> expense = expenseRepository.findById(id);
        if (expense.isPresent()) {
            return saveOrUpdateExpense(expense.get(), expenseDTO);
        } else {
            throw new EntityNotFoundException("Expense is not present with id " + id);
        }
    }

    public List<Expense> getAllExpenses() {
       return expenseRepository.findAll()
               .stream().sorted(Comparator.comparing(Expense::getDate).reversed())
               .collect(Collectors.toList());
    }

    public Expense getExpenseById(Long id) {
        Optional<Expense> optionalExpense = expenseRepository.findById(id);
        if(optionalExpense.isPresent()) {
            return optionalExpense.get();
        }
        else {
            throw new EntityNotFoundException("Expense with id " + id + " not found");
        }
    }

    public void deleteExpense(Long id) {
        Optional<Expense> optionalExpense = expenseRepository.findById(id);
        if(optionalExpense.isPresent()) {
            expenseRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Expense with id " + id + " not found");
        }
    }
}
