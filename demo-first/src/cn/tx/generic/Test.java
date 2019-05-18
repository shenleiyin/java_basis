package cn.tx.generic;

public class Test {
    public static void main(String[] args) {
        GenericTest<String> gt = new GenericTest<>();
        gt.setT("你好");
        String t = gt.getT();
        System.out.println(t);

        GenericTest<Integer> gt1 = new GenericTest<>();
        gt1.setT(1);
        Integer t1 = gt1.getT();
        System.out.println(t1);


        GenericTest<Integer[]> gt2 = new GenericTest<>();
        gt2.setT(new Integer[]{1,2,4,5,6,35});
        gt2.getT();
        System.out.println(gt2);

        //测试两个泛型
        GenericTest1<String, Integer> gtt = new GenericTest1<>("小明", 20);



    }
}

