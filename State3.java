public class State3 extends  States {
    private static State3 theState3;

    private State3() {
    }

    public synchronized static State3 instance(Calculator calculator, char c){
        if(theState3 == null){
            theState3 = new State3();
        }
        int n = Character.getNumericValue(c);
        int mainN = calculator.getN();
        mainN = mainN *10 + n;
        calculator.setN(mainN);
        return theState3;
    }

    @Override
    void update(char c, Calculator calculator) {
        switch (c){
            case '+':
            case '-':
                calculator.setCurrentState(State2.instance(calculator,c));
                break;
            case ' ':
                if(calculator.getErrorFlag() == true){
                    calculator.setCurrentState(ErrorState.instance(c));
                }
                else {
                    calculator.setCurrentState(DoneState.instance(calculator, c));
                }
                break;
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
            case '0':
                //calculator.setN(c);
                calculator.setCurrentState(State3.instance(calculator,c));
                break;
            default:
                calculator.setCurrentState(ErrorState.instance(c));
                break;
        }
        //super.update(c, calculator);
    }
}
