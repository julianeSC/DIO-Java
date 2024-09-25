package Aplicativo.ReprodutorMusical;

    public class Musica implements ReprodutorMusical {

        @Override
        public void tocar() {
            // TODO Auto-generated method stub
            System.out.println("Tocando Múcica");
        }
    
        @Override
        public void pausar() {
            // TODO Auto-generated method stub
            System.out.println("Múscica Pausa");
        }
    
        @Override
        public void selecionarMusica(String musica) {
            // TODO Auto-generated method stub
            System.out.println("Selecionando música "+musica);
        }
        
}
