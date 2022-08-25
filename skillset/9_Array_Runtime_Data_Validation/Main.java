class Main {
    public static void main(String args[]) {
        //call static void method
        Methods.getRequirements();
        int arraySize = 0;
        arraySize = Methods.validateArraySize();
        Methods.calculateNumbers(arraySize);
    }
}