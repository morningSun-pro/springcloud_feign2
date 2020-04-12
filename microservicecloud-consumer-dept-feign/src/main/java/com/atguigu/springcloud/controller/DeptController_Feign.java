package com.atguigu.springcloud.controller;
 
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptClientService;
 
@RestController
@RequestMapping("/consumer")
public class DeptController_Feign
{
  @Autowired
  private DeptClientService service;
 
  @GetMapping(value = "/get/{id}")
  public Dept get(@PathVariable("id") Long id)
  {
   return service.get(id);
  }
 
  @GetMapping(value = "/list")
  public List<Dept> list()
  {
   return service.list();
  }
 
  @PostMapping(value = "/add")
  public Object add(Dept dept)
  {
   return service.add(dept);
  }
}
 
