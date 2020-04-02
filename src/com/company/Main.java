import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

//    1) сделать fork
//    https://github.com/akadatsky/GithubPullRequestDemo
//    2) Попрактиковаться со StreamApi и послать PullRequest
//    3) Создать ISSUE в этом репозитории когда отправить пулл реквест
//    В качестве ответа на задание прислать ссылку на issue


    private static final int SIZE = 100;
    private static final int MIN = 0;
    private static final int MAX = 50;

    public static void main(String[] args) {

        Random random = new Random();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < SIZE; i++) {
            list.add(Integer.toString(random.nextInt(SIZE)));
        }

        int[] array = list.stream()
                .mapToInt(Integer::parseInt)
                .filter((i) -> (i >= MIN && i <= MAX))
                .distinct()
                .sorted()
                .toArray();
        System.out.println("Size = " + array.length);
        System.out.println(Arrays.toString(array));
        double avg = list.stream().mapToInt(Integer::parseInt).average().getAsDouble();
        System.out.println("Average is " + avg);
    }


}
