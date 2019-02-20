package com.example.beatlsql.dao;

import com.example.beatlsql.model.Account;
import org.beetl.sql.core.annotatoin.SqlStatement;
import org.beetl.sql.core.mapper.BaseMapper;
import org.springframework.stereotype.Service;

@Service
public interface AccountDao extends BaseMapper<Account> {
    @SqlStatement(params = "name")
    Account selectAccountByName(String name);
}
