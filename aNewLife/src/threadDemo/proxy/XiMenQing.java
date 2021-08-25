package src.threadDemo.proxy;

public class XiMenQing {
    public static void main(String[] args) {
//        WangPo wangPo = new WangPo();
//        wangPo.makeEyesWithMen();
//        wangPo.playWithMen();

        JiaShi jiaShi = new JiaShi();
        WangPo wangPo = new WangPo(jiaShi);
        wangPo.makeEyesWithMen();
        wangPo.playWithMen();

    }
}
