package pl.marta.exercise.innerClasses.RobotExercise;

public class AnonimousClasse {

    public static class Robot {
        private final GreetingModule greetingModule;

        public Robot(GreetingModule greetingModule) {
            this.greetingModule = greetingModule;
        }

        public void saySomething() {
            greetingModule.sayHello();
        }
    }

    public interface GreetingModule {
        void sayHello();
    }

    public static void main(String[] args) {
        Robot jan = new Robot(new GreetingModule() {
            @Override
            public void sayHello() {
                System.out.println("dzien dobry");
            }
        });
        Robot john = new Robot(new GreetingModule() {
            @Override
            public void sayHello() {
                System.out.println("good morning");
            }
        });

        Robot henry = new Robot(new GreetingModule() {
            @Override
            public void sayHello() {
                System.out.println("cześć!!");
            }
        });

        jan.saySomething();
        john.saySomething();
        henry.saySomething();
    }
}

