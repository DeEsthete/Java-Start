package file.dz;

public class Main {
    public static void main(String[] args) {
        FileWork<Person> personFileWork = new FileWork<>("fileDz.txt");
        Person person = new Person("Ivan", "Ivanov", "Ivanovich", 3);
        System.out.println("До сериализации:");
        System.out.println(person);
        personFileWork.write(person);
        person = personFileWork.read();
        System.out.println("После десериализации:");
        System.out.println(person);
    }
}