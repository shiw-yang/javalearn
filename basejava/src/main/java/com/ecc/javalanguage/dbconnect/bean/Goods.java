package com.ecc.javalanguage.dbconnect.bean;

/**
 * @author yangshiwei
 * @Description
 * @date 2021/4/30-13:26
 */
public class Goods {
    private int id;
    private  String name;

    public Goods() {
    }

    @Override
    public String toString() {
        return "Name{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Goods(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
