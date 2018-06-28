package com.alex.spi;

import java.util.ServiceLoader;

/**
 * spi。
 * 接口有多种实现，接口与实现类装配 在外部进行。spi是一种服务发现机制
 * 约定：
 * 服务的提供者，提供多种接口实现；一般会在jar包的META-INF/services/目录下;
 * 创建该接口的同名文件;
 * 该文件的内容就是该服务接口的具体实现类的名称；
 * 外部加载这个模块的时候，就能过该jar包META-INF/services/里配置的文件得到具体的实现类名，并加载实例化，完成模块的装配。
 */
public class Main {
    public static void main(String[] args) {
        ServiceLoader<Command> serviceLoader = ServiceLoader.load(Command.class);

        for (Command command : serviceLoader) {
            command.execute();
        }
    }
}
