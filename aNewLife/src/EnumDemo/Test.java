package EnumDemo;

public class Test {
    public static void main(String[] args) {
        Gender gender = Gender.男;
        Gender gender1 = Gender.女;
        System.out.println(gender);
        EventEnum ee = EventEnum.LAUNCH;
        System.out.println(ee.name());
        String id = EventEnum.PAGEVIEW.name();//name()这个方法并非是打印输出小写的内容，而是大写的名字，注意区分这个方法
        System.out.println(id);
        System.out.println("**************");
        ee.show();
    }
}
