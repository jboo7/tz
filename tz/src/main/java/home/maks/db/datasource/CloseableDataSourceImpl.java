package home.maks.db.datasource;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.logging.Logger;

public final class CloseableDataSourceImpl<D extends DataSource> implements CloseableDataSource {
    private final D dataSource;
    private final Optional<Consumer<D>> closingConsumer;

    public CloseableDataSourceImpl(D dataSource, Consumer<D> closingConsumer) {
        this.dataSource = Objects.requireNonNull(dataSource, "DataSource cannot be null");
        this.closingConsumer = Optional.ofNullable(closingConsumer);
    }

    public CloseableDataSourceImpl(D dataSource) {
        this(dataSource, null);
    }

    @Override
    public Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        return dataSource.getConnection(username, password);
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return dataSource.unwrap(iface);
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return dataSource.isWrapperFor(iface);
    }

    @Override
    public PrintWriter getLogWriter() throws SQLException {
        return dataSource.getLogWriter();
    }

    @Override
    public void setLogWriter(PrintWriter out) throws SQLException {
        dataSource.setLogWriter(out);
    }

    @Override
    public void setLoginTimeout(int seconds) throws SQLException {
        dataSource.setLoginTimeout(seconds);
    }

    @Override
    public int getLoginTimeout() throws SQLException {
        return dataSource.getLoginTimeout();
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return dataSource.getParentLogger();
    }


    @Override
    public void close() {
        closingConsumer
                .ifPresent(c -> c.accept(dataSource));
    }
}
