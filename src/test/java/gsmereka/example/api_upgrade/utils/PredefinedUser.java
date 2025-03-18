package gsmereka.example.api_upgrade.utils;

import gsmereka.example.api_upgrade.controller.dto.*;
import gsmereka.example.api_upgrade.domain.model.User;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class PredefinedUser {
    public static UserDto createUserDto() {

        AccountDto accountDto = new AccountDto(1L, "1234", "Banco do Brasil", new BigDecimal(1000), new BigDecimal(2000));

        CardDto cardDto = new CardDto(1L, "1234", new BigDecimal(2000));

        FeatureDto feature1 = new FeatureDto(1L, "1234", "1234");
        FeatureDto feature2 = new FeatureDto(2L, "1234", "1234");
        FeatureDto feature3 = new FeatureDto(3L, "1234", "1234");
        List<FeatureDto> featureDtos = Arrays.asList(feature1, feature2, feature3);

        NewsDto news1 = new NewsDto(1L, "News 1", "Description of news 1");
        NewsDto news2 = new NewsDto(2L, "News 2", "Description of news 2");
        List<NewsDto> newsDtos = Arrays.asList(news1, news2);

        UserDto userDto = new UserDto(
                1L, // id
                "Gsmereka", // name
                accountDto, // account
                cardDto, // card
                featureDtos, // features
                newsDtos // news
        );

        return userDto;
    }
}
