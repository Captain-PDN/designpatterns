class Pigeon {
    private static int count = 0;
    void coo(){
        System.out.print("coo ");
        count++;
        if (count == 2){
            System.out.println();
            count = 0;
        }
    }
}
