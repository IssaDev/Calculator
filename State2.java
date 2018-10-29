public class State2 extends States {
    Calculator mainCal;

    public State2(Calculator calculator, char c) {
        super(calculator, c);
        this.mainCal = calculator;
        int mainTotal = mainCal.getTotal();
        int mainN = mainCal.getN();
        if(mainTotal == 0){
            mainCal.setTotal(mainN);
        }
        else {
            char prevOp = mainCal.getPreviousOperator();
            switch (prevOp){
                case '+':
                    mainTotal = mainTotal + mainN;
                    mainCal.setTotal(mainTotal);
                    break;
                case '-':
                    mainTotal = mainTotal - mainN;
                    mainCal.setTotal(mainTotal);
                    break;
            }
        }
        mainCal.setPreviousOperator(c);

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
                calculator.setCurrentState(new State1(calculator,c));
                break;
        }
        //super.update(c, calculator);
    }
}
