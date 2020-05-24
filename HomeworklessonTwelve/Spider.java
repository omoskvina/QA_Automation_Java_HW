package HomeworklessonTwelve;

public class Spider extends Animal {

    public Spider(String name, String size, int legs, int eyes, boolean tail) {
        super(name, size, legs, eyes, tail);

    }

    @Override
    public String toString() {
        return
                (name + " is a " + size + " animal  with " + legs + " legs, " + eyes + " eyes and " + (this.tail == false ? "no tail" : " a tail"));
    }

}
