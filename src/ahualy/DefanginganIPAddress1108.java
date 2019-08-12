package ahualy;

import java.util.ArrayList;
import java.util.List;

public class DefanginganIPAddress1108 {
    public static void main(String args[]){
        String address = "1.1.1.1";
        String res = fefangIPaddr(address);
        System.out.println(res);
    }

    private static String fefangIPaddr(String address) {

        address= address.replace(".","[.]");

        return address;
    }
}
