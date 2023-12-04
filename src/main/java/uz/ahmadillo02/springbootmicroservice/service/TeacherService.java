package uz.ahmadillo02.springbootmicroservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.ahmadillo02.springbootmicroservice.dto.TeacherDto;
import uz.ahmadillo02.springbootmicroservice.entity.Teacher;
import uz.ahmadillo02.springbootmicroservice.reppository.TeacherRepository;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TeacherService {

    private final TeacherRepository teacherRepository;

    public String getInfo() {
        return "connect to teacher-service";
    }


    public Teacher save(TeacherDto teacherDto) {
        Teacher teacher = Teacher.builder()
                .age(teacherDto.getAge())
                .gender(teacherDto.getGender())
                .name(teacherDto.getName())
                .build();
        return teacherRepository.save(teacher);
    }

    public List<Teacher> getAll() {
        return teacherRepository.findAll();
    }

    public Optional<Teacher> getById(Long id) {
        Optional<Teacher> teacherOptional = teacherRepository.findById(id);
        if (teacherOptional.isPresent()) {
            return teacherOptional;
        } else {
            throw new NoSuchElementException("Teacher with id " + id + " not found");
        }
    }



    public String  delete(Long id) {
         teacherRepository.deleteById(id);
         return "delete " + id;
    }

    public Teacher update(Teacher teacher) {
        return teacherRepository.save(teacher);
    }
}
