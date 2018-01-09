package attic.Menu;

import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import javax.swing.*;

/**
 * A frame with a menu whose File->Connect action shows a password dialog.
 */
public class DataExchangeFrame extends JFrame {
    public static final int TEXT_ROWS = 20;
    public static final int TEXT_COLUMNS = 40;
    private PasswordChooser dialog = null;
    private JTextArea textArea;

    public DataExchangeFrame() {
        // construct a File menu

        JMenuBar mbar = new JMenuBar();
        setJMenuBar(mbar);
        JMenu fileMenu = new JMenu("File");
        mbar.add(fileMenu);

        // add Connect and Exit menu items

        JMenuItem connectItem = new JMenuItem("Connect");
        connectItem.addActionListener(new ConnectAction());
        fileMenu.add(connectItem);

        JMenuItem createCourse = new JMenuItem("1. Создание курса");
//Todo
        fileMenu.add(createCourse);

        JMenuItem InformationByCourse = new JMenuItem("2. Вывод подробной информации о курсе по его идентификатору");
//Todo
        fileMenu.add(InformationByCourse);

        JMenuItem CourseList = new JMenuItem("3. Вывод списка названий всех курсов");
//Todo
        fileMenu.add(CourseList);

        JMenuItem CreateStudent = new JMenuItem("4. Создание студента в рамках определенного курса(ов)");
//Todo
        connectItem.addActionListener((ActionListener) CreateStudent);
        fileMenu.add(CreateStudent);

        JMenuItem transfer = new JMenuItem("5. Перевод студента из одного курса на другой");
//Todo
        fileMenu.add(transfer);

        JMenuItem InformationByStudent = new JMenuItem("6. Вывод информации о студенте по его идентификатору");
//Todo
        fileMenu.add(InformationByStudent);

        JMenuItem CreateTrainer = new JMenuItem("7. Создание тренера в рамках определенного курса(ов)");
//Todo
        fileMenu.add(CreateTrainer);

        JMenuItem InformationByTrainer = new JMenuItem("8. Вывод информации о тренере по его идентификатору");
//Todo
        fileMenu.add(InformationByTrainer);

        JMenuItem example = new JMenuItem("9. Создание задач в рамках определенного курса");
//Todo
        fileMenu.add(example);


        JMenuItem ListStudent = new JMenuItem("10. Вывод имен и фамилий всех студентов по идентификатору курса");
//Todo
        fileMenu.add(ListStudent);

        JMenuItem Journal = new JMenuItem("11. Вывод журнала успеваемости определенного курса");
//Todo
        fileMenu.add(Journal);

        JMenuItem file = new JMenuItem("12. Сохранение журнала успеваемости в файл");
//Todo
        fileMenu.add(file);

        // The Exit item exits the program

        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(event -> System.exit(0));
        fileMenu.add(exitItem);

        textArea = new JTextArea(TEXT_ROWS, TEXT_COLUMNS);
        add(new JScrollPane(textArea), BorderLayout.CENTER);
        pack();
    }

    /**
     * The Connect action pops up the password dialog.
     */
    private class ConnectAction implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            // if first time, construct dialog

            if (dialog == null) dialog = new PasswordChooser();

            // set default values
            dialog.setUser(new User("yourname", null));

            // pop up dialog
            if (dialog.showDialog(DataExchangeFrame.this, "Connect")) {
                // if accepted, retrieve user input
                User u = dialog.getUser();
                textArea.append("user name = " + u.getName() + ", password = "
                        + (new String(u.getPassword())) + "\n");
            }
        }
    }
}