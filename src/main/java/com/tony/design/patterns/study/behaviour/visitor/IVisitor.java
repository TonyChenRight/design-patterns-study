package com.tony.design.patterns.study.behaviour.visitor;

public interface IVisitor {
    void visit(Engineer engineer);
    void visit(Pm pm);
}
