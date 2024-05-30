package generators.model;

import java.util.UUID;

public class Human {

    /**
     * ID пользователя.
     */
    private final UUID id;
    /**
     * Имя пользователя.
     */
    private final String name;
    /**
     * Фамилия пользователя.
     */
    private final String surname;
    /**
     * Возраст пользователя.
     */
    private int age;

    /**
     * Конструктор для класса Human
     * @param id - ID пользователя.
     * @param name - Имя пользователя.
     * @param surname - Фамилия пользователя.
     * @param age - Возраст пользователя.
     */
    public Human(UUID id, String name, String surname, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }


    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Человек (uuid = %s, name = %s , surname = %s , age = %s)",id,name,surname,age);
    }
}
