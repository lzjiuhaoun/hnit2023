package cn.lzj66.experiment.ep4;

import java.io.*;
import java.util.*;

/**
 * ClassName: Demo1
 * Package: cn.lzj66.experiment.ep4
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/10/31 14:27
 */
public class Demo1 {

    public static void main(String[] args) {
//        jianSuo();
//        fenxi();
        tongji();
    }

    //实验1  检索简历
    public static void jianSuo() {
        String jianli = "姓名:张三 出生日期:1989.10.06 个人网站:http://lzj66.cn/welcome.jpg 身高:185 cm 体重:72 KG";
        String name = jianli.substring(jianli.indexOf("姓名:") + 3, jianli.indexOf("姓名:") + 4);
        System.out.println(name.equals("张") ? "简历中的姓名姓张" : "简历中的姓名不姓张");
        System.out.println(jianli.substring(jianli.indexOf("出生日期:") + 5, jianli.indexOf("出生日期:") + 15));
        System.out.println(jianli.substring(jianli.indexOf("个人网站:") + 5, jianli.indexOf("jpg") + 3));
        Integer height = Integer.valueOf(jianli.substring(jianli.indexOf("身高:") + 3, jianli.indexOf("身高:") + 6));
        System.out.println(height >= 180 ? "简历中的身高" + height + "cm大于或等于180cm" : "简历中的身高" + height + "cm小于180cm");
        Integer weight = Integer.valueOf(jianli.substring(jianli.indexOf("体重:") + 3, jianli.indexOf("体重:") + 5));
        System.out.println(weight >= 75 ? "简历中的体重" + weight + "KG大于或等于75KG" : "简历中的体重" + weight + "KG小于75KG");
    }

    //实验2  分析成绩单。
    public static void fenxi() {
        try (BufferedReader reader = new BufferedReader(new FileReader("D:\\SJX\\score.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\SJX\\scoreAnalysis.txt"));
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();// 去除行末尾的换行符
                int mathScore = Integer.parseInt(line.substring(line.indexOf("数学") + 2, line.indexOf("数学") + 4));
                int physicsScore = Integer.parseInt(line.substring(line.indexOf("物理") + 2, line.indexOf("物理") + 4));
                int englishScore = Integer.parseInt(line.substring(line.indexOf("英语") + 2, line.indexOf("英语") + 4));
                double totalScore = mathScore + physicsScore + englishScore;
                line += "  总分：" + totalScore;
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //实验3  统计英文单词
    public static void tongji() {
        try (Scanner scanner = new Scanner(new File("D:\\SJX\\I have a dream .txt"))) {
            Map<String, Integer> wordCountMap = new HashMap<>();
            int total = 0; //总单词数量（包括重复单词）
            int count = 0; //不同单词数量（不包括重复单词）
            while (scanner.hasNext()) {
                String word = scanner.next().toLowerCase();
                total++;
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
            //根据单词频率排序(使用stream流)
            List<Map.Entry<String, Integer>> wordList = new ArrayList<>(wordCountMap.entrySet());
            wordList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
            //输出结果
            System.out.println("共有" + total + "个英文单词");
            System.out.println("有" + count + "个互不相同的单词");
            System.out.println("按出现频率排序：");
            wordList.forEach(entry -> System.out.print(entry.getKey() + "：" + entry.getValue() + "\t"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}