/*
Una tienda de ropa está ofreciendo una promoción en la que se aplica 
un descuento del 15% sobre el precio original de cada prenda. Si una 
camiseta cuesta $25 y un pantalón cuesta $30, ¿Cuál será el precio total
de ambas prendas después de aplicar el descuento? Además, si se compra una
segunda camiseta, se aplica un descuento adicional del 5% sobre el precio 
ya descuento de la primera camiseta.
*/
package ejerciciosjava;
public class EjerciciosDeOperadoresUno {
    public static void main(String[] args) {
        
        double pantalon = 30;
        double camiseta = 25;
        double descuento = 0.85;
        double valorCamiseta = camiseta * descuento;
        double valorPantalon = pantalon * descuento;
        
        double segundaCamiseta = valorCamiseta*0.95;
        
        double total = valorCamiseta + valorPantalon + segundaCamiseta;
        System.out.println("Precio de la primera camiseta con 15% de descuento: $" + valorCamiseta);
        System.out.println("Precio del pantalón con 15% de descuento: $" + valorPantalon);
        System.out.println("Precio de la segunda camiseta con descuento adicional: $" + segundaCamiseta);
        System.out.println("Total a pagar: $" + total);
    }
}
