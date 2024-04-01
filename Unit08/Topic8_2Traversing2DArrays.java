package Unit08;

public class Topic8_2Traversing2DArrays {
    public static void main(String[] args) {
        char [][] grid= new char[4][7];
        int i=(int)('A');
        int x=0, j=0;

        while(x<grid.length){
            while(j<grid[0].length){
                grid[x][j]=(char)(i);
                i++;
                j++;
            }
            x++;
            j=0;
        }

        for(int a=0;a<grid.length;a++){
            for(int b=0;b<grid[0].length;b++){
                System.out.print(grid[a][b]);
            }
            System.out.println("");
        }

    }
}
