import java.util.Scanner;
public class Calculator {
    int n =0;
    int total =0;
    char previousOperator =' ';
    boolean errorFlag = false;
    States currentState;


    public Calculator(){
        currentState = State0.instance();
    }
    int getTotal(){
        return  total;
    }
    int getN(){
        return n;
    }

    public char getPreviousOperator(){
        return previousOperator;
    }

    public void setN(int c){
        n = c;
    }
    void setTotal(int t){
        total = t;
    }

    void setPreviousOperator(char p){
        previousOperator = p;
    }

    void setCurrentState(States currState){
        currentState = currState;
    }
    public States getCurrentState(){
        return currentState;
    }
    public boolean getErrorFlag(){
        return errorFlag;
    }
    public void setErrorFlag(){
        errorFlag = true;
    }

    public void update(char c){
        currentState.update(c,this);
    }

    public static void main(String[] args){
        Calculator calculator = new Calculator();
        System.out.println("Enter values to calculate: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char inputArray[] =input.toCharArray();
        for(int i = 0; i<inputArray.length; i++){
            if(inputArray[i] == ' '){
                calculator.setErrorFlag();
            }
            calculator.update(inputArray[i]);
        }

        calculator.update(' ');

    }



}