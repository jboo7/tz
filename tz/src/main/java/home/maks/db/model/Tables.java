/*
 * This file is generated by jOOQ.
*/
package home.maks.db.model;


import home.maks.db.model.tables.File;
import home.maks.db.model.tables.FileContent;
import home.maks.db.model.tables.FormStat;
import home.maks.db.model.tables.UserStat;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in TZ
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>TZ.FILE</code>.
     */
    public static final File FILE = home.maks.db.model.tables.File.FILE;

    /**
     * The table <code>TZ.FILE_CONTENT</code>.
     */
    public static final FileContent FILE_CONTENT = home.maks.db.model.tables.FileContent.FILE_CONTENT;

    /**
     * The table <code>TZ.FORM_STAT</code>.
     */
    public static final FormStat FORM_STAT = home.maks.db.model.tables.FormStat.FORM_STAT;

    /**
     * The table <code>TZ.USER_STAT</code>.
     */
    public static final UserStat USER_STAT = home.maks.db.model.tables.UserStat.USER_STAT;
}