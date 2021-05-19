package com.spacex.mars.monitoring.datadashboard.model.dao;

import com.spacex.mars.monitoring.datadashboard.model.dvo.Data;

public interface DataDao {  // Data Layer
    Data save(Data data);
    Data findById(Long id);
}
