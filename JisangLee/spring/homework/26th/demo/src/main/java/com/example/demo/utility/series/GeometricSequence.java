package com.example.demo.utility.series;

import lombok.Getter;

@Getter
public class GeometricSequence {
    final int MAX = 31;
    final int START_IDX = 0;
    final int BASE = 2;



   int idx = 31;
   int tmp;

    int[] seq = new int[idx];

    public void sequenceGenerator() {
        for (int i = START_IDX; i < idx; i++) {
            //System.out.printf("%d\n", idx);

            seq[i] = (int) Math.pow(BASE, i);

            tmp = seq[i];

            //System.out.printf("seq[%d] = %d\n", i, seq[i]);
        }
    }

    /*public void inputIndex() {
        System.out.print("31이하의 수를 입력하세요 ");
        Scanner scan = new Scanner(System.in);

        int idx = scan.nextInt();
        this.idx = idx;

        /*while (true) {
            if (idx > 31) {
                System.out.print("다시 입력해주세요: ");
                idx = scan.nextInt();
            } else {
                this.idx = idx;
            }
            return idx;
        }*/
    //}
    //int[] seq = new int[idx];




    }
