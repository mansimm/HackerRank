import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Solution {

    public static void main(String[] args) throws NoSuchAlgorithmException{
       
        Scanner sc = new Scanner(System.in);
        MessageDigest m = MessageDigest.getInstance("SHA-256");
        m.reset();
        String s = sc.nextLine();
        m.update(s.getBytes());
        
        for(byte b: m.digest())
        {
            System.out.print(String.format("%02x",b));
        }
    }
}
