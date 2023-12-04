package uz.ahmadillo02.springbootmicroservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.ahmadillo02.springbootmicroservice.dto.TeacherDto;
import uz.ahmadillo02.springbootmicroservice.entity.Teacher;
import uz.ahmadillo02.springbootmicroservice.service.TeacherService;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/teacher")
public class TeacherController {

    private final TeacherService teacherService;


    @GetMapping("/info")
    public String getInfo() {
        return teacherService.getInfo();
    }



    @GetMapping("/get/{id}")
    public Optional<Teacher> get(@PathVariable Long id) {
        return teacherService.getById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        return teacherService.delete(id);
    }


    @GetMapping("/all")
    public List<Teacher> getAll() {
        return teacherService.getAll();
    }


    @PostMapping("/save")
    public Teacher save(@RequestBody TeacherDto teacherDto) {
        return teacherService.save(teacherDto);
    }


    @PutMapping("/update")
    public Teacher update(@RequestBody Teacher teacher) {
        return teacherService.update(teacher);
    }
}
