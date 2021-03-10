package rest.api.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import rest.api.domain.User;

@Repository
@Mapper
public interface UserMapper {
    User findAllUsers();
}
