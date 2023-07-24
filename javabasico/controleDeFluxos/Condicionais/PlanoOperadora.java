package controledefluxos.condicionais;

public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "T";

        //Criação de condição switch/case  --> evita repetições
        switch (plano) {
            case "T": {
                System.out.println("5Gb Youtube");
            }
            case "M": {
                System.out.println("WhatsApp e Instagram grátis");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
                break;
            }
            default:
                System.out.println("Indisponível");
        }

        //Criação de condicão encadeada --> ocorrem muitas repetições
        /* if(plano == "B") {
            System.out.println("100 minutos de ligação");
        }else if(plano == "M") {
            System.out.println("100 minutos de ligação");
            System.out.println("WhatsApp e Instagram grátis");
        }else if(plano == "T") {
            System.out.println("100 minutos de ligação");
            System.out.println("WhatsApp e Instagram grátis");
            System.out.println("5Gb Youtube");
        }*/
    }
}
