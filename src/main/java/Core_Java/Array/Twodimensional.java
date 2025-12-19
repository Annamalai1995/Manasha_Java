package Core_Java.Array;

public class Twodimensional {
    public static void main(String[] args) {
        int [][]matrix={{10,20,3},{30,40,50},{50,60,45}};
        for(int  row=0;row<3;row++)
        {
            for(int column=0;column<3;column++)
            {
                System.out.println(matrix[column][row]);
            }
            System.out.println();
        }
    }
}
