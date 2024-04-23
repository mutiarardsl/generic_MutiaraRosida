public class genericMain {
    public static void main(String[] args) {
        generic<String> stringgeneric = new generic<>();
        stringgeneric.add("tiara");
        System.out.println(stringgeneric.get());
    
        generic<Integer> integerBox = new generic<>();
        integerBox.add(23);
        System.out.println(integerBox.get());
      }
}
