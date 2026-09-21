package com.carconsole;

public class LeftCommand implements CarCommand {

    @Override
    public void execute()
    {
        System.out.println("小车左转");
    }
}
