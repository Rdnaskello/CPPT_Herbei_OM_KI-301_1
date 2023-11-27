package Lab3HerbeiKI301;

public class Main {
    public static void main(String[] args) {
        ExperimentalDog experimentalDog = new ExperimentalDog(new Head("gray")
                , new Body("gray", "42")
                , new Leg("gray", 32.1)
                , new Leg("gray", 32.3)
                , new Leg("gray", 31.8)
                , new Leg("gray", 32.0)
                , "Tuzik", "Sheepdog");

        experimentalDog.Bark();
        experimentalDog.Respond();
        System.out.println("\n\n" + experimentalDog);

        Head dogHead = new Head("brown");
        Body dogBody = new Body("brown", "medium");
        Leg frontRightLeg = new Leg("brown", 20.5);
        Leg backRightLeg = new Leg("brown", 20.3);
        Leg frontLeftLeg = new Leg("brown", 20.0);
        Leg backLeftLeg = new Leg("brown", 20.2);

        ExperimentalDog experimentalDog2 = new ExperimentalDog(dogHead, dogBody, frontRightLeg, backRightLeg, frontLeftLeg, backLeftLeg, "Bobik", "Golden Retriever");

        experimentalDog2.Respond();
        System.out.println("\nDog Details:\n" + experimentalDog2);
    }
}