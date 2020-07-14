package vip.mate.gateway.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import vip.mate.core.common.props.MateRequestProperties;

@Configuration
@EnableConfigurationProperties({MateRequestProperties.class})
public class PreRequestConfig {
}
