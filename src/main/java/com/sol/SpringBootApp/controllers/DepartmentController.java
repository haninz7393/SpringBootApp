package com.sol.SpringBootApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sol.SpringBootApp.services.DepartmentService;

@Controller
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping
    public String getAllDepartments(Model model) {
        model.addAttribute("departments", departmentService.getAllDepartmentS());
        return "departments";
    }

}
