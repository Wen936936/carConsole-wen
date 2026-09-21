package com.carconsole;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarController
{
    private Map<String,CarCommand>  commandMap = new HashMap<>();
    //历史记录列表historyList
    //List属于接口，是ArrayList的父类，这里是多态的写法，后面的new ArrayList<>()以后也可以改成其他的
    private List<String> historyList = new ArrayList<>();

    //对应指令方法
    public CarController()
    {
        commandMap.put("forward",new ForwardCommand());
        commandMap.put("stop",new StopCommand());
        commandMap.put("left",new LeftCommand());
        commandMap.put("right",new RightCommand());
    }

    //执行指令
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

        historyList.add(action);
    }

    //查看历史指令
    public List<String> getHistoryList()
    {
        return historyList;
    }

}