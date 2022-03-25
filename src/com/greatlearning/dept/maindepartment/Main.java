package com.greatlearning.dept.maindepartment;

import com.greatlearning.dept.admindepartment.AdminDepartment;
import com.greatlearning.dept.hrdepartment.HrDepartment;
import com.greatlearning.dept.techdepartment.TechDepartment;

public class Main {

	public static void main(String[] args) {
		//creating object for AdminDepartment
		AdminDepartment admindepartment =new AdminDepartment();
		admindepartment.departmentName();
		admindepartment.getTodaysWork();
		admindepartment.getWorkDeadline();
		admindepartment.isTodayAHoliday();
		System.out.println("        ");
		//creating object for HrDepartment
        HrDepartment hrdepartment = new HrDepartment();
        hrdepartment.departmentName();
        hrdepartment.getTodaysWork();
        hrdepartment.getWorkDeadline();
        hrdepartment.doActivity();
        hrdepartment.isTodayAHoliday();
        System.out.println("        ");
        //creating object for TechDepartment
        TechDepartment techdepartment = new TechDepartment();
        techdepartment.departmentName();
		techdepartment.getTodaysWork();
		techdepartment.getWorkDeadline();
		techdepartment.getTechStackInformation();
		techdepartment.isTodayAHoliday();
		

	}
	}


