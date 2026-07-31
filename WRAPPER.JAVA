public class Wrapper {
    public static void main(String[] args) {
        int a = 10;
        Integer i = Integer.valueOf(a);
        System.out.println(i);

        Integer j = new Integer(20);
        int b = j.intValue();
        System.out.println(b);

        String s = "30";
        int c = Integer.parseInt(s);
        System.out.println(c);

    }

    

   
}