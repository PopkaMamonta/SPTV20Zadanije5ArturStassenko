
package sptv20zadanije5arturstassenko;

import java.util.Random;

public class SPTV20Zadanije5ArturStassenko {

    public static void main(String[] args) {
        Random random=new Random();
        int[][]nums;
        int min=50,max = 100;
        nums=new int[5][];
        nums[0]=new int[3];
        nums[1]=new int[5];
        nums[2]=new int[7];
        nums[3]=new int[8];
        nums[4]=new int[9];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j]=random.nextInt(max-min+1)+min;
                int mini=nums[i][j];
                int place=j;
                for (int v= j+1; j < nums[j].length; v++) {
                    if (nums[j][v]<mini){
                        mini=nums[j][v];
                        place=v;
                    }
                }
                    if (j != place) {
                        int tmp = nums[i][j];
                        nums[j] = nums[place];
                        nums[j][place] = tmp;
                    }
                    System.out.printf("%4d",nums[i][j]);
            }
            System.out.println();
        }
    }
}
