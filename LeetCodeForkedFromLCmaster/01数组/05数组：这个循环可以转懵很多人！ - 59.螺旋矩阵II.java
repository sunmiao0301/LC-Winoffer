2nd
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int row = 0;//hang
        int col = 0;//lie
        int colBoundaryRight = n;
        int rowBoundaryBottom = n;
        int colBoundaryLeft = -1;
        int rowBoundaryTop = 0;
        int i = 1;
        int nSquareAddOne = n * n + 1;
        while(i < nSquareAddOne){
            while(col < colBoundaryRight){
                res[row][col] = i;
                col++;
                i++;
            }
            if(i >= nSquareAddOne)
                break;
            col--;
            row++;//easy to forget
            colBoundaryRight--;
            while(row < rowBoundaryBottom){
                res[row][col] = i;
                row++;
                i++;
            }
            row--;
            col--;
            rowBoundaryBottom--;
            while(col > colBoundaryLeft){
                res[row][col] = i;
                col--;
                i++;
            }
            if(i >= nSquareAddOne)
                break;
            col++;
            row--;
            colBoundaryLeft++;
            while(row > rowBoundaryTop){
                res[row][col] = i;
                row--;
                i++;
            }
            row++;
            col++;
            rowBoundaryTop++;
        }
    return res;
    }
}

//第一版 一遍过

卡住的原因是对二维数组没掌握牢固 把arr[行][列] 行 = row 列 = col 弄颠倒了 举个例子
1 2 3
4 5 6
7 8 9
那么arr[2][0] = 7 != 3

执行结果：
通过
执行用时：
0 ms
, 在所有 Java 提交中击败了
100.00%
的用户
内存消耗：
36.3 MB
, 在所有 Java 提交中击败了
80.60%
的用户
class Solution {
    public int[][] generateMatrix(int n) {
    int x = 0, y = 0, i = 0;
    int[][] ret = new int[n][n];//复习二维数组！！！二维数组ret[行][列] 是 行 - 列 顺序 所以最好用 rows cols 而不是 x y    
    while(i < n * n){
        while(x < n - y && ret[y][x] == 0){
            ret[y][x] = i + 1;
            x++;
            i++;
        }
        x--;
        y++;
        if(i >= n * n)break;
        while(y < x + 1 && ret[y][x] == 0){
            ret[y][x] = i + 1;
            y++;
            i++;
        }
        x--;
        y--;
        if(i >= n * n)break;

        while(x > y - n && ret[y][x] == 0){
            ret[y][x] = i + 1;
            x--;
            i++;
        }
        x++;
        y--;    
        if(i >= n * n)break;
        while(y > x && ret[y][x] == 0){
            ret[y][x] = i + 1;
            y--;
            i++;
        }
        y++;
        x++;
        if(i >= n * n)break;
    }
    return ret;
    }
}

//第二版 对于第一版还可以略作优化
class Solution {
    public int[][] generateMatrix(int n) {
    int x = 0, y = 0, i = 0;
    int[][] ret = new int[n][n];//复习二维数组！！！二维数组ret[行][列] 是 行 - 列 顺序 所以最好用 rows cols 而不是 x y    
    while(i < n * n){
        while(x < n - y){//&& ret[y][x] == 0·················优化点1
            ret[y][x] = i + 1;
            x++;
            i++;
        }
        x--;
        y++;
        if(i >= n * n)break;
        while(y < x + 1){ //&& ret[y][x] == 0·················优化点2
            ret[y][x] = i + 1;
            y++;
            i++;
        }
        x--;
        y--;
        if(i >= n * n)break;
        while(x > y - n && ret[y][x] == 0){
            ret[y][x] = i + 1;
            x--;
            i++;
        }
        x++;
        y--;    
        if(i >= n * n)break;
        while(y > x && ret[y][x] == 0){
            ret[y][x] = i + 1;
            y--;
            i++;
        }
        y++;
        x++;
        if(i >= n * n)break;
    }
    return ret;
    }
}

//第三版 K神 模拟法 但是代码比我的简洁
class Solution {
    public int[][] generateMatrix(int n) {
        int l = 0, r = n - 1, t = 0, b = n - 1;
        int[][] mat = new int[n][n];
        int num = 1, tar = n * n;
        while(num <= tar){
            for(int i = l; i <= r; i++) mat[t][i] = num++; // left to right.
            t++;
            for(int i = t; i <= b; i++) mat[i][r] = num++; // top to bottom.
            r--;
            for(int i = r; i >= l; i--) mat[b][i] = num++; // right to left.
            b--;
            for(int i = b; i >= t; i--) mat[i][l] = num++; // bottom to top.
            l++;
        }
        return mat;
    }
}
