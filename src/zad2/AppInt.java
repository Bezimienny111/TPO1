package zad2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;

import com.badlogic.gdx.utils.Json;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;

import net.miginfocom.swing.MigLayout;
import java.awt.CardLayout;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JTextPane;

public class AppInt {

	JFrame frame;
	

	public JTextField getDisplayTextField() {
		return cityName;
	}

	public void setDisplayTextField(JTextField displayTextField) {
		this.cityName = displayTextField;
	}
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JTextField getCityName() {
		return cityName;
	}

	public void setCityName(JTextField cityName) {
		this.cityName = cityName;
	}

	public JTextField getDescField() {
		return descField;
	}

	public void setDescField(JTextField descField) {
		this.descField = descField;
	}

	public JTextField getDetailField() {
		return detailField;
	}

	public void setDetailField(JTextField detailField) {
		this.detailField = detailField;
	}

	public JTextField getPressField() {
		return pressField;
	}

	public void setPressField(JTextField pressField) {
		this.pressField = pressField;
	}

	public JTextField getTempfield() {
		return tempfield;
	}

	public void setTempfield(JTextField tempfield) {
		this.tempfield = tempfield;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JPanel getPanel_2() {
		return panel_2;
	}

	public void setPanel_2(JPanel panel_2) {
		this.panel_2 = panel_2;
	}

	public JPanel getPanel_3() {
		return panel_3;
	}

	public void setPanel_3(JPanel panel_3) {
		this.panel_3 = panel_3;
	}

	public JPanel getPanel_4() {
		return panel_4;
	}

	public void setPanel_4(JPanel panel_4) {
		this.panel_4 = panel_4;
	}

	public JPanel getPanel_5() {
		return panel_5;
	}

	public void setPanel_5(JPanel panel_5) {
		this.panel_5 = panel_5;
	}

	public JTextField getTxtMiasto() {
		return txtMiasto;
	}

	public void setTxtMiasto(JTextField txtMiasto) {
		this.txtMiasto = txtMiasto;
	}

	public JTextField getTxtTemperatura() {
		return txtTemperatura;
	}

	public void setTxtTemperatura(JTextField txtTemperatura) {
		this.txtTemperatura = txtTemperatura;
	}

	public JTextField getTxtCisnienie() {
		return txtCisnienie;
	}

	public void setTxtCisnienie(JTextField txtCisnienie) {
		this.txtCisnienie = txtCisnienie;
	}

	public JTextField getTxtDetale() {
		return txtDetale;
	}

	public void setTxtDetale(JTextField txtDetale) {
		this.txtDetale = txtDetale;
	}

	public JTextField getTxtOpis() {
		return txtOpis;
	}

	public void setTxtOpis(JTextField txtOpis) {
		this.txtOpis = txtOpis;
	}
	private JTextField cityName;
	private JTextField descField;
	private JTextField detailField;
	private JTextField pressField;
	private JTextField tempfield;
	private JPanel panel;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JTextField txtMiasto;
	private JTextField txtTemperatura;
	private JTextField txtCisnienie;
	private JTextField txtDetale;
	private JTextField txtOpis;
	private JPanel panel_6;
	private JTextField txtJakiemiasto;
	private JTextField inCountryFIeld;
	private JTextField txtJakie;
	private JTextField inCityField;
	private JButton setButton;
	private JLabel lblUzywajJezykaAngielskiego;
	private JLabel label_1;
	private JLabel label_2;
	private JPanel panel_7;
	private JPanel panel_8;
	private JTextField txtKursy;
	private JTextField txtWpiszWalute;
	private JTextField currInField;
	private JTextField KursKraju;
	private JTextField outCurrCountry;
	private JTextField txtKursNbp;
	private JTextField currOutNBP;
	private JButton countCurr;
	private JPanel panel_9;
	private JTextPane txtUzywajJezykaAngielskiego;

	
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppInt window = new AppInt();
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
	public AppInt() {
		initialize();
		this.frame.setMinimumSize(new Dimension(600,480));
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.EAST);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		panel = new JPanel();
		panel_1.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		txtMiasto = new JTextField();
		txtMiasto.setText("Miasto");
		txtMiasto.setEditable(false);
		panel.add(txtMiasto, BorderLayout.NORTH);
		txtMiasto.setColumns(10);
		
		cityName = new JTextField();
		panel.add(cityName);
		cityName.setEditable(false);
		cityName.setColumns(10);
		
		panel_2 = new JPanel();
		panel_1.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		txtTemperatura = new JTextField();
		txtTemperatura.setText("Temperatura");
		txtTemperatura.setEditable(false);
		panel_2.add(txtTemperatura, BorderLayout.NORTH);
		txtTemperatura.setColumns(10);
		
		tempfield = new JTextField();
		panel_2.add(tempfield);
		tempfield.setEditable(false);
		tempfield.setColumns(10);
		
		panel_3 = new JPanel();
		panel_1.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		txtCisnienie = new JTextField();
		txtCisnienie.setEditable(false);
		txtCisnienie.setText("Cisnienie");
		panel_3.add(txtCisnienie, BorderLayout.NORTH);
		txtCisnienie.setColumns(10);
		
		pressField = new JTextField();
		panel_3.add(pressField);
		pressField.setEditable(false);
		pressField.setColumns(10);
		
		panel_4 = new JPanel();
		panel_1.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		txtDetale = new JTextField();
		txtDetale.setText("Detale");
		txtDetale.setEditable(false);
		panel_4.add(txtDetale, BorderLayout.NORTH);
		txtDetale.setColumns(10);
		
		detailField = new JTextField();
		panel_4.add(detailField);
		detailField.setEditable(false);
		detailField.setColumns(10);
		
		panel_5 = new JPanel();
		panel_1.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		txtOpis = new JTextField();
		txtOpis.setText("Opis");
		txtOpis.setEditable(false);
		panel_5.add(txtOpis, BorderLayout.NORTH);
		txtOpis.setColumns(10);
		
		descField = new JTextField();
		panel_5.add(descField);
		descField.setEditable(false);
		descField.setColumns(10);
		
		panel_6 = new JPanel();
		frame.getContentPane().add(panel_6, BorderLayout.NORTH);
		panel_6.setLayout(new GridLayout(0, 4, 0, 0));
		
		txtJakiemiasto = new JTextField();
		txtJakiemiasto.setText("JakiePanstwo");
		txtJakiemiasto.setEditable(false);
		panel_6.add(txtJakiemiasto);
		txtJakiemiasto.setColumns(10);
		
		inCountryFIeld = new JTextField();
		panel_6.add(inCountryFIeld);
		inCountryFIeld.setColumns(10);
		
		txtJakie = new JTextField();
		txtJakie.setText("JakieMiasto");
		txtJakie.setEditable(false);
		panel_6.add(txtJakie);
		txtJakie.setColumns(10);
		
		inCityField = new JTextField();
		panel_6.add(inCityField);
		inCityField.setColumns(10);
		
	
		
		lblUzywajJezykaAngielskiego = new JLabel("");
		panel_6.add(lblUzywajJezykaAngielskiego);
		
		label_1 = new JLabel("");
		panel_6.add(label_1);
		
		label_2 = new JLabel("");
		panel_6.add(label_2);
		
		panel_7 = new JPanel();
		panel_7.setLayout(new GridLayout(0, 1, 0, 0));
		
		
		
		setButton = new JButton("Zatwierdz");
		panel_6.add(setButton);
		 float calv = 273.15f;
		
		 String[] cityString = new String[1];
		 String[] countryString = new String[1];
			final JFXPanel fxPanel = new JFXPanel();
			panel_7.add(fxPanel);
		
		setButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if ((inCityField.getText() != null && inCityField.getText().equals("") == false )) {
					cityString[0] =	inCityField.getText();
					Platform.runLater(() -> {
						WebView webView = new WebView();
						fxPanel.setScene(new Scene(webView));
						webView.getEngine().load("https://en.wikipedia.org/wiki/" + cityString[0] );
						});

				}
				if (((inCountryFIeld.getText() == null || inCountryFIeld.getText().equals("") == true )) 
						|| ((inCityField.getText() == null|| inCityField.getText().equals("") == true ))) {
					countryString[0] = "";
					getCityName().setText("");
					getDetailField().setText("");
					getDescField().setText("");
					getPressField().setText("");
					getTempfield().setText("");
					
					
					
				}
				
			
				if (((inCountryFIeld.getText() != null && inCountryFIeld.getText().equals("") == false )) &&
						((inCityField.getText() != null && inCityField.getText().equals("") == false ))) {
					countryString[0] =	inCountryFIeld.getText();
					Service s = new Service(countryString[0]);
					try {
						
						String weatherJson = s.getWeather(cityString[0]);
						if(!(weatherJson=="error")){
						Json json = new Json();
					    json.setElementType(WeatherIN.class, "weather", Weather2Weather.class);
					    json.setIgnoreUnknownFields(true);
					    
					    WeatherIN test = json.fromJson(WeatherIN.class, weatherJson);
						getCityName().setText(test.getName());
						getDetailField().setText(test.getWeather().get(0).getDescription());
						getDescField().setText(test.getWeather().get(0).getMain());
						getPressField().setText(Float.toString(test.getMainOne().getPressure()));
						getTempfield().setText(Float.toString(test.getMainOne().getTemp()-calv));
						}
						else {
							countryString[0] = "";
							getCityName().setText("");
							getDetailField().setText("");
							getDescField().setText("");
							getPressField().setText("");
							getTempfield().setText("");
						}
					
						
						
						
						
						
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (NoSuchFieldException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (SecurityException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (NullPointerException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					//String tagForCurrency = s.currency.get(countryString[0]);
					
					countCurr.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent event) {
							if ((currInField.getText() != null && currInField.getText().equals("") == false )) {
								
								
								try {
									Service t = new Service(countryString[0]);
									KursKraju.setText(Double.toString(t.getRateFor((currInField.getText()))));
								} catch (MalformedURLException | ClassNotFoundException | NoSuchFieldException
										| SecurityException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								
								
								
							}
						}
					});
					
					
					
					
					
					
					
					}
					
				}
				
				
			
			});
		
		
	
	//	Platform.runLater(() -> {
	//		WebView webView = new WebView();
	//		fxPanel.setScene(new Scene(webView));
	//		webView.getEngine().load("https://pl.wikipedia.org/wiki/" + countryString[0] );
	//		});
		
		frame.getContentPane().add(panel_7, BorderLayout.CENTER);
		
		panel_8 = new JPanel();
		frame.getContentPane().add(panel_8, BorderLayout.WEST);
		GridBagLayout gbl_panel_8 = new GridBagLayout();
		gbl_panel_8.columnWidths = new int[]{0, 0};
		gbl_panel_8.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_8.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_8.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_8.setLayout(gbl_panel_8);
		
		txtKursy = new JTextField();
		txtKursy.setText("Kursy");
		txtKursy.setEditable(false);
		GridBagConstraints gbc_txtKursy = new GridBagConstraints();
		gbc_txtKursy.insets = new Insets(0, 0, 5, 0);
		gbc_txtKursy.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtKursy.gridx = 0;
		gbc_txtKursy.gridy = 0;
		panel_8.add(txtKursy, gbc_txtKursy);
		txtKursy.setColumns(10);
		
		txtWpiszWalute = new JTextField();
		txtWpiszWalute.setText("Wpisz walute");
		txtWpiszWalute.setEditable(false);
		GridBagConstraints gbc_txtWpiszWalute = new GridBagConstraints();
		gbc_txtWpiszWalute.insets = new Insets(0, 0, 5, 0);
		gbc_txtWpiszWalute.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtWpiszWalute.gridx = 0;
		gbc_txtWpiszWalute.gridy = 1;
		panel_8.add(txtWpiszWalute, gbc_txtWpiszWalute);
		txtWpiszWalute.setColumns(10);
		
		currInField = new JTextField();
		GridBagConstraints gbc_currInField = new GridBagConstraints();
		gbc_currInField.insets = new Insets(0, 0, 5, 0);
		gbc_currInField.fill = GridBagConstraints.HORIZONTAL;
		gbc_currInField.gridx = 0;
		gbc_currInField.gridy = 2;
		panel_8.add(currInField, gbc_currInField);
		currInField.setColumns(10);
		
		KursKraju = new JTextField();
		KursKraju.setText("Kurs Kraju");
		KursKraju.setEditable(false);
		GridBagConstraints gbc_KursKraju = new GridBagConstraints();
		gbc_KursKraju.insets = new Insets(0, 0, 5, 0);
		gbc_KursKraju.fill = GridBagConstraints.HORIZONTAL;
		gbc_KursKraju.gridx = 0;
		gbc_KursKraju.gridy = 3;
		panel_8.add(KursKraju, gbc_KursKraju);
		KursKraju.setColumns(10);
		
		outCurrCountry = new JTextField();
		outCurrCountry.setEditable(false);
		GridBagConstraints gbc_outCurrCountry = new GridBagConstraints();
		gbc_outCurrCountry.insets = new Insets(0, 0, 5, 0);
		gbc_outCurrCountry.fill = GridBagConstraints.HORIZONTAL;
		gbc_outCurrCountry.gridx = 0;
		gbc_outCurrCountry.gridy = 4;
		panel_8.add(outCurrCountry, gbc_outCurrCountry);
		outCurrCountry.setColumns(10);
		
		txtKursNbp = new JTextField();
		txtKursNbp.setEditable(false);
		txtKursNbp.setText("Kurs NBP");
		GridBagConstraints gbc_txtKursNbp = new GridBagConstraints();
		gbc_txtKursNbp.insets = new Insets(0, 0, 5, 0);
		gbc_txtKursNbp.anchor = GridBagConstraints.EAST;
		gbc_txtKursNbp.gridx = 0;
		gbc_txtKursNbp.gridy = 5;
		panel_8.add(txtKursNbp, gbc_txtKursNbp);
		txtKursNbp.setColumns(10);
		
		currOutNBP = new JTextField();
		currOutNBP.setEditable(false);
		GridBagConstraints gbc_currOutNBP = new GridBagConstraints();
		gbc_currOutNBP.insets = new Insets(0, 0, 5, 0);
		gbc_currOutNBP.fill = GridBagConstraints.HORIZONTAL;
		gbc_currOutNBP.gridx = 0;
		gbc_currOutNBP.gridy = 6;
		panel_8.add(currOutNBP, gbc_currOutNBP);
		currOutNBP.setColumns(10);
		
		countCurr = new JButton("Licz");
		GridBagConstraints gbc_countCurr = new GridBagConstraints();
		gbc_countCurr.gridx = 0;
		gbc_countCurr.gridy = 7;
		panel_8.add(countCurr, gbc_countCurr);
		
		
		
		
		
		
		panel_9 = new JPanel();
		frame.getContentPane().add(panel_9, BorderLayout.SOUTH);
		panel_9.setLayout(new GridLayout(0, 1, 0, 0));
		
		txtUzywajJezykaAngielskiego = new JTextPane();
		txtUzywajJezykaAngielskiego.setText("Uzywaj jezyka angielskiego. Do wyswietlenia wiki wystarczy miasto. Pogoda wymaga obu pol.");
		txtUzywajJezykaAngielskiego.setEditable(false);
		panel_9.add(txtUzywajJezykaAngielskiego);
		

	//	displayTextField.set
		
		 
		 
	}

	public JPanel getPanel_6() {
		return panel_6;
	}

	public void setPanel_6(JPanel panel_6) {
		this.panel_6 = panel_6;
	}

	public JTextField getTxtJakiemiasto() {
		return txtJakiemiasto;
	}

	public void setTxtJakiemiasto(JTextField txtJakiemiasto) {
		this.txtJakiemiasto = txtJakiemiasto;
	}

	public JTextField getTextField_1() {
		return inCountryFIeld;
	}

	public void setTextField_1(JTextField textField_1) {
		this.inCountryFIeld = textField_1;
	}

	public JTextField getTxtJakie() {
		return txtJakie;
	}

	public void setTxtJakie(JTextField txtJakie) {
		this.txtJakie = txtJakie;
	}

	public JTextField getTextField_3() {
		return inCityField;
	}

	public void setTextField_3(JTextField textField_3) {
		this.inCityField = textField_3;
	}

	public JButton getSetButton() {
		return setButton;
	}

	public void setSetButton(JButton setButton) {
		this.setButton = setButton;
	}

	public JLabel getLabel() {
		return lblUzywajJezykaAngielskiego;
	}

	public void setLabel(JLabel label) {
		this.lblUzywajJezykaAngielskiego = label;
	}

	public JLabel getLabel_1() {
		return label_1;
	}

	public void setLabel_1(JLabel label_1) {
		this.label_1 = label_1;
	}

	public JLabel getLabel_2() {
		return label_2;
	}

	public void setLabel_2(JLabel label_2) {
		this.label_2 = label_2;
	}

	public JPanel getPanel_7() {
		return panel_7;
	}

	public void setPanel_7(JPanel panel_7) {
		this.panel_7 = panel_7;
	}

	public JPanel getPanel_8() {
		return panel_8;
	}

	public void setPanel_8(JPanel panel_8) {
		this.panel_8 = panel_8;
	}

	public JTextField getTxtKursy() {
		return txtKursy;
	}

	public void setTxtKursy(JTextField txtKursy) {
		this.txtKursy = txtKursy;
	}

	public JTextField getTxtWpiszWalute() {
		return txtWpiszWalute;
	}

	public void setTxtWpiszWalute(JTextField txtWpiszWalute) {
		this.txtWpiszWalute = txtWpiszWalute;
	}

	public JTextField getCurrInField() {
		return currInField;
	}

	public void setCurrInField(JTextField currInField) {
		this.currInField = currInField;
	}

	public JTextField getKursKraju() {
		return KursKraju;
	}

	public void setKursKraju(JTextField kursKraju) {
		KursKraju = kursKraju;
	}

	public JTextField getOutCurrCountry() {
		return outCurrCountry;
	}

	public void setOutCurrCountry(JTextField outCurrCountry) {
		this.outCurrCountry = outCurrCountry;
	}

	public JTextField getTxtKursNbp() {
		return txtKursNbp;
	}

	public void setTxtKursNbp(JTextField txtKursNbp) {
		this.txtKursNbp = txtKursNbp;
	}

	public JTextField getCurrOutNBP() {
		return currOutNBP;
	}

	public void setCurrOutNBP(JTextField currOutNBP) {
		this.currOutNBP = currOutNBP;
	}

	public JButton getCountCurr() {
		return countCurr;
	}

	public void setCountCurr(JButton countCurr) {
		this.countCurr = countCurr;
	}
}
