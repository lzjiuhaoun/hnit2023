public class Chapter2 {
    public static void main(String[] args) {
//        for (int i = 20302; i < 20322; ++i) {
//            System.out.println((char)i);
//        }
//        System.out.println('我');

//        System.out.println(Byte.MAX_VALUE+","+Byte.MIN_VALUE);
        Long[] a = {1L,2L,3L,4L};
        Long[] b = {100L,200L,300L,400L,500L};
        b=a;
        b[0]=123L;
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+'\t');
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+'\t');
        }
        System.out.println(b.length);
        System.out.println(a.length);

    }
}
