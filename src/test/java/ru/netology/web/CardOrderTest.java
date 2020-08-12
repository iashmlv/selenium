package ru.netology.web;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CardOrderTest {
    @Test
    void orderDateTest() {
        open("http://localhost:9999");
        $("[data-test-id=name] input").setValue("Ваня");
        $("[data-test-id=phone] input").setValue("+79997680000");
        $("[data-test-id=agreement]").click();
        $("button.button.button_view_extra.button_size_m.button_theme_alfa-on-white").click();
        $("[data-test-id=order-success]").shouldHave(text("Ваша заявка успешно отправлена!"));

    }
}
