public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog( new String[]{"voice", "sleep"},Color.GRAY,new Shelter("slopy","chue 37"));
        Dog dog2 = new Dog("Germany", "Spike", Color.BLACK, new Shelter("this is a name ", "this could be a street"));

	                                                                        /* ⬆ as long as shelter is a class, we have to
                                                                                 create it right in here*/

        Dog dog3 = new Dog("German Shepherd", "Rex", new String[]{"sit", "smell", "eat"}, Color.BROWN, new Shelter("cozy", "warm place"));

                                                                    /* ⬆ the way of creating new array right in the constructor */

        System.out.println(dog3.getInfo());
        System.out.println(dog2.getInfo());
        System.out.println(dog.getInfo());



        dog.makeVoice("raph");
        dog.makeVoice(4, "gaff");
        dog.makeVoice("gaffff", 3);
    }
}
