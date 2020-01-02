package com.entor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entor.entity.Student;
import com.entor.service.IStudentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
public class StudentController {

	@Autowired
	private IStudentService studentService;
	
	@RequestMapping("/add")
	public void add() {
		
	}
	@RequestMapping("/update")
	public void update() {
		
	}
	@RequestMapping("/deleteById")
	public void deleteById(int id) {
		
	}
	@RequestMapping("/queryById")
	public Student queryById(int id) {
		return studentService.queryById(id);
	}
	@RequestMapping("/queryByPage")
	public List<Student> queryByPage(int currentPage,int pageSize) {
		return studentService.queryByPage(currentPage, pageSize);
	}
	@RequestMapping("/queryByPage2")
	public PageInfo<Student> queryByPage2(int currentPage,int pageSize) {
		PageHelper.startPage(currentPage, pageSize);
		List<Student> list = studentService.queryAll();
		PageInfo<Student> pageInfo = new PageInfo<Student>(list);
		return pageInfo;
	}
}
