package Unit08;

public class Topic8_1_2DArrays {

    public static void main(String[] args) {
        int [] student0={100,65,96,54};
        int [] student1={97,63,96,88};
        int [] student2={100,100,96,97};
        int [] student3={100,99,96,99};

        int [][] grades={student0,student1,student2,student3};
        grades[2][0]=89;
        grades[0][0]=84;
        for(int i=0;i<grades.length;i++){
            for(int j=0;j<grades[0].length;j++){
                System.out.print(grades[i][j]+", ");
            }
            System.out.println("");
        }
    }
}
