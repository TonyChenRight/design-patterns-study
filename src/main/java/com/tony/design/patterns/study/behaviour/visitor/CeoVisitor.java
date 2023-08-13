package com.tony.design.patterns.study.behaviour.visitor;

public class CeoVisitor implements IVisitor{
    @Override
    public void visit(Engineer engineer) {
        System.out.println(engineer.getName() + " KPI为：" + engineer.getKpi());
    }

    @Override
    public void visit(Pm pm) {
        System.out.println(pm.getName() + " KPI为: " + pm.getKpi());
    }
}
