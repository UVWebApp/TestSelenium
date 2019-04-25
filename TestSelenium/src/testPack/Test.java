package testPack;

//Class Declaration
class Test {
 // Instance Variables
 String breed;
 String size;
 int age;
 String color;


 // method 1
 public String getInfo() {
     return ("Breed is: "+breed+" Size is:"+size+" Age is:"+age+" color is: "+color);
 }
 
 public static void main(String[] args) {
     Test maltese = new Test();
     maltese.breed="Maltese";
     maltese.size="Small";
     maltese.age=2;
     maltese.color="white";
     System.out.println(maltese.getInfo());
     
     //https://www.guru99.com/java-oops-class-objects.html
 }
}
