package Unit04;

public class AssignmentExercises {
    
    public boolean xyzThere(String str){
        //must use .equals() for strings
        boolean a = false;
        for(int i=0;i<str.length() - 2;i++){
            if(str.substring(i, i+1).equals("x")){
                if(i > 0 && str.substring(i-1, i).equals(".")){
                    a=false;
                }
                else if(str.substring(i, i+3).equals("xyz")){
                    a=true;
                    break;
                }
                else{
                    a=false;
                }
            }
            else{
                a=false;
            }
        }
        return a;
    }

    public String zipZap(String str){
        
    }

}
