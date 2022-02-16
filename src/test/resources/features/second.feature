Feature: Более сложный тест

  Scenario: Испльзование AND в Given
    Given открыт браузер
    * страница логина открыта

  Scenario: Простой тест со всеми ключевыми словами
    Given открыт браузер
    And страница логина открыта
    Then username field is displayed