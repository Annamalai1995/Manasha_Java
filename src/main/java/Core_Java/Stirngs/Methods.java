package Core_Java.Stirngs;

public class Methods {
    public static void main(String[] args) {
        //Literal
        String Name="Mansasha";
        //nOn literal
        String name= new String("Manasha");
        System.out.println("STring Data"+Name);
        System.out.println("String Values"+name);
        char Location[]={'s','a','l','e','m'};
        System.out.println("Location"+Location);

        //CharAt
        String COllege="Vinayaka Mission";
        System.out.println("CollegeName:"+COllege.charAt(3));

        //Concat
        String food="Pizza";
        String Food="Burger";
        System.out.println("Concatanation:"+food.concat(Food));
        System.out.println(food+Food);

        //Equals
        String bus="Volvo";
        String bus1="volvo";
        String bus2="Volvo";
        System.out.println(bus2.equals(bus1));
        System.out.println(bus2.equalsIgnoreCase(bus1));
        //Toupper
        System.out.println(bus.toUpperCase());
        //ToLower
        System.out.println(bus.toLowerCase());
        //Startwith
        String Place="Salem";
        System.out.println("Place start with:"+Place.startsWith("S"));
        //endwith
        System.out.println("Place start with:"+Place.endsWith("e"));
        //substring
        System.out.println("SubSTring:"+Place.substring(1,4));

        //Replace
        String verb="Knowelge is Power";
        String verb1=verb.replace("Power","better");
        System.out.println("Replace String :"+verb1);





    }
}
