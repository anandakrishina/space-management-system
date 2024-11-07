package ifto.projeto.space_management_system.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("helloworld") //Define que as requisições para URLs que começam com /helloworld serão tratadas por esta classe.
public class ManagementController { //Esta classe foi criada para ser um controlador que gerencia solicitações HTTP relacionadas à URL base definida (/helloworld).



    @GetMapping("/hello") //Mapeia solicitações HTTP GET para o caminho /helloworld/hello.
    public String hello() {
        return "<div style='font-family: Arial, sans-serif; text-align: center; padding: 20px;'>"
                + "<h1 style='color: #4C9666;'>Olá! Bem-vindo ao Sistema de Gestão de Espaços</h1>"
                + "<p style='font-size: 18px;'>Tenha uma ótima noite!</p>"
                + "<footer style='margin-top: 20px; color: #777;'>"
                + "Desenvolvido por Ananda Krishina e Laís Baltar ❤️"
                + "</footer>"
                + "</div>";

    //O método hello() retorna uma String que contém um bloco de código HTML.
        // Esse HTML é renderizado no navegador quando o endpoint é acessado.

        //http://localhost:8080/helloworld/hello

    }
}