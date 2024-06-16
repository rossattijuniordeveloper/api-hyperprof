package com.py.tecnopar.app.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.py.tecnopar.app.core.models.teacher;

public interface teacherRepository extends JpaRepository<teacher, Long> {
    
}
