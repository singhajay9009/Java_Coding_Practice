//package sampleTest;
//
//public class Test2 {
//
//    // Java code to find number of unique paths
//// in a Matrix
//
//
//        static int uniquePathsWithObstacles(int[][] A)
//        {
//
//            int r = 3, c = 3;
//
//            // create a 2D-matrix and initializing
//            // with value 0
//            int[][] paths = new int[r];
//            for(int i = 0; i < r; i++)
//            {
//                for(int j = 0; j < c; j++)
//                {
//                    paths[i][j] = 0;
//                }
//            }
//
//            // Initializing the left corner if
//            // no obstacle there
//            if (A[0][0] == 0)
//                paths[0][0] = 1;
//
//            // Initializing first column of
//            // the 2D matrix
//            for(int i = 1; i < r; i++)
//            {
//                // If not obstacle
//                if (A[i][0] == 0)
//                    paths[i][0] = paths[i - 1][0];
//            }
//
//            // Initializing first row of the 2D matrix
//            for(int j = 1; j < c; j++)
//            {
//
//                // If not obstacle
//                if (A[0][j] == 0)
//                    paths[0][j] = paths[0][j - 1];
//            }
//
//            for(int i = 1; i < r; i++)
//            {
//                for(int j = 1; j < c; j++)
//                {
//
//                    // If current cell is not obstacle
//                    if (A[i][j] == 0)
//                        paths[i][j] = paths[i - 1][j] +
//                                paths[i][j - 1];
//                }
//            }
//
//            // Returning the corner value
//            // of the matrix
//            return paths[r - 1];
//        }
//
//        // Driver code
//        public static void main(String[] args) {
//            int[][] A = { { 0, 0, 0 },
//                    { 0, 1, 0 },
//                    { 0, 0, 0 } };
//
//            System.out.print(uniquePathsWithObstacles(A));
//        }
//
//
//}
