package com.tony.design.patterns.study.structural.composite;

public class Test {

    public static void main(String[] args) {
        //创建一级菜单
        MenuComponent component = new Menu("系统管理",1);

        MenuComponent menu1 = new Menu("用户管理",2);
        menu1.add(new MenuItem("新增用户",3));
        menu1.add(new MenuItem("修改用户",3));
        menu1.add(new MenuItem("删除用户",3));

        MenuComponent menu2 = new Menu("角色管理",2);
        menu2.add(new MenuItem("新增角色",3));
        menu2.add(new MenuItem("修改角色",3));
        menu2.add(new MenuItem("删除角色",3));
        menu2.add(new MenuItem("绑定用户",3));

        //将二级菜单添加到一级菜单中
        component.add(menu1);
        component.add(menu2);

        //打印菜单名称(如果有子菜单一块打印)
        component.print();
    }
}
