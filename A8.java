package lambdaExpression;


import java.util.ArrayList;

import java.util.List; 
import java.util.function.Consumer;

public class A8 {

     public static void main(String[] args){

        Print t=new Print();

        t.start();
        }

}

class Print extends Thread{

         @Override
          public void run() {
               List<Integer> li=new ArrayList<>();

                 li.add(8);

                li.add(44);

                li.add(6);

                li.add(33);

             Consumer<Integer> c=(n)->{ 
                System.out.println(n);
                 };

    li.forEach(c);
 }
}