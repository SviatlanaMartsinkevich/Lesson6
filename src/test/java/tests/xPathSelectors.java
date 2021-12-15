package tests;

public class xPathSelectors {
    private static String absolutePath = "/html/body/div";

    //все элементы на странице начиная с html- тега
    private static String allElementsInHTMLPath = "//*";

    // поиск элемента по тегу
    private static String bodyPath = "//body";

    // поиск дочернего элемента относительно родителя
    private static String childPath = "//form/input";

    // поиск элемента с аттрибутом и его значением
    private static String tegWithAttrPath = "//span[@id='access--1']";

    // поиск родителя у элемента с аттрибутом и его значением
    private static String parentPath1 = "//span[@id='access--1']/..";
    private static String parentPath2 = "//*[@id='suite_mode_single']/parent::label";

    // поиск элемента по индексу
    private static String elementByIndexPath = "(//form)[4]";

    // поиск элемента по полному соответствию текста
    private static String searchByTextPath = "//*[text() = 'New Widget']";
    private static String searchByTextPath1 = "//*[. = 'New Widget']";

    // поиск элемента по подстроке в текста
    private static String searchBySubstringPath = "//*[contains(text(), 'New Widget')]";

    // поиск элемента по значению аттрибута, значение которого начинается с
    private static String searchByStartWithPath = "//input[starts-with(@type, 'hi')]";

    // исползование логического оператора
    private static String searchByTwoAttrPath = "//*[@class='form-control ' and @type='text']";

    // исползование логического оператора
    private static String searchBySpecificAttrPath = "//input[@type != 'hidden']";

    // Axes - Оси
    // Использование ancestor - все предки текущего узла
    private static String path1 = "//*[@id='suite_mode_single_baseline']/ancestor::div";

    // Использование ancestor - все предки текущего узла зависят от уровня
    private static String path2_1 = "//ul/child::span";
    private static String path2_2 = "//ul/span";  // аналог только проще


    // Использование descendant - все предки текущего узла не зависят от уровня
    private static String path3_1 = "//ul/descendant:span";
    private static String path3_2 = "//ul//span";  // аналог только проще

    //Использование following - Выбирает всё в документе после закрытия тэга текущего узла
    private static String path4_1 = "//label[@for='announcement']/following::form";
    private static String path4_2 = "(//label[@for=\"announcement\"]/following::div/*[@class='checkbox'])[1]";

    //Использование following-sibling - Выбирает все узлы одного уровня после текущего узла
    private static String path5_1 = "//label[@for=\"announcement\"]/following-sibling::div";


    //Использование preceding - Выбирает все узлы, которые появляются перед текущим узлом в документе
    private static String path6_1 = "//label[@for=\"announcement\"]/preceding::div";

    //Использование preceding-sibling - Выбирает все узлы одного уровня до текущего узла
    private static String path7_1 = "//label[@for=\"announcement\"]/preceding-sibling::div";
}

