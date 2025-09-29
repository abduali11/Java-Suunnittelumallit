public class Main {
    public static void main(String[] args) {
        Device tv = new TV();
        Remote remote = new BasicRemote(tv);

        System.out.println("Testing TV with BasicRemote:");
        tv.printStatus();

        remote.power();
        remote.volumeUp();
        remote.channelUp();
        tv.printStatus();
    }
}
