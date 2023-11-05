package com.ragav.student;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService service;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(
        @RequestBody Student student
    )
    {
        service.saveStudent(student);
    }

    @GetMapping
    public ResponseEntity<List<Student>>findAllStudents(){
        return ResponseEntity.ok(service.findAllStudents());
    }
}
