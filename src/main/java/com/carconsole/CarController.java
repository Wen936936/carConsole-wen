package com.carconsole;

public class CarController
{
    public void executeCommand(String action) throws CarCommandException
    {
        if(action==null||action.isEmpty())
        {
            throw new CarCommandException("指令不能为空！");
        }
            System.out.println("执行指令" + action);
    }

}