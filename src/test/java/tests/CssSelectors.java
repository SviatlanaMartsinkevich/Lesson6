package tests;

import org.openqa.selenium.By;

public class CssSelectors {
    private void cssSelectors() {
        By classSelector = By.cssSelector(".radio"); // поиск по классу radio
        By classSelector1 = By.className("radio"); // поиск по классу radio

        By idSelector = By.cssSelector("#suite_mode_single"); // поиск по классу по id
        By idSelector1 = By.id("suite_mode_single"); // поиск по классу по id

        By tagSelector = By.cssSelector("label"); // поиск по классу по тегу
        By tagSelector1 = By.tagName("label"); // поиск по классу по тегу

        By tagAttributeSelector = By.cssSelector("label[for='name']"); // поиск по классу по тегу и атрибуту с значением
        By tagAttributeSelector1 = By.cssSelector("label[for]"); // поиск по классу по тегу и присутствием атрибута

        By multipleClassesSelector = By.cssSelector(".column.overflow-content"); // поиск по двум классам в элементе

        By simpleHierarchicalClassesSelector = By.cssSelector(".table .content-inner"); // поиск простого дочернего элемента

        By fullHierarchicalClassesSelector = By.cssSelector("body .table .content-inner"); // использование трехуровневой иерархии для поиска дочернего элемента

        By searchLikeContainsSelector = By.cssSelector("form[action*='admin']"); // поиск с вхождением подстроки в значении аттрибута
        By searchByWordSelector = By.cssSelector("form[action~='admin']"); // поиск с вхождением слова в значении аттрибута
        By valueStartFromSelector = By.cssSelector("a[href^='https://']"); // поиск элемента с аттрибутом значение которого начинается с
        By valueEndsWithSelector = By.cssSelector("a[href$='@gmail.com']"); // поиск элемента с аттрибутом значение которое заканчивается на

        By childRightAfterParentSelector = By.cssSelector("ul>li"); // поиск дочернего элемента li у родителя ul
        By elementRightAfterElementSelector = By.cssSelector("#form+script"); // поиск элемента script, который идет за элементом id form на одном уровне
        By elementOnTheSameLevelSelector = By.cssSelector("#form~script"); // поиск элементов script, которым предшествует элемент #form

        By firstChildSelector = By.cssSelector(" li:first-child"); // поиск первого дочернего элемента
        By lastChildSelector = By.cssSelector(" li:last-child"); // поиск последнего дочернего элемента
        By nthChildFromBeginSelector = By.cssSelector("li:nth-child(2)"); // поиск н-го дочернего элемента с начала
        By nthChildFromEndSelector = By.cssSelector(" li:nth-last-child(2)"); // поиск н-го дечернего элемента с конца
    }
}
