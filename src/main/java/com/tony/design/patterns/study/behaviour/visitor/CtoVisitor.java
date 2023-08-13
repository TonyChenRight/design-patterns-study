package com.tony.design.patterns.study.behaviour.visitor;

public class CtoVisitor implements IVisitor{
    @Override
    public void visit(Engineer engineer) {
        System.out.println(engineer.getName() + " 工作内容: " + engineer.getCodeLine() + "行代码");
    }

    @Override
    public void visit(Pm pm) {
        System.out.println(pm.getName() + " 工作内容: " + pm.getProject() + "个项目");
    }
}
