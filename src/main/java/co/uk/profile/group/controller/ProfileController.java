package co.uk.profile.group.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ProfileController {

    @GetMapping(value="/profiles/1", produces = MediaType.APPLICATION_JSON_VALUE)
    public String test() {
        return "{\n" +
                "\t\"name\": \"Rhiannaa Singh\",\n" +
                "\t\"age\": 22,\n" +
                "\t\"dietaryRequirements\": [\"Vegitarian\", \"Vegan\", \"Gluten-Free\", \"Fish\", \"Eggs\"],\n" +
                "\t\"shoppingEssentials\": [\"Milk\", \"Beard\", \"Flour\", \"Fish\", \"Eggs\"],\n" +
                "\t\"profileImage\": \"www.linktoimage.com/images/profile/rhiannaa.jpeg\"\n" +
                "}";
    }
}
