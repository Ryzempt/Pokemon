package pokemon.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListeners;
import pokemon.controller.PokedexController;

public class PokedexPanel extends JPanel
{
private PokedexController app;

private SpringLayout appLayout;

private JButton changeButton;
private JComboBox<String> pokedexDropdown;


private JTextField numberField;
private JTextField nameField;
private JTextField evolveField;
private JTextField attackField;
private JTextField enhancementField;
private JTextField healthField;



private JLabel numberLabel;
private JLabel nameLabel;
private JLabel evolveLabel;
private JLabel enhanceLabel;
private JLabel healthLabel;
private JLabel imageLabel;
private JLabel attackLabel;

private ImageIcon pokemonIcon;


public PokedexPanel(PokedexController app)
{
	super();
	this.app = app;
	
	this.pokemonIcon = new ImageIcon(getClass().getResource("/pokemon/view/images/Ultra Necrozma.png"));
	
	numberField = new JTextField("0");
	nameField = new JTextField("My PokeName");
	evolveField = new JTextField("false");
	attackField = new JTextField("0");
	enhancementField = new JTextField("0");
	healthField = new JTextField("0");
	
	numberLabel = new JLabel("This Pokenumber is ");
	healthLabel = new JLabel("This Pokenumber is");
	evolveLabel = new JLabel("This Pokemon can evolve");
	attackLabel = new JLabel("This Pokemon attack level is");
	enhanceLabel = new JLabel("This pokemone enhancement level is");
	nameLabel = new JLabel("My name is");
	imageLabel = new JLabel("pokemon goes here", pokemonIcon);
	
	changeButton = new JButton("Click here to change the Pokevalues.");
	pokedexDropdown = new JComboBox<String>();	//stub
	
	
	setupPanel();
	setupLayout();
	setupListeners();
	setupDropdown();
	
}

private void setupDropdown()
{
	DefaultComboBoxModel<String> temp = new DefaultComboBoxModel<String>(app.buildPokedexText());
	pokedexDropdown.setModel(temp);
}


private void setupPanel()

{
	this.setLayout(appLayout);
	this.add(changeButton);
	this.add(pokedexDropdown);
	this.add(healthField);
	this.add(numberField);
	this.add(evolveField);
	this.add(enhancementField);
	this.add(attackField);
	this.add(nameField);
	
	this.add(healthLabel);
	this.add(numberLabel);
	this.add(evolveLabel);
	this.add(enhanceLabel);
	this.add(attackLabel);
	this.add(nameLabel);
	this.add(imageLabel);
}

private void setupLayout()
{
	
}

private void setupListeners()
{
	
}


}
