package objektTenkikker.LF;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.function.BinaryOperator;

public class Program {
    
    private List<BinaryOperator<Integer>> operations = new ArrayList<>();
    private Stack<Integer> stack = new Stack<>(); // 
    private int programId;
    private boolean isDone = false;

    public Program() {
        operations.add((a, b) -> a + b);
        operations.add((a, b) -> a - b);
        operations.add((a, b) -> a * b);
        operations.add((a, b) -> a / b);
        operations.add(null); // Special halt operation

        stack.push(1);
        stack.push(2);

        stack.push(6);
        stack.push(3);

        stack.push(2);
        stack.push(4);

        stack.push(3);
        stack.push(2);
    }

    public BinaryOperator<Integer> getOperation(int index) {
        if (isDone) {
            return null;
        }
        if (index >= operations.size()) {
            isDone = true;
            return null;
        }

        return operations.get(index);
    }

    public int getOperand() {
        if (stack.isEmpty()) {
            isDone = true;
            return 0;
        }
        return stack.pop();
    }

    /* 
     * This method should make the program check the memory for data
     * And if there is data for it, the program should remove itself
     * from the cpu
     */
    public void update(Memory memory){
        // TODO: Implement this method 
        List<Integer> data = memory.getData(programId);

        if (data != null) {
            System.out.println("Program " + programId + " got data: " + data);
        }
        System.out.println("Program " + programId + " is done");
    }

    public void setProgramId(int programId) {
        this.programId = programId;
    }

    public int getProgramId() {
        return programId;
    }
    
}
