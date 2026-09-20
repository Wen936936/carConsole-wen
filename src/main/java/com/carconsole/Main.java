package com.carconsole;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        CarController controller = new CarController();

        Scanner sc = new Scanner(System.in);

        System.out.println("===============小车控制台已启动===============");
        System.out.println("支持指令：forward，stop");
        System.out.println("输入 quit 退出");

        //等待用户输入
        while (true)
        {
            System.out.println("请输入指令：");

            //scanner.nextLine() 会卡住程序，直到你敲了字并按回车，它才把你敲的内容读进来
            //.trim() 去掉你输入内容前后的空格（比如你不小心打了个空格）
            //.toLowerCase() 把你输入的大写字母变成小写（这样你输入 Forward 也能识别）
            String input = sc.nextLine().trim().toLowerCase();

            //如果用户输入 quit 就退出循环
            if ("quit".equals(input))
            {
                System.out.println("本次操作历史：" + controller.getHistoryList());
                System.out.println("退出控制台");
                break;
            }

            //把输入的指令给CarControler执行，捕获异常
            try
            {
                controller.executeCommand(input);
            }catch (CarCommandException e)
            {
                System.out.println("错误指令：" +e.getMessage());
            }

        }
        //关闭读取器（输入器）
        sc.close();
    }
}