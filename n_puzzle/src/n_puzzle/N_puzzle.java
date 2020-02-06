/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n_puzzle;

/**
 *
 * @author Mahbub
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class matrix {

    int[][] table = new int[3][3];
    int matrix_number;
    int parent_number;

}

/*0 2 3         1 0 3          1 2 3          1 2 3           1 2 3
 1 4 5         4 2 5          4 8 5          4 0 5            7 4 5
 7 8 6         7 8 6          7 0 6           7 8 6           0 8 6
   
 */
public class N_puzzle {

    /**
     * @param args the command line arguments
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int a, b, c, d, i, j, k;
        int r = 0, m = 0, lo, ind = 0;
        int row = 0, col = 0, temp = 0, temp1 = 0, temp2 = 0, temp3 = 0;
        List<matrix> arralist = new ArrayList<matrix>();
        matrix obj = new matrix();

        System.out.println("Goal array");
        int[][] arr = new int[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 0},};
        for (int l = 0; l < 3; l++) {
            System.out.print("row +[" + l + "] = ");
            for (int n = 0; n < 3; n++) {
                System.out.print(arr[l][n] + " ");
            }
            System.out.println();
        }

        System.out.println("array input");
        for (j = 0; j < 3; j++) {
            for (k = 0; k < 3; k++) {

                obj.table[j][k] = in.nextInt();

            }
        }
        System.out.print("obj-> matrix_number : ");
        obj.matrix_number = in.nextInt();
        System.out.print("obj->parent_number : ");
        obj.parent_number = in.nextInt();

        arralist.add(obj);

        //Iterator <matrix> point = arralist.iterator();
        matrix obj1, element, element1, element2, element3;

        int count = 0, mtch, mtch1, flag = 0, num = 0, u = 1;

        while (count < arralist.size()) {
            element = new matrix();
            element1 = new matrix();
            element2 = new matrix();
            element3 = new matrix();
            obj1 = new matrix();
            obj1 = arralist.get(num);
            ind = num;
            for (mtch = 0; mtch < 3; mtch++) {
                for (mtch1 = 0; mtch1 < 3; mtch1++) {
                    if (obj1.table[mtch][mtch1] == arr[mtch][mtch1]) {
                        flag = flag + 1;
                    } else {
                        flag = 0;
                        break;
                    }
                }
            }

            if (flag == 9) {
                System.out.println("Hurry !Puzzel solve");
                System.out.println("arraylist solve index num  : " + num);

                break;

            }

            for (j = 0; j < 3; j++) {
                for (k = 0; k < 3; k++) {
                    element.table[j][k] = obj1.table[j][k];
                    element1.table[j][k] = obj1.table[j][k];
                    element2.table[j][k] = obj1.table[j][k];
                    element3.table[j][k] = obj1.table[j][k];
                }
            }
            element.matrix_number = num;
            //element.parent_number = obj1.parent_number;
            element1.matrix_number = num;
            // element1.parent_number = obj1.parent_number;
            element2.matrix_number = num;
            // element2.parent_number = obj1.parent_number;
            element3.matrix_number = num;
            ///  element3.parent_number = obj1.parent_number;

            for (i = 0; i < 3; i++) {
                for (j = 0; j < 3; j++) {
                    if (obj1.table[i][j] == 0) {
                        row = i;
                        col = j;

                    }
                }
            }

            if (row == 0 && col == 0) {
                temp = element.table[row][col];
                element.table[row][col] = element.table[0][1];
                element.table[0][1] = temp;
                element.matrix_number = (arralist.size() + 1) - 1;

                element.parent_number = count;
                arralist.add(element);

                temp1 = element1.table[row][col];
                element1.table[row][col] = element1.table[1][0];
                element1.table[1][0] = temp1;
                element1.matrix_number = (arralist.size() + 1) - 1;

                element1.parent_number = count;
                arralist.add(element1);

            } else if (row == 0 && col == 1) {
                temp = element.table[row][col];
                element.table[row][col] = element.table[0][0];
                element.table[0][0] = temp;
                element.matrix_number = (arralist.size() + 1) - 1;

                element.parent_number = count;
                arralist.add(element);

                temp1 = element1.table[row][col];
                element1.table[row][col] = element1.table[0][2];
                element1.table[0][2] = temp1;
                element1.matrix_number = (arralist.size() + 1) - 1;

                element1.parent_number = count;
                arralist.add(element1);

                temp2 = element2.table[row][col];
                element2.table[row][col] = element2.table[1][1];
                element2.table[1][1] = temp2;

                element2.matrix_number = (arralist.size() + 1) - 1;
                element2.parent_number = count;
                arralist.add(element2);

            } else if (row == 0 && col == 2) {
                temp = element.table[row][col];
                element.table[row][col] = element.table[0][1];
                element.table[0][1] = temp;

                element.matrix_number = (arralist.size() + 1) - 1;
                element.parent_number = count;
                arralist.add(element);

                temp1 = element1.table[row][col];
                element1.table[row][col] = element1.table[1][2];
                element1.table[1][2] = temp1;
                element1.matrix_number = (arralist.size() + 1) - 1;
                element1.parent_number = count;
                arralist.add(element1);

            } else if (row == 1 && col == 0) {
                temp = element.table[row][col];
                element.table[row][col] = element.table[0][0];
                element.table[0][0] = temp;

                element.matrix_number = (arralist.size() + 1) - 1;
                element.parent_number = count;
                arralist.add(element);

                temp1 = element1.table[row][col];
                element1.table[row][col] = element1.table[1][1];
                element1.table[1][1] = temp1;

                element1.matrix_number = (arralist.size() + 1) - 1;
                element1.parent_number = count;
                arralist.add(element1);

                temp2 = element2.table[row][col];
                element2.table[row][col] = element2.table[2][0];
                element2.table[2][0] = temp2;

                element2.matrix_number = (arralist.size() + 1) - 1;
                element2.parent_number = count;
                arralist.add(element2);

            } else if (row == 1 && col == 1) {
                temp = element.table[row][col];
                element.table[row][col] = element.table[0][1];
                element.table[0][1] = temp;

                element.matrix_number = (arralist.size() + 1) - 1;
                element.parent_number = count;
                arralist.add(element);

                temp1 = element1.table[row][col];
                element1.table[row][col] = element1.table[1][0];
                element1.table[1][0] = temp1;

                element1.matrix_number = (arralist.size() + 1) - 1;
                element1.parent_number = count;
                arralist.add(element1);

                temp2 = element2.table[row][col];
                element2.table[row][col] = element2.table[1][2];
                element2.table[1][2] = temp2;

                element2.matrix_number = (arralist.size() + 1) - 1;
                element2.parent_number = count;
                arralist.add(element2);
                temp3 = element3.table[row][col];
                element3.table[row][col] = element3.table[2][1];
                element3.table[2][1] = temp3;

                element3.matrix_number = (arralist.size() + 1) - 1;
                element3.parent_number = count;
                arralist.add(element3);

            } else if (row == 1 && col == 2) {
                temp = element.table[row][col];
                element.table[row][col] = element.table[0][2];
                element.table[0][2] = temp;

                element.matrix_number = (arralist.size() + 1) - 1;
                element.parent_number = count;
                arralist.add(element);

                temp1 = element1.table[row][col];
                element1.table[row][col] = element1.table[1][1];
                element1.table[1][1] = temp1;

                element1.matrix_number = (arralist.size() + 1) - 1;
                element1.parent_number = count;
                arralist.add(element1);

                temp2 = element2.table[row][col];
                element2.table[row][col] = element2.table[2][2];
                element2.table[2][2] = temp2;

                element2.matrix_number = (arralist.size() + 1) - 1;
                element2.parent_number = count;
                arralist.add(element2);

            } else if (row == 2 && col == 0) {
                temp = element.table[row][col];
                element.table[row][col] = element.table[1][0];
                element.table[1][0] = temp;

                element.matrix_number = (arralist.size() + 1) - 1;
                element.parent_number = count;
                arralist.add(element);

                temp1 = element1.table[row][col];
                element1.table[row][col] = element1.table[2][1];
                element1.table[2][1] = temp1;

                element1.matrix_number = (arralist.size() + 1) - 1;
                element1.parent_number = count;
                arralist.add(element1);
            } else if (row == 2 && col == 1) {
                temp = element.table[row][col];
                element.table[row][col] = element.table[2][0];
                element.table[2][0] = temp;

                element.matrix_number = (arralist.size() + 1) - 1;
                element.parent_number = count;
                arralist.add(element);

                temp1 = element1.table[row][col];
                element1.table[row][col] = element1.table[1][1];
                element1.table[1][1] = temp1;

                element1.matrix_number = (arralist.size() + 1) - 1;
                element1.parent_number = count;
                arralist.add(element1);

                temp2 = element2.table[row][col];
                element2.table[row][col] = element2.table[2][2];
                element2.table[2][2] = temp2;

                element2.matrix_number = (arralist.size() + 1) - 1;
                element2.parent_number = count;
                arralist.add(element2);
            } else if (row == 2 && col == 2) {
                temp = element.table[row][col];
                element.table[row][col] = element.table[1][2];
                element.table[1][2] = temp;

                element.matrix_number = (arralist.size() + 1) - 1;
                element.parent_number = count;
                arralist.add(element);

                temp1 = element1.table[row][col];
                element1.table[row][col] = element1.table[2][1];
                element1.table[2][1] = temp1;
                element1.matrix_number = (arralist.size() + 1) - 1;
                element1.parent_number = count;
                arralist.add(element1);
            }

            count++;
            num = count;

        }   //while loop finish

        for (i = 0; i <= ind; i++) {
            System.out.println("matrix number = " + arralist.get(i).matrix_number + "     " + "parent_number = " + arralist.get(i).parent_number);

            for (j = 0; j < 3; j++) {
                for (k = 0; k < 3; k++) {

                    System.out.print(arralist.get(i).table[j][k] + " ");

                }
                System.out.println();
            }

        }

        System.out.println("\n ---------------------------------------------\n");
        System.out.println("you want to backtracking ,if (yes) press 1");
        int back, sc, track;
        sc = in.nextInt();
        track = i - 1;
        System.out.println(track);
        if (sc == 1) {
            for (i = track; i >= 0;) {

                System.out.println("matrix number = " + arralist.get(i).matrix_number + "     " + "parent_number = " + arralist.get(i).parent_number);

                for (j = 0; j < 3; j++) {
                    for (k = 0; k < 3; k++) {

                        System.out.print(arralist.get(i).table[j][k] + " ");

                    }

                    System.out.println();
                }

                if (i == 0) {
                    System.out.println("Back-tracking process complete");
                    break;
                }
                i = arralist.get(i).parent_number;
            }

        } else {
            System.out.println("Happy N-puzzle");
        }

    }

}