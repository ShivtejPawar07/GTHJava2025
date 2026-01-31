class ScoreBoard {
    synchronized void bat() {
        System.out.println("Batsman is batting...");
        try{
            Thread.sleep(2000);
        }catch (Exception e) {}
        System.out.println("Run scored!");
        notify(); // inform umpire
    }
    synchronized void signal() {
        try {
            wait(); // wait for batsman
        } catch (Exception e) {}

        System.out.println("Umpire updated the score");
    }
}
class Batsman extends Thread {
    ScoreBoard sb;
    Batsman(ScoreBoard sb) {
        this.sb = sb;
    }
    public void run() {
        sb.bat();
    }
}
class Umpire extends Thread {
    ScoreBoard sb;
    Umpire(ScoreBoard sb) {
        this.sb = sb;
    }
    public void run() {
        sb.signal();
    }
}
class CricketInterThread {
    public static void main(String[] args) {
        ScoreBoard sb = new ScoreBoard();
        Umpire u = new Umpire(sb);
        Batsman b = new Batsman(sb);
        u.start();
        b.start();
    }
}
