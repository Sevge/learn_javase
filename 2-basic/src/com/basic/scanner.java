package com.basic;
import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        // 创建一个扫描器对象，用于接收键盘数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数据: ");
        String str = scanner.nextLine();
        System.out.println("输出的内容为："+str);
        scanner.close();


    }
}
