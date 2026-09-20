package com.carconsole;

public class Main
{
    public static void main(String[] args) {
//        //多态：父接口引用指向子类对象
//        CarCommand cmd1 = new ForwardCommand();
//        CarCommand cmd2 = new StopCommand();
//
//        cmd1.execute();
//        cmd2.execute();

        //匿名内部类，不新建类，直接实现接口
//        CarCommand leftCommand = new CarCommand() {
//            @Override
//            public void execute()
//            {
//                System.out.println("小车左转");
//            }
//        };
//        leftCommand.execute();
//    }

//    public static void execute(CarCommand cmd)
//    {
//        if (cmd instanceof ForwardCommand)
//        {
//            System.out.println("小车正在前进...");
//        }
//        if (cmd instanceof StopCommand)
//        {
//            System.out.println("小车已停止");
//        }
//
//        cmd.execute();
//    }


        CarController controller = new CarController();
        try {
            controller.executeCommand("forward");
            controller.executeCommand("");
        } catch (CarCommandException e) {
            System.out.println("错误！" + e.getMessage());
        }finally {
            System.out.println("指令处理流程结束");
        }



    }
}