package completed.pr18;

public class ThrowsDemo {
    public void getDetails(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
        }catch (NullPointerException e){
            System.out.println("Null key in getDetails");
        }
    }// do something with the key }
}