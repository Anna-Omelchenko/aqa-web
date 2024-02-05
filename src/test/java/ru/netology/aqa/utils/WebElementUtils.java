package ru.netology.aqa.utils;

import org.openqa.selenium.WebElement;

import java.util.Arrays;

public class WebElementUtils {
    public static boolean hasClass(WebElement element, String className) {
        return Arrays.asList(element.getAttribute("class").split(" ")).contains(className);
    }
}
