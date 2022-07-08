import javax.swing.*;  // JFrame  (окно приложения)

public class Main extends JFrame {  // 1.  Наследуем Main от класса JFrame, который предостграфический интерфейс
    public Main(){                  // 2. Создаем конструктор
        setTitle("Snake");          // 3. Название в окне сверху
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  // 4. Если закрыли окно, программа завершается
        setSize(320,345); // 5. Размеры экрана (квадрат (25 пикселей - разммер верхней полоски))
        setLocation(400, 400); // 6. Указываем локацию, где появляется экран (отступ вниз и отступ справа)
        add(new GameField());
        setVisible(true);  //  7. Делает экран видимым
    }

    public static void main(String[] args) {      // 8. Делаем точку входа в программу
        Main main = new Main();                // 9. Создаем объект Maina, вызываем конструктор (сщздается окно)
    }


}
