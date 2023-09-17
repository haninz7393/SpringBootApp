package com.sol.SpringBootApp.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sol.SpringBootApp.models.Employees;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    @GetMapping
    public String getAllEmployees(Model model) {
        model.addAttribute("employees", employees);
        return "employees";
    }


}
