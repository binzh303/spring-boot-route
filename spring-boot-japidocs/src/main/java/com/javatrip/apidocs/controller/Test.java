package com.javatrip.apidocs.controller;

import io.github.yedaxia.apidocs.IPluginSupport;
import io.github.yedaxia.apidocs.parser.ControllerNode;

import java.util.List;

/**
 * @Author zhbin
 * @Description
 * @Date 2020-06-15 22:25
 */
public class Test implements IPluginSupport {
    @Override
    public void execute(List<ControllerNode> list) {

        ControllerNode controllerNode = new ControllerNode();
        controllerNode.setAuthor("Java旅途");
        controllerNode.setBaseUrl("localhost:8080");
        controllerNode.setDocFileName("api文档");
        list.add(controllerNode);
    }
}
