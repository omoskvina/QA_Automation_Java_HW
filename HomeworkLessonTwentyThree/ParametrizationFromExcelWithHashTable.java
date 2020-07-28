package HomeworkLessonTwentyThree.Lesson23;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Hashtable;

public class ParametrizationFromExcelWithHashTable {

    public static ExcelReader excel = null;


    @Test(dataProvider="getData")
    public void testData(Hashtable<String,String> data){


        System.out.println(data.get("login")+"---"+data.get("password")+"---"+data.get("is_correct")+"---"+data.get("age")+"---"+data.get("role"));

    }

    //Hashtable


    @DataProvider
    public static Object[][] getData(){


        if(excel == null){


            excel = new ExcelReader("/home/ulitosik/Documents/testngdatalong.xlsx");


        }

        String sheetName="loginTest";
        int rows = excel.getRowCount(sheetName);
        int cols = excel.getColumnCount(sheetName);

        Object[][] data = new Object[rows-1][1];

        Hashtable<String,String> table = null;

        for(int rowNum=2; rowNum<=rows; rowNum++){

            table = new Hashtable<String,String>();

            for(int colNum=0; colNum<cols; colNum++){

                //	data[rowNum-2][colNum]=	excel.getCellData(sheetName, colNum, rowNum);

                table.put(excel.getCellData(sheetName, colNum, 1), excel.getCellData(sheetName, colNum, rowNum));
                data[rowNum-2][0]=table;

            }

        }


        return data;

        //Результат выполнения
        /*
        olenka@mail.com---passwd---Y---21.0---admin


        lena@gmail.com---pswd---N---25.0---user_A


                ===============================================
        Default Suite
        Total tests run: 2, Failures: 0, Skips: 0
                ===============================================


        Process finished with exit code 0

         */
    }
}
