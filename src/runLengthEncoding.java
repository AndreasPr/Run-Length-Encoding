/**
 * Created on 08/Jan/2021 to Run-Length-Encoding
 */
public class runLengthEncoding {


    private static void findRunLengthEncoding(String str){

        int counter;
        for(int i = 0; i < str.length(); i++){
            counter = 1;
            while(i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)){
                counter++;
                i++;
            }
            System.out.println(str.charAt(i));
            System.out.println(counter);
        }

    }

    public static void main(String args[]){

        String str = "wwwwaaadexxx";
        findRunLengthEncoding(str);
    }

}
