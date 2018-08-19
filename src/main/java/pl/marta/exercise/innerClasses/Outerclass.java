package pl.marta.exercise.innerClasses;

import com.sun.org.apache.bcel.internal.classfile.InnerClass;

public class Outerclass {

    public class InnerClass{


    }
    public InnerClass instiniate(){
        return new InnerClass();
    }

    private static void InnerClassInstinitaion(){
        Outerclass outerclass = new Outerclass();
        Outerclass.InnerClass innerclass = outerclass.instiniate(); //creating InnerClass instance - 1 method
        Outerclass.InnerClass innerClass2 = outerclass.new InnerClass(); //creating  InenrClass instance - 2 method

    }
}
