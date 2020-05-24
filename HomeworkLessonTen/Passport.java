package HomeworkLessonTen;

public class Passport {

    String number;
    String series;

    public String getNumber(){
        return  number;
    }

    public String getSeries(){
        return series;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == this)
            return true;

        if (obj == null || obj.getClass() != this.getClass())
            return false;
        Passport other = (Passport) obj;
        return number == other.number && (series == other.series);


    }

    @Override
    public int hashCode (){
        final int prime = 17;
        int result = 1;
        result = prime * result + (series == null ? 0 : series.hashCode());
        result = prime * result + (number == null ? 0 :number.hashCode());
        return result;
    }
}


