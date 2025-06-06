package TypingTestSpeed;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;
import java.util.Random; // Para escolher frases aleatoriamente

public class TypingTestGUI extends JFrame implements ActionListener {

    // Lista de frases para o teste
    private List<String> sentences = Arrays.asList(
            "Java é onde tudo é um objeto, inclusive a sua paciência.",
            "JavaScript, a linguagem que funciona, mas ninguém sabe como.",
            "Python é tão fácil que até seu cachorro consegue programar em cinco minutos.",
            "C++: porque compilar código devagar é um esporte radical.",
            "PHP a linguagem que te faz questionar todas as suas escolhas de carreira.",
            "SQL: o seu banco de dados é um aquário de problemas que você mesmo criou.",
            "Kotlin é Java, mas com esteroides e menos pontos e vírgulas.",
            "Front-end: a arte de transformar café em código para ver um botão no meio da tela.",
            "Back-end: onde a mágica acontece e ninguém do front-end entende.",
            "Meu código não tem bugs, ele tem features secretas."
    );

    private String currentSentence; // A frase atual para o teste
    private JTextArea displaySentenceArea;
    private JTextArea inputTextArea;
    private JButton startButton;
    private JButton resetButton;
    private JLabel timerLabel;
    private JLabel resultLabel;

    private long startTime;
    private boolean testStarted = false;
    private Random random = new Random(); // Para selecionar frases aleatoriamente

    public TypingTestGUI() {
        super("Typing Test Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 450); // Aumentei um pouco o tamanho da janela
        setLocationRelativeTo(null);

        setLayout(new BorderLayout(10, 10));

        // --- Painel Superior (Título e Frase Original) ---
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout(5, 5));
        topPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 0, 10));

        JLabel titleLabel = new JLabel("Bem-vindo ao Teste de Digitação!", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 22)); // Fonte maior
        topPanel.add(titleLabel, BorderLayout.NORTH);

        displaySentenceArea = new JTextArea();
        displaySentenceArea.setFont(new Font("Monospaced", Font.PLAIN, 18)); // Fonte maior
        displaySentenceArea.setEditable(false);
        displaySentenceArea.setLineWrap(true);
        displaySentenceArea.setWrapStyleWord(true);
        displaySentenceArea.setBackground(new Color(240, 240, 240));
        displaySentenceArea.setBorder(BorderFactory.createLineBorder(Color.GRAY));

        // Exibe a instrução inicial e a primeira frase aleatória
        selectNewSentence(); // Seleciona uma frase ao iniciar
        displaySentenceArea.setText("Escreva a seguinte frase:\n" + currentSentence);

        topPanel.add(new JScrollPane(displaySentenceArea), BorderLayout.CENTER);

        add(topPanel, BorderLayout.NORTH);

        // --- Painel Central (Área de Digitação e Botões) ---
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout(5, 5));
        centerPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));

        inputTextArea = new JTextArea();
        inputTextArea.setFont(new Font("Monospaced", Font.PLAIN, 18)); // Fonte maior
        inputTextArea.setLineWrap(true);
        inputTextArea.setWrapStyleWord(true);
        inputTextArea.setEnabled(false);
        inputTextArea.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        centerPanel.add(new JScrollPane(inputTextArea), BorderLayout.CENTER);

        JPanel controlPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        startButton = new JButton("Iniciar Teste");
        startButton.setFont(new Font("Arial", Font.BOLD, 16)); // Fonte maior
        startButton.addActionListener(this);

        resetButton = new JButton("Próxima Frase / Resetar"); // Botão multifuncional
        resetButton.setFont(new Font("Arial", Font.BOLD, 16)); // Fonte maior
        resetButton.addActionListener(this);
        resetButton.setEnabled(false);

        timerLabel = new JLabel("Tempo: 0.00s");
        timerLabel.setFont(new Font("Arial", Font.PLAIN, 18)); // Fonte maior

        controlPanel.add(startButton);
        controlPanel.add(resetButton);
        controlPanel.add(timerLabel);
        centerPanel.add(controlPanel, BorderLayout.SOUTH);

        add(centerPanel, BorderLayout.CENTER);

        // --- Painel Inferior (Resultados) ---
        resultLabel = new JLabel("Resultados: ", SwingConstants.CENTER);
        resultLabel.setFont(new Font("Arial", Font.BOLD, 20)); // Fonte maior
        resultLabel.setForeground(Color.DARK_GRAY);
        resultLabel.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
        add(resultLabel, BorderLayout.SOUTH);

        setVisible(true);
    }

    // Método para selecionar uma nova frase aleatoriamente
    private void selectNewSentence() {
        currentSentence = sentences.get(random.nextInt(sentences.size()));
        displaySentenceArea.setText("Escreva a seguinte frase:\n" + currentSentence);
    }

    // Calcula a precisão da digitação
    private double calculateAccuracy(String sentence, String my_sentence) {
        double chars = 0;
        int minLength = Math.min(sentence.length(), my_sentence.length());
        for (int i = 0; i < minLength; i++) {
            if (sentence.charAt(i) == my_sentence.charAt(i)) {
                chars++;
            }
        }
        if (sentence.length() == 0) return 100.0;
        return (chars / sentence.length()) * 100;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            if (!testStarted) {
                // Inicia o teste
                testStarted = true;
                startButton.setText("Finalizar Teste");
                inputTextArea.setText("");
                inputTextArea.setEnabled(true);
                inputTextArea.requestFocus();
                startTime = System.currentTimeMillis();
                timerLabel.setText("Digitando...");
                resultLabel.setText("Resultados: ");
                resetButton.setEnabled(false);
            } else {
                // Finaliza o teste
                testStarted = false;
                startButton.setText("Iniciar Teste");
                inputTextArea.setEnabled(false);
                resetButton.setEnabled(true); // Habilita o botão "Próxima Frase / Resetar"

                long endTime = System.currentTimeMillis();
                long totalTime = endTime - startTime;
                double seconds = totalTime / 1000.0;

                String mySentence = inputTextArea.getText();

                double words = currentSentence.split(" ").length;
                double wpm = (seconds > 0) ? (words / seconds) * 60 : 0;

                double accuracyPercentage;
                if (currentSentence.equals(mySentence)) {
                    accuracyPercentage = 100.0;
                } else {
                    accuracyPercentage = calculateAccuracy(currentSentence, mySentence);
                }

                String results = String.format("Tempo: %.2f s | WPM: %.2f | Precisão: %.2f%%", seconds, wpm, accuracyPercentage);
                resultLabel.setText("Resultados: " + results);

                if (accuracyPercentage == 100.0) {
                    resultLabel.setText("Resultados: " + results + " - Uau! Sua precisão é 100%!");
                    resultLabel.setForeground(Color.GREEN.darker());
                } else {
                    resultLabel.setForeground(Color.RED.darker()); // Cor vermelha para não 100% de precisão
                }
            }
        } else if (e.getSource() == resetButton) {
            // Reseta o teste para a próxima frase
            testStarted = false;
            startButton.setText("Iniciar Teste");
            inputTextArea.setText("");
            inputTextArea.setEnabled(false);
            timerLabel.setText("Tempo: 0.00s");
            resultLabel.setText("Resultados: ");
            resetButton.setEnabled(false);
            selectNewSentence(); // Seleciona uma nova frase
            resultLabel.setForeground(Color.DARK_GRAY); // Volta para a cor padrão
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TypingTestGUI());
    }
}