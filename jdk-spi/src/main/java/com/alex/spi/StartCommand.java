package com.alex.spi;

public class StartCommand implements Command {
    public void execute() {
        System.out.println("start command impl");
    }
}
