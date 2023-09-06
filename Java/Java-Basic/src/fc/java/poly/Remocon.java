package fc.java.poly;
// 추상클래스=추상메서드+구현메서드
public interface Remocon {
    // chUp, chDown(), volUp(), volDown
    public static final int MAXCH = 99;
    public static final int MINCH = 1;
    public void chUp();
    public void chDown();
    public void volUp();
    public void volDown();
    public void internet();
}