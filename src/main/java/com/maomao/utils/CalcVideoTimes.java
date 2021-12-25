package com.maomao.utils;

import java.util.Arrays;
import java.util.List;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/11/22 11:48
 * Program Goal:
 * total:2044minutes-->【34hours:4minutes】
 *********************************************/
public class CalcVideoTimes {

    private static final List<Integer> times =
            Arrays.asList(4, 3, 2, 7, 9, 27, 14, 4, 3, 7, 20, 18, 4, 5, 7, 14, 12, 7, 23, 12, 11, 32, 7,
                    12, 5, 2, 9, 23, 4, 12, 8, 5, 5, 6, 6, 12, 3, 6, 2, 13, 7, 9, 9, 22, 11, 9, 13, 9, 5,
                    3, 4, 13, 4, 14, 32, 6, 6, 2, 2, 8, 11, 20, 32, 10, 10, 10, 16, 4, 4, 13, 14, 6, 18,
                    16, 5, 5, 5, 13, 11, 11, 10, 4, 9, 3, 10, 2, 11, 10, 4, 11, 7, 10, 1, 7, 6, 20, 13,
                    4, 18, 19, 14, 4, 14, 8, 8, 23, 11, 13, 6, 19, 14, 24, 5, 8, 27, 29, 28, 9, 9, 8, 6,
                    4, 16, 5, 10, 7, 16, 11, 2, 1, 7 , 15, 9, 17, 3, 2, 14, 3, 3, 10, 12, 10, 15, 1, 12,
                    22, 18, 6, 24, 3, 10, 4, 16, 12, 15, 12, 10, 11, 20, 5, 3, 2, 23, 14, 2, 5, 17, 22,
                    13, 3, 3, 12, 9, 7, 2, 8, 5, 22, 10, 12, 4, 12, 11, 6 , 10, 11, 9, 7, 7, 9, 5, 11, 14, 5, 63);

    public static void main(String[] args) {
        int size = times.size();
        System.out.println(size);

        int sum=getVideoTimes(76);
        System.out.println("total:"+sum+"minutes"+"-->【"+(sum/60)+"hours"+":"+(sum%60)+"minutes】");
    }
    private static int getVideoTimes(int start) {
        int sum=0;
        for(int i=start-1;i<times.size();i++){
            sum+=times.get(i);
        }
        return sum;
    }
    private static int getVideoTimes(int start, int end) {
        int sum=0;
        for(int i=start-1;i<end;i++){
            sum+=times.get(i);
        }
        return sum;
    }

}
