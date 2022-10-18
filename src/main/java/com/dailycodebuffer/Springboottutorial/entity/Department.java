package com.dailycodebuffer.Springboottutorial.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long DepartmentId;
	
@NotBlank(message="please add department Name")	
private String departmentName;
private String departmentAddress;
private String departmentCode;
public Long getDepartmentId() {
	return DepartmentId;
}



}
