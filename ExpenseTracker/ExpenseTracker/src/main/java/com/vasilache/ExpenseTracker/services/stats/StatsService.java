package com.vasilache.ExpenseTracker.services.stats;

import com.vasilache.ExpenseTracker.dto.GraphDTO;
import com.vasilache.ExpenseTracker.dto.StatsDTO;

public interface StatsService {

    GraphDTO getChartData();

    StatsDTO getStats();
}
