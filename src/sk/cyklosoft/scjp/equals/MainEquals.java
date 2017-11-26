package sk.cyklosoft.scjp.equals;

import java.util.HashMap;
import java.util.Map;

import sk.cyklosoft.scjp.data.Address;
import sk.cyklosoft.scjp.data.User;

public class MainEquals {

    public static void main(String[] args) throws InterruptedException {

        int irado = new Integer("1");
        int irado2 = new Integer("1");
        
        if(irado == irado2) {
            System.out.println("== int");
        } else {
            System.out.println("== no int");
        }
        
        String rado = new String("rado");
        String rado2 = new String("rado");
        
        if(rado.equals(rado2)) {
            System.out.println("equals string");
        } else {
            System.out.println("equals no string");
        }
        
        if(rado == rado2) {
            System.out.println("== string");
        } else {
            System.out.println("== no string");
        }

        
        User user = new User();
        User user2 = new User();
        if(user == user2) {
            System.out.println("user == user2");
        } else {
            System.out.println("user != user2");
        }
        
        Address d1 = new Address("rado");
        Address d2 = new Address("rad2");
        if(d1 == d2) {
            System.out.println("d1 == d2");
        } else {
            System.out.println("d1 != d2");
        }
        
        Map<Object, String> m = new HashMap<Object, String>();
        m.put(d1, "rado");
        System.out.println(m.get(d1));   
        System.out.println(m.get(d2));
        
        if(d2.equals(d1)) {
            System.out.println("Address");
        } else {
            System.out.println("no Address");
        }
    }
    

}
