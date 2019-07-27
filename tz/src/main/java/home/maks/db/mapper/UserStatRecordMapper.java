package home.maks.db.mapper;

import home.maks.db.model.Tables;
import home.maks.db.model.tables.records.UserStatRecord;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public final class UserStatRecordMapper implements RowMapper<UserStatRecord> {
    @Override
    public UserStatRecord mapRow(ResultSet resultSet, int i) throws SQLException {
        UserStatRecord userStatRecord = new UserStatRecord();
        userStatRecord.setFileId(resultSet.getInt(Tables.USER_STAT.FILE_ID.getName()));
        userStatRecord.setSeqId(resultSet.getInt(Tables.USER_STAT.SEQ_ID.getName()));
        userStatRecord.setSsoid(resultSet.getString(Tables.USER_STAT.SSOID.getName()));
        userStatRecord.setFormid(resultSet.getString(Tables.USER_STAT.FORMID.getName()));
        return userStatRecord;
    }
}
