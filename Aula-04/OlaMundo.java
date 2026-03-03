public class OlaMundo {

    void main(){

        // IO.println("Ola Mundo!");

        int i = 1;
        String s = "";

        switch (i){
            case 1:
                s = "Um";
                IO.println(s);
                break;
            default:
                s = "Outro";  
                IO.println(s);
                break;
        }

    }
}