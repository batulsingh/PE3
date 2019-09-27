public class Ex8 {
    public static void main(String[] args) {
        try{
            String st = null;
            int[] arr2 = new int[4];
            int a = arr2[4];

            int[] arr1 = new int[-1];



            System.out.println(st);
        }
        catch (NullPointerException np){
            System.out.println("NullPointerException has occurred");
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch(NegativeArraySizeException ex){
            System.out.println(ex.getMessage());
        }
    }
}
