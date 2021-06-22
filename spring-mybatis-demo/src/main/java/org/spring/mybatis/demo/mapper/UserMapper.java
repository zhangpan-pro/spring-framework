package org.spring.mybatis.demo.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.spring.mybatis.demo.entity.User;

public interface UserMapper {

	@Select("select * from user where id = #{id}")
	public User selectById(@Param("id") Long id);
}
