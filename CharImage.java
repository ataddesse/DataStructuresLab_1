import java.util.HashMap;

public class CharImage {
    //the 3d array
    char[][][] scr;
    //the hashmap
   HashMap<Integer, Integer> counter = new HashMap<Integer,Integer>();
   //the number of test cases
   int num_test = scr.length;

    int z=0;
    //Coloring starts here
   void setLabels(){
       int m = 65;
       for( z=0; z<num_test; z++){
       for(int y=0; y<scr[0].length; y++){
           for(int x=0; x<scr[0][1].length; x++){
               compLabel(x,y,m++);
           }
       }

       }
   }
   //the recursive method that will check the neighbours of each element
   void compLabel(int i, int j, int m){
       if(scr[z][i][j] == '*'){
           char r = (char)m;
           scr[num_test][i][j] = r;
           compLabel(i-1, j-1, m); compLabel(i-1,j,m);
           compLabel(i-1,j+1,m); compLabel(i,j-1,m);
           compLabel(i,j+1,m); compLabel(i+1, j-1, m);
           compLabel(i+1, j, m); compLabel(i+1,j+1,m);
       }
   }

   void count_component(){

   }
}
