package com.carconsole;

import java.util.HashMap;
import java.util.Map;

public class CarController
{
    private Map<String,CarCommand>  commandMap = new HashMap<>();

    public CarController()
    {
        commandMap.put("forward",new ForwardCommand());
        commandMap.put("stop",new StopCommand());
    }


    public void executeCommand(String action) throws CarCommandException
    {
        //查找指令
        CarCommand command = commandMap.get(action);
        //查不到，抛异常
        if(command==null)
        {
            throw new CarCommandException("未知指令："+action);
        }
        //查到了，执行它
        command.execute();
    }

}