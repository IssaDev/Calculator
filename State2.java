public class State2 extends States {
    private static State2 theState2;

    private State2() {
    }
    public synchronized static State2 instance(Calculator calculator, char c){
        if (theState2== null){
            theState2 = new State2();
        }
        int mainTotal = calculator.getTotal();
        int mainN = calculator.getN();
        if(mainTotal == 0){
            calculator.setTotal(mainN);
        }
        else {
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
        }
        calculator.setPreviousOperator(c);
        return theState2;
    }
    @Override
    void update(char c, Calculator calculator) {
        switch(c){
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                calculator.setCurrentState(State1.instance(calculator,c));
                break;
            case '0':
            case '+':
            case '-':
                calculator.setCurrentState(ErrorState.instance(c));
                break;
        }
        //super.update(c, calculator);
    }
}
