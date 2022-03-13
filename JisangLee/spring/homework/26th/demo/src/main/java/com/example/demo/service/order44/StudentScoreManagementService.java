package com.example.demo.service.order44;

import com.example.demo.entity.order44.StudentScoreManagement;

import java.util.List;

public interface StudentScoreManagementService {
    public void register(StudentScoreManagement studentScoreManagement);

    public List<StudentScoreManagement> list();
}
