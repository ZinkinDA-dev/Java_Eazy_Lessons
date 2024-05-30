package generators;

import generators.interfaces.Generator;
import generators.model.Human;

import java.util.*;

public class HumanGenerator implements Generator<Human> {


    /*
         Класс random отвечает за генерацию рандомных значений.
     */
    private static final Random random = new Random();
    /*
        Список генерируемых имен, инициализация поля происходит в конструкторе класса.
     */
    private final String[] names;
    /*
        Список генерируемых фамилий, инициализация поля происходит в конструкторе класса.
     */
    private final String[] surnames;

    /**
     * Конструктор генератора
     */
    public HumanGenerator() {
        this.names = new String[]{
                "Dima","Sasha","Andrey","Artem","Ilya","Pasha","Boris","Ivan"
        };
        this.surnames = new String[]{
                "Zinkin","Shevcov","Ruchkin","Zidan","Curry","Lebron","Zukinav Ogli","Familia"
        };
    }

    /**
     * Метод генерации списка людей.
     * @param count - количество генерируемых данных
     * @return - список из людей размером count
     */
    @Override
    public List<Human> generate(int count) {
        List<Human> humans = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            int indexName = Math.abs(random.nextInt() % names.length);
            int indexSurname = Math.abs(random.nextInt() % names.length);

            humans.add(
                    HumanFactory.get(
                            names[indexName],
                            surnames[indexSurname],
                            random.nextInt(100)
                    )
            );
        }
        return humans;
    }

    /**
     * Локальная фабрика людей.
     * Она доступна только в этом классе.
     */
    private static class HumanFactory {
        /**
         * Приватный конструктор фабрики.
         */
        private HumanFactory(){

        }

        /**
         * Метод генерации человека.
         * @param name - Имя
         * @param surname - Фамилия
         * @param age - Возраст
         * @return - Человек с указанным именем, фамилией и возрастом. ID генерируется автоматически.
         */
        public static Human get(String name,String surname,int age){
            return new Human(
                    UUID.randomUUID(),
                    name,
                    surname,
                    age
            );
        }
    }

}
