package HomeworkLessonTwentyThree.Lesson23;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class ParametrizationExcelBasic {

    public static ExcelReader excel = null;

    @Test(dataProvider="getData")
    public void testData(String login, String password, String is_correct){


        System.out.println(login+"---"+password+"---"+is_correct);

    }


    @DataProvider
    public static Object[][] getData(){
        if(excel == null){
            excel = new ExcelReader("/home/ulitosik/Documents/testngdata.xlsx");
        }

        String sheetName = "loginTest";
        int rows = excel.getRowCount(sheetName);
        int cols = excel.getColumnCount(sheetName);
        Object[][] data = new Object[rows-1][cols];
        //наполняем наш data данными из экселя
        for(int rowNum=2; rowNum<=rows; rowNum++){
            for(int colNum=0; colNum<cols; colNum++){
                //rowNum-2 дает 0 и это для того чтобы начать наполнять с data[0][0] строк и столбцов
                data[rowNum-2][colNum] = excel.getCellData(sheetName,colNum,rowNum);
            }
        }

        return data;



        //Результат выполнения

        /*

        olenka@mail.com---passwd---Y


        lena@gmail.com---pswd---N


                ===============================================
        Default Suite
        Total tests run: 2, Failures: 0, Skips: 0
                ===============================================


        Process finished with exit code 0


         */


    }
}
