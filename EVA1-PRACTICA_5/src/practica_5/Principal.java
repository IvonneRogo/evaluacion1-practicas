/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_5;

import java.util.Scanner;

/**
 *
 * @author 15060769
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //DOS DIMENSIONES CON DATOS COMPLETOS
        /*String asTabla[][] = {{"ENERO", "FEBRERO", "MAYO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE", "AÑO"},
        {"30.0(86)", "32.0(89.6)", "34.0(93.2)", "38.8(101.8)", "39.6(103.3)", "41.4(106.5)", "41.6(106.9)", "39.2(102.6)", "39.0(102.2)", "35.0(95)", "34.6(94.3)", "29.0(84.2)", "41.6(106.9)"},
        {"18.1(64.6)", "21.2(70.2)", "24.2(75.6)", "27.9(82.2)", "32.2(90)", "34.0(93.2)", "32.1(89.8)", "30.3(86.5)", "29.2(84.6)", "26.8(80.2)", "21.9(71.4)", "18.2(64.8)", "26.3(79.3)"},
        {"10.0(50)", "12.9(55.2)", "15.7(60.3)", "19.2(74.5)",
             "23.6(74.5)", "26.3(79.3)", "25.6(78.1)", "24.3(75.7)", "22.6(72.7)", "18.7(65.7)", "13.7(56.7)", "10.3(50.5)", "18.6(65.5)"},
        {"2.0(35.6)",
             "4.5(40.1)", "7.1(44.8)", "10.4(50.7)", "14.9(58.8)", "18.6(65.5)", "19.1(66.4)", "18.2(64.8)", "16.0(60.8)", "10.7(51.3)", "5.5(41.9)", "2.4(36.3)", "10.8(51.4)"},
        {"−12.8(9)",
             "−18.0(−0.4)", "−5.8(21.6)", "−3.4(25.9)", "3.8(38.8)", "6.1(43)", "10.6(51.1)", "10.0(50)", "3.7(38.7)", "−2.4(27.7)", "−6.1(21)", "−11.5(11.3)", "−18.0(−0.4)"},
        {"9.9(0.39)",
             "3.7(0.146)", "7.7(0.303)", "12.9(0.508)", "26.1(1.028)", "34.7(1.366)", "94.7(3.728)", "89.3(3.516)", "66.4(2.614)", "21.6(0.85)", "8.7(0.343)", "9.9(0.39)", "385.7(15.185)"},
        {"2.5",
             "1.6", "1.5", "2.5", "4.0", "6.7", "11.4", "12.0", "8.0", "4.0", "2.0", "2.3", "58.4"},
        {"0.30",
             "0.18", "0.09", "0.09", "0.00", "0.00", "0.00", "0.00", "0.00", "0.00", "0.50", "0.88", "2.04"},
        {"55",
             "49", "39", "37", "37", "42", "53", "61", "61", "56", "55", "57", "50"},
        {"185",
             "204", "254", "278", "299", "273", "240", "242", "229", "238", "191", "174", "2,807"}};*/
        System.out.println("MES\t\tENERO\tFEBRERO\tMARZO\tABRIL\tMAYO\tJUNIO\tJULIO\tAGOSTO\tSEPTI\tOCT\tNOVIE\tDICI\tAÑO");
        String asTabla[][] = {//{"MES","ENERO", "FEBRE", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTI", "OCTUBRE", "NOVI", "DICI", "AÑO"},
        {"REGI MAX","30.0", "32.0", "34.0", "38.8", "39.6", "41.4", "41.6", "39.2", "39.0", "35.0", "34.6", "29.0", "41.6"},
        {"PROM MAX","18.1", "21.2", "24.2", "27.9", "32.2", "34.0", "32.1", "30.3", "29.2", "26.8", "21.9", "18.2", "26.3"},
        {"PROM DIA","10.0", "12.9", "15.7", "19.2", "23.6", "26.3", "25.6", "24.3", "22.6", "18.7", "13.7", "10.3", "18.6"},
        {"PROM MIN","2.0", "4.5", "7.1", "10.4", "14.9", "18.6", "19.1", "18.2", "16.0", "10.7", "5.5", "2.4", "10.8"},
        {"REGI MIN","−12.8", "−18.0", "−5.8", "−3.4", "3.8", "6.1", "10.6", "10.0", "3.7", "−2.4", "−6.1", "−11.5", "−18.0"},
        {"PRE PROM","9.9", "3.7", "7.7", "12.9", "26.1", "34.7", "94.7", "89.3", "66.4", "21.6", "8.7", "9.9", "385.7"},
        {"PRO DI PRE","2.5", "1.6", "1.5", "2.5", "4.0", "6.7", "11.4", "12.0", "8.0", "4.0", "2.0", "2.3", "58.4"},
        {"PRO DI NEV","0.30", "0.18", "0.09", "0.09", "0.00", "0.00", "0.00", "0.00", "0.00", "0.00", "0.50", "0.88", "2.04"},
        {"PRO HU REL","55", "49", "39", "37", "37", "42", "53", "61", "61", "56", "55", "57", "50"},
        {"PRO HO ME SOL","185", "204", "254", "278", "299", "273", "240", "242", "229", "238", "191", "174", "2,807"}};

        for (int i = 0; i < asTabla.length; i++) {
            for (int j = 0; j < asTabla[i].length; j++) {
                System.out.print(asTabla[i][j] + "\t");
            }
            System.out.println("");
        }

       Scanner sCap = new Scanner(System.in);
        System.out.println("1.-Registro Maximo\n2.-Promedio Maximo\n3.-Promedio Diario\n4.-Promedio Minimo\n5.-Regitro Minimo\n6.-Precipitación promedio mm (pulgadas)");
        System.out.println("7.-Pomedio de Dias de precipitación\n8.-Promedio de dias nevados\n9.-Promedio de humedad relativa\n10.-Promedio de horas mensuales de sol");
        System.out.println("¿Que informacion quiere obtener?");
        int iFila = sCap.nextInt();
        System.out.println("Elige la opcion del mes");
        System.out.println("1)ENERO\t\t2)FEBRERO\t3)MAYO\n4)ABRIL\t\t5)MAYO\t\t6)JUNIO\n7)JULIO\t\t8)AGOSTO\t9)SEPTIEMBRE\n10)OCTUBRE\t11)NOVIEMBRE\t12)DICIEMBRE\n13)AÑO");
        //System.out.println("¿De cual mes?");
        int iColum =sCap.nextInt();
        System.out.println(asTabla[iFila-1][iColum]);
    }
}
