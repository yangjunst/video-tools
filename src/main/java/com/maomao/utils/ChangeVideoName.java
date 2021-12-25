package com.maomao.utils;

/**
 * Description:    批量更改文件的序号前缀
 * Author:         杨俊
 * CreateDate:     2020/3/1 17:23
 * Version:        1.0
 */
import java.io.File;

public class ChangeVideoName {

    public static void getFileOfGreaterThan(long overout,File file) {
        File[] files=file.listFiles();

        for(File f:files){

            if(f.isFile()) {
                if(f.length()>1024*1024*100){
                    System.out.println(f.getAbsolutePath());
                }
            }else{
                getFileOfGreaterThan(0,f);
            }
        }
    }



    public static void change(File file){
        File[] files=file.listFiles();
        for(File f:files){
            if(f.isFile()) {
                String name=f.getAbsolutePath();
                Integer n=Integer.parseInt(name.substring(name.indexOf("第")+1,name.indexOf("节")));
                if(n<10){
                    name=name.substring(0,name.indexOf("第"))+"第00"+n+name.substring(name.indexOf("节"));
                }else if(n<100){
                    name=name.substring(0,name.indexOf("第"))+"第0"+n+name.substring(name.indexOf("节"));
                }
                f.renameTo(new File(name));
            }
        }
    }

    public static void change(File file,String str){
        File[] files=file.listFiles();
        for(File f:files){
            if(f.isFile()) {
                String name=f.getAbsolutePath();
                name=name.replaceAll(str,"");
                f.renameTo(new File(name));
            }
        }
    }
    public static void main(String[] args) {
        File f=new File("C:\\Users\\yangjunst\\Desktop\\Thread\\多线程10-31-21\\02.多线程高级视频教程\\last3-30-33");
        change(f,"多线程高级视频教程之");
        System.out.println(f.length()/1024/1024);
    }
}
