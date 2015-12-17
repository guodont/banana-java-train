package contact;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 主测试类
 *
 * 第三天,涉及到的知识点：
 *
 *  1、构造方法
 *  2、集合
 *  3、for循环
 */
public class Main {

    public static void main(String [] args) {
        //  创建出一个联系人集合对象
        List<Contact> contacts = new ArrayList<Contact>();
        int flag = 3;
        //	循环录入联系人
        while(flag>0){
            flag--;
            //  创建出一个联系人
            Contact contact = new Contact();
            contact.input();
            //	将联系人对象放入集合
            contacts.add(contact);
        }
        //	输出集合中所有联系人对象
        System.out.println("当前电话本中的联系人：");
        for(int i=0 ; i< contacts.size(); i++) {
            System.out.println(contacts.get(i).getName());
        }
        //  查找联系人
        while(true){
            System.out.println("请输入要查找的联系人名字:");
            Scanner scan = new Scanner(System.in);
            String name = scan.nextLine();
            for(int j = 0; j < contacts.size() ; j++) {
                if(name.equals(contacts.get(j).getName())){
                    System.out.println("找到了联系人"+contacts.get(j).getName()+contacts.get(j).getPhoneNumber());
                    break;
                }
            }
        }
    }
}
