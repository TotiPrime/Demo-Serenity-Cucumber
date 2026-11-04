
package com.swag.pe.steps.validation;

import com.swag.pe.pages.validations.ValidationPage;
import net.serenitybdd.annotations.Step;
import java.time.Duration;

public class ValidationStep extends ValidationPage {

    @Step("Validar visualizacion del modulo de productos")
    public Boolean titleIsVisible() {
        lbl_product.withTimeoutOf(Duration.ofSeconds(10))
                   .waitUntilVisible();

        return lbl_product.isDisplayed();
    }

    @Step("Validar visualizacion del mensaje de error")
    public Boolean errorMessageIsDisplayed() {
        return lbl_errorMessage.isDisplayed();
    }
}
