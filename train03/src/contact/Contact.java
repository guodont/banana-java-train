package contact;

import java.util.Scanner;

/**
 * 联系人的类
 *
 * @author guodong
 */
public class Contact {

    //	定义Contact类的属性
    private String name;
    private String phoneNumber;
    private int age;
    private String company;
    private boolean gender;

    /**
     * 构造函数
     */
    public Contact() {
//		System.out.println("调用联系人的构造函数（创建了一个对象）");
    }

    /**
     * 返回联系人的名字
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * 设置联系人的名字
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * 返回联系人的电话号
     *
     * @return
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * 设置联系人电话号
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * 获取联系人年龄
     * @return
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置联系人年龄
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取公司名字
     * @return
     */
    public String getCompany() {
        return company;
    }

    /**
     * 设置公司名字
     * @param company
     */
    public void setCompany(String company) {
        this.company = company;
    }


    public boolean isGender() {
        return gender;
    }


    public void setGender(boolean gender) {
        this.gender = gender;
    }

    /**
     * 输出打电话语句
     * @return
     */
    public String call() {
        return ("打电话给：" + name + "，他的电话号码是：" + phoneNumber);
    }

    /**
     * 录入联系人方法
     */
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入联系人名字:");
        setName(scanner.nextLine());
        System.out.println("请输入联系人电话:");
        setPhoneNumber(scanner.nextLine());
    }

}
