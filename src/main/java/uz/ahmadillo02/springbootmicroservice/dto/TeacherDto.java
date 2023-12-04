package uz.ahmadillo02.springbootmicroservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class TeacherDto {

    private String name;

    private String gender;

    private Long age;
}
