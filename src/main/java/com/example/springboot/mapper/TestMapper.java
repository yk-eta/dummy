package com.example.springboot.mapper;

import com.example.springboot.dto.TestDto;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TestMapper {

    @Select("SELECT * FROM test")
    List<TestDto> list();

    @Select("SELECT * FROM test WHERE id = #{id}")
    TestDto get(@Param("id") int id);

    @Insert("INSERT INTO test(text) VALUES(#{text})")
    int create(@Param("text") String text);

    @Update("UPDATE test SET text = #{text} WHERE id = #{id}")
    int update(@Param("id") int id, @Param("text") String text);

    @Delete("DELETE FROM test WHERE id = #{id}")
    int delete(@Param("id") int id);
}
