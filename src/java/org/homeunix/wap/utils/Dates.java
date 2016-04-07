/*
 * Classe que permite calcular tempo de execucao, através da diferença
 * entre horas de inicio e fim
 */
package org.homeunix.wap.utils;

/**
 *
 * @author iberiam
 */
public class Dates {
    public static String DiffDates(Long seconds){
        String diff_date = "", m, s, h;
        int horas, min;
        
        if (seconds >= 1000){
            seconds = seconds/1000;
            horas = (int)Math.floor(seconds / 3600);
            seconds -= horas * 3600;
            min = (int)Math.floor(seconds / 60);
            seconds -= min * 60;
            
            if (horas < 10)
                h = "0"+ Integer.toString(horas);
            else
                h = Integer.toString(horas);
            
            if (min < 10)
                m = "0"+ Integer.toString(min);
            else
                m = Integer.toString(min);

            if (seconds < 10)
                s = "0"+ Long.toString(seconds);
            else
                s = Long.toString(seconds);
            
            diff_date = h + ":" + m + ":" + s + " H";
        }
        else
            //System.out.println("Tempo decorrido " + (end_date - begin_date) + " ms");
            diff_date = seconds + " ms";
        
        return diff_date;
    }
}
