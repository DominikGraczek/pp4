package pl.dgraczek.ecommerce.catalog.playground;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;


@SpringBootTest
public class JdbcPlaygroundTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    void selectMyNameViaDB() {
        var currentdate = jdbcTemplate.queryForObject("select now() my_date", String.class);
        assert currentdate.contains("2024");
    }
}