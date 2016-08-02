package com.wqj;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int[] input = new int[num1];
        List<Integer> l = new ArrayList();
        for (int i = 0; i < num1; i++) {
            input[i] = s.nextInt();//获取输入的数字集合
        }
        for (int i = 0; i < num1 - num2 + 1; i++) {

            int[] ziji = new int[num2];
            int m = num2 - 1;
            for (int j = 0; j < num2; j++) {
                ziji[j] = input[i + j];
            }
            Arrays.sort(ziji);//将子集排序

            if (ziji[num2 - 1] != ziji[num2 - 2]) {//到最大值
                System.out.println(ziji[num2 - 1]);//显示最大值
                continue;
            }
            while (ziji[m] == ziji[m - 1]) {
                while (ziji[m] == ziji[m - 1]) {
                    m = m - 1;
                    if (m == 0) {
                        System.out.println("Nothing");
                        break;
                    }
                }
                if (m <= 1) {
                    if (m == 0) {
                        break;
                    }
                    System.out.println(ziji[0]);
                    break;
                } else {
                    while (ziji[m] == ziji[m - 1]) {//
                        m = m - 1;
                        if (m == 0) {
                            System.out.println("Nothing");
                            break;
                        }
                    }
                    if (m <= 1) {
                        if (m == 0) {
                            break;
                        }
                        System.out.println(ziji[0]);
                        break;
                    } else {
                        if (ziji[m - 1] == ziji[m - 2]) {
                            m = m - 1;
                        } else {
                            System.out.print(ziji[m - 1]);
                        }
                    }
                }
            }
//
        }
    }
}