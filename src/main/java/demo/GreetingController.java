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
    
    /**
     * @return
     */
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
    	
    	Zone zonas = new Zone();
    	String[] envigado = {"Alto de Misael","Las Orquídeas","El Esmeraldal","Loma El Atravesado","San Mateo","Zuñiga","Bosques de Zuñiga","Loma de Las Brujas","La Pradera","El Chocho","La Inmaculada","El Chinguí","El Salado","La Mina","San Rafael","Las Antillas","El Trianón","Loma del Barro","La Paz","Las Casitas","Primavera","Milán-Vallejuelos","Alcalá","El Dorado","San José","Los Naranjos","Barrio Mesa","Zona Centro","Barrio Obrero","Bucares","Las Vegas","El Portal ","La Magnolia ","San Marcos ","Pontevedra ","Jardines ","Villagrande ","La Pradera","La Sebastiana ","Las Flores","Uribe Ángel"};
    	zonas.setEnvigado(envigado);
    	values.setZonas(zonas);
    	
    	String[] comuna1_Paris = {"Los Sauces","La Pradera","Paris central","José Antonio Galán","Campo Grande","Tierra Verde","El Cafetal","La Esmeralda","La Maruchenga","Salvador Allende"};
    	String[] comuna2_Madera = {"Barrio Nuevo","Cabañitas","La Cabaña","La Madera","La Florida","Gran Avenida","San José Obrero","Amazonía"};
    	String[] comuna3_Santa_ana = {"Villas de Occidente","Occidente","Molinares","San Simón","Santa Ana","Los Búcaros","Salento","Serramonte","Palmar de Serramonte","San Silvestre"};
    	String[] comuna4_Centro = {"Suárez","Puerto Bello","Rincón Santo","Zona Centro","Pérez","Nazaret","El Rosario","Andalucía","López de Mesa","El Cairo","La Milagrosa","El Cóngolo","Las Granjas","Prado","Manchester","La Estación"};
    	String[] comuna5_La_Cumbre_Carmelo = {"La Cumbre","Altavista","El Carmelo","Hato Viejo","El Porvenir","Briceño","Buenos Aires","El Paraiso","Valadares","El Trapiche","Aralias","Urapanes","La Primavera","Villa María","Villas de Confenalco","Riachuelos"};
    	String[] comuna6_Bellavista = {"Bellavista","Playa Rica","San Gabriel","San Martin","Villas del Sol","Tierradentro","Villa Linda","Girasoles","La Sonora","Villa Luna","Pachelly","Los Alpes","El Ducado","La Aldea","La Selva"};
    	String[] comuna7_altos = {"Altos de Niquía","Niquía Bifamiliares","El Mirador Quitasol","Altos de Niquía"};
    	String[] comuna8_Niquia = {"Terranova","Niquia Panamericano","Ciudad Norte","Hermosa Provincia"};
    	String[] comuna9_Guasimalito = {"La Navarra","El Trébol","Guasimalito"};
    	String[] comuna10_Fonti = {"La Virginia","Fontidueño","La Mina","Alcalá","Los Ciruelos","Estación Palmira","Las Vegas","La Camila","Cinco Estrellas","Jardín de los Sueños","Marco Fidel Suarez"};
    	String[] comuna11_Acevedo = {"La Gabriela","Belverde","Acevedo","Zamora","Alpes del Norte","Mirador de San Nicolás","Santa Rita"};
    	String[] comuna12_Croacia = {"El Siete","San Félix","Jalisco","Los Álvarez"};
    	String[] belloVereda = {"Potrerito","Hato Viejo","Los Espejos","La Primavera","Tierra Adentro","Buena Vista","San Félix","Jalisco","Los Álvarez","La Palma","Sabana Larga","Charco Verde","La Unión","La China","Cuartas","El Tambo","Cerezales"};
    	BelloSubZone belloSZ = new BelloSubZone();
    	belloSZ.setComuna1_Paris(comuna1_Paris);
    	belloSZ.setComuna2_Madera(comuna2_Madera);
    	belloSZ.setComuna3_Santa_ana(comuna3_Santa_ana);
    	belloSZ.setComuna4_Centro(comuna4_Centro);
    	belloSZ.setComuna5_La_Cumbre_Carmelo(comuna5_La_Cumbre_Carmelo);
    	belloSZ.setComuna6_Bellavista(comuna6_Bellavista);
    	belloSZ.setComuna7_Altos_de_Niquia(comuna7_altos);
    	belloSZ.setComuna8_Niquia(comuna8_Niquia);
    	belloSZ.setComuna9_Guasimalito(comuna9_Guasimalito);
    	belloSZ.setComuna10_Fontidueno(comuna10_Fonti);
    	belloSZ.setComuna11_Acevedo(comuna11_Acevedo);
    	belloSZ.setComuna12_Croacia_el_Pinar(comuna12_Croacia);
    	belloSZ.setVereda(belloVereda);
    	zonas.setBello(belloSZ);
    	
    	String[] sabaletaVereda = {"María Auxiliadora","Las Lomitas","La Doctora","San José","Cañaveralejo","Pan de Azúcar"};
    	String[] sabaleta = {"ALIADAS DEL SUR","ANCON SUR","BETANIA","CALLE DEL BANCO","CALLE LARGA","EL CARMELO II","ENTREAMIGOS","HOLANDA","LA BARQUEREÑA","LA FLORIDA","LAGOS DE LA DOCTORA","LAS CASITAS","LOS ALCÁZAREZ","LOS ARIAS","MANUEL RESTREPO","MARÍA AUXILIADORA","NUESTRA SEÑORA DE LOS DOLORES","PASO ANCHO","PLAYAS DE MARÍA","PRADOS DE SABANETA","PROMISIÓN","RESTREPO NARANJO","SABANETA REAL","SAN JOAQUÍN","SAN RAFAEL","SANTA ANA","TRES ESQUINAS","VEGAS DE LA DOCTORA","VEGAS DE SAN JOSÉ","VILLAS DEL CARMEN","VIRGEN DEL CARMEN"};
    	SabanetaSubZone sabaleSZ = new SabanetaSubZone();
    	sabaleSZ.setSabaneta(sabaleta);
    	sabaleSZ.setVereda(sabaletaVereda);
    	zonas.setSabaneta(sabaleSZ);
    	
    	String[] laEstrella = {"Ancón ","San Martín","Villa alicia ","Villa Mira ","Bellavista ","Camilo Torres ","Caqueta ","Centro ","Chile ","El Dorado ","El Pedrero","Escobar ","Horizontes ","La Chinca ","La Ferreira ","La Ospina ","Las Brisas ","Monterrey","Primavera ","Quebrada Grande ","San Agustín ","San Andrés ","San Cayetano ","San Vicente ","Zona Industrial"};
    	String[] estrellaVereda = {"San José ","Tierra Amarilla","El Guayabo ","Pueblo Viejo","La Bermejala ","Peñas Blancas ","La Culebra ","La Raya","La Tablacita ","Juan XXIII ","San Isidro ","Sagrada Familia"};
    	LaEstrellaSubZone estrella = new LaEstrellaSubZone();
    	estrella.setLaEstrella(laEstrella);
    	estrella.setVereda(estrellaVereda);
    	zonas.setLaEstrella(estrella);
    	
    	String[] ita_comun1 = {"Zona Industrial Nº1","Zona Industrial Nº2","La Independencia","La Santa Cruz","San pablo","Araucaria","La Gloria","Las Mercedes","Centro","Asturias","Los Naranjos","Villa Paula","Artex","Playa Rica","Satexco","San Isidro"};
    	String[] ita_comun2 = {"Santa Catalina","Samaria Robles de Sur","La Finca","Yarumito","El Palmar","Santa Ana","Samaria Nº1","Las Margaritas","Malta","Monte Verde","Camparola","San Pio X","La Palma","Jardines Montesacro","Zona Industrial Nº3"};
    	String[] ita_comun3 = {"Las Brisas","Pilsen","San Javier","Villa Lia","19 de Abril","San Gabriel","San Antonio","Triana","Ditaires","San Francisco","Glorieta Pilsen"};
    	String[] ita_comun4 = {"Santa Maria Nº 1","Santa Maria Nº 2","Santa Maria Nº 3","La Esmeralda","Simón Bolivar","San Fernando","Entre colinas"};
    	String[] ita_comun5 = {"Las Acacias","Las Américas","El Tablazo","Calatrava","Loma Linda","Terranova Nº 1 y Nº 2","La Aldea","Balcones de Sevilla"};
    	String[] ita_comun6 = {"Fátima","El Rosario","La Unión","Santa María La Nueva"};
    	String[] itaVereda = {"La María","Los Olivares","Loma de los Zuleta","El Progreso","El Pedregal","Los Gómez","El Ajizal","Porvenir"};
    	ItaguiSubZone itagui = new ItaguiSubZone();
    	itagui.setComuna_1(ita_comun1);
    	itagui.setComuna_2(ita_comun2);
    	itagui.setComuna_3(ita_comun3);
    	itagui.setComuna_4(ita_comun4);
    	itagui.setComuna_5(ita_comun5);
    	itagui.setComuna_6(ita_comun6);
    	itagui.setVeredas(itaVereda);
    	zonas.setItagui(itagui);
    	
    	String[] comuna1_Popular ={	"Popular 1-2","Santo Domingo Savio Nº 1","Santo Domingo Savio Nº 2","Granizal","Moscú Nº 2","Villa Guadalupe","San Pablo","Aldea Pablo VI","La Esperanza Nº 2","El Compromiso","La Avanzada","Carpinelo" };
    	String[] comuna2_SantaCruz ={ "Santa Cruz","La Isla","El Playón de Los Comuneros","Pablo VI","La Frontera","La Francia","Andalucía","Villa del Socorro","Villa Niza","Moscú Nº 1","La Rosa" };
    	String[] comuna3_Manrrique ={ "La Salle","Las Granjas","Campo Valdes Nº 2","Santa Inés","El Raizal","El Pomar","Manrique Central Nº 2","Manrique Oriental","Versalles Nº 1","Versalles Nº 2","La Cruz","La Honda","Oriente","Maria Cano – Carambolas","San José La Cima Nº 1","San José La Cima Nº 2" };
    	String[] comuna4_Aranjuez ={ "Aranjuez","Berlín","San Isidro","Palermo","Bermejal - Los Álamos","Moravia","Sevilla","San Pedro","Manrique Central Nº 1","Campo Valdes Nº 1","Las Esmeraldas","La Piñuela","Brasilia","Miranda" };
    	String[] comuna5_Castilla ={ "Castilla","Toscana","La Paralela","Las Brisas","Florencia","Tejelo","Boyacá","Héctor Abad Gómez","Belalcazar","Girardot","Tricentenario","Francisco Antonio Zea","Alfonso López","Caribe","El Progreso" };
    	String[] comuna6_Doce ={ "Doce de Octubre Nº 1","Doce de Octubre Nº 2","Santander","Pedregal","La Esperanza","San Martín de Porres","Kennedy","Picacho","Picachito","Mirador del Doce","Progreso Nº 2","El Triunfo" };
    	String[] comuna7_Robledo ={ "Robledo","El Volador","San Germán","Barrio Facultad de Minas","La Pilarica","Bosques de San Pablo","Altamira","Córdoba","López de Mesa","El Diamante","Aures Nº 1","Aures Nº 2","Bello Horizonte","Villa Flora","Palenque","Cucaracho","Fuente Clara","Santa Margarita","Olaya Herrera","Pajarito","Monteclaro","Villa de La Iguaná","La Cuchilla"	};
    	String[] comuna8_Villa ={ "Villa Hermosa","La Mansión","San Miguel","La Ladera","Batallón Girardot","Llanaditas","Los Mangos","Enciso","Sucre","El Pinal","Trece de Noviembre","La Libertad","Villatina","San Antonio","Las Estancias","Villa Turbay","La Sierra","Villa Lilliam","Quintas de La Playa","Esfuerzos de Paz N°1","Esfuerzos de Paz N°2" };
    	String[] comuna9_BuenosAires ={ "Buenos Aires","Juan Pablo II","Barrios de Jesús","Bombona Nº 2","Los Cerros El Bergel","Alejandro Echavarría","Miraflores","Cataluña","La Milagrosa","Gerona","El Salvador","Loreto","Asomadera Nº 1","Asomadera Nº 2","Asomadera Nº 3","Asomadera N° 4" };
    	String[] comuna10_Lacandelaria ={ "La Candelaria","Prado","Jesús Nazareno","El Chagualo","Estación Villa","San Benito","Guayaquil","Corazón de Jesús","Calle Nueva","Perpetuo Socorro","Barrio Colón","Las Palmas","Bombona Nº 1","Boston","Los Ángeles","Villa Nueva","San Diego" };
    	String[] comuna11_LaurelesEstadio ={ "Los Conquistadores","Laureles","Carlos E. Restrepo","Suramericana","Naranjal","San Joaquín","Bolivariana","Las Acacias","La Castellana","Lorena","El Velódromo","Estadio","Los Colores","Cuarta Brigada","Florida Nueva" };
    	String[] comuna12_LaAmerica	={ "La América","Ferrini","Calasanz","Los Pinos","La Floresta","Santa Lucía","El Danubio","Campo Alegre","Santa Mónica","Barrio Cristóbal","Simón Bolívar","Santa Teresita","Calasanz Parte Alta" };
    	String[] comuna13_SanJavier	={ "San Javier Nº 1","San Javier Nº 2","El Pesebre","Blanquizal","Santa Rosa de Lima","Los Alcázares","Metropolitano","La Pradera","Juan XXIII","La Divisa","Veinte de Julio","Belencito -","Betania","El Corazón","Las Independencias","Nuevos Conquistadores","El Salado","Eduardo Santos","Peñitas","Antonio Nariño","El Socorro" };
    	String[] comuna14_ElPoblado	={ "El Poblado","Barrio Colombia","Simesa","Villa Carlota","Castropol","Lalinde","Las Lomas Nº 1","Las Lomas Nº 2","Altos del Poblado","El Tesoro","Los Naranjos","Los Balsos Nº 1","Los Balsos Nº 2","San Lucas","El Diamante Nº 2","El Castillo","Alejandría","La Florida","Manila","Astorga","Patio Bonito","La Aguacatala","Santa María de Los Ángeles"	};
    	String[] comuna15_Guayabal ={ "Guayabal","Tenche","Trinidad","Santa Fe","Shellmar","San Pablo","Parque Juan Pablo II","Campo Amor, Noel","Cristo Rey","La Colina" };
    	String[] comuna16_Belen	={ "Belén","Fátima","Tenche","Rosales","Granada","San Bernardo","Las Playas","Diego Echevarria","La Mota","Rodeo Alto","El Rincón","La Loma de Los Bernal","La Gloria","Altavista","La Palma","Zafra","Los Alpes","Las Violetas","Las Mercedes","Nueva Villa de Aburrá","Miravalle","El Nogal - Los Almendros","Cerro Nutibara" };
    	MedellinSubZone medellin = new MedellinSubZone();
    	medellin.setComuna1_Barrio_Popular(comuna1_Popular);
    	medellin.setComuna2_Santa_Cruz(comuna2_SantaCruz);
    	medellin.setComuna3_Manrrique(comuna3_Manrrique);
    	medellin.setComuna4_Aranjuez(comuna4_Aranjuez);
    	medellin.setComuna5_Castilla(comuna5_Castilla);
    	medellin.setComuna6_Doce_de_octubre(comuna6_Doce);
    	medellin.setComuna7_Robledo(comuna7_Robledo);
    	medellin.setComuna8_Villa_Hermosa(comuna8_Villa);
    	medellin.setComuna9_Buenos_Aires(comuna9_BuenosAires);
    	medellin.setComuna10_La_candelaria(comuna10_Lacandelaria);
    	medellin.setComuna11_Laureles_Estadio(comuna11_LaurelesEstadio);
    	medellin.setComuna12_La_America(comuna12_LaAmerica);
    	medellin.setComuna13_San_Javier(comuna13_SanJavier);
    	medellin.setComuna14_El_Poblado(comuna14_ElPoblado);
    	medellin.setComuna15_Guayabal(comuna15_Guayabal);
    	medellin.setComuna16_Belen(comuna16_Belen);
    	zonas.setMedellin(medellin);
    	
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