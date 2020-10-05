package com.javatrip.swagger.controller;

import com.javatrip.swagger.entity.Person;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

/**
 * @Author 公众号：Java旅途
 * @Description 接口类，生成swagger接口文档
 * @Date 2020-08-28 11:29
 */
@Api(tags = "用户接口")
@RestController
@RequestMapping("person")
public class PersonController {

    @ApiOperation(value = "获取用户列表",notes = "根据name获取用户列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name",value = "用户姓名",dataType = "String",required = true),
            @ApiImplicitParam(name = "age",value = "年龄",dataType = "int",required = true)
    })
    @GetMapping("/{name}")
    public Person getPerson(@PathVariable("name") String name,@RequestParam int age){
        return new Person(name,age);
    }

    @ApiOperation(value = "新增用户",notes = "根据用户实体类新增用户")
    @ApiImplicitParam(name = "person",value = "用户实体类",dataType = "Person",required = true)
    @PostMapping("add")
    public int addPerson(@RequestBody Person person){
        if(StringUtils.isEmpty(person)){
            return -1;
        }
        return 1;
    }

    @ApiOperation(value = "更新用户信息",notes = "根据用户实体更新用户信息")
    @ApiImplicitParam(name = "person",value = "用户实体类",dataType = "Person",required = true)
    @PutMapping("update")
    public int updatePerson(@RequestBody Person person){
        if(StringUtils.isEmpty(person)){
            return -1;
        }
        return 1;
    }

    @ApiOperation(value = "删除用户信息",notes = "根据用户名删除用户信息")
    @ApiImplicitParam(name = "name",value = "用户姓名",dataType = "String",required = true)
    @DeleteMapping("/{name}")
    public int deletePerson(@PathVariable(name = "name") String name){
        if(StringUtils.isEmpty(name)){
            return -1;
        }
        return 1;
    }
}