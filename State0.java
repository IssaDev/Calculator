public class State0 extends States {
    private static State0 theState0;

    private State0() {
    }

    public  synchronized  static State0 instance(){
        if(theState0 == null){
            theState0 = new State0();
        }
        return theState0;
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
                calculator.setCurrentState(State1.instance(calculator,c));
                break;
            default:
                calculator.setCurrentState(ErrorState.instance(c));
                break;
        }

    }
}
