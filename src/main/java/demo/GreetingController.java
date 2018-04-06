package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    
    @RequestMapping(value = "/consulta/consultarRecomendacion",method = RequestMethod.POST)
    public String recommendation(@RequestBody FilledForm input) {
    	return "OK KO"+input.getGenero();
    }
    
    @RequestMapping("/consulta/infoFormularioConsulta")
    public FormWithValues getInfoForm() {
    	FormWithValues formInfo = returnFormWithValues();    	
    	return formInfo;
    }
    
    private FormWithValues returnFormWithValues() {
    	FormWithValues values = new FormWithValues();
    	
    	String[] prioridad = {"Conformar familia", "Viajar", "Estudiar", "Ahorrar/Invertir", "Impulsar su carrera", "Otras"};
    	values.setPrioridad(prioridad);
    	
    	String[] genero = {"Masculino", "Femenino", "Otro"};
    	values.setGenero(genero);
    	
    	String[] compartirVivienda = {"Hijos", "Padres", "Mascotas", "Pareja", "Hermanos", "Amigos", "Otros"};
    	values.setCompartirVivienda(compartirVivienda);
    	
    	String[] ocupacion = {"Estudiar", "Trabajar", "Estudiar y Trabajar", "Desempleo", "otros"};
    	values.setOcupacion(ocupacion);
    	
    	String[] transportePpal = {"Transporte Público", "Transporte Propio"};
    	values.setTransportePrincipal(transportePpal);
    	
    	String[] transportePro = {"2 ruedas", "4 Ruedas"};
    	values.setTransportePropio(transportePro);
    	    	
    	String[] estiloVida = {};
    	values.setEstilosVida(estiloVida);
    	
    	return values;
	}
    
    private FormField[] returnInfo() {
    	ArrayList<FormField> formFieldArrayList= new ArrayList<FormField>();
    	
    	FormField prioridad = new FormField();
    	prioridad.setCampo("Prioridad");
    	String[] valores = {"Conformar familia", "Viajar", "Estudiar", "Ahorrar/Invertir", "Impulsar su carrera", "Otras"};
    	prioridad.setValores(valores);
    	formFieldArrayList.add(prioridad);
    	
    	FormField genero = new FormField();
    	genero.setCampo("Genero");
    	String[] generoVal = {"Masculino", "Femenino", "Otro"};
    	genero.setValores(generoVal);
    	formFieldArrayList.add(genero);
    	
    	FormField compartirVivienda = new FormField();
    	compartirVivienda.setCampo("CompartirVivienda");
    	String[] comparVal = {"Hijos", "Padres", "Mascotas", "Pareja", "Hermanos", "Amigos", "Otros"};
    	compartirVivienda.setValores(comparVal);
    	formFieldArrayList.add(compartirVivienda);
    	
    	FormField ocupacion = new FormField();
    	ocupacion.setCampo("Ocupacion");
    	String[] ocupacionVal = {"Estudiar", "Trabajar", "Estudiar y Trabajar", "Desempleo", "otros"};
    	ocupacion.setValores(ocupacionVal);
    	formFieldArrayList.add(ocupacion);
    	
    	FormField transportePpal = new FormField();
    	transportePpal.setCampo("TransportePrincipal");
    	String[] transporteVal = {"Transporte Público", "Transporte Propio"};
    	transportePpal.setValores(transporteVal);
    	formFieldArrayList.add(transportePpal);
    	
    	FormField transportePro = new FormField();
    	transportePro.setCampo("TransportePropio");
    	String[] transProV = {"2 ruedas", "4 Ruedas"};
    	transportePro.setValores(transProV);
    	formFieldArrayList.add(transportePro);
    	
    	FormField estiloVida = new FormField();
    	estiloVida.setCampo("EstilosVida");
    	String[] estiloVidaV = {};
    	estiloVida.setValores(estiloVidaV);
    	formFieldArrayList.add(estiloVida);
    	
    	Object[] formFieldObjectArray = formFieldArrayList.toArray();
    	FormField[] formFieldList = Arrays.copyOf(formFieldObjectArray, formFieldObjectArray.length, FormField[].class);
    	return formFieldList;
    }

}