package tests;

public class HomeWorkXPathSelectors {

    String URL = "https://www.mts.by/";

    private static String absolutePath = "/html/body/div/header";

    private static String allElementsInHTMLPath = "//*";

    private static String bodyPath = "//title";

    private static String childPath = "//body/noscript";

    private static String tagWithAttrPath = "//div[@id='panel']";

    private static String parentPath1 = "//div[@id='bx_3218110189_45543']/..";
    private static String parentPath2 = "//*[@class='page-header__auth-apps']/parent::div";

    private static String elementByIndexPath = "(//a)[3]";

    private static String searchByTextPath = "//*[text()='Пополнить онлайн без комиссии']";
    private static String searchByTextPath1 = "//*[. = 'Пополнить онлайн без комиссии']";

    private static String searchBySubstringPath = "//*[contains(text(), 'положение')]";

    private static String searchByStartsWithPath = "//div[starts-with(@class, 'layo')]";

    private static String searchByTwoAttrPath = "//*[@type='button' and @style='min-width: 280px;']";

    private static String searchBySpecificAttrPath = "//p[@class != 'errors']";

    private static String path1 = "//*[@class = 'page-footer']/ancestor::div";

    private static String path2_1 = "//div/child::i";
    private static String path2_2 = "//div/i";

    private static String path3_1 = "//form/descendant::p";
    private static String path3_2 = "//form//p";

    private static String path4_1 = "//noscript/following::header";
    private static String path4_2 = "(//noscript/following::div[5]";

    private static String path5_1 = "//a/following-sibling::header";

    private static String path6_1 = "//noscript/preceding::head";

    private static String path7_1 = "//noscript/preceding-sibling::script[2]";
}

