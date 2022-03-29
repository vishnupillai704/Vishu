package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
@Component
public interface Employeejparepository extends JpaRepository<employee,Long>{

	employee findByEmployeename(String employeename);

}
