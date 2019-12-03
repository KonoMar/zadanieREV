package pl.konopka.zadanie1;


import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping(value = "/{string}")
    String reverse(@PathVariable String string) {
        return StringUtils.reverse(string);
    }

    @GetMapping(value = "/{string}")
    boolean isMixedCase(@PathVariable String string) {
        return StringUtils.isMixedCase(string);
    }

    @GetMapping(value = "/{string}")
    boolean isUpperCase(@PathVariable String string) {
        return StringUtils.isAllUpperCase(string);
    }

    @GetMapping(value = "/{string}")
    boolean isLowerCaseCase(@PathVariable String string) {
        return StringUtils.isAllLowerCase(string);
    }
    @GetMapping(value = "/{string}")
    boolean isSpecialCase(@PathVariable String string) {
        return StringUtils.isAlpha(string) && StringUtils.isNumeric(string) && StringUtils.isWhitespace(string);
    }
}

