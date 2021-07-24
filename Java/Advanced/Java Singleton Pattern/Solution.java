import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class Singleton{

    public static Singleton s = null;
    public String str= null;
    private Singleton()
    {
        str = "Hello I am a singleton! Let me say hello world to you";
    }
    public static Singleton getSingleInstance()
    {
        if(s==null)
        {
            s = new Singleton();
            return s;
        }
        else
        {
            return s;
        }
    }
}
