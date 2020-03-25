package com.atguigu.bin;

/**
 * @author yg
 * @create 2020-03-24 23:34
 */
public class Student extends Person {
    @Override
    public void eat() {
        System.out.println("Student.eat");
        System.out.println();
        System.out.println("true = " + true);
        super.eat();
    }

    public String getName(int bb) {
        int a = 10;
        int b = 20;
        System.out.println("Student.getName");
        String[] arr = new String[]{"tom", "fanmei", "lileilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (String s : arr) {
            System.out.println("s = " + s);
        }
        //ifn
        if (arr == null) {

        }

        //arr.null
        if (arr == null) {

        }

        return null;
    }

    public static void main(String[] args) {

    }

    public void nihao(){

    }

    public String niaho(String name){

        return  name;
    }
    public String getAge(int grxh){
        String agr = null;

        return agr;
    }
    
    
    
    /**
     *客户的id 
     */
     private int id ;
     /**
      *客户的name 
      */
     private int name ;

       
    
}
