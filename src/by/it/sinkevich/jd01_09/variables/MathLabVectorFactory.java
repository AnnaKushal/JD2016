package by.it.sinkevich.jd01_09.variables;

/**
 * Created by Computer on 23.06.2016.
 *
 * @author Sinkevich Denis
 */
public class MathLabVectorFactory extends VariableFactory {

    @Override
    public MathLabVariable getVariable() {
        return new MathLabVector();
    }

    @Override
    public MathLabVariable getVariable(String variable) {
        return new MathLabVector(variable);
    }
}
