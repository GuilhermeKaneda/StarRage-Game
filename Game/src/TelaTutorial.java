import javax.swing.*;
import java.awt.*;

class TelaTutorial extends JFrame {

    // Construtor da classe TelaTutorial -------------------------------------------------------------------
    public TelaTutorial() {
        // Configurações básicas da janela
        setSize(1880, 1010); // Define o tamanho da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Define a operação de fechar a janela

        // Carregar a imagem de fundo ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        ImageIcon backgroundIcon = null;
        try {
            // Tenta carregar a imagem de fundo a partir dos recursos
            backgroundIcon = new ImageIcon(this.getClass().getResource("images/tutorial.gif"));
        } catch (Exception e) {
            // Imprime uma mensagem de erro se a imagem não for encontrada
            System.err.println("Erro ao carregar a imagem de fundo: " + e.getMessage());
        }

        // Painel principal com imagem de fundo
        BackgroundPanel mainPanel = new BackgroundPanel(backgroundIcon != null ? backgroundIcon.getImage() : null);
        mainPanel.setLayout(new GridBagLayout()); // Define o layout como GridBagLayout para melhor centralização
        mainPanel.setBackground(Color.BLACK); // Define a cor de fundo como preta

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Define o espaçamento entre os componentes

        add(mainPanel);
    }
}