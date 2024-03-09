package org.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class page_prev {
    public static String start(){
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ugrasu.ru/timetable/faculty/163");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        WebElement web = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div/div[2]/div[7]"));
        web.click();

        WebElement nextweek = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div/div[1]/div[1]"));
        nextweek.click();

        WebElement week = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div/div[1]/div[2]"));

        WebElement d1o1 = driver
                .findElement(By.xpath("//*[@id=\"dayWeek1\"]/div[2]"));

        WebElement d2o1 = driver
                .findElement(By.xpath("//*[@id=\"dayWeek2\"]/div[2]"));

        WebElement d3o1 = driver
                .findElement(By.xpath("//*[@id=\"dayWeek3\"]/div[2]"));

        WebElement d4o1 = driver
                .findElement(By.xpath("//*[@id=\"dayWeek4\"]/div[2]/div[2]/div/div[3]/div/div[1]/div"));
        WebElement d4o2 = driver
                .findElement(By.xpath("//*[@id=\"dayWeek4\"]/div[2]/div[3]/div/div[3]/div/div[1]/div"));
        WebElement d4o3 = driver
                .findElement(By.xpath("//*[@id=\"dayWeek4\"]/div[2]/div[4]/div/div[3]/div/div[1]/div"));

        WebElement d5o1 = driver
                .findElement(By.xpath("//*[@id=\"dayWeek5\"]/div[2]/div[2]/div/div[3]/div/div[1]/div"));
        WebElement d5o2 = driver
                .findElement(By.xpath("//*[@id=\"dayWeek5\"]/div[2]/div[3]/div/div[3]/div/div[1]/div"));
        WebElement d5o3 = driver
                .findElement(By.xpath("//*[@id=\"dayWeek5\"]/div[2]/div[4]/div/div[3]/div/div[1]/div"));

        WebElement d6o1 = driver
                .findElement(By.xpath("//*[@id=\"dayWeek6\"]/div[2]/div[2]/div/div[3]/div/div[1]/div"));
        WebElement d6o2 = driver
                .findElement(By.xpath("//*[@id=\"dayWeek6\"]/div[2]/div[3]/div/div[3]/div/div[1]/div"));
        WebElement d6o3 = driver
                .findElement(By.xpath("//*[@id=\"dayWeek6\"]/div[2]/div[4]/div/div[3]/div/div[1]/div"));
        String week3=
                "Расписание группы 1ИС10 \nНа " +week.getText()+
                        "\n\nПонедельник\n"
                        +d1o1.getText()+
                        "\n\nВторник\n"
                        +d2o1.getText()+
                        "\n\nСреда\n"
                        +d3o1.getText()+
                        "\n\nЧетверг\n" +
                        d4o1.getText()+"\n"+
                        d4o2.getText()+"\n"+
                        d4o3.getText()+"\n"+
                        "\nПятница\n" +
                        d5o1.getText()+"\n"+
                        d5o2.getText()+"\n"+
                        d5o3.getText()+"\n"+
                        "\nСуббота\n" +
                        d6o1.getText()+"\n"+
                        d6o2.getText()+"\n"+
                        d6o3.getText()+"\n";
        driver.quit();
        System.out.println(week3);
        return week3;
    }
}