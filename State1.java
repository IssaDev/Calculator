public class State1 extends States {
    Calculator mainCal;
    public State1(Calculator calculator, char c) {
        super(calculator, c);
        mainCal = calculator;
        int n = Character.getNumericValue(c);
        mainCal.setN(n);
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
                calculator.setCurrentState(new State3(calculator,c));
                break;

            case '+':
            case '-':
                calculator.setCurrentState(new State2(calculator,c));
                break;
            case ' ':
                calculator.setCurrentState(new DoneState(calculator, c));
                break;
        }
        //super.update(c, calculator);
    }
}
