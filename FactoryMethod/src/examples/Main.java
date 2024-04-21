package examples;

public class Main {
    public static void main(String[] args) {

        PersonFactory personFactory = new PersonFactory();
        IPerson ruralPerson = personFactory.getPerson(PersonType.Rural);
        System.out.println("Rural person: " + ruralPerson.getName());
        IPerson urbanPerson = personFactory.getPerson(PersonType.Urban);
        System.out.println("Urban person: " + urbanPerson.getName());


        ProductAbstractFactory phoneFactory = new PhoneConcreteFactory();
        ProductAbstractFactory tabletFactory = new TabletConcreteFactory();
        
        
        IProduct phone = phoneFactory.getObject();
        IProduct tablet = tabletFactory.getObject();
        System.out.println("Phone name: " + phone.getName());
        System.out.println("Phone price: $" + phone.getPrice());
        System.out.println("Phone Color: " + phone.getColor());
        
        System.out.println("Tablet name: " + tablet.getName());
        System.out.println("Tablet price: $" + tablet.getPrice());
        System.out.println("Tablet Color: " + tablet.getColor());
    }
}
