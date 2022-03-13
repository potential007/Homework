package com.example.demo.utility;


import lombok.Data;

@Data
public class Dice {
    int diceNum;
    final int Max = 6;
    final int Min = 1;

    int range = Max - Min + 1;

    public void rollDice(){
        diceNum = (int) (Math.random() * range + Min);
    }


}
