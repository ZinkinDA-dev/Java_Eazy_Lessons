import generators.HumanGenerator;
import generators.model.Human;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        /**
         * Получаем наш генератор.
         */
        HumanGenerator humanGenerator = new HumanGenerator();
        /**
         * С помощью функции generate генерируем столько людей сколько нам нужно.(В данном случае 5)
         */
        List<Human> humans = humanGenerator.generate(5);

        for (Human h:humans) {
            System.out.println(h);
        }
    }


}
