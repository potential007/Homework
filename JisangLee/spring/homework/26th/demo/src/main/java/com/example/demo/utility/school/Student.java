package com.example.demo.utility.school;

import lombok.Getter;

@Getter
public class Student{
    final int stu_num = 30;

    final int MAX_SCORE = 100;
    final int MIN_SCORE = 60;

    float average;
    final int range_score = MAX_SCORE - MIN_SCORE + 1;

    int sum = 0;


    public void score(){
        int [] stuscore = new int[stu_num];
        for(int i =0; i < stu_num; i++){
            //System.out.printf("stu_num = %d\n",stu_num);
            stuscore[i] = (int)(Math.random() * range_score + MIN_SCORE);
            sum += stuscore[i];
            //System.out.printf("학생들의 점수의 총합 = %d\n",sum);
        }
    }

    public void average() {
        average = (float)sum/stu_num;
    }
}
