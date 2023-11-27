package Lab2HerbeiKI301;
public class Dog {

    private Head head;
    private Body body;
    private Leg frontRightLeg;
    private Leg backRightLeg;
    private Leg frontLeftLeg;
    private Leg backLeftLeg;
    private String name;
    private String breed;
    private final Logger logger = Logger.getLogger("logs.txt");

    public Dog(Head head, Body body,
               Leg frontRightLeg, Leg backRightLeg,
               Leg frontLeftLeg, Leg backLeftLeg,
               String name, String breed) {
        this.head = head;
        this.body = body;
        this.frontRightLeg = frontRightLeg;
        this.backRightLeg = backRightLeg;
        this.frontLeftLeg = frontLeftLeg;
        this.backLeftLeg = backLeftLeg;
        this.name = name;
        this.breed = breed;
        logger.log(logger.infoFlag + "Dog constructor called");
    }


    public void Respond()
    {
        System.out.println("I am dog. My name is " + name + " and my breed is " + breed);
        Bark();
        logger.log(logger.infoFlag + "Dog Respond method was called");
    }


    public void Bark()
    {
        System.out.println("Gav-gav-gav rafff-rafff-raffff");
        logger.log(logger.infoFlag + "Dog bark method was called");
    }

    @Override
    public String toString() {
        return "Dog: \n" +
                "name = '" + name + '\'' + "\n" +
                "breed = '" + breed + '\'' + "\n" +
                "head = " + head + "\n" +
                "body = " + body +  "\n" +
                "frontRightLeg = " + frontRightLeg +  "\n" +
                "backRightLeg = " + backRightLeg +  "\n" +
                "frontLeftLeg = " + frontLeftLeg +  "\n" +
                "backLeftLeg = " + backLeftLeg;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Leg getFrontRightLeg() {
        return frontRightLeg;
    }

    public void setFrontRightLeg(Leg frontRightLeg) {
        this.frontRightLeg = frontRightLeg;
    }

    public Leg getBackRightLeg() {
        return backRightLeg;
    }

    public void setBackRightLeg(Leg backRightLeg) {
        this.backRightLeg = backRightLeg;
    }

    public Leg getFrontLeftLeg() {
        return frontLeftLeg;
    }

    public void setFrontLeftLeg(Leg frontLeftLeg) {
        this.frontLeftLeg = frontLeftLeg;
    }

    public Leg getBackLeftLeg() {
        return backLeftLeg;
    }

    public void setBackLeftLeg(Leg backLeftLeg) {
        this.backLeftLeg = backLeftLeg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

}


