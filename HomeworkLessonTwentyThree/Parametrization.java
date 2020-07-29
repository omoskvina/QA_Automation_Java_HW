package HomeworkLessonTwentyThree;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Parametrization {


    @Test(dataProvider = "getData")
    public void doLogin(String username, String password){
        System.out.println(username + "-----" + password);
    }


    @DataProvider
    public Object[][] getData(){
        Object[][] data = new Object[3][2];

        data[0][0] = "test1@test.com";
        data[0][1] = "passwd1";

        data[1][0]= "test2@test.com";
        data[1][1] = "passwd2";

        data[2][0]= "test3@test.com";
        data[2][1] = "passwd3";

        return data;
    }

}
