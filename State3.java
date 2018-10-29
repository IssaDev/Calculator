public class State3 extends  States {
    Calculator mainCal;

    public State3(Calculator calculator, char c) {
        super(calculator, c);
        this.mainCal = calculator;
        int n = Character.getNumericValue(c);
        int mainN = mainCal.getN();
        mainN = mainN *10 + n;
        mainCal.setN(mainN);
    }

    @Override
    void update(char c, Calculator calculator) {
        switch (c){
            case '+':
            case '-':
                calculator.setCurrentState(new State2(calculator,c));
                break;
            case ' ':
                calculator.setCurrentState(new DoneState(calculator, c));
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
                calculator.setCurrentState(new State3(calculator,c));
                break;
        }
        //super.update(c, calculator);
    }
}
