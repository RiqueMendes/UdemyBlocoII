package classes;


public class DataFormatada {
    
    int dia;
    int mes;
    int ano;


    
    DataFormatada() {
        /* dia = 1;
        mes = 1;
        ano = 1970; */
        this(1, 1, 1970);
    }

    DataFormatada(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String obterDataFormatada (){
        final String format = "%d/%d/%d";
        return String.format(format, dia, mes, ano);
    }

    void imprimirDataFormatada(){
        System.out.println(obterDataFormatada());
    }


}
