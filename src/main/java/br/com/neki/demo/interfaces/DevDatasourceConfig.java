package br.com.neki.demo.interfaces;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevDatasourceConfig implements DatasourceConfig {
    @Override
    public String setup() {
        return "Setting up datasource for DEV environment. ";
    }
}