/*
 * This file is generated by jOOQ.
*/
package home.maks.db.model.tables;


import home.maks.db.model.Keys;
import home.maks.db.model.Tz;
import home.maks.db.model.tables.records.FileRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class File extends TableImpl<FileRecord> {

    private static final long serialVersionUID = -611437666;

    /**
     * The reference instance of <code>TZ.FILE</code>
     */
    public static final File FILE = new File();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FileRecord> getRecordType() {
        return FileRecord.class;
    }

    /**
     * The column <code>TZ.FILE.FILE_ID</code>.
     */
    public final TableField<FileRecord, Integer> FILE_ID = createField("FILE_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>TZ.FILE.FILE_NAME</code>.
     */
    public final TableField<FileRecord, String> FILE_NAME = createField("FILE_NAME", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>TZ.FILE.FILE_DATE</code>.
     */
    public final TableField<FileRecord, Timestamp> FILE_DATE = createField("FILE_DATE", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>TZ.FILE</code> table reference
     */
    public File() {
        this(DSL.name("FILE"), null);
    }

    /**
     * Create an aliased <code>TZ.FILE</code> table reference
     */
    public File(String alias) {
        this(DSL.name(alias), FILE);
    }

    /**
     * Create an aliased <code>TZ.FILE</code> table reference
     */
    public File(Name alias) {
        this(alias, FILE);
    }

    private File(Name alias, Table<FileRecord> aliased) {
        this(alias, aliased, null);
    }

    private File(Name alias, Table<FileRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Tz.TZ;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<FileRecord, Integer> getIdentity() {
        return Keys.IDENTITY_FILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FileRecord> getPrimaryKey() {
        return Keys.PK_FILE_FILEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FileRecord>> getKeys() {
        return Arrays.<UniqueKey<FileRecord>>asList(Keys.PK_FILE_FILEID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public File as(String alias) {
        return new File(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public File as(Name alias) {
        return new File(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public File rename(String name) {
        return new File(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public File rename(Name name) {
        return new File(name, null);
    }
}
