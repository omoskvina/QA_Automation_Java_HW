package HomeworklessonTwelve;

public class Panda extends Animal{
    public Panda(String name, String size, int legs, int eyes, boolean tail) {
        super(name, size, legs, eyes, tail);
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;

        if (obj == null || obj.getClass() != this.getClass())
            return false;
        Panda other = (Panda) obj;
        return (name == other.name) && (size == other.size) && (legs==other.legs) && (eyes==other.eyes) && (tail == other.tail);
    }


    @Override
    public int hashCode (){
        final int prime = 17;
        int result = 1;
        result = prime * result + (name == null ? 0 : name.hashCode());
        result = prime * result + (size == null ? 0 : size.hashCode());
        result = prime * result + legs;
        result = prime * result + eyes;
        result = prime * result + ( tail ? 1 : 0 );
        return result;
    }

    @Override
    public String toString() {
        return
                (name + " is a " + size + " animal  with " + legs + " legs, " + eyes + " eyes and " + (this.tail == false ? "no tail" : " a tail"));
    }
}
