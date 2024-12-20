package App;

import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Entities.Administrador;
import Entities.Fornecedor;
import Entities.Operario;
import Entities.Pessoa;
import Entities.Vendedor;





public class Visual implements ActionListener{

    private JFrame frame;
    private JTextField textField;
    private JTextField textField_1;
    private Container container;
    private JLabel titulo;
    private JLabel nome;
    private JTextField tnome;
    private JLabel numeroCelular;
    private JTextField tNumeroCelular;
    private JLabel sexo;
    private JRadioButton homem;
    private JRadioButton mulher;
    private ButtonGroup bGGeneroSexo;
    private JLabel dataNascimento;
    private JComboBox<String> dia;
    private JComboBox<String> mes;
    private JComboBox<String> ano;
    private JLabel endereco;
    private JTextArea tEndereco;
    private JCheckBox termoConcentimento;
    private JButton bSubmeter;
    private JButton bresetar;
    private JTextArea tAOutrasInformacoes;
    private JLabel mensagem;
    private JTextArea jTMensagemErro;
    private JRadioButton BotaoAdministrador;
    private JRadioButton BotaoOperario;
    private JRadioButton BotaoFornecedor;
    private JRadioButton BotaoVendedor;
    private JRadioButton BotaoPessoa;
    private JLabel ProfissaoLabel;
    private ButtonGroup ProfissoesGrupoBotao;
    private JLabel CodigoSetorLabel;
    private JTextField CodigoSetorTextField;
    private JTextField AjudaDeCustoTextField;
    private JLabel AjudaDeCustoLabel;
    private JLabel ValorCreditoLabel;
    private JTextField ValorCreditoTextField;
    private JLabel ValorDividaLabel;
    private JTextField ValorDividaTextField;
    private JLabel ValorProducaoLabel;
    private JTextField ValorProducaoTextField;
    private JLabel ValorVendasLabel;
    private JTextField ValorVendasTextField;
    private JLabel SalarioLabel;
    private JTextField SalarioTextField;
    private JTextField ImpostoTextField;
    private JLabel ImpostoLabel;
    private JLabel ComissaoLabel;
    private JTextField ComissaoTextField;

    private String dias[]
            = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
    private String meses[]
            = { "Jan", "Fev", "Mar", "Abr",
            "Mai", "Jun", "Jul", "Ago",
            "Set", "Out", "Nov", "Dez" };
    private String anos[]
            = { "1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019", "2020", "2021", "2022",};
    
    


    /*Construtor para inicializar os componentes das tela com valores padrões.*/

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Visual window = new Visual();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Visual() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {

        frame = new JFrame();
        frame.setTitle("Formulario de Registro");
        frame.setBounds(300, 90, 1138, 623);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        container = frame.getContentPane();
        container.setLayout(null);

        titulo = new JLabel("Formulário de Registro");
        titulo.setFont(new Font("Arial", Font.PLAIN, 25));
        titulo.setSize(300, 30);
        titulo.setLocation(313, 30);
        container.add(titulo);

        nome = new JLabel("Nome");
        nome.setFont(new Font("Arial", Font.PLAIN, 20));
        nome.setSize(100, 20);
        nome.setLocation(73, 98);
        container.add(nome);

        tnome = new JTextField();
        tnome.setFont(new Font("Arial", Font.PLAIN, 15));
        tnome.setSize(150, 20);
        tnome.setLocation(159, 100);
        container.add(tnome);

        numeroCelular = new JLabel("Celular");
        numeroCelular.setFont(new Font("Arial", Font.PLAIN, 20));
        numeroCelular.setSize(100, 20);
        numeroCelular.setLocation(73, 148);
        container.add(numeroCelular);

        tNumeroCelular = new JTextField();
        tNumeroCelular.setFont(new Font("Arial", Font.PLAIN, 15));
        tNumeroCelular.setSize(150, 20);
        tNumeroCelular.setLocation(159, 150);
        container.add(tNumeroCelular);

        sexo = new JLabel("Sexo");
        sexo.setFont(new Font("Arial", Font.PLAIN, 20));
        sexo.setSize(100, 20);
        sexo.setLocation(73, 198);
        container.add(sexo);

        homem = new JRadioButton("Homem");
        homem.setFont(new Font("Arial", Font.PLAIN, 15));
        homem.setSelected(true);
        homem.setSize(80, 20);
        homem.setLocation(159, 200);
        container.add(homem);

        mulher = new JRadioButton("Mulher");
        mulher.setFont(new Font("Arial", Font.PLAIN, 15));
        mulher.setSelected(false);
        mulher.setSize(80, 20);
        mulher.setLocation(241, 200);
        container.add(mulher);

        bGGeneroSexo = new ButtonGroup();
        bGGeneroSexo.add(homem);
        bGGeneroSexo.add(mulher);

        dataNascimento = new JLabel("Data Nascimento");
        dataNascimento.setFont(new Font("Arial", Font.PLAIN, 20));
        dataNascimento.setSize(110, 20);
        dataNascimento.setLocation(39, 248);
        container.add(dataNascimento);

        dia = new JComboBox<String>(dias);
        dia.setFont(new Font("Arial", Font.PLAIN, 15));
        dia.setSize(50, 20);
        dia.setLocation(159, 250);
        container.add(dia);

        mes = new JComboBox<String>(meses);
        mes.setFont(new Font("Arial", Font.PLAIN, 15));
        mes.setSize(60, 20);
        mes.setLocation(219, 250);
        container.add(mes);

        ano = new JComboBox<String>(anos);
        ano.setFont(new Font("Arial", Font.PLAIN, 15));
        ano.setSize(60, 20);
        ano.setLocation(289, 250);
        container.add(ano);

        endereco = new JLabel("Endereco");
        endereco.setFont(new Font("Arial", Font.PLAIN, 20));
        endereco.setSize(100, 20);
        endereco.setLocation(73, 299);
        container.add(endereco);

        tEndereco = new JTextArea();
        tEndereco.setFont(new Font("Arial", Font.PLAIN, 15));
        tEndereco.setSize(200, 75);
        tEndereco.setLocation(159, 300);
        tEndereco.setLineWrap(true);
        container.add(tEndereco);

        termoConcentimento = new JCheckBox("Aceitar termos e condições");
        termoConcentimento.setFont(new Font("Arial", Font.PLAIN, 15));
        termoConcentimento.setSize(250, 20);
        termoConcentimento.setLocation(313, 526);
        container.add(termoConcentimento);

        bSubmeter = new JButton("Enviar");
        bSubmeter.setFont(new Font("Arial", Font.PLAIN, 15));
        bSubmeter.setSize(100, 20);
        bSubmeter.setLocation(313, 553);
        bSubmeter.addActionListener((ActionListener) this);
        container.add(bSubmeter);

        bresetar = new JButton("Resetar");
        bresetar.setFont(new Font("Arial", Font.PLAIN, 15));
        bresetar.setSize(100, 20);
        bresetar.setLocation(423, 553);
        bresetar.addActionListener((ActionListener) this);
        container.add(bresetar);

        tAOutrasInformacoes = new JTextArea();
        tAOutrasInformacoes.setFont(new Font("Arial", Font.PLAIN, 15));
        tAOutrasInformacoes.setSize(300, 400);
        tAOutrasInformacoes.setLocation(798, 101);
        tAOutrasInformacoes.setLineWrap(true);
        tAOutrasInformacoes.setEditable(false);
        container.add(tAOutrasInformacoes);

        mensagem = new JLabel("");
        mensagem.setFont(new Font("Arial", Font.PLAIN, 20));
        mensagem.setSize(500, 25);
        mensagem.setLocation(280, 494);
        container.add(mensagem);

        jTMensagemErro = new JTextArea();
        jTMensagemErro.setFont(new Font("Arial", Font.PLAIN, 15));
        jTMensagemErro.setSize(200, 75);
        jTMensagemErro.setLocation(841, 123);
        jTMensagemErro.setLineWrap(true);
        container.add(jTMensagemErro);

        ProfissaoLabel = new JLabel("Profissão");
        ProfissaoLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        ProfissaoLabel.setBounds(73, 387, 100, 20);
        frame.getContentPane().add(ProfissaoLabel);

        BotaoPessoa = new JRadioButton("Pessoa");
        BotaoPessoa.setBounds(179, 389, 110, 23);
        frame.getContentPane().add(BotaoPessoa);
        
        BotaoAdministrador = new JRadioButton("Administrador");
        BotaoAdministrador.setBounds(179, 434, 110, 23);
        frame.getContentPane().add(BotaoAdministrador);

        BotaoOperario = new JRadioButton("Operário");
        BotaoOperario.setBounds(179, 412, 80, 20);
        frame.getContentPane().add(BotaoOperario);

        BotaoFornecedor = new JRadioButton("Fornecedor");
        BotaoFornecedor.setBounds(179, 459, 80, 20);
        frame.getContentPane().add(BotaoFornecedor);

        BotaoVendedor = new JRadioButton("Vendedor");
        BotaoVendedor.setSelected(false);
        BotaoVendedor.setBounds(179, 481, 80, 20);
        frame.getContentPane().add(BotaoVendedor);

        ProfissoesGrupoBotao = new ButtonGroup();
        ProfissoesGrupoBotao.add(BotaoAdministrador);
        ProfissoesGrupoBotao.add(BotaoOperario);
        ProfissoesGrupoBotao.add(BotaoFornecedor);
        ProfissoesGrupoBotao.add(BotaoVendedor);
        ProfissoesGrupoBotao.add(BotaoPessoa);

        
        CodigoSetorLabel = new JLabel("Código Setor");
        CodigoSetorLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        CodigoSetorLabel.setBounds(427, 95, 129, 31);
        frame.getContentPane().add(CodigoSetorLabel);
        	
        CodigoSetorTextField = new JTextField();
        CodigoSetorTextField.setFont(new Font("Arial", Font.PLAIN, 15));
        CodigoSetorTextField.setBounds(423, 124, 150, 20);
        frame.getContentPane().add(CodigoSetorTextField);

        AjudaDeCustoLabel = new JLabel("Ajuda de Custo (%)");
        AjudaDeCustoLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        AjudaDeCustoLabel.setBounds(627, 94, 173, 28);
        frame.getContentPane().add(AjudaDeCustoLabel);

        AjudaDeCustoTextField = new JTextField();
        AjudaDeCustoTextField.setFont(new Font("Arial", Font.PLAIN, 15));
        AjudaDeCustoTextField.setBounds(627, 124, 161, 20);
        frame.getContentPane().add(AjudaDeCustoTextField);

        ValorCreditoLabel = new JLabel("Valor Crédito (R$)");
        ValorCreditoLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        ValorCreditoLabel.setBounds(423, 178, 173, 20);
        frame.getContentPane().add(ValorCreditoLabel);

        ValorCreditoTextField = new JTextField();
        ValorCreditoTextField.setFont(new Font("Arial", Font.PLAIN, 15));
        ValorCreditoTextField.setBounds(423, 202, 150, 20);
        frame.getContentPane().add(ValorCreditoTextField);

        ValorDividaLabel = new JLabel("Valor Dívida (R$)");
        ValorDividaLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        ValorDividaLabel.setBounds(627, 178, 161, 20);
        frame.getContentPane().add(ValorDividaLabel);

        ValorDividaTextField = new JTextField();
        ValorDividaTextField.setFont(new Font("Arial", Font.PLAIN, 15));
        ValorDividaTextField.setBounds(627, 200, 161, 20);
        frame.getContentPane().add(ValorDividaTextField);

        ValorProducaoLabel = new JLabel("Valor Produção (R$)");
        ValorProducaoLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        ValorProducaoLabel.setBounds(423, 248, 185, 20);
        frame.getContentPane().add(ValorProducaoLabel);

        ValorProducaoTextField = new JTextField();
        ValorProducaoTextField.setFont(new Font("Arial", Font.PLAIN, 15));
        ValorProducaoTextField.setBounds(423, 272, 150, 20);
        frame.getContentPane().add(ValorProducaoTextField);

        ValorVendasLabel = new JLabel("Valor Vendas (R$)");
        ValorVendasLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        ValorVendasLabel.setBounds(628, 248, 182, 20);
        frame.getContentPane().add(ValorVendasLabel);

        ValorVendasTextField = new JTextField();
        ValorVendasTextField.setFont(new Font("Arial", Font.PLAIN, 15));
        ValorVendasTextField.setBounds(627, 272, 161, 20);
        frame.getContentPane().add(ValorVendasTextField);
        
        SalarioLabel = new JLabel("Salário (R$)");
        SalarioLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        SalarioLabel.setBounds(427, 315, 129, 30);
        frame.getContentPane().add(SalarioLabel);
        
        SalarioTextField = new JTextField();
        SalarioTextField.setBounds(423, 344, 150, 19);
        frame.getContentPane().add(SalarioTextField);
        SalarioTextField.setColumns(10);
        
        ImpostoLabel = new JLabel("Imposto (%)");
        ImpostoLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        ImpostoLabel.setBounds(627, 320, 129, 20);
        frame.getContentPane().add(ImpostoLabel);
        
        ImpostoTextField = new JTextField();
        ImpostoTextField.setBounds(627, 344, 161, 20);
        frame.getContentPane().add(ImpostoTextField);
        ImpostoTextField.setColumns(10);
        
        ComissaoLabel = new JLabel("Comissão (%)");
        ComissaoLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        ComissaoLabel.setBounds(423, 389, 150, 17);
        frame.getContentPane().add(ComissaoLabel);
        
        ComissaoTextField = new JTextField();
        ComissaoTextField.setBounds(423, 412, 150, 20);
        frame.getContentPane().add(ComissaoTextField);
        ComissaoTextField.setColumns(10);
        
        

        frame.setVisible(true);

    }

    public void erroCondicao(){
        tAOutrasInformacoes.setText("");
        jTMensagemErro.setText("");
        mensagem.setText("Por favor, aceite os termos e condições");
        mensagem.setForeground(Color.RED);
    }

    public void erroDados(){
        tAOutrasInformacoes.setText("");
        jTMensagemErro.setText("");
        mensagem.setText("Por favor, preencha todos os dados de vermelho");
        mensagem.setForeground(Color.RED);
    }
    
    public void erroDadosPadrao()
    {
    	
    	nome.setForeground(Color.RED);
    	endereco.setForeground(Color.RED);
    	numeroCelular.setForeground(Color.RED);
    }
    
    public void resetarCores()
    {
    	SalarioLabel.setForeground(Color.BLACK);
    	CodigoSetorLabel.setForeground(Color.BLACK);
    	AjudaDeCustoLabel.setForeground(Color.BLACK);
    	ValorProducaoLabel.setForeground(Color.BLACK);
    	ValorVendasLabel.setForeground(Color.BLACK);
    	ValorCreditoLabel.setForeground(Color.BLACK);
    	ValorDividaLabel.setForeground(Color.BLACK);
    	nome.setForeground(Color.BLACK);
    	numeroCelular.setForeground(Color.BLACK);
    	endereco.setForeground(Color.BLACK);
    	ImpostoLabel.setForeground(Color.BLACK);
    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == bSubmeter) {
            if (termoConcentimento.isSelected()) {
                String dados1;
                
                String dados
                        = "Nome : "
                        + tnome.getText() + "\n";
                
                if (homem.isSelected())
                    dados1 = "Sexo : Homem"
                            + "\n";
                else
                    dados1 = "Sexo : Mulher"
                            + "\n";
                String dados2
                        = "Data Nascimento : "
                        + (String)dia.getSelectedItem()
                        + "/" + (String)mes.getSelectedItem()
                        + "/" + (String)ano.getSelectedItem()
                        + "\n";


                //Aqui podemos usar os dados obtidos para montar uma pessoa.
                //Achar se é homem ou mulher
                String sexo = null;
                if(homem.isSelected())
                    sexo = "H";
                else
                    sexo = "M";
                //Montar o objeto Date
                int d = Integer.parseInt(dia.getSelectedItem().toString());
                //Teste dos meses
                int m = -9;
                if(mes.getSelectedItem().toString().equals("Jan"))
                    m = 0;
                if(mes.getSelectedItem().toString().equals("Fev"))
                    m = 1;
                if(mes.getSelectedItem().toString().equals("Mar"))
                    m = 2;
                if(mes.getSelectedItem().toString().equals("Abr"))
                    m = 3;
                if(mes.getSelectedItem().toString().equals("Mai"))
                    m = 4;
                if(mes.getSelectedItem().toString().equals("Jun"))
                    m = 5;
                if(mes.getSelectedItem().toString().equals("Jul"))
                    m = 6;
                if(mes.getSelectedItem().toString().equals("Ago"))
                    m = 7;
                if(mes.getSelectedItem().toString().equals("Set"))
                    m = 8;
                if(mes.getSelectedItem().toString().equals("Out"))
                    m = 9;
                if(mes.getSelectedItem().toString().equals("Nov"))
                    m = 10;
                if(mes.getSelectedItem().toString().equals("Dez"))
                    m = 11;


                int a = Integer.parseInt(ano.getSelectedItem().toString());


                Date dataNascimentoPessoa = new Date(d, m, a);
                Pessoa pessoa = new Pessoa(tnome.getText(), tEndereco.getText(), sexo, dataNascimentoPessoa);
                pessoa.setTelefone(tNumeroCelular.getText());
                
                
                
                String dados3 = "Endereco : " + tEndereco.getText();
                
                if(BotaoPessoa.isSelected())
                {
                	if(tEndereco.getText().isEmpty() || !pessoa.isValidNome(tnome.getText())) //|| !pessoa.isValidTelefone(tNumeroCelular.getText())) 
                	{
                		erroDadosPadrao();
                		erroDados();
                	}
                	else
                	{
                		resetarCores();
                		pessoa.setCargo("Desempregado");
                		String dados4 = pessoa.telefoneFormatado(tNumeroCelular.getText());
                		tAOutrasInformacoes.setText(dados + dados4 + "\n" + dados1 + dados2 + dados3 + "\n\n");
                		tAOutrasInformacoes.setEditable(false);
                		mensagem.setText("Registrado com sucesso!");
                	}
                }

                if(BotaoAdministrador.isSelected() )
                {
                    if(SalarioTextField.getText().isEmpty() || CodigoSetorTextField.getText().isEmpty() || 
                    		AjudaDeCustoTextField.getText().isEmpty() || ImpostoTextField.getText().isEmpty())
                    {
                    	SalarioLabel.setForeground(Color.RED);
                    	CodigoSetorLabel.setForeground(Color.RED);
                    	AjudaDeCustoLabel.setForeground(Color.RED);
                    	ImpostoLabel.setForeground(Color.RED);
                    	
                        erroDados();
                    }
                    else
                    {	
                    	Integer CodSetor = Integer.parseInt(CodigoSetorTextField.getText());
                    	Administrador administrador = new Administrador(CodSetor, pessoa);
                    	
                    	if(!administrador.isSalarioValid(SalarioTextField.getText()) || 
                    	   !administrador.isAjudaDeCustoValid(AjudaDeCustoTextField.getText()) ||
                    	   !administrador.isCodigoSetorValid(CodigoSetorTextField.getText()) ||
                    	   !administrador.isImpostoValid(ImpostoTextField.getText()))
                    	{ 
                    		SalarioLabel.setForeground(Color.RED);
                    		AjudaDeCustoLabel.setForeground(Color.RED);
                    		CodigoSetorLabel.setForeground(Color.RED);
                    		ImpostoLabel.setForeground(Color.RED);
                    		erroDados();
                    	}
                    	
                    	resetarCores();
                    	
                    	administrador.setImposto(ImpostoTextField.getText());
                    	administrador.setSalarioBase(SalarioTextField.getText());
                    	administrador.setAjudaDeCusto(AjudaDeCustoTextField.getText());
                    	administrador.setCargo("Administrador");
                        String dados4 = "Cargo: " + administrador.getCargo() + "\n";
                        String dados5 = "Salario: R$" + String.valueOf(administrador.calcularSalario());
                        tAOutrasInformacoes.setText(dados + dados1 + dados2 + dados3 + dados4 + dados5 + "\n\n");
                        tAOutrasInformacoes.setEditable(false);
                        mensagem.setText("Registrado com Sucesso...");
                    }
                }

                if(BotaoOperario.isSelected()){
                    if(ValorProducaoTextField.getText().isEmpty() || SalarioTextField.getText().isEmpty() || 
                    		CodigoSetorTextField.getText().isEmpty() || ImpostoTextField.getText().isEmpty() ||
                    		ComissaoTextField.getText().isEmpty())
                    {
                    	SalarioLabel.setForeground(Color.RED);
                    	CodigoSetorLabel.setForeground(Color.RED);
                    	ValorProducaoLabel.setForeground(Color.RED);
                    	ImpostoLabel.setForeground(Color.RED);
                    	ComissaoLabel.setForeground(Color.RED);
                        erroDados();
                    }
                    else
                    {
                    	
                        Integer CodSetor = Integer.parseInt(CodigoSetorTextField.getText());
                    	Operario operario = new Operario(CodSetor, pessoa);
                    	
                    	if(!operario.isSalarioValid(SalarioTextField.getText()) || 
                         	   !operario.isValorProducaoValid(ValorProducaoTextField.getText()) ||
                         	   !operario.isCodigoSetorValid(CodigoSetorTextField.getText()) ||
                         	   !operario.isImpostoValid(ImpostoTextField.getText()) ||
                         	   !operario.isComissaoValid(ComissaoTextField.getText()))
                         	{ 
                         		SalarioLabel.setForeground(Color.RED);
                         		ValorProducaoLabel.setForeground(Color.RED);
                         		CodigoSetorLabel.setForeground(Color.RED);
                         		ImpostoLabel.setForeground(Color.RED);
                         		ComissaoLabel.setForeground(Color.RED);
                         		erroDados();
                         	}
                    	
                    	resetarCores();
                    	
                    	operario.setComissao(ComissaoTextField.getText());
                    	operario.setImposto(ImpostoTextField.getText());
                    	operario.setSalarioBase(SalarioTextField.getText());
                    	operario.setValorProducao(ValorProducaoTextField.getText());
                    	operario.setCargo("Operário");
                    	String dados4 = "Cargo: " + operario.getCargo();
                    	String dados5 = "Salario: R$" + String.valueOf(operario.calcularSalario());
                    	tAOutrasInformacoes.setText(dados + dados1 + dados2 + dados3 + dados4 + "\n" + dados5 + "\n\n");
                    	tAOutrasInformacoes.setEditable(false);
                    	mensagem.setText("Registrado com Sucesso...");
                    }
                }

                if(BotaoVendedor.isSelected()) 
                {
                    if (ValorVendasTextField.getText().isEmpty() || SalarioTextField.getText().isEmpty() || 
                    		CodigoSetorTextField.getText().isEmpty() || ImpostoTextField.getText().isEmpty() ||
                    		ComissaoTextField.getText().isEmpty()) 
                    {
                    	SalarioLabel.setForeground(Color.RED);
                    	CodigoSetorLabel.setForeground(Color.RED);
                    	ValorVendasLabel.setForeground(Color.RED);
                    	ImpostoLabel.setForeground(Color.RED);
                    	ComissaoLabel.setForeground(Color.RED);
                        erroDados();
                    } 
                    else 
                    {
                    	
                    	Integer CodSetor = Integer.parseInt(CodigoSetorTextField.getText());
                    	Vendedor vendedor = new Vendedor(CodSetor, pessoa);
                    	
                    	if(!vendedor.isSalarioValid(SalarioTextField.getText()) || 
                         	   !vendedor.isValorVendasValid(ValorVendasTextField.getText()) ||
                         	   !vendedor.isCodigoSetorValid(CodigoSetorTextField.getText()) ||
                         	   !vendedor.isImpostoValid(ImpostoTextField.getText()) ||
                         	   !vendedor.isComissaoValid(ComissaoTextField.getText()))
                         	{ 
                         		SalarioLabel.setForeground(Color.RED);
                         		AjudaDeCustoLabel.setForeground(Color.RED);
                         		CodigoSetorLabel.setForeground(Color.RED);
                         		ImpostoLabel.setForeground(Color.RED);
                         		ComissaoLabel.setForeground(Color.RED);
                         		erroDados();
                         	}
                    	
                    	resetarCores();
                    	
                    	vendedor.setComissao(ComissaoTextField.getText());
                    	vendedor.setImposto(ImpostoTextField.getText());
                    	vendedor.setSalarioBase(SalarioTextField.getText());
                    	vendedor.setValorVendas(ValorProducaoTextField.getText());
                    	vendedor.setCargo("Operário");
                    	String dados4 = "Cargo: " + vendedor.getCargo();
                    	String dados5 = "Salario: R$" + String.valueOf(vendedor.calcularSalario());
                    	tAOutrasInformacoes.setText(dados + dados1 + dados2 + dados3 + dados4 + dados5 + "\n\n");
                    	tAOutrasInformacoes.setEditable(false);
                    	mensagem.setText("Registrado com Sucesso...");
                    }
                }

                if(BotaoFornecedor.isSelected()) 
                {
                    if (ValorCreditoTextField.getText().isEmpty() || ValorDividaTextField.getText().isEmpty()) 
                    {
                    	ValorCreditoLabel.setForeground(Color.RED);
                    	ValorDividaLabel.setForeground(Color.RED);
                        erroDados();
                    } 
                    else 
                    {
                    	 
                    	 Integer CodSetor = Integer.parseInt(CodigoSetorTextField.getText());
                    	 Fornecedor fornecedor = new Fornecedor(pessoa);
                    	 
                    	 if(!fornecedor.isValorDividaValid(ValorDividaTextField.getText()) ||
                    		!fornecedor.isValorCreditoValid(ValorCreditoTextField.getText()))
                          	{ 
                          		ValorDividaLabel.setForeground(Color.RED);
                          		ValorCreditoLabel.setForeground(Color.RED);
                          		erroDados();
                          	}
                    	 
                    	 resetarCores();
                    	 
                    	 fornecedor.setValorCredito(ValorCreditoTextField.getText());
                    	 fornecedor.setValorDivida(ValorDividaTextField.getText());
                    	 fornecedor.setCargo("Operário");
                    	 String dados4 = "Cargo: " + fornecedor.getCargo() + "\n";
                    	 String dados5 = "Salario: R$" + String.valueOf(fornecedor.obterSaldo());
                    	 tAOutrasInformacoes.setText(dados + dados1 + dados2 + dados3 + dados4 + dados5 + "\n\n");
                    	 tAOutrasInformacoes.setEditable(false);
                    	 mensagem.setText("Registrado com Sucesso...");
                    }
                }

            }
            else 
            {
                erroCondicao();
            }
        }

        else if (e.getSource() == bresetar) 
        {
            String def = "";
            tnome.setText(def);
            tEndereco.setText(def);
            tNumeroCelular.setText(def);
            mensagem.setText(def);
            tAOutrasInformacoes.setText(def);
            termoConcentimento.setSelected(false);
            dia.setSelectedIndex(0);
            mes.setSelectedIndex(0);
            ano.setSelectedIndex(0);
            jTMensagemErro.setText(def);
            ValorCreditoTextField.setText(def);
            ValorDividaTextField.setText(def);
            ValorVendasTextField.setText(def);
            ValorProducaoTextField.setText(def);
            AjudaDeCustoTextField.setText(def);
            SalarioTextField.setText(def);
            CodigoSetorTextField.setText(def);
            resetarCores();
        }
    }
}