package objektTenkikker.LF;

import java.util.ArrayList;
import java.util.List;

public class Memory {

    private final List<Integer> finishedPrograms = new ArrayList<>();
    private final List<List<Integer>> programMemory = new ArrayList<>();


    public void addProgram() {
        programMemory.add(new ArrayList<>());
    }

    public void saveData(int programId, int data) {
        programMemory.get(programId).add(data);
    }

    public void finishProgram(int programId) {
        finishedPrograms.add(programId);
    }

    public List<Integer> getData(int programId) {
        if (finishedPrograms.contains(programId)) {
            return new ArrayList<>(programMemory.get(programId));
        }
        return null;
    }
}
