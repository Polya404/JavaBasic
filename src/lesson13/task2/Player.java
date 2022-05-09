package lesson13.task2;

public class Player implements Playable, Recodable{
    @Override
    public void play() {
        System.out.println("Music is playing");
    }

    @Override
    public void record() {
        System.out.println("Recording started");
    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }

    @Override
    public void pause() {
        System.out.println("Pause");
    }
}
