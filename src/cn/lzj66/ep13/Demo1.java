package cn.lzj66.ep13;

import java.util.*;

/**
 * ClassName: Demo1
 * Package: cn.lzj66.ep13
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/11/9 11:10
 */
public class Demo1 {
    public static void main(String[] args) {
//        // 创建一个默认长度的列表对象
//        List<String> list = new ArrayList<>(); //向上转型
//        // 添加操作：向列表中添加4个元素
//        Collections.addAll(list,"5","34","2","25","2023");
//        // 查询操作:
//        System.out.println("列表中所有元素："+list);//输出:[Will, 100, true, Lucy]
//        System.out.println("元素数量："+list.size());//4
//        System.out.println("第一个元素："+list.get(0));//5
//        // 修改操作：把索引为2的元素，替换为wolfcode
//        list.set(2, "wolfcode");
//        System.out.println("修改后："+list);//输出:[5, 34, wolfcode, 25, 2023]
//        // 删除操作：删除索引为1的元素
//        list.remove(1);
//        System.out.println("删除后："+list);//输出:[5, wolfcode, 25, 2023]
//        //删除操作：删除元素为“2023”的元素
//        list.remove("2023");
//        System.out.println("删除后" + list);//输出:[5, wolfcode, 25]
//        Set<String> set = new HashSet<>();
//        Collections.addAll(set,"www",".","lzj66",".","cn");
//        System.out.println(set);
//        List<String> list = new ArrayList<>();
//        Collections.addAll(list,"西施","王昭君","貂蝉","杨玉环");
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//        List<String> list = new ArrayList<>();
//        Collections.addAll(list,"西施","王昭君","貂蝉","杨玉环");
//        for (String s : list) {
//            System.out.println(s);
//        }
//        List<String> list = new ArrayList<>();
//        Collections.addAll(list,"西施","王昭君","貂蝉","杨玉环");
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//        List<String> list = new ArrayList<>();
//        Collections.addAll(list, "西施", "王昭君", "貂蝉", "杨玉环");
//        list.forEach(System.out::println);
//        list.forEach(item -> {
//            System.out.println(item);
//        });
//        HashMap<String, Integer> map = new HashMap<>();
//        map.put("One", 1);
//        map.put("Two", 2);
//        map.put("Three", 3);
//        map.put("Four", 4);
//        map.forEach((k, v) -> {
//            System.out.println("k:" + k + ",v:" + v);
//        });
        ArrayList<String> al = new ArrayList<String>();
        Collections.addAll(al, "3", "6", "2", "9", "4");
        //升序排序
        Collections.sort(al, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.parseInt(o1) - Integer.parseInt(o2);
            }
        });
        //降序排序
        Collections.sort(al, (String o1, String o2) -> Integer.parseInt(o2) - Integer.parseInt(o1));
        System.out.println(al);
    }
}
