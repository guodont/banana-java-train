package contact;

/**
 * Created by guodont on 15/12/17.
 */
public class CatClass extends Animal {
    private int lag;    // 腿的数量

    public int getLag() {
        return lag;
    }

    public void setLag(int lag) {
        this.lag = lag;
    }

    /**
     * 爬树方法
     */
    public void pashu() {
        System.out.println("爬树");
    }

    @Override
    public void walk() {
        System.out.println("四条腿行走");
    }
}
