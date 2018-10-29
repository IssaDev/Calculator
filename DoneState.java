public class DoneState extends States {
    Calculator mainCal;

    public DoneState(Calculator calculator, char c) {
        super(calculator, c);
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
