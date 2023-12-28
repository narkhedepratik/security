package com.cjc.main.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	
	private int sid;
	private String studentName;
	private String studentCourse;
	private String studentEmail;
	private float feesPaid;

}

/*
  {
    "sid":1,
    "studentName":"abc",
    "studentCourse":"Java",
    "studentEmail":"abc@gmail.com",,
    "feesPaid":20000
    }
    
 */
