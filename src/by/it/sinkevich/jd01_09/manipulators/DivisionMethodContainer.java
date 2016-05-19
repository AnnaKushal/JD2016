package by.it.sinkevich.jd01_09.manipulators;

import by.it.sinkevich.jd01_09.variables.MathLabFloat;
import by.it.sinkevich.jd01_09.variables.MathLabMatrix;
import by.it.sinkevich.jd01_09.variables.MathLabVariable;
import by.it.sinkevich.jd01_09.variables.MathLabVector;

/**
 * Created by Computer on 19.05.2016.
 *
 * @author Sinkevich Denis
 */
class DivisionMethodContainer {

    private static MathLabFloat division(MathLabFloat aFloat1, MathLabFloat aFloat2) {
        MathLabFloat result = new MathLabFloat();
        result.setValue(aFloat1.getValue() / aFloat2.getValue());
        return result;
    }

    private static MathLabVariable division(MathLabFloat aFloat, MathLabVector vector) {
        System.out.println("Деление числа на вектор невозможно!");
        return null;
    }

    private static MathLabVariable division(MathLabFloat aFloat, MathLabMatrix matrix) {
        System.out.println("Деление числа на матрицу невозможно!");
        return null;
    }

    private static MathLabVector division(MathLabVector vector, MathLabFloat aFloat) {
        Double[] result = vector.getValue();
        for (int i = 0; i < result.length; i++) {
            result[i] = result[i] / aFloat.getValue();
        }
        return new MathLabVector(result);
    }

    private static MathLabVariable division(MathLabVector vector1, MathLabVector vector2) {
        System.out.println("Деление вектора на вектор невозможно!");
        return null;
    }

    private static MathLabFloat division(MathLabVector vector, MathLabMatrix matrix) {
        System.out.println("Деление вектора на матрицу невозможно!");
        return null;
    }

    private static MathLabMatrix division(MathLabMatrix matrix, MathLabFloat aFloat) {
        Double[][] result = matrix.getValue();
        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[row].length; col++) {
                result[row][col] /= aFloat.getValue();
            }
        }
        return new MathLabMatrix(result);
    }

    private static MathLabVariable division(MathLabMatrix matrix, MathLabVector vector) {
        System.out.println("Деление матрицы на вектор невозможно!");
        return null;
    }

    private static MathLabVariable division(MathLabMatrix matrix1, MathLabMatrix matrix2) {
        System.out.println("Деление матрицы на матрицу невозможно!");
        return null;
    }

    static MathLabVariable division(MathLabVariable first, MathLabVariable second) {
        if (first instanceof MathLabFloat) {
            if (second instanceof MathLabFloat) {
                return division((MathLabFloat) first, (MathLabFloat) second);
            } else if (second instanceof MathLabVector) {
                return division((MathLabFloat) first, (MathLabVector) second);
            } else {
                return division((MathLabFloat) first, (MathLabMatrix) second);
            }
        } else if (first instanceof MathLabVector) {
            if (second instanceof MathLabFloat) {
                return division((MathLabVector) first, (MathLabFloat) second);
            } else if (second instanceof MathLabVector) {
                return division((MathLabVector) first, (MathLabVector) second);
            } else {
                return division((MathLabVector) first, (MathLabMatrix) second); //УЗНАТЬ ЕСТЬ ЛИ ТАКАЯ ОПЕРАЦИЯ
            }
        } else if (first instanceof MathLabMatrix) {
            if (second instanceof MathLabFloat) {
                return division((MathLabMatrix) first, (MathLabFloat) second);
            } else if (second instanceof MathLabVector) {
                return division((MathLabMatrix) first, (MathLabVector) second); //УЗНАТЬ ЕСТЬ ЛИ ТАКАЯ ОПЕРАЦИЯ
            } else if (second instanceof MathLabMatrix) {
                return division((MathLabMatrix) first, (MathLabMatrix) second);
            }
        }
        return null;
    }
}
