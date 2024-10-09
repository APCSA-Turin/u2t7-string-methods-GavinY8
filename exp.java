public class exp {
    public static void main(String args[]) {
        String qwe = "qwerty";
        String wer = "tyuiopq";

        int index = wer.indexOf(qwe.substring(0, 1));
        System.out.println(index);
        
        if (index > -1) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
        System.out.println(qwe.substring(2,2+1) + qwe + qwe.substring(2,2+1));

    }
}
