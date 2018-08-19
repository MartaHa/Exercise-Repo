package pl.marta.exercise.innerClasses;

public class StaticOuterClass {

    public static class StaticInnerClass {

    }

    public StaticInnerClass instantiate() {
        return new StaticInnerClass();
    }


    private static void returnInnerClassInstance() {
        StaticOuterClass staticOuterClass = new StaticOuterClass();
        StaticOuterClass.StaticInnerClass instance = staticOuterClass.instantiate();
        StaticOuterClass.StaticInnerClass instance2 = new StaticOuterClass.StaticInnerClass();
    }
}
