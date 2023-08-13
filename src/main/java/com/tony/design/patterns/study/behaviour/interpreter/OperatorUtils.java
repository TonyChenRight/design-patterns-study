package com.tony.design.patterns.study.behaviour.interpreter;

public class OperatorUtils {
    // 判断是不是非终结符
    public static boolean isOperator(String symbol) {
        return symbol.equals("+") || symbol.equals("-") || symbol.equals("*") || symbol.equals("/");
    }

    // 简单工厂
    public static NonTerminal getNonTerminal(Expression left, Expression right, String symbol) {
        if (symbol.equals("+")) {
            return new PlusNonTerminal(left, right);
        } else if (symbol.equals("-")) {
            return new MinusNonTerminal(left, right);
        } else if (symbol.equals("*")) {
            return new MclNonTerminal(left, right);
        } else if (symbol.equals("/")) {
            return new DivisionNonTerminal(left, right);
        }
        return null;
    }
}