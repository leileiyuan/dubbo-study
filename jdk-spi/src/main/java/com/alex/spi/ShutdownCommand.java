package com.alex.spi;

public class ShutdownCommand implements Command {
    public void execute() {
        System.out.println("shutdown command impl");
    }
}
