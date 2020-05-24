package HomeworkLessonTen;

public final class PersonalNumber {
    private static PersonalNumber instance;
    public String personalNumber;

    private PersonalNumber(String personalNumber) {
        this.personalNumber  = personalNumber;

    }

    public static PersonalNumber getInstance(String personalNumber) {
        if (instance == null) {
            instance = new PersonalNumber(personalNumber);
        }
        return instance;
    }
}
