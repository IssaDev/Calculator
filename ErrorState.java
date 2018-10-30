public class ErrorState extends States {
    private static ErrorState error;
    private ErrorState(){

    }
    public static synchronized ErrorState instance(char c){
        if(error == null){
            error = new ErrorState();
        }
        System.out.println("Error has occurred, unexpected " + c + " found");
        return error;
    }

    @Override
    void update(char c, Calculator calculator) {

    }
}
