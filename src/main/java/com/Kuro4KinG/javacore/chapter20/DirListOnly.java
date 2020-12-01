package com.Kuro4KinG.javacore.chapter20;

import java.io.File;
import java.io.FilenameFilter;

public class DirListOnly {
    public static void main(String[] args) {
        String dirname="/Users/user/IdeaProjects/JavaCore";
        File f1=new File(dirname);
        FilenameFilter only=new OnlyExt("iml");
        String s[]=f1.list(only);

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
