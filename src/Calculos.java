public class Calculos extends Polinomio{
    @Override
    public void getRaices(){
        if(calcularDiscriminante()==0){
            System.out.println("La raiz doble es: " + (-getB())/(2*getA()));
        } else if (calcularDiscriminante()>0) {
            System.out.println("La raiz 1 es: " + ((-getB())+(Math.sqrt(calcularDiscriminante()))/2*getA()));
            System.out.println("La raiz 2 es: " + ((-getB())-(Math.sqrt(calcularDiscriminante()))/2*getA()));
        } else {
            System.out.println("No tiene raices reales.");
        }
    }
    private double calcularDiscriminante(){
        return getB()*getB()-4*getA()*getC();
    }
    @Override
    public void getDiscriminante() {
        if(calcularDiscriminante()>0){
            System.out.println("Tiene 2 raices reales y diferentes.");
        } else if (calcularDiscriminante() == 0) {
            System.out.println("Tiene una raiz doble");
        } else{
            System.out.println("No tiene raices reales");
        }
    }

    @Override
    public void getVertice() {
        System.out.println("la coordenada x del vertice es: "+ (-getB())/(2*getA()));
        System.out.println("la coordenada y del vertice es: "+ (getA()*((-getB())/(2*getA())*(-getB())/(2*getA())))*(getB()*(-getB())/(2*getA()))+(getC()));
    }
}
