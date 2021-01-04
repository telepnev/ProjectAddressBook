package ru.telepnev.AddressBook;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class GroupDeletionTest {
        private WebDriver wd;


        @BeforeMethod(alwaysRun = true)
        public void setUp() {
            wd = new FirefoxDriver();
            wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }

        @Test
        public void testGroupDeletion() {
            wd.get("http://localhost/addressbook/index.php");
            wd.findElement(By.name("user")).click();
            wd.findElement(By.name("user")).clear();
            wd.findElement(By.name("user")).sendKeys("admin");
            wd.findElement(By.name("pass")).clear();
            wd.findElement(By.name("pass")).sendKeys("secret");
            wd.findElement(By.xpath("//input[@value='Login']")).click();
            wd.findElement(By.linkText("groups")).click();
            wd.findElement(By.name("selected[]")).click();
            wd.findElement(By.name("delete")).click();
            wd.findElement(By.linkText("group page")).click();
        }

        @AfterMethod(alwaysRun = true)
        public void tearDown() {
            wd.quit();
        }

        private boolean isElementPresent(By by) {
            try {
                wd.findElement(by);
                return true;
            } catch (NoSuchElementException e) {
                return false;
            }
        }

    }

