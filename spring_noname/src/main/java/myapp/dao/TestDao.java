package myapp.dao;

import myapp.dto.Dto;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TestDao {
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    public List<Dto> select() {
        return sqlSessionTemplate.selectList("sql.sel");
    }
}
