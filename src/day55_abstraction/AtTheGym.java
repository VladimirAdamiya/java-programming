package day55_abstraction;

public class AtTheGym {
    public static void main(String[] args) {
        Exercise exercise = new Running();
        Running running = new Running();
        Swimming swimming = new Swimming() {
            @Override
            public void perform() {

            }

            @Override
            public int getCaloriesCount(int minutes) {
                return 0;
            }
        };
        FreeWeight freeWeight = new FreeWeight();

        exercise.start();
        exercise.perform();
        System.out.println("Running 30 minutes - calories = " + exercise.getCaloriesCount(30));

        swimming.start();
        swimming.perform();
        System.out.println("Running 30 minutes - calories = " + swimming.getCaloriesCount(30));

        running.start();
        running.perform();
        System.out.println("Running 30 minutes - calories = " + running.getCaloriesCount(30));
    }
}
