package com.Optimart.configuration.Mapper;
import com.Optimart.dto.Auth.ChangeUserInfo;
import com.Optimart.models.User;
import com.Optimart.responses.Auth.UserLoginResponse;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfiguration {
    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        modelMapper.typeMap(User.class, UserLoginResponse.class)
                .addMappings(mapper -> mapper.map(User::getUsername, UserLoginResponse::setUserName));
        modelMapper.typeMap(ChangeUserInfo.class, User.class).addMappings(mapper -> {
            mapper.map(ChangeUserInfo::getFirstName, User::setFirstName);
            mapper.map(ChangeUserInfo::getMiddleName, User::setMiddleName);
            mapper.map(ChangeUserInfo::getLastName, User::setLastName);
        });
        return modelMapper;
    }
}
