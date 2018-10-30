public class State1 extends States {
    private static State1 theState1;
    private State1() {
    }

    public synchronized static State1 instance(Calculator calculator, char c){
        if (theState1== null){
            theState1 = new State1();
        }
        int n = Character.getNumericValue(c);
        calculator.setN(n);
        return theState1;
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
            case '0':
                //calculator.setN(c);
                calculator.setCurrentState(State3.instance(calculator,c));
                break;

            case '+':
            case '-':
                calculator.setCurrentState(State2.instance(calculator,c));
                break;
            case ' ':
                calculator.setCurrentState(DoneState.instance(calculator, c));
                break;
            default:
                calculator.setCurrentState(ErrorState.instance(c));
                break;
        }
        //super.update(c, calculator);
    }
}
