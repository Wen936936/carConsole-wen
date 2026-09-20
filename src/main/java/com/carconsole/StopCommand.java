package com.carconsole;

public class StopCommand implements CarCommand
{
    //重写接口中的方法execute
    @Override
    public void execute()
    {
        System.out.println("小车停止");
    }
}