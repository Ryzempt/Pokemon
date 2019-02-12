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
private JComboBox pokedexDropdown;


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

public PokedexPanel(PokedexController app)
{
	super();
	this.app = app;
	
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
	imageLabel = new JLabel("pokemon goes here");
	
	setupPanel();
	setupLayout();
	setupListeners();
	
}

private void setupPanel()

{
	
}

private void setupLayout()
{
	
}

private void setupListeners()
{
	
}

}
