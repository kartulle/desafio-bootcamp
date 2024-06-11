package br.com.dio.desafio.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateUtil {

    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    // Método para formatar uma data
    public static String format(LocalDate date) {
        return date.format(DATE_FORMATTER);
    }

    // Método para calcular a diferença em dias entre duas datas
    public static long daysBetween(LocalDate startDate, LocalDate endDate) {
        return ChronoUnit.DAYS.between(startDate, endDate);
    }

    // Método para verificar se uma data está no futuro
    public static boolean isFutureDate(LocalDate date) {
        return date.isAfter(LocalDate.now());
    }

    // Método para verificar se uma data está no passado
    public static boolean isPastDate(LocalDate date) {
        return date.isBefore(LocalDate.now());
    }

    // Método para verificar se uma data é hoje
    public static boolean isToday(LocalDate date) {
        return date.equals(LocalDate.now());
    }

    // Método para adicionar dias a uma data
    public static LocalDate addDays(LocalDate date, long days) {
        return date.plusDays(days);
    }

    // Método para subtrair dias de uma data
    public static LocalDate subtractDays(LocalDate date, long days) {
        return date.minusDays(days);
    }
}