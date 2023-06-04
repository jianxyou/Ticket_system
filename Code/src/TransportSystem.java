import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TransportSystem {
    private ArrayList<String> avions = new ArrayList<>();
    private ArrayList<String> bateaux = new ArrayList<>();
    private ArrayList<String> trains = new ArrayList<>();
    private ArrayList<String> compagnies = new ArrayList<>();
    private ArrayList<String> lieux = new ArrayList<>();
    private ArrayList<String> itineraires = new ArrayList<>();

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TransportSystem().createAndShowGUI();
        });
    }

    private void createAndShowGUI() {
        JFrame mainFrame = new JFrame("Système de transport");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(500, 300);

        JPanel mainPanel = new JPanel();
        mainFrame.add(mainPanel);

        JButton serverButton = new JButton("Serveur");
        JButton clientButton = new JButton("Client");
        mainPanel.add(serverButton);
        mainPanel.add(clientButton);

        serverButton.addActionListener(e -> {
            mainFrame.dispose();
            createServerGUI();
        });

        clientButton.addActionListener(e -> {
            mainFrame.dispose();
            createClientGUI();
        });

        mainFrame.setVisible(true);
    }

    private void createServerGUI() {
        JFrame serverFrame = new JFrame("Serveur");
        serverFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        serverFrame.setSize(600, 400);

        JPanel serverPanel = new JPanel();
        serverFrame.add(serverPanel);

        JButton avionButton = new JButton("Avion");
        JButton bateauButton = new JButton("Bateau");
        JButton trainButton = new JButton("Train");
        serverPanel.add(avionButton);
        serverPanel.add(bateauButton);
        serverPanel.add(trainButton);

        avionButton.addActionListener(e -> {
            serverFrame.dispose();
            createAvionGUI();
        });

        bateauButton.addActionListener(e -> {
            serverFrame.dispose();
            createOperationGUI("Opération bateau");
        });

        trainButton.addActionListener(e -> {
            serverFrame.dispose();
            createOperationGUI("Opération train");
        });

        serverFrame.setVisible(true);
    }

    private void createAvionGUI() {
        JFrame avionFrame = new JFrame("Avion");
        avionFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        avionFrame.setSize(400, 300);

        JPanel avionPanel = new JPanel();
        avionFrame.add(avionPanel);

        JButton compagnieButton = new JButton("Compagnie");
        JButton lieuButton = new JButton("Lieu");
        JButton itineraireButton = new JButton("Itinéraire");
        avionPanel.add(compagnieButton);
        avionPanel.add(lieuButton);
        avionPanel.add(itineraireButton);

        compagnieButton.addActionListener(e -> {
            avionFrame.dispose();
            createOperationGUI("Opération compagnie");
        });

        lieuButton.addActionListener(e -> {
            avionFrame.dispose();
            createOperationGUI("Opération lieu");
        });

        itineraireButton.addActionListener(e -> {
            avionFrame.dispose();
            createOperationGUI("Opération itinéraire");
        });

        avionFrame.setVisible(true);
        JButton retourButton = new JButton("Retour");
        avionPanel.add(retourButton);
        retourButton.addActionListener(e -> {
            avionFrame.dispose();
            createServerGUI();
        });

        avionFrame.setVisible(true);
    }

    private void createOperationGUI(String title) {
        JFrame operationFrame = new JFrame(title);
        operationFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        operationFrame.setSize(400, 300);
        JPanel operationPanel = new JPanel();
        operationFrame.add(operationPanel);
    
        JButton addButton = new JButton("Ajouter");
        JButton deleteButton = new JButton("Supprimer");
        JButton updateButton = new JButton("Mettre à jour");
        operationPanel.add(addButton);
        operationPanel.add(deleteButton);
        operationPanel.add(updateButton);
    
        addButton.addActionListener(e -> {
            String code = JOptionPane.showInputDialog(operationFrame, "Veuillez saisir le code:");
            if (code != null && !code.trim().isEmpty()) {
                switch (title) {
                    case "Opération avion":
                        avions.add(code);
                        System.out.println("Avion ajouté: " + code);
                        break;
                    case "Opération bateau":
                        bateaux.add(code);
                        System.out.println("Bateau ajouté: " + code);
                        break;
                    case "Opération train":
                        trains.add(code);
                        System.out.println("Train ajouté: " + code);
                        break;
                    case "Opération compagnie":
                        compagnies.add(code);
                        System.out.println("Compagnie ajoutée: " + code);
                        break;
                    case "Opération lieu":
                        lieux.add(code);
                        System.out.println("Lieu ajouté: " + code);
                        break;
                    case "Opération itinéraire":
                        itineraires.add(code);
                        System.out.println("Itinéraire ajouté: " + code);
                        break;
                }
            } else {
                JOptionPane.showMessageDialog(operationFrame, "Veuillez saisir un code valide", "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        });
        deleteButton.addActionListener(e -> {
            String code = JOptionPane.showInputDialog(operationFrame, "Veuillez saisir le code à supprimer:");
            if (code != null && !code.trim().isEmpty()) {
                switch (title) {
                    case "Opération avion":
                        avions.remove(code);
                        System.out.println("Avion supprimé: " + code);
                        break;
                    case "Opération bateau":
                        bateaux.remove(code);
                        System.out.println("Bateau supprimé: " + code);
                        break;
                    case "Opération train":
                        trains.remove(code);
                        System.out.println("Train supprimé: " + code);
                        break;
                    case "Opération compagnie":
                        compagnies.remove(code);
                        System.out.println("Compagnie supprimée: " + code);
                        break;
                    case "Opération lieu":
                        lieux.remove(code);
                        System.out.println("Lieu supprimé: " + code);
                        break;
                    case "Opération itinéraire":
                        itineraires.remove(code);
                        System.out.println("Itinéraire supprimé: " + code);
                        break;
                }
            } else {
                JOptionPane.showMessageDialog(operationFrame, "Veuillez saisir un code valide", "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        });

            updateButton.addActionListener(e -> {
            String oldCode = JOptionPane.showInputDialog(operationFrame, "Veuillez saisir le code à mettre à jour:");
            String newCode = JOptionPane.showInputDialog(operationFrame, "Veuillez saisir le nouveau code:");

            if (oldCode != null && !oldCode.trim().isEmpty() && newCode != null && !newCode.trim().isEmpty()) {
                switch (title) {
                    case "Opération avion":
                        avions.remove(oldCode);
                        avions.add(newCode);
                        System.out.println("Avion mis à jour: " + oldCode + " -> " + newCode);
                        break;
                    case "Opération bateau":
                        bateaux.remove(oldCode);
                        bateaux.add(newCode);
                        System.out.println("Bateau mis à jour: " + oldCode + " -> " + newCode);
                        break;
                    case "Opération train":
                        trains.remove(oldCode);
                        trains.add(newCode);
                        System.out.println("Train mis à jour:" + oldCode + " -> " + newCode);
                        break;
                        case "Opération compagnie":
                        compagnies.remove(oldCode);
                        compagnies.add(newCode);
                        System.out.println("Compagnie mise à jour: " + oldCode + " -> " + newCode);
                        break;
                        case "Opération lieu":
                        lieux.remove(oldCode);
                        lieux.add(newCode);
                        System.out.println("Lieu mis à jour: " + oldCode + " -> " + newCode);
                        break;
                        case "Opération itinéraire":
                        itineraires.remove(oldCode);
                        itineraires.add(newCode);
                        System.out.println("Itinéraire mis à jour: " + oldCode + " -> " + newCode);
                        break;
                        }
                        } else {
                        JOptionPane.showMessageDialog(operationFrame, "Veuillez saisir des codes valides", "Erreur", JOptionPane.ERROR_MESSAGE);
                        }
                        });
                        
                        
        

    

    
        JButton backButton = new JButton("Retour");
        operationPanel.add(backButton);
        backButton.addActionListener(e -> {
            operationFrame.dispose();
            if (title.equals("Opération avion") || title.equals("Opération bateau") || title.equals("Opération train")) {
                createServerGUI();
            } else {
                createAvionGUI();
            }
        });
    
        operationFrame.setVisible(true);
    }
    
    private void createClientGUI() {
        JFrame clientFrame = new JFrame("Client");
        clientFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        clientFrame.setSize(600, 400);
    
        JPanel clientPanel = new JPanel();
        clientFrame.add(clientPanel);
    
        JButton avionButton = new JButton("Billet d'avion");
        JButton bateauButton = new JButton("Billet de bateau");
        JButton trainButton = new JButton("Billet de train");
        clientPanel.add(avionButton);
        clientPanel.add(bateauButton);
        clientPanel.add(trainButton);
    
        ActionListener clientActionListener = e -> {
            String actionCommand = e.getActionCommand();
            createSelectionGUI("Sélection " + actionCommand);
        };
    
        avionButton.addActionListener(clientActionListener);
        bateauButton.addActionListener(clientActionListener);
        trainButton.addActionListener(clientActionListener);
    
        clientFrame.setVisible(true);
    }
    
    private void createSelectionGUI(String title) {
        JFrame selectionFrame = new JFrame(title);
        selectionFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        selectionFrame.setSize(400, 300);
    
        JPanel selectionPanel = new JPanel();
        selectionFrame.add(selectionPanel);

        String[] exampleData = {"aaa", "bbb", ""};
    
        JList<String> selectionList = new JList<>(exampleData);
        JScrollPane scrollPane = new JScrollPane(selectionList);
        selectionPanel.add(scrollPane);
        JButton purchaseButton = new JButton("Acheter");
        selectionPanel.add(purchaseButton);
    
        purchaseButton.addActionListener(e -> {
            int selectedIndex = selectionList.getSelectedIndex();
            if (selectedIndex != -1) {
                String selectedItem = selectionList.getSelectedValue();
                System.out.println("Achat: " + selectedItem);
            } else {
                JOptionPane.showMessageDialog(selectionFrame, "Veuillez sélectionner une option", "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        });
    
        selectionFrame.setVisible(true);
        JButton retourButton = new JButton("Retour");
        selectionPanel.add(retourButton);
        retourButton.addActionListener(e -> {
            selectionFrame.dispose();
            createClientGUI();
        });
    
        selectionFrame.setVisible(true);
    }
}
    
    
