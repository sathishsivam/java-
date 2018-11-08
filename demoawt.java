import java.awt.*;

import java.awt.event.*;

class sample extends Frame implements ActionListener,ItemListener,MouseListener,MouseMotionListener,KeyListener
  {
    Label l1,l2;
    TextField t1,t2;
    TextArea ta;

    Choice ch;	
    Button b1,b2;

    Checkbox c1,c2,c3,c4,c5;

    CheckboxGroup cbg;

    Scrollbar s;

    sample()
	{
	    setLayout(null);

	    setVisible(true);
	    setSize(500,500);

	    l1=new Label("Username");
	    l2=new Label("Password");

	    t1=new TextField();
	    t2=new TextField();

	    Panel p1=new Panel(new GridLayout(1,4));

	    p1.add(l1);
	    p1.add(t1);
	    p1.add(l2);
	    p1.add(t2);

	    add(p1);

	    p1.setBounds(100,120,370,40);

	    b1=new Button("Sign in");

	    add(b1);

	    b1.addActionListener(this);


	    b1.setBounds(180,230,90,40);

	    b1.setBackground(Color.blue);

	    b1.setForeground(Color.white);


	    b2=new Button("Exit");

	    add(b2);

	    b2.addActionListener(this);


	    b2.setBounds(280,230,90,40);

	    b2.setBackground(Color.blue);

	    b2.setForeground(Color.white);



	    ta=new TextArea();

	    add(ta);

	    ta.setBounds(200,300,220,120);

	    ch=new Choice();

	    ch.add("Java");
	    ch.add("Java script");	   
	    ch.add("Python");	 
	    ch.add("HTML");
	    ch.add("HTML5");
	    ch.add("css");

	    add(ch);
	    ch.setBounds(450,300,90,30);

	    ch.addItemListener(this);

	    c1=new Checkbox("Music");
	    c2=new Checkbox("Garden");
	    c3=new Checkbox("Aratai");

	   Panel cpan=new Panel(new GridLayout(1,3));

	  cpan.add(c1);
	  cpan.add(c2);
	  cpan.add(c3);

	  add(cpan);
          cpan.setBounds(500,340,170,40);

	  cbg=new CheckboxGroup();
	 
	  c4=new Checkbox("Male",cbg,true);
	  c5=new Checkbox("Female",cbg,false);
	
	  add(c4);
	  add(c5);

	  c4.setBounds(500,450,70,40);
	  c5.setBounds(580,450,70,40);
	  		    
          setBackground(Color.cyan);		

	   s=new Scrollbar();

	   add(s);
	   s.setBounds(650,600,420,80);

	   addMouseListener(this);

	   addMouseMotionListener(this);

	   addKeyListener(this);

	}

	public void actionPerformed(ActionEvent s)
	{
		if(s.getActionCommand().equals("Sign in"))
		{

	          System.out.println("Action done");
		  System.out.println("Username="+t1.getText());	
		  System.out.println("Password="+t2.getText());

		  ta.setText(t1.getText());
		}

		if(s.getActionCommand().equals("Exit"))
		{
		  System.exit(0);
		}
  	}

	public void itemStateChanged(ItemEvent ss)
	 {
		System.out.println(""+ch.getSelectedItem());

	}

	public void mouseExited(MouseEvent me)
	{
		setBackground(Color.cyan);
		System.out.println("MouseExited");
	}
	public void mouseEntered(MouseEvent me)
	{
		setBackground(Color.pink);
	}
	
	public void mouseReleased(MouseEvent me)
	{

	}
	
	public void mousePressed(MouseEvent me)
	{
	}	

	public void mouseClicked(MouseEvent me)
	{
	}

	public void mouseMoved(MouseEvent me)
	{
		System.out.println("");
		System.out.println("X ="+me.getX());
		System.out.println("Y="+me.getY());
	}
	public void mouseDragged(MouseEvent me)
	{
		
	}

	public void keyReleased(KeyEvent ke)
	{
		
	}

	public void keyPressed(KeyEvent ke)
	{

		System.out.println(""+ke.getKeyCode());

		
	}

	public void keyTyped(KeyEvent ke)
	{
	}


  }


class demoawt
 {
    public static void main(String args[])
	{
	   sample obj=new sample();
	}
 }

