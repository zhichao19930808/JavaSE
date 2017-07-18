package Exam.Test_1;

import java.util.ArrayList;

public class User {
    private int id;
    private String name;//姓名
    private String num;//学号
    private String address;//家庭住址

    private ArrayList<String> keCheng = new ArrayList<>();//课程

    public User() {
    }

    public User(int id, String name, String num, String address, ArrayList<String> keCheng) {
        this.id = id;
        this.name = name;
        this.num = num;
        this.address = address;
        this.keCheng = keCheng;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNum() {
        return num;
    }

    public String getAddress() {
        return address;
    }

    public ArrayList getKeCheng() {
        return keCheng;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setKeCheng(ArrayList<String> keCheng) {
        this.keCheng = keCheng;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", num='" + num + '\'' +
                ", address='" + address + '\'' +
                ", keCheng=" + keCheng +
                '}';
    }
}
