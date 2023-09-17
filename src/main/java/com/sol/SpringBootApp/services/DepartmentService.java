package com.sol.SpringBootApp.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.stereotype.Service;
import com.sol.SpringBootApp.models.Department;
import com.sol.SpringBootApp.models.Position;

@Service
public class DepartmentService {
    private static final List<Department> departments = new ArrayList<>();

    static {
        departments.add(new Department(UUID.randomUUID().toString(), "IT", "Haifa", Position.MANAGER));
        departments.add(new Department(UUID.randomUUID().toString(), "HR", "Haifa", Position.MEMBER));
        departments.add(new Department(UUID.randomUUID().toString(), "Developer", "Jerusalem", Position.TEAMLEADER));
        departments.add(new Department(UUID.randomUUID().toString(), "Sales", "Tel-Aviv", Position.SUPERVISOR));
    }

    public List<Department> getAllDepartmentS() {
        return departments;
    }

}
