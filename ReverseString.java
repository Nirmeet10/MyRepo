public class ReverseString {
    public static void main (String args []){
        String name ="Nirmeet kamble";
        int leng = name.length();
        String reverse = "";
        for(int i=leng-1;i>=0;i++){
        reverse=reverse+name.charAt(i);

        }
        System.out.println("reverse of" +name+ "is"+reverse);
        
    }

    
}
