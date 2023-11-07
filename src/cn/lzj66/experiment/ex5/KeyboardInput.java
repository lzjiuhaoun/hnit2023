package cn.lzj66.experiment.ex5;

import java.util.Scanner;

/**
 * Classcode: KeyboardInput
 * Package: cn.lzj66.experiment.ex5
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/11/7 15:03
 */
public class KeyboardInput {
    private static int score = 0;
    private static boolean isRunning = true;

    public static void main(String[] args) {
        Thread displayThread = new Thread(new DisplayThread());
        Thread inputThread = new Thread(new InputThread());

        displayThread.start();
        inputThread.start();

        try {
            displayThread.join();
            inputThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static class DisplayThread implements Runnable {
        private static final String[] characters = {"a", "b", "c", "d", "e"};
        private static int currentIndex = 0;

        @Override
        public void run() {
            while (isRunning) {
                synchronized (KeyboardInput.class) {
                    if (currentIndex >= characters.length) {
                        isRunning = false;
                        break;
                    }

                    System.out.println("显示的字符:" + characters[currentIndex]);
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                currentIndex++;
            }
        }
    }

    static class InputThread implements Runnable {
        @Override
        public void run() {
            Scanner scanner = new Scanner(System.in);
            String input;

            while (isRunning) {
                input = scanner.nextLine();

                if (input.equals("#")) {
                    isRunning = false;
                    break;
                }

                synchronized (KeyboardInput.class) {
                    if (DisplayThread.currentIndex < DisplayThread.characters.length) {
                        String currentCharacter = DisplayThread.characters[DisplayThread.currentIndex];
                        if (input.equals(currentCharacter)) {
                            score++;
                            System.out.println("\t\t输入对了，目前分数" + score);
                        }
                    }
                }
            }

            scanner.close();
        }
    }
}
