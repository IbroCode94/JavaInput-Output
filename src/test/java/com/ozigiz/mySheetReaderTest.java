package com.ozigiz;

import com.ozigiz.models.Mall;
import com.ozigiz.models.mySheetReader;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class mySheetReaderTest {


    @Test
    void productList() {
        Mall mall1 = new Mall("Target");
        mySheetReader sheetReader = new mySheetReader(mall1);

        sheetReader.productList("src/main/resources/resources/Utilities/Book.xlsx");
        assertEquals(6, mall1.getProducts().size());
    }
}