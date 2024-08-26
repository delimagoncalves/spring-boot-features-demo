package br.com.estudospring.funcionalidades;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@SpringBootApplication
public class FuncionalidadesApplication {

	public static void main(String[] args) {
		SpringApplication.run(FuncionalidadesApplication.class, args);
	}
	
	@GetMapping("/user/{id}")
	public Map<String,Object> getUser(@PathVariable long id){
		Map<String, Object> user = new HashMap<>();
		user.put("id",id);
		user.put("name","User: "+id);
		user.put("email","user"+id+"@example.com");
		return user;
	}

}
