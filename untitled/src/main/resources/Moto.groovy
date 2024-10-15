import org.example.Terrestre

class Moto extends Terrestre{
    String matricula = ""

    Moto(String matricula){
        this.matricula = matricula;
    }


    @Override
    void parqueo() {
        System.out.println("Se ha parqueado la moto")
    }

    @Override
    void retroceder() {

    }

    @Override
    void pitar() {

    }


    void mostrarMatricula(){
        System.out.println(matricula)


    }
}