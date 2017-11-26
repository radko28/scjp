package sk.cyklosoft.scjp.parse;

public class MainParseInt {
    
    public static void main(String[] args) {
        try {
            System.out.println("start");
            doParse(args);
        } catch(Exception e) {
            System.out.println("exception");
            doParse(args);
        } /*finally {
            System.out.println("finally");
            doParse(args);    
            System.out.println("finally2");
        }*/
        System.out.println("end");
        doParse(args);
        
    }
    
    static int doParse(String[] args) {
        return Integer.parseInt(args[0]);
    }
}
