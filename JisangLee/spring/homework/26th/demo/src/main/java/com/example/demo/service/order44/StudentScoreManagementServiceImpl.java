package com.example.demo.service.order44;

import com.example.demo.entity.order44.StudentScoreManagement;
import com.example.demo.repository.order44.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentScoreManagementServiceImpl implements StudentScoreManagementService {

    @Autowired
    StudentRepository repository;

    @Override
    public void register(StudentScoreManagement studentScoreManagement) {
        {
            repository.create(studentScoreManagement);
        }

    }

    @Override
    public List<StudentScoreManagement> list() {
        List<StudentScoreManagement> list = repository.list();
        float average;

        for (int i = 0; i < list.size(); i++) {
            //System.out.println(list.get(i));
            StudentScoreManagement studentScoreManagementElem = list.get(i);
            average = (studentScoreManagementElem.getKorean() + studentScoreManagementElem.getEnglish() + studentScoreManagementElem.getMathematics()) / 3;
            studentScoreManagementElem.setAverage(average);
            list.set(i, studentScoreManagementElem);
        }
        return list;
    }



}
