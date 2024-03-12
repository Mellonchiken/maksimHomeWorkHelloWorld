package sk.com.ymca;
/*
 Теорія для виконання домашнього завдання:
Почитати про склеювання (конкатенацію) рядків у Java

- Текст "Hello world" заносимо у змінну message, та запускаємо на виконання;
- Створити рядкову змінну words, записати значення: “Java forever”
- Вивести на екран послідовно message та words

Повинно вийти:
Hello world!
Java forever

- Створити рядкову змінну space, записати до неї значення: “ “ (пробіл)
- Вивести на екран: message + space + words

Повинно вийти:
Hello world! Java forever
 */

public class HomeWorkHelloWorld2 {
	public static void main(String[] args) {
	String message = "Hello world";
	String words = "Java forever";
	String space = " ";
	
	System.out.println(message + '\n' + words);
	System.out.println(message + space + words);
	}
}