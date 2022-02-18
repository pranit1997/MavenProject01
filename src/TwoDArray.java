public class TwoDArray {
    public static void main(String[]args){
     int [] [] marks = new int[2][3];
     marks[0][0]=101;
     marks[0][1]=202;
        marks[0][2]=303;
        marks[1][0]=404;
        marks[1][1]=505;
        marks[1][2]=606;

        for (int i = 0;i< marks.length;i++)
        {for (int j=0;j< marks[i].length;j++){
            System.out.print(marks[i][j]);
            System.out.print(" ");}
            System.out.println("");
        }}
}
