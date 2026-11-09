class TestFactorial{
    public static void main(String[] args){
       try{
        if(Factorial.factorial(5) != 120){
            throw new AssertionError("Test failed: factorial(5) should be 120");
        }
        if(Factorial.factorial(0) != 1){
            throw new AssertionError("Test failed: factorial(0) should be 1");
        }
        System.out.println("All tests passed.");
        } catch(AssertionError e){
            System.err.println(e.getMessage());
        }
    }
}