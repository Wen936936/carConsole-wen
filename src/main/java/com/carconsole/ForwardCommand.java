package com.carconsole;

public class ForwardCommand implements CarCommand
{
    //重写接口中的方法execute
    @Override
    public void execute()
    {
        System.out.println("小车前进");
    }
}