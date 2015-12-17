package contact;

/**
 * Created by guodont on 15/12/17.
 */
public class Animal {
    private String name;
    private int age;
    private int sex;

    public Animal() {
        System.out.println("调用空的构造方法");
    }

    public Animal(String name) {
        System.out.println("调用传name参数的构造方法");
        this.name = name;
    }

    public Animal(int age) {
        System.out.print("调用传age参数的构造方法");
        this.age = age;
    }

    public Animal(String name, int age) {
        System.out.println("调用传name,age参数的构造方法");
        this.name = name;
        this.age = age;
    }

    public Animal(String name, int age, int sex) {
        System.out.println("调用传name,sex,age参数的构造方法");
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Animal(int age, String name, int sex) {
        System.out.println("调用传name,sex,age参数的构造方法");
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Animal(int age, int sex, String name) {
        System.out.println("调用传name,sex,age参数的构造方法");
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Animal(int age, int sex) {
        System.out.println("调用传sex,age参数的构造方法");
        this.age = age;
        this.sex = sex;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     *  吃饭方法
     */
    public void eat(){
        System.out.println("吃饭");
    }

    /**
     * 行走方法
     */
    public void walk(){
        System.out.println("行走");
    }
}
