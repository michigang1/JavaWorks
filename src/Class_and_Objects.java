public class Class_and_Objects {

        public static void main(String[] args) {

            Person undef = new Person();
            undef.displayInfo();

            Person tom = new Person("Tom");
            tom.displayInfo();

            Person sam = new Person("Sam", 25);
            sam.displayInfo();
        }
    }
    // Для простоты и первой пробы классы оформлены в одном файле
    class Person{

        String name;    // имя
        int age;        // возраст
        Person()
        {
            this("Undefined", 18);
        }
        Person(String name)
        {
            this(name, 18);
        }
        Person(String name, int age)
        {
            this.name = name;
            this.age = age;
        }
         public void displayInfo(){
            System.out.printf("Name: %s \tAge: %d\n", name, age);
        }
    }

