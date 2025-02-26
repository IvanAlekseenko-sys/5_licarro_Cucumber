package ilcarro;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) // Говорит фреймворку какой класс использовать для запуска тестов.
@CucumberOptions // для настройки параметров выполнения тестов
        (       // Указывает путь к файлам .feature, которые содержат сценарии тестов.
                features = "C:\\Users\\Ivan\\AIT-TR\\5_licarro_Cucumber\\src\\test\\resources\\feauters",
                // Где находятся реализации шагов (методов), соответствующих сценариям в .feature файлах
                glue = "ilcarro.step_definitions",
                // Определяет, какие плагины будут использоваться для формирования отчётов.
                //      pretty: выводит шаги тестов в понятном для чтения формате в консоль.
                //      html:target/cucumber-reports: создаёт HTML-отчёт по результатам тестирования в папке target/cucumber-reports
                plugin = {"pretty", "html:target/cucumber-reports.html"},
                tags = "@Login or @InvalidPassword"
        )

public class TestRunner {
}
