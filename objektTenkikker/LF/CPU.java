package objektTenkikker.LF;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class CPU {
    
    private final Memory memory = new Memory();
    private final List<Program> programs = new ArrayList<>();
    private final List<Core> cores = new ArrayList<>();


    public CPU(int coreCount) {
        for (int i = 0; i < coreCount; i++) {
            cores.add(new Core());
        }
    }

    public void addProgram(Program program) {
        program.setProgramId(programs.size());
        programs.add(program);
        memory.addProgram();
    }

    public void runPrograms(){
        for (Program program : programs) {
            int coreIndex = 0;
            int operationIndex = 0;
            BinaryOperator<Integer> operation;

            while ((operation = program.getOperation(operationIndex)) != null) {
                int operand1 = program.getOperand();
                int operand2 = program.getOperand();
                int result = cores.get(coreIndex).performBinaryOperation(operation, operand1, operand2);

                memory.saveData(program.getProgramId(), result);
                coreIndex++;

                if (coreIndex >= cores.size()) {
                    coreIndex = 0;
                }
            }

            memory.finishProgram(program.getProgramId());
            program.update(memory);
        }
    }

    public static void main(String[] args) {
        CPU cpu = new CPU(4);

        Program program1 = new Program();
        Program program2 = new Program();
        Program program3 = new Program();

        cpu.addProgram(program1);
        cpu.addProgram(program2);
        cpu.addProgram(program3);

        cpu.runPrograms();
    }

}
