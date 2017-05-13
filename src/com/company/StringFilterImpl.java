package com.company;

import java.util.*;

/**
 * Created by Seva_ on 03.05.2017.
 */
public class StringFilterImpl implements StringFilter {
    public static Set<String> stringHashSet = new HashSet<>();
    public static Iterator<String> iterStart = stringHashSet.iterator();
    public static boolean flagStart = false;

    @Override
    public void add(String s) {
        if (s != null) {
            stringHashSet.add(s.toLowerCase());
        } else {
            stringHashSet.add(s);
        }
    }

    @Override
    public boolean remove(String s) {
        if (s != null) {
            if (stringHashSet.remove(s.toLowerCase())) {
                return true;
            } else return false;
        } else {
            if (stringHashSet.remove(s)) {
                return true;
            } else return false;
        }
    }

    @Override
    public void removeAll() {
        stringHashSet.removeAll(stringHashSet);
    }

    @Override
    public Collection<String> getCollection() {
        return stringHashSet;
    }

    /**
     * Ищет и возвращает все строки, содержащие указанную последовательность символов.<br/>
     * Если <code>chars</code> - пустая строка или <code>null</code>,
     * то результат содержит все строки данного набора.<br/>
     *
     * @param chars символы, входящие в искомые строки
     *              (все символы, являющиеся буквами, - в нижнем регистре)
     * @return строки, содержащие указанную последовательность символов
     */
    @Override
    public Iterator<String> getStringsContaining(String chars) {
        return null;
    }

    /**
     * Ищет и возвращает строки, начинающиеся с указанной последовательности символов,
     * (без учета регистра). <br/>
     * Если <code>begin</code> - пустая строка или <code>null</code>,
     * то результат содержит все строки данного набора.<br/>
     *
     * @param begin первые символы искомых строк
     *              (для сравнения со строками набора символы нужно привести к нижнему регистру)
     * @return строки, начинающиеся с указанной последовательности символов
     */
    @Override
    public Iterator<String> getStringsStartingWith(String begin) {

        if (!iterStart.hasNext()) {
            iterStart = stringHashSet.iterator();
        }

        String prefix;
        if ((begin != null) && (!begin.isEmpty())) {
            prefix = begin.toLowerCase();
        } else {
            iterStart.next();
            return iterStart;
        }

        while (iterStart.hasNext()) {
            if (iterStart.next().startsWith(prefix)) {
                return iterStart;
            }
        }

        return null;
    }


    /**
     * Ищет и возвращает все строки, представляющие собой число в заданном формате.<br/>
     * Формат может содержать символ # (место для одной цифры от 0 до 9) и любые символы.
     * Примеры форматов: "(###)###-####" (телефон), "# ###" (целое число от 1000 до 9999),
     * "-#.##" (отрицательное число, большее -10, с ровно двумя знаками после десятичной точки).<br/>
     * Упрощающее ограничение: в строке, удовлетворяющей формату, должно быть ровно столько символов,
     * сколько в формате (в отличие от стандартного понимания числового формата,
     * где некоторые цифры на месте # не являются обязательными).<br/>
     * Примечание: в данной постановке задачи НЕ предполагается использование регулярных выражений
     * или какого-либо высокоуровневого API (эти темы изучаются позже).<br/>
     * Если <code>format</code> - пустая строка или <code>null</code>,
     * то результат содержит все строки данного набора.<br/>
     *
     * @param format формат числа
     * @return строки, удовлетворяющие заданному числовому формату
     */
    @Override
    public Iterator<String> getStringsByNumberFormat(String format) {
        return null;
    }

    /**
     * Ищет и возвращает строки, удовлетворяющие заданному шаблону поиска, содержащему символы *
     * в качестве wildcards (на месте * в строке может быть ноль или больше любых символов).<br/>
     * <a href="http://en.wikipedia.org/wiki/Wildcard_character#File_and_directory_patterns">Про * wildcard</a>.<br/>
     * Примеры шаблонов, которым удовлетворяет строка "distribute": "distr*", "*str*", "di*bute*".<br/>
     * Упрощение: достаточно поддерживать всего два символа * в шаблоне.<br/>
     * Примечание: в данной постановке задачи НЕ предполагается использование регулярных выражений
     * и какого-либо высокоуровневого API (эти темы изучаются позже), цель - применить методы String.<br/>
     * Если <code>pattern</code> - пустая строка или <code>null</code>,
     * то результат содержит все строки данного набора.<br/>
     *
     * @param pattern шаблон поиска (все буквы в нем - в нижнем регистре)
     * @return строки, удовлетворяющие заданному шаблону поиска
     */
    @Override
    public Iterator<String> getStringsByPattern(String pattern) {
        return null;
    }


//    public static void main(String... args) {
//        StringFilter s = new StringFilterImpl();
//        s.add("Kek");
//        s.add("Kebrl");
//        s.add("Kekbl");
//        s.add("Keskbl");
//        System.out.println(stringHashSet.toString());
//
//        Iterator<String> iter;
//        iter = s.getStringsStartingWith("kew");
//        //System.out.println(iter.next());
//        iter = s.getStringsStartingWith("ke");
//        System.out.println(iter.next());
////        iter = s.getStringsStartingWith("ke");
////        System.out.println(iter.next());
//
//
//    }
}