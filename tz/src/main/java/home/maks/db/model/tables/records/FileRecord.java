/*
 * This file is generated by jOOQ.
*/
package home.maks.db.model.tables.records;


import home.maks.db.model.tables.File;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


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
public class FileRecord extends UpdatableRecordImpl<FileRecord> implements Record3<Integer, String, Timestamp> {

    private static final long serialVersionUID = -1737228351;

    /**
     * Setter for <code>TZ.FILE.FILE_ID</code>.
     */
    public void setFileId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>TZ.FILE.FILE_ID</code>.
     */
    public Integer getFileId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>TZ.FILE.FILE_NAME</code>.
     */
    public void setFileName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>TZ.FILE.FILE_NAME</code>.
     */
    public String getFileName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>TZ.FILE.FILE_DATE</code>.
     */
    public void setFileDate(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>TZ.FILE.FILE_DATE</code>.
     */
    public Timestamp getFileDate() {
        return (Timestamp) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, Timestamp> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, Timestamp> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return File.FILE.FILE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return File.FILE.FILE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return File.FILE.FILE_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getFileId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getFileName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getFileDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getFileId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getFileName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getFileDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FileRecord value1(Integer value) {
        setFileId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FileRecord value2(String value) {
        setFileName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FileRecord value3(Timestamp value) {
        setFileDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FileRecord values(Integer value1, String value2, Timestamp value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FileRecord
     */
    public FileRecord() {
        super(File.FILE);
    }

    /**
     * Create a detached, initialised FileRecord
     */
    public FileRecord(Integer fileId, String fileName, Timestamp fileDate) {
        super(File.FILE);

        set(0, fileId);
        set(1, fileName);
        set(2, fileDate);
    }
}