package tests;

import org.openqa.selenium.By;

public class HomeWork_2 {
    String URL = "https://www.alfabank.by/";

    public void homework_2() {
        By classSelector = By.cssSelector(".dimmer js-dimmer");
        By classSelector1 = By.cssSelector("dimmer js-dimmer");

        By idSelector = By.cssSelector("#topmailru-code");
        By idSelector1 = By.cssSelector("topmailru-code");

        By tagSelector = By.cssSelector("title");
        By tagSelector1 = By.tagName("title");

        By tagAttributeSelector = By.cssSelector("script[charset='utf-8']");
        By tagAttributeSelector1 = By.cssSelector("script[charset]");

        By multipleClassesSelector = By.cssSelector(".notifications.js-notifications-box");

        By simpleHierarchicalClassesSelector = By.cssSelector(".symbol .style");

        By fullHierarchicalClassesSelector = By.cssSelector(".defs .symbol .style");

        By searchLikeContainsSelector = By.cssSelector("symbol[id*='dark']");
        By searchByWordSelector = By.cssSelector("symbol[id*='dark']");
        By valueStartFromSelector = By.cssSelector("div[class^='dimmer']");
        By valueEndsWithSelector = By.cssSelector("div[class$='bar']");

        By childRightAfterParentSelector = By.cssSelector("symbol>style");
        By elementRightAfterElementSelector = By.cssSelector("script+link");
        By elementOnTheSameLevelSelector = By.cssSelector("iframe~script");

        By firstChildSelector = By.cssSelector("header:first-child");
        By lastChildSelector = By.cssSelector("symbol:last-child");
        By nthChildFromBeginSelector = By.cssSelector("symbol:nth-child(2)");
        By nthChildFromEndSelector = By.cssSelector("symbol:nth-last-child(2)");
    }
}
