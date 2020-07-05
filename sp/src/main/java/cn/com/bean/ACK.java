package cn.com.bean;


import lombok.Data;

@Data
public class ACK {
    public ACK(int age){
        this.age = age;
    }
    private int age;
    private String name;
    private B b;
}
