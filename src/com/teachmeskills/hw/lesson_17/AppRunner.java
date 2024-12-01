package com.teachmeskills.hw.lesson_17;

import com.teachmeskills.hw.lesson_17.task1.operation.InputOperation;
import com.teachmeskills.hw.lesson_17.task2.DateInformation;

/**
 * Задача 1
 * Создать обобщенный функциональный интерфейс.
 * Написать класс с одним методом.
 * В этом методе реализуйте логику:
 * - если в консоль введена цифра 1, то: использования интерфейса со строковым типом и передать в метод интерфейса логику реверса строки(вывода строки в обратном порядке).
 * <p>
 * - если в консоль введена цифра 2, то: использования интерфейса с целочисленным типом и передать в метод интерфейса логику нахождения факториала числа.
 * <p>
 * Задача 2 (опционально)
 * Получить день недели по дате
 */
public class AppRunner {

    public static void main(String[] args) {
        //Task1
        InputOperation.analyzeUserInput();
        //Task2
        DateInformation.formatDate();
    }
}
