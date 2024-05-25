package objektTenkikker.LF;

import java.util.function.BinaryOperator;

public class Core {
    
    public int performBinaryOperation(BinaryOperator<Integer> operator, int a, int b) {
        return operator.apply(a, b);
    }
}
