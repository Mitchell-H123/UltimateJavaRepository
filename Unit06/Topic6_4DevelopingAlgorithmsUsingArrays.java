package Unit06;

public class Topic6_4DevelopingAlgorithmsUsingArrays {
    public static void main(String[] args) {
        //right shift
        int [] numbers={1,2,3,4,5};
        int [] shifted = new int [numbers.length];
        int shift=8;
        for(int i=0;i<numbers.length;i++){
            shifted[Math.abs((i+shift)%numbers.length)]=numbers[i];
        }
        numbers=shifted;
        for(int num:numbers){
            System.out.println(num+" ");
        }

        //left shift
        String [] words={"alpha","beta","gamma","delta"};
        int shiftWord=2;
        for(int count=0;count<shiftWord;count++){
            String temp=words[0];
            for(int i=0;i<words.length-1;i++){
                words[i]=words[i+1];
            }
            words[words.length-1]=temp;
        }
        for(String word:words){
            System.out.println(word);
        }
    }
}
