package com.carconsole;

public class RightCommand implements CarCommand
{
    @Override
    public void execute()
    {
        System.out.println("小车右转");
    }
}
