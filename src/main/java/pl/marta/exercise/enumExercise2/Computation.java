package pl.marta.exercise.enumExercise2;

public enum Computation {

    MULTIPLY {
        public double perform(double x, double y) {
            return x * y;
        }
    },
    DIVIDE {
        public double perform(double x, double y) {
            double answer = 0;
            try {
                answer = x / y;
            } catch (Exception e) {
                e.printStackTrace();
            }

            return answer;
        }
    },
    ADD {
        public double perform(double x, double y) {
            return x + y;
        }
    },
    SUBSTRACT {
        public double perform(double x, double y) {
            return x - y;
        }
    };


    public abstract double perform(double x, double y);


    }
