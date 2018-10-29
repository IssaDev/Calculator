public class State0 extends States {
    Calculator mainCal;

    public State0(Calculator calculator, char c) {
        super(calculator, c);
        this.mainCal = calculator;
    }


    @Override
    public void update(char c, Calculator calculator) {
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
                calculator.setCurrentState(new State1(calculator,c));
                break;
        }
        super.update(c, calculator);
    }
}
