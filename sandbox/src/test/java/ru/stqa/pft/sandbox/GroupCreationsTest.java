package ru.stqa.pft.sandbox;


import org.testng.annotations.Test;

public class GroupCreationsTest extends TestBase{

    @Test
    public void testGroupCreation() throws Exception {
        gotoGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupData("test1", "test2", "test3"));
        submitGroupCreation();
        returnToGroupPage();
    }

}
