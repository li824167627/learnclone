package common;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class ExcelData {
    int rows;
    int columns;

    /**
     * 获得excel表中的数据
     */
    public Object[][] getExcelData(String filepath,String fileName,String sheetName)throws IOException {
        
        ArrayList<String> arrkey = new ArrayList<String>();
        FileInputStream inputStream = new FileInputStream(new File(filepath + "\\" + fileName));
        Workbook Workbook = null;
        //获取文件扩展名
        String fileExtensionName = fileName.substring(fileName.indexOf("."));
        //判断是.xlsx还是.xls的文件并进行实例化
        if(fileExtensionName.equals(".xlsx")){
            Workbook = new XSSFWorkbook(inputStream);
        }
        else if(fileExtensionName.equals(".xls")){
            Workbook = new HSSFWorkbook(inputStream);
        }
        //通过sheetName生成Sheet对象
        Sheet Sheet = Workbook.getSheet(sheetName);

//        workbook = Workbook.getWorkbook(new File(getPath()));
//        sheet = workbook.getSheet(caseName);
        //行数
        rows = Sheet.getLastRowNum()-Sheet.getFirstRowNum()+1;
        //列数
        columns = Sheet.getRow(1).getLastCellNum();
        System.out.println(columns);
        // 为了返回值是Object[][],定义一个多行单列的二维数组
        LinkedHashMap<String, String>[][] arrmap = new LinkedHashMap[rows - 1][1];
        // 对数组中所有元素hashmap进行初始化
        if (rows > 1) {
            for (int i = 0; i < rows - 1; i++) {
                arrmap[i][0] = new LinkedHashMap<String, String>();
            }
        } else {
            System.out.println("excel中没有数据");
        }

        // 获得首行的列名，作为hashmap的key值
        for (int c = 0; c < columns; c++) {
            String cellvalue = Sheet.getRow(0).getCell(c).getStringCellValue();
            arrkey.add(cellvalue);
        }
        // 遍历所有的单元格的值添加到hashmap中
        for (int r = 1; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                String cellvalue = Sheet.getRow(r).getCell(c).getStringCellValue();
                if(cellvalue.equals("null")){
                    cellvalue="";
                }
                arrmap[r - 1][0].put(arrkey.get(c), cellvalue);
            }
        }
        return arrmap;
    }
}