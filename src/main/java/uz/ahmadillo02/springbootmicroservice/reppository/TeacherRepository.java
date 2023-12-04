package uz.ahmadillo02.springbootmicroservice.reppository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.ahmadillo02.springbootmicroservice.entity.Teacher;


@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {


}