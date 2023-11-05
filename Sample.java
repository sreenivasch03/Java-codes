public class Sample
{
    String name;
    int age;
    String location;

    public Sample(String name,int age,String location)
    {
        this.name = name;
        this.age = age;
        this.location = location;
    }
    public void info()
    {
        System.out.println("Name      : "+name);
        System.out.println("Age       : "+age);
        System.out.println("Location  : "+location);
    }

    public static void main(String[]args)
    {
        Sample s = new Sample("Sreenivas",22,"Hyderabad");
        s.info();
    }
}