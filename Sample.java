public class Sample
{
    String name;
    int age;
    String location;
    int percentage;

    public Sample(String name,int age,String location,int percentage)
    {
        this.name = name;
        this.age = age;
        this.location = location;
        this.percentage =
    }
    public void info()
    {
        System.out.println("Name      : "+name);
        System.out.println("Age       : "+age);
        System.out.println("Location  : "+location);
    }

    public static void main(String[]args)
    {
        Sample s = new Sample("Sreenivas",22,"Hyderabad",75);
        s.info();
    }
}