package nl.inergy.test.SQLLineage;

import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.statement.Statement;
import org.jooq.DSLContext;
import org.jooq.Parser;
import org.jooq.Query;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.jooq.impl.DefaultConfiguration;
import org.jooq.impl.DefaultConnectionProvider;
import org.jooq.impl.DefaultVisitListenerProvider;

import org.pentaho.di.core.KettleClientEnvironment;
import org.pentaho.di.core.KettleEnvironment;
import org.pentaho.di.core.NotePadMeta;
import org.pentaho.di.core.exception.KettleException;
import org.pentaho.di.job.JobHopMeta;
import org.pentaho.di.job.JobMeta;
import org.pentaho.di.job.entry.JobEntryCopy;

import java.util.Locale;
import java.util.Properties;

import static nl.inergy.test.tools.Tools.connection;
import static nl.inergy.test.tools.Tools.print;
import static nl.inergy.test.tools.Tools.properties;


public class Main {

    public static void main(String[] args) throws JSQLParserException, KettleException {
        Properties properties = properties();
        QueryParser listener = new QueryParser();
        DSLContext ctx = DSL.using(new DefaultConfiguration()
                .set(SQLDialect.POSTGRES)
                .set(new DefaultConnectionProvider(connection()))
                .set(new DefaultVisitListenerProvider(listener))
        );
        Parser p = ctx.parser();
        Query q = p.parseQuery("select max(a), min(b) " +
                "from (select a, b from c) s " +
                "group by s.a");
        print("***: " + q);
        print(q.getSQL());

        Query q2 = p.parseQuery("insert into tmp_table " +
                "select a, b from c");
        print("***: " + q2);
        print(q2.getSQL());

        Query q3 = p.parseQuery("delete from tmp_table " +
                "where timest > 123");
        print("***: " + q3);
        print(q3.getSQL());

        Statement stmt = CCJSqlParserUtil.parse("select max(a), min(b) " +
                "from (select a, b from c) s " +
                "group by s.a");
        print(stmt);

        Statement stmt2 = CCJSqlParserUtil.parse("insert into tmp_table " +
                "select a, b from c");
        print(stmt2);

        Statement stmt3 = CCJSqlParserUtil.parse("delete from tmp_table " +
                "where timest > 123");
        print(stmt3);

        KettleClientEnvironment.getInstance().setClient(KettleClientEnvironment.ClientType.OTHER);
        KettleEnvironment.init();
        JobMeta jobMeta = new JobMeta("/Users/rkooijman/Documents/Projects/HansAnders/trunk/4-Deployment/etl/scripts/pdi/ej_hourly.kjb", null, null);
        print(jobMeta.getDescription());
        for (NotePadMeta note : jobMeta.getNotes()) {
            if (note.getNote().toUpperCase(Locale.ROOT).startsWith("METADATA:"))
                print(note.getNote());
        }
        JobEntryCopy start = jobMeta.getStart();
        for (JobEntryCopy job : jobMeta.getJobCopies()) {
           print(job.getName());
           print(job.getDescription());
           print(job.getEntry().getReferencedObjectDescriptions());
        }
        for (JobHopMeta hop : jobMeta.getJobhops()) {
            print(hop.getFromEntry().getName() + " --> " + hop.getToEntry().getName());
        }
        print(jobMeta);
    }
}
