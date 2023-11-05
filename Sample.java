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
<<<<<<< HEAD
        Sample s = new Sample("Sreenivas",20,"Hyderabad");
=======
        Sample s = new Sample("Sreenivas",22,"Hyderabad",85);
>>>>>>> 30777b1c602c7be5fe5368d7c807304669a5c60a
        s.info();
    }
}