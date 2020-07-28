package com.ar.qmeq.repository.dialects;

import com.vladmihalcea.hibernate.type.json.JsonNodeBinaryType;

import java.sql.Types;

public class PostgresJsonDialect extends org.hibernate.dialect.PostgreSQL10Dialect {
    public PostgresJsonDialect() {
        super();
        this.registerHibernateType(
                Types.OTHER, JsonNodeBinaryType.class.getName()
        );
    }
}

