class PrintArrayElemsUsingFor {
    public static void main(String[] args) {
        String[] arr={"blue","red","black"};
        for(int i=0;i < arr.length;i++){
            System.out.println("Element "+ (i+1) +" : "+arr[i]);
        }
    }
}