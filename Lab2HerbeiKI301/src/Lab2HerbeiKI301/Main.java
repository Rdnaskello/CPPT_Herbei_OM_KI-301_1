package Lab2HerbeiKI301;

public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog(new Head("gray")
                , new Body("gray", "42")
                , new Leg("gray", 32.1)
                , new Leg("gray", 32.3)
                , new Leg("gray", 31.8)
                , new Leg("gray", 32.0)
                , "Tuzik", "Sheepdog");

        dog1.Bark();
        dog1.Respond();
        System.out.println("\nDog Details:\n" + dog1);


        Head dogHead = new Head("brown");
        Body dogBody = new Body("brown", "medium");
        Leg frontRightLeg = new Leg("brown", 20.5);
        Leg backRightLeg = new Leg("brown", 20.3);
        Leg frontLeftLeg = new Leg("brown", 20.0);
        Leg backLeftLeg = new Leg("brown", 20.2);

        Dog myDog = new Dog(dogHead, dogBody, frontRightLeg, backRightLeg, frontLeftLeg, backLeftLeg, "Bobik", "Golden Retriever");

        myDog.Respond();
        System.out.println("\nDog Details:\n" + myDog);
    }
}
