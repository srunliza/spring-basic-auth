package co.hrd.springbasicauth.repository;


import co.hrd.springbasicauth.dto.CreateUserDto;
import co.hrd.springbasicauth.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface UserRepository {

    @Select("""
            INSERT INTO users (name, password, email, role)
            VALUES (#{user.name}, #{user.password}, #{user.email}, #{user.role})
            RETURNING *
            """)
    User save(@Param("user") CreateUserDto createUserDto);


    @Select("""
            SELECT * FROM users WHERE email = #{email}
            """)
    User findByEmail(String email);
}
