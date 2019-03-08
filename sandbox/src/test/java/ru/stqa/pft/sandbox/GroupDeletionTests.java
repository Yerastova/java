package ru.stqa.pft.sandbox;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase{


    @Test
    public void testGroupDeletion() throws Exception {
        gotoGroupPage();
        selectGroup();
        deleteSelectedGroups();
        returnToGroupPage();
    }

}
