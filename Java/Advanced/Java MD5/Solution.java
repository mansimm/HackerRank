import java.io.*;
import java.util.*;
import java.security.*;

public class Solution {

    public static void main(String[] args) throws NoSuchAlgorithmException{
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        MessageDigest m = MessageDigest.getInstance("MD5");
        m.reset();
        m.update(s.getBytes());
        for(byte b: m.digest())
        {
            System.out.print(String.format("%02x",b));
        }
    }
}
