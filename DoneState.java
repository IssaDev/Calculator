public class DoneState extends States {
    private static DoneState weDone;

    private DoneState() {
    }
    public synchronized static DoneState instance(Calculator calculator, char c){
        if (weDone== null){
            weDone = new DoneState();
        }
        int mainTotal = calculator.getTotal();
        int mainN = calculator.getN();
        char prevOp = calculator.getPreviousOperator();
        switch (prevOp){
            case '+':
                mainTotal = mainTotal + mainN;
                calculator.setTotal(mainTotal);
                break;
                case '-':
                    mainTotal = mainTotal - mainN;
                    calculator.setTotal(mainTotal);
                    break;
            }
        System.out.println("your total is " + mainTotal);
        return weDone;
    }

    @Override
    void update(char c, Calculator calculator) {
        int mainTotal = calculator.getTotal();
        int mainN = calculator.getN();
        char prevOp = calculator.getPreviousOperator();
        switch (prevOp){
            case '+':
                mainTotal = mainTotal + mainN;
                calculator.setTotal(mainTotal);
                break;
                case '-':
                    mainTotal = mainTotal - mainN;
                    calculator.setTotal(mainTotal);
                    break;
            }
        System.out.println("your total is " + mainTotal);
        super.update(c, calculator);
    }
}
