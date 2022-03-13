package com.example.demo.repository.order44;

import com.example.demo.entity.order44.StudentScoreManagement;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class StudentRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public StudentScoreManagement create(StudentScoreManagement studentScoreManagement) {
        String query = "insert into StudentScoreManagement ( name, korean, english, mathematics) values (?, ?, ?, ?)";

        jdbcTemplate.update(query, studentScoreManagement.getName(), studentScoreManagement.getKorean(), studentScoreManagement.getEnglish(), studentScoreManagement.getMathematics());

        return studentScoreManagement;
    }

    public List<StudentScoreManagement> list() {
        List<StudentScoreManagement> results = jdbcTemplate.query(
                "select * from StudentScoreManagement " +
                        "where student_no > 0 order by student_no desc",

                new RowMapper<StudentScoreManagement>() {
                    @SneakyThrows
                    @Override
                    public StudentScoreManagement mapRow(ResultSet rs, int rowNum) throws SQLException {
                        StudentScoreManagement studentScoreManagement= new StudentScoreManagement();

                        studentScoreManagement.setStudentNo(rs.getInt("student_no"));
                        studentScoreManagement.setName(rs.getString("name"));
                        studentScoreManagement.setKorean(rs.getInt("korean"));
                        studentScoreManagement.setEnglish(rs.getInt("english"));
                        studentScoreManagement.setMathematics(rs.getInt("mathematics"));
                        return studentScoreManagement;
                    }
                }
        );
        return results;
    }
}
