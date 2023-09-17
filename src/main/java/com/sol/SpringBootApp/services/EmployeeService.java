package com.sol.SpringBootApp.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.sol.SpringBootApp.models.Employees;

@Service
public class EmployeeService {
    private static final List<Employees> employees = new ArrayList<>();

    static {
        for (int i = 0; i < 10; i++) {
            employees.add(new Employees(i, "" + i, "sol" + i, "info" + i));

        }
    }

    public List<Employees> getAllEmployees() {
        return employees;
    }

}
