package com.vasilache.ExpenseTracker.entity;

import com.vasilache.ExpenseTracker.dto.IncomeDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Income {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long id;

    private String title;
    private Integer amount;
    private LocalDate date;
    private String category;
    private String description;

    public IncomeDTO getIncomeDto() {
        IncomeDTO incomeDto = new IncomeDTO();

        incomeDto.setId(id);
        incomeDto.setTitle(title);
        incomeDto.setAmount(amount);
        incomeDto.setDate(date);
        incomeDto.setCategory(category);
        incomeDto.setDescription(description);

        return incomeDto;
    }

}
