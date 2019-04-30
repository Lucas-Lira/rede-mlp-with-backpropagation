package prjtrabalhomlp_backpropagation;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.control.cell.PropertyValueFactory;
import modulos.FuncoesGerais;
import modulos.Registro;

public class TelaPrincipalController implements Initializable
{
    @FXML
    private JFXButton bmatconfusao;
    @FXML
    private JFXTextField txentrada;
    @FXML
    private JFXTextField txsaida;
    @FXML
    private JFXTextField txoculta;
    @FXML
    private RadioButton rblinear;
    @FXML
    private ToggleGroup funcao;
    @FXML
    private RadioButton rblogistica;
    @FXML
    private RadioButton rbhiperbolica;
    @FXML
    private JFXTextField txerro;
    @FXML
    private JFXTextField txiteracoes;
    @FXML
    private JFXTextField txn;
    @FXML
    private RadioButton rbnormal;
    @FXML
    private ToggleGroup execucao;
    @FXML
    private RadioButton rbpassoapasso;
    @FXML
    private JFXButton barquivo;
    @FXML
    private JFXButton bavancar;
    @FXML
    private TableView<Registro> tabeladados;
    @FXML
    private TableColumn<String, String> coltransicao1;
    @FXML
    private TableColumn<String, String> coltransicao2;
    @FXML
    private TableColumn<String, String> coltransicao3;
    @FXML
    private TableColumn<String, String> coltransicao4;
    @FXML
    private TableColumn<String, String> coltransicao5;
    @FXML
    private TableColumn<String, String> coltransicao6;
    @FXML
    private TableColumn<String, String> coltransicao7;
    @FXML
    private TableColumn<String, String> coltransicao8;
    @FXML
    private TableColumn<String, String> coltransicao9;
    @FXML
    private TableColumn<String, String> coltransicao10;
    @FXML
    private TableColumn<String, String> coltransicao11;
    @FXML
    private TableColumn<String, String> coltransicao12;
    @FXML
    private TableColumn<String, String> coltransicao13;
    @FXML
    private TableColumn<String, String> coltransicao14;
    @FXML
    private TableColumn<String, String> coltransicao15;
    @FXML
    private TableColumn<String, String> coltransicao16;
    @FXML
    private TableColumn<String, String> coltransicao17;
    @FXML
    private TableColumn<String, String> coltransicao18;
    @FXML
    private TableColumn<String, String> coltransicao19;
    @FXML
    private TableColumn<String, String> coltransicao20;
    @FXML
    private TableColumn<String, String> coltransicao21;
    @FXML
    private TableColumn<String, String> coltransicao22;
    @FXML
    private TableColumn<String, String> coltransicao23;
    @FXML
    private TableColumn<String, String> coltransicao24;
    @FXML
    private TableColumn<String, String> coltransicao25;
    @FXML
    private TableColumn<String, String> coltransicao26;
    @FXML
    private TableColumn<String, String> coltransicao27;
    @FXML
    private TableColumn<String, String> coltransicao28;
    @FXML
    private TableColumn<String, String> coltransicao29;
    @FXML
    private TableColumn<String, String> coltransicao30;
    @FXML
    private TableColumn<String, String> coltransicao31;
    @FXML
    private TableColumn<String, String> coltransicao32;
    @FXML
    private TableColumn<String, String> coltransicao33;
    @FXML
    private TableColumn<String, String> coltransicao34;
    @FXML
    private TableColumn<String, String> coltransicao35;
    @FXML
    private TableColumn<String, String> coltransicao36;
    @FXML
    private TableColumn<String, String> coltransicao37;
    @FXML
    private TableColumn<String, String> coltransicao38;
    @FXML
    private TableColumn<String, String> coltransicao39;
    @FXML
    private TableColumn<String, String> coltransicao40;
    @FXML
    private TableColumn<String, String> coltransicao41;
    @FXML
    private TableColumn<String, String> coltransicao42;
    @FXML
    private TableColumn<String, String> coltransicao43;
    @FXML
    private TableColumn<String, String> coltransicao44;
    @FXML
    private TableColumn<String, String> coltransicao45;
    @FXML
    private TableColumn<String, String> coltransicao46;
    @FXML
    private JFXButton binicializar;
    
    private List<TableColumn> list_colunas;
    private ArrayList<String> list_classes;
    private int colunas_adicionais;
    private int tf_tabela_dados;
    private ArrayList<ArrayList<Double>> list_dados;
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        barquivo.setTooltip(geraMsgB("Abrir Arquivo"));
        bavancar.setTooltip(geraMsgB("Avançar"));
        binicializar.setTooltip(geraMsgB("Inicializar"));
        bmatconfusao.setTooltip(geraMsgB("Visualizar Matriz de Confusão"));
        configurarTabelaColunas();
    }
    
    public static Tooltip geraMsgB(String msg)
    {
        Tooltip tt = new Tooltip();
        tt.setText(msg);
        tt.setStyle("-fx-font: normal bold 10 Langdon; "
            + "-fx-text-fill: white;"+"-fx-background-color:   #607D8B;");
        return tt;
    }
    
    public void informa(String str1, String str2)
    {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(str1);
        alert.setContentText(str2);
        alert.showAndWait();
    }
    
    public void estadoInicialTela()
    {
        txentrada.setDisable(false);
        txsaida.setDisable(false);
        
        txoculta.setDisable(true);
        txerro.setDisable(true);
        txiteracoes.setDisable(true);
        txn.setDisable(true);
        
        rbhiperbolica.setDisable(true);
        rblinear.setDisable(true);
        rblogistica.setDisable(true);
        rbnormal.setDisable(true);
        rbpassoapasso.setDisable(true);
        
        barquivo.setDisable(false);
        bavancar.setDisable(true);
        binicializar.setDisable(true);
        bmatconfusao.setDisable(true);
    }
    
    public void estadoArquivoCarregadoTela()
    {
        txentrada.setDisable(false);
        txsaida.setDisable(false);
        
        txoculta.setDisable(false);
        txerro.setDisable(false);
        txiteracoes.setDisable(false);
        txn.setDisable(false);
        
        rbhiperbolica.setDisable(false);
        rblinear.setDisable(false);
        rblogistica.setDisable(false);
        rbnormal.setDisable(false);
        rbpassoapasso.setDisable(false);
        
        barquivo.setDisable(true);
        bavancar.setDisable(false);
        binicializar.setDisable(false);
        bmatconfusao.setDisable(false);
    }
    
    public void estadoTestarDadosTela()
    {
        txentrada.setDisable(false);
        txsaida.setDisable(false);
        
        txoculta.setDisable(true);
        txerro.setDisable(true);
        txiteracoes.setDisable(true);
        txn.setDisable(true);
        
        rbhiperbolica.setDisable(true);
        rblinear.setDisable(true);
        rblogistica.setDisable(true);
        rbnormal.setDisable(true);
        rbpassoapasso.setDisable(true);
        
        barquivo.setDisable(true);
        bavancar.setDisable(false);
        binicializar.setDisable(false);
        bmatconfusao.setDisable(false);
    }
    
    public void configurarTabelaColunas()
    {
        coltransicao1.setCellValueFactory(new PropertyValueFactory<>("a0"));
        coltransicao2.setCellValueFactory(new PropertyValueFactory<>("a1"));
        coltransicao3.setCellValueFactory(new PropertyValueFactory<>("a2"));
        coltransicao4.setCellValueFactory(new PropertyValueFactory<>("a3"));
        coltransicao5.setCellValueFactory(new PropertyValueFactory<>("a4"));
        coltransicao6.setCellValueFactory(new PropertyValueFactory<>("a5"));
        coltransicao7.setCellValueFactory(new PropertyValueFactory<>("a6"));
        coltransicao8.setCellValueFactory(new PropertyValueFactory<>("a7"));
        coltransicao9.setCellValueFactory(new PropertyValueFactory<>("a8"));
        coltransicao10.setCellValueFactory(new PropertyValueFactory<>("a9"));
        coltransicao11.setCellValueFactory(new PropertyValueFactory<>("a10"));
        coltransicao12.setCellValueFactory(new PropertyValueFactory<>("a11"));
        coltransicao13.setCellValueFactory(new PropertyValueFactory<>("a12"));
        coltransicao14.setCellValueFactory(new PropertyValueFactory<>("a13"));
        coltransicao15.setCellValueFactory(new PropertyValueFactory<>("a14"));
        coltransicao16.setCellValueFactory(new PropertyValueFactory<>("a15"));
        coltransicao17.setCellValueFactory(new PropertyValueFactory<>("a16"));
        coltransicao18.setCellValueFactory(new PropertyValueFactory<>("a17"));
        coltransicao19.setCellValueFactory(new PropertyValueFactory<>("a18"));
        coltransicao20.setCellValueFactory(new PropertyValueFactory<>("a19"));
        coltransicao21.setCellValueFactory(new PropertyValueFactory<>("a20"));
        coltransicao22.setCellValueFactory(new PropertyValueFactory<>("a21"));
        coltransicao23.setCellValueFactory(new PropertyValueFactory<>("a22"));
        coltransicao24.setCellValueFactory(new PropertyValueFactory<>("a23"));
        coltransicao25.setCellValueFactory(new PropertyValueFactory<>("a24"));
        coltransicao26.setCellValueFactory(new PropertyValueFactory<>("a25"));
        coltransicao27.setCellValueFactory(new PropertyValueFactory<>("a26"));
        coltransicao28.setCellValueFactory(new PropertyValueFactory<>("a27"));
        coltransicao29.setCellValueFactory(new PropertyValueFactory<>("a28"));
        coltransicao30.setCellValueFactory(new PropertyValueFactory<>("a29"));
        coltransicao31.setCellValueFactory(new PropertyValueFactory<>("a30"));
        coltransicao32.setCellValueFactory(new PropertyValueFactory<>("a31"));
        coltransicao33.setCellValueFactory(new PropertyValueFactory<>("a32"));
        coltransicao34.setCellValueFactory(new PropertyValueFactory<>("a33"));
        coltransicao35.setCellValueFactory(new PropertyValueFactory<>("a34"));
        coltransicao36.setCellValueFactory(new PropertyValueFactory<>("a35"));
        coltransicao37.setCellValueFactory(new PropertyValueFactory<>("a36"));
        coltransicao38.setCellValueFactory(new PropertyValueFactory<>("a37"));
        coltransicao39.setCellValueFactory(new PropertyValueFactory<>("a38"));
        coltransicao40.setCellValueFactory(new PropertyValueFactory<>("a49"));
        coltransicao41.setCellValueFactory(new PropertyValueFactory<>("a40"));
        coltransicao42.setCellValueFactory(new PropertyValueFactory<>("a41"));
        coltransicao43.setCellValueFactory(new PropertyValueFactory<>("a42"));
        coltransicao44.setCellValueFactory(new PropertyValueFactory<>("a43"));
        coltransicao45.setCellValueFactory(new PropertyValueFactory<>("a44"));
        coltransicao46.setCellValueFactory(new PropertyValueFactory<>("a45"));
        
        inicializarListColunas();
        estadoInicialTela();
    }
    
    public void restartListColunas()
    {
        list_classes = new ArrayList();
        list_dados = null;
        tabeladados.getItems().clear();
        
        if(!txentrada.getText().isEmpty())
        {
            for(int i = 0; i < (Integer.parseInt(txentrada.getText()) + colunas_adicionais + 1); i++)
            {
                list_colunas.get(i).setVisible(false);
                list_colunas.get(i).setText("");
                list_colunas.get(i).setPrefWidth(40);
            }
        }
    }
    
    public void inicializarListColunas()
    {
        tabeladados.getItems().clear();
        colunas_adicionais = 2;
        tf_tabela_dados = 46;
        
        list_colunas = new ArrayList();
        list_colunas.add(coltransicao1);
        list_colunas.add(coltransicao2);
        list_colunas.add(coltransicao3);
        list_colunas.add(coltransicao4);
        list_colunas.add(coltransicao5);
        list_colunas.add(coltransicao6);
        list_colunas.add(coltransicao7);
        list_colunas.add(coltransicao8);
        list_colunas.add(coltransicao9);
        list_colunas.add(coltransicao10);
        list_colunas.add(coltransicao11);
        list_colunas.add(coltransicao12);
        list_colunas.add(coltransicao13);
        list_colunas.add(coltransicao14);
        list_colunas.add(coltransicao15);
        list_colunas.add(coltransicao16);
        list_colunas.add(coltransicao17);
        list_colunas.add(coltransicao18);
        list_colunas.add(coltransicao19);
        list_colunas.add(coltransicao20);
        list_colunas.add(coltransicao21);
        list_colunas.add(coltransicao22);
        list_colunas.add(coltransicao23);
        list_colunas.add(coltransicao24);
        list_colunas.add(coltransicao25);
        list_colunas.add(coltransicao26);
        list_colunas.add(coltransicao27);
        list_colunas.add(coltransicao28);
        list_colunas.add(coltransicao29);
        list_colunas.add(coltransicao30);
        list_colunas.add(coltransicao31);
        list_colunas.add(coltransicao32);
        list_colunas.add(coltransicao33);
        list_colunas.add(coltransicao34);
        list_colunas.add(coltransicao35);
        list_colunas.add(coltransicao36);
        list_colunas.add(coltransicao37);
        list_colunas.add(coltransicao38);
        list_colunas.add(coltransicao39);
        list_colunas.add(coltransicao40);
        list_colunas.add(coltransicao41);
        list_colunas.add(coltransicao42);
        list_colunas.add(coltransicao43);
        list_colunas.add(coltransicao44);
        list_colunas.add(coltransicao45);
        list_colunas.add(coltransicao46);
    }

    @FXML
    private void evtTabelaConfusao(ActionEvent event)
    {
    }
    
    public void addDadosColuna(int n_col, ArrayList list) // Para coluans adicionais
    {
        int size = list_dados.size();
        String[] vet;
        if(n_col >= 0 && n_col < (tf_tabela_dados - (colunas_adicionais + 1)))
            for(int i = 0; i < size; i++)
            {
                vet = tabeladados.getItems().get(i).getTotal();
                vet[n_col] = list.get(i).toString().toUpperCase();
                tabeladados.getItems().get(i).setTotal(vet);
            }
    }

    @FXML
    private void evtArquivo(ActionEvent event)
    {
        list_classes = new ArrayList();
        int[] camadas = new int[2];
        list_dados = FuncoesGerais.abrirArquivo(list_classes, camadas, tabeladados, list_colunas);
        /*
        ArrayList<ArrayList<ArrayList<Double>>> list_folds = FuncoesGerais.abrirArquivoKFold(list_classes, 
                camadas, tabeladados, list_colunas);
        if(list_folds != null && !list_folds.isEmpty())
        {
            txentrada.setText("" + camadas[0]);
            txsaida.setText("" + camadas[1]);
            
            // Média Aritmética:
            int camada_oculta = (int)Math.round(camadas[0] + camadas[1]) / 2;
            // Média geométrica:
            //int camada_oculta = (int)Math.round(Math.sqrt(camadas[0] * camadas[1]));
            
            txoculta.setText("" + camada_oculta);
            
            String[] vet;
            int n_col, n_lin = 0;
            System.out.println("\n\n-------------------------------------------------------------------------------------------------------------------------------------------------");
            for(int i = 0; i < list_folds.size(); i++)
            {
                System.out.println("FOLD [ " + (i + 1) + " ]:");
                for(int j = 0; j < list_folds.get(i).size(); j++)
                {
                    n_col = list_folds.get(i).get(j).size();
                    vet = tabeladados.getItems().get(n_lin).getTotal();
                    vet[n_col] = list_classes.get(n_lin).toString().toUpperCase();
                    tabeladados.getItems().get(n_lin).setTotal(vet);
                    n_lin++;
                    for(int k = 0; k < list_folds.get(i).get(j).size(); k++)
                    {
                        System.out.print("" + list_folds.get(i).get(j).get(k) + " ");
                    }
                    System.out.println("");
                }
                System.out.println("");
            }
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------\n\n");
            
            estadoArquivoCarregadoTela();
        }
        else
            informa("Aviso", "Erro ao tentar carregar o Arquivo Completo (possíveis motivos):\n"
                + "Erro interno durante o processo;\nA qtde de colunas excedem a [" 
                + (tf_tabela_dados - (colunas_adicionais + 1)) + "] posições;\n"
                + "Muitos valores inválidos foram inseridos comprometendo a Rede.");
        */
        if(list_dados != null && !list_dados.isEmpty())
        {
            txentrada.setText("" + camadas[0]);
            txsaida.setText("" + camadas[1]);
            
            // Média Aritmética:
            int camada_oculta = (int)Math.round(camadas[0] + camadas[1]) / 2;
            // Média geométrica:
            //int camada_oculta = (int)Math.round(Math.sqrt(camadas[0] * camadas[1]));
            
            txoculta.setText("" + camada_oculta);
            addDadosColuna(list_dados.get(0).size(), list_classes);
            estadoArquivoCarregadoTela();
        }
        else
            informa("Aviso", "Erro ao tentar carregar o Arquivo (possíveis motivos):\n"
                + "Erro interno durante o processo;\nA qtde de colunas excedem a [" 
                + (tf_tabela_dados - (colunas_adicionais + 1)) + "] posições;\n"
                + "Muitos valores inválidos foram inseridos comprometendo a Rede.");
    }

    @FXML
    private void evtAvancar(ActionEvent event)
    {
        estadoTestarDadosTela();
    }

    @FXML
    private void evtInicializar(ActionEvent event)
    {
        restartListColunas();
        
        txentrada.setText("");
        txerro.setText("");
        txiteracoes.setText("");
        txn.setText("");
        txoculta.setText("");
        txsaida.setText("");
        
        rblinear.setSelected(true);
        rbnormal.setSelected(true);
        
        estadoInicialTela();
    }
}