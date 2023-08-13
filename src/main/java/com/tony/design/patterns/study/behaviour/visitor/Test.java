package com.tony.design.patterns.study.behaviour.visitor;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Engineer("工程师A"));
        employeeList.add(new Engineer("工程师B"));
        employeeList.add(new Pm("项目经理A"));
        employeeList.add(new Engineer("工程师C"));
        employeeList.add(new Engineer("工程师D"));
        employeeList.add(new Pm("项目经理B"));
        System.out.println("=============CEO==============");
        CeoVisitor ceoVisitor = new CeoVisitor();
        for (Employee employee : employeeList) {
            employee.accept(ceoVisitor);
        }
        System.out.println("=============CTO==============");
        CtoVisitor ctoVisitor = new CtoVisitor();
        for (Employee employee : employeeList) {
            employee.accept(ctoVisitor);
        }
        // =============CEO==============
        // 工程师AKPI为:2
        // 工程师BKPI为:4
        // 项目经理AKPI为:4
        // 工程师CKPI为:2
        // 工程师DKPI为:0
        // 项目经理BKPI为:0
        // =============CTO==============
        // 工程师A工作内容:5811行代码
        // 工程师B工作内容:9930行代码
        // 项目经理A工作内容:2163行代码
        // 工程师C工作内容:4591行代码
        // 工程师D工作内容:333行代码
        // 项目经理B工作内容:3940行代码
    }
}
