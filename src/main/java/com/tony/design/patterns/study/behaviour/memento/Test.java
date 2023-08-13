package com.tony.design.patterns.study.behaviour.memento;

public class Test {

    private static RoleStateMemento roleStateMemento;

    public static void main(String[] args) {
        System.out.println("===========打boss前状态===========");
        GameRole gameRole = new GameRole();
        gameRole.init();
        gameRole.showState();
        // 保存进度
        roleStateMemento = gameRole.saveState();
        System.out.println("===========打boss后状态===========");
        gameRole.fight();
        gameRole.showState();
        System.out.println("===========恢复状态===========");
        gameRole.recoverState(roleStateMemento);
        gameRole.showState();
        // ===========打boss前状态===========
        // 角色生命力:100
        // 角色攻击力:100
        // 角色防御力:100
        // ===========打boss后状态===========
        // 角色生命力:0
        // 角色攻击力:0
        // 角色防御力:0
        // ===========恢复状态===========
        // 角色生命力:100
        // 角色攻击力:100
        // 角色防御力:100
    }
}
