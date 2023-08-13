package com.tony.design.patterns.study.behaviour.memento;

public class RoleStateMemento {
    private Integer vit; // 生命力
    private Integer atk; // 攻击力
    private Integer def; // 防御力

    public RoleStateMemento(Integer vit, Integer atk, Integer def) {
        this.vit = vit;
        this.atk = atk;
        this.def = def;
    }

    public Integer getVit() {
        return vit;
    }

    public Integer getAtk() {
        return atk;
    }

    public Integer getDef() {
        return def;
    }
}
