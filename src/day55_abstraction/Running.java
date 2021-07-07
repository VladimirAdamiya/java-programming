package day55_abstraction;

public class Running extends Exercise {

    @Override
    public void perform() {
        System.out.println("Performing Running exercise");

    }

    /**
     * another abstract method that concrete sub classes will override/imlement
     * @param minutes - how long is exercise is performed
     * @return we are assuning avg num of calories while running is 13
     */

    @Override
    public int getCaloriesCount(int minutes) {
        return minutes * 13;
    }
}