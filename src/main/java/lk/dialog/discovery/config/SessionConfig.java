package lk.dialog.discovery.config;

import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.session.web.context.AbstractHttpSessionApplicationInitializer;

/**
 * @Author DILAN on 2018-03-19
 */
@EnableRedisHttpSession
public class SessionConfig extends AbstractHttpSessionApplicationInitializer {
}
