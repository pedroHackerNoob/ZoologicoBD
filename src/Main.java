import com.itson.model.Animal;
import com.itson.model.Habitat;
import com.itson.model.Tamanio;


public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("coyote",1, Tamanio.MEDIANO, Habitat.TERRESTRE);
        System.out.println("nombre: "+animal.getAnimalName()+" edad: "+animal.getAge()+" tamanio: "+animal.getTamanio()+" habitat: "+ animal.getHabitat());
    }
}