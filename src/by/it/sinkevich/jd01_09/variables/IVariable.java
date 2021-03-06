package by.it.sinkevich.jd01_09.variables;

/**
 * Интерфейс для описания основных методов присущих любому типу переменной матлаб(скаляр, вектор либо матрица)
 *
 * @author Sinkevich Denis
 */
interface IVariable {
    /**
     * Метод который возвращает переменную в текстовом представлении
     *
     * @return Значение переменной типа {@code String}
     */
    String toString();

    /**
     * Метод переводит переменную из текстового вида в соответсвующий ей тип и устанавливает ей это значение
     *
     * @param strFrom Текстовое представление переменной
     */
    void setValue(String strFrom);

    /**
     * Возвращает текущее значение переменной
     *
     * @return Текущее значение переменной типа {@code MathLabVariable}
     */
    Object getValue();
}
