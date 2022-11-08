package br.com.neki.demo.interfaces;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("qa")
public class QADatasourceConfig implements DatasourceConfig {
    @Override
    public String setup() {
        return "Setting up datasource for QA environment. ";
    }
}