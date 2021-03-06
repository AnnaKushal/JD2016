package by.it.novik.jd01_09.operations;

import by.it.novik.jd01_09.entity.Variable;


/**
 * Created by Kate Novik.
 */
public class EqualOperations implements IEquality{
    /**
     * Метод равенства
     * @param nameVar Название переменной
     * @param value Значение переменной
     * @return true - имени переменной присвоено значение
     */
    @Override
    public boolean equality(String nameVar, Variable value) {
        if (!nameVar.isEmpty()) {
            value.saveByName(nameVar);
            return true;
        }
        return false;
    }
}
