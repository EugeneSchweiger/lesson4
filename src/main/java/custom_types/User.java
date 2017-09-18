package custom_types;


public class User extends Object {
    String name;
    private int age;
    private String surName;
    private String adress;



    public void doWork(int hours){
        System.out.println("method is 'doWork'"+hours);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", surName='" + surName + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
