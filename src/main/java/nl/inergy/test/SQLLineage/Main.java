package nl.inergy.test.SQLLineage;

import org.jooq.DSLContext;
import org.jooq.Parser;
import org.jooq.Query;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.jooq.impl.DefaultConfiguration;
import org.jooq.impl.DefaultConnectionProvider;
import org.jooq.impl.DefaultVisitListenerProvider;

import static nl.inergy.test.tools.Tools.*;


public class Main {

    public static void main(String[] args) {
        properties();
        QueryParser listener = new QueryParser();
        DSLContext ctx = DSL.using(new DefaultConfiguration()
                .set(SQLDialect.POSTGRES)
                .set(new DefaultConnectionProvider(connection()))
                .set(new DefaultVisitListenerProvider(listener))
        );
        Parser p = ctx.parser();
        Query q = p.parseQuery("select * from (select a, b from c) s");
        print(q.getSQL());
    }
}
