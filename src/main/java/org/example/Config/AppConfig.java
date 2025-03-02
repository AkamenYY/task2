package org.example.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //это конфигурационный класс
@ComponentScan(basePackages = "org.example")// говорим Springу сканировать весь пакет org.example
public class AppConfig {
}

