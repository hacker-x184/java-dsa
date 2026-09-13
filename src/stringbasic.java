public class stringbasic {
    public static void main(String[] args) {
        String firstName = "Mohd";
        String lastName = "Inzamam";
        String fullName = "Mohd Inzamam";
        System.out.println(firstName + " "+ lastName);
        System.out.println(firstName.length());
        System.out.println(firstName.charAt(2));
        System.out.println(lastName.charAt(2));
        // Accesing The All String Character USeing loops
        for (int ch = 0;ch<fullName.length();ch++){
            System.out.println(fullName.charAt(ch));
        }
        String name1 = "Luffy";
        String name2 = "luffy";
        System.out.println("Compre using the == Operator");
        if (name1 == name2){
            System.out.println("Both string are equal");
        }
        else{
            System.out.println("Both string are not equal");
        }
        
        System.out.println("Compre using the .equal Operator");
        if (name1.equals(name2)){
            System.out.println("Both string are equal");
        }
        else{
            System.out.println("Both string are not equal");
        }
        
        System.out.println("Compre using the .equalignorecase Operator");
        if (name1.equalsIgnoreCase(name2)){
            System.out.println("Both string are equal");
        }
        else{
            System.out.println("Both string are not equal");
        }
        String str = "             ";
        System.out.println(str.length());
        System.out.println(str.isEmpty());
        System.out.println(str.isBlank());
        String naem = "      Zoro  ";
        System.out.println(naem.length());
        naem = naem.trim();
        System.out.println(naem.length());
        System.out.println(naem.toUpperCase());
        System.out.println(naem.toLowerCase());
        String val = "Sanji is the one of the Best Charater";
        System.out.println(val.substring(0,5));
        String name = "Sanji";
        System.out.println(val.contains(name));


        
    }
}
