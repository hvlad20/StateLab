package assignment;

public class Main {

    public static void main(String[] args) {
        ComandaMancare context = new ComandaMancare();
        context.nextState();
        context.nextState();

        ComandaPlasata startState = new ComandaPlasata();
        startState.updateState(context);

//
//        InCursDePreparare stopState = new InCursDePreparare();
//        stopState.updateState(context);

    }
}
