package application;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import services.Verify;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Verify v=new Verify();
			GridPane g = new GridPane();
			Scene scene = new Scene(g);
			g.setAlignment(Pos.CENTER);
			g.setHgap(10);
			g.setVgap(10);
			g.setMinSize(750, 400);
			Button b1 = new Button("Login");
			Button b2 = new Button("Register");
			g.addRow(0,b1);
			g.addRow(1,b2);			
			
			GridPane g1 = new GridPane();
			Scene scene1 = new Scene(g1);
			g1.setAlignment(Pos.CENTER);
			g1.setHgap(10);
			g1.setVgap(10);
			g1.setMinSize(750, 400);
			Text t2=new Text();
			t2.setText("Enter Details");
			Label l = new Label("Enter Account Name: ");
			Label l1 = new Label("Password");
			TextField tf = new TextField();
			TextField tf1 = new TextField();
			Button b4= new Button("Login");
			Button b3=new Button("Validate");
			TextField c1=new TextField();
			g1.add(t2,0, 0);
			g1.add(l,0,2);
			g1.add(tf,1, 2);
			g1.add(l1,0,3);
			g1.add(tf1,1, 3);
			g1.add(b3,0,5);
			g1.add(b4,1,6);
			g1.add(c1,1,5);
			
			GridPane g2 = new GridPane();
			Scene scene2 = new Scene(g2);
			g2.setAlignment(Pos.CENTER);
			g2.setHgap(10);
			g2.setVgap(10);
			g2.setMinSize(750, 400);
			Text t1=new Text();
			t1.setText("Enter Details");
			Label l2 = new Label("Enter Name: ");
			Label l3 = new Label("Enter Addhaar Number: ");
			Label l4 = new Label("Enter New Password : ");
			Label l5 = new Label("Renter Password: ");
			Label l6 = new Label("Enter Passport Number : ");
			Label l7 = new Label("Enter Vehicle register: ");
			Button b5= new Button("Register");
			Button b6=new Button("Dashboard");
			TextField tf2 = new TextField();
			TextField tf3 = new TextField();
			TextField tf4 = new TextField();
			TextField tf5 = new TextField();
			TextField tf6 = new TextField();
			TextField tf7 = new TextField();
			TextField c2=new TextField();
			g2.add(t1, 0, 0);
			g2.add(l2,0,2);
			g2.add(tf2,1, 2);
			g2.add(l3,0,3);
			g2.add(tf3,1, 3);
			g2.add(l4,0,4);
			g2.add(tf4,1, 4);
			g2.add(l5,0,5);
			g2.add(tf5,1,5);
			g2.add(l6,0,6);
			g2.add(tf6,1, 6);
			g2.add(l7,0,7);
			g2.add(tf7,1,7);
			g2.add(b5,0,8);
			g2.add(c2,1,8);
			g2.add(b6,1,9);
			
			GridPane g3 = new GridPane();
			Scene scene3 = new Scene(g3);
			g3.setAlignment(Pos.CENTER);
			g3.setHgap(10);
			g3.setVgap(10);
			g3.setMinSize(750, 400);
			Text t3=new Text();
			t3.setText("Facilties");
			Button b7= new Button("FIR");
			Button b8= new Button("Passport");
			Button b9= new Button("E-Challan");
			Button b0= new Button("Petitions");
			g3.add(t3, 0, 0);
			g3.add(b7, 0, 2);
			g3.add(b8, 1, 2);
			g3.add(b9, 2, 2);
			g3.add(b0, 3, 2);

			b1.setOnAction(gp->primaryStage.setScene(scene1));
			b2.setOnAction(gp->primaryStage.setScene(scene2));

			EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
	            public void handle(ActionEvent e)
	            {
	            	String a=new String();
	            	String b=new String();
	            	Boolean c;
	            	a=tf.getText();
	            	b=tf1.getText();
	            	c=v.validate(a,b);
	                if(c==true)
	                	c1.setText("Verified");
	                else
	                {
	                	c1.setText("Retry");
	                	tf.clear();
	                	tf1.clear();
	                }
	            }
	        };
	        b3.setOnAction(event);
	        b4.setOnAction(gp->primaryStage.setScene(scene3));
	        
	        EventHandler<ActionEvent> event1 = new EventHandler<ActionEvent>() {
	            public void handle(ActionEvent e)
	            {
	            	String j=new String();
	            	String f=new String();
	            	String h=new String();
	            	String n=new String();
	            	String o=new String();
	            	Boolean i;
	            	j=tf3.getText();
	            	f=tf2.getText();
	            	h=tf5.getText();
	            	n=tf6.getText();
	            	o=tf7.getText();
	            	i=v.validateAd(j,f,h,n,o);
	            	if(i==true)
	                	c2.setText("Registered");
	                else
	                {
	                	c2.setText("Retry");
	                }
	            }
	        };
	        b5.setOnAction(event1);
	        b6.setOnAction(gp->primaryStage.setScene(scene3));
			
	        GridPane g4 = new GridPane();
			Scene scene4 = new Scene(g4);
			g4.setAlignment(Pos.CENTER);
			g4.setHgap(10);
			g4.setVgap(10);
			g4.setMinSize(750, 400);
			Text t4=new Text("FIR");
			Label lb1=new Label("Enter Greivances: ");
			TextArea te1=new TextArea();
			Button bu1 = new Button("Register");
			Button bu7 = new Button("DashBoard");
			g4.add(t4,0,0);
			g4.add(lb1,0,2);
			g4.add(te1, 1, 2);
			g4.add(bu1, 1, 4);
			g4.add(bu7, 2,4);
			bu7.setOnAction(gp->primaryStage.setScene(scene3));
			
			GridPane g5 = new GridPane();
			Scene scene5 = new Scene(g5);
			g5.setAlignment(Pos.CENTER);
			g5.setHgap(10);
			g5.setVgap(10);
			g5.setMinSize(750, 400);
			Text t5=new Text("Passport");
			Label lb2=new Label("Enter Passport Number:");
			TextField te2=new TextField();
			Button bu2 = new Button("Authenticate");
			TextField te5=new TextField();
			Button bu5 = new Button("DashBoard");
			g5.add(t5,0,0);
			g5.add(lb2,0,2);
			g5.add(te2, 1, 2);
			g5.add(bu2, 0, 4);
			g5.add(te5, 1, 4);
			g5.add(bu5, 1, 5);
			bu5.setOnAction(gp->primaryStage.setScene(scene3));
	        
			GridPane g6 = new GridPane();
			Scene scene6 = new Scene(g6);
			g6.setAlignment(Pos.CENTER);
			g6.setHgap(10);
			g6.setVgap(10);
			g6.setMinSize(750, 400);
			Text t6=new Text("E-challan");
			Label lb3=new Label("Enter Vehicle Number:");
			TextField te3=new TextField();
			Button bu3 = new Button("Verify");
			TextField te6=new TextField();
			Button bu6 = new Button("DashBoard");
			g6.add(t6,0,0);
			g6.add(lb3,0,2);
			g6.add(te3, 1, 2);
			g6.add(bu3, 0, 4);
			g6.add(te6, 1, 4);
			g6.add(bu6, 1, 5);
			bu6.setOnAction(gp->primaryStage.setScene(scene3));
			
			GridPane g7 = new GridPane();
			Scene scene7 = new Scene(g7);
			g7.setAlignment(Pos.CENTER);
			g7.setHgap(10);
			g7.setVgap(10);
			g7.setMinSize(750, 400);
			Text t7=new Text("Petition");
			Label lb4=new Label("Enter Petition");
			TextArea te4=new TextArea();
			Button bu4= new Button("Register");
			Button bu8 = new Button("DashBoard");
			g7.add(t7,0,0);
			g7.add(lb4,0,2);
			g7.add(te4, 1, 2);
			g7.add(bu4, 1, 4);
			g7.add(bu8,2,4);
			bu8.setOnAction(gp->primaryStage.setScene(scene3));
			
	        b7.setOnAction(gp->primaryStage.setScene(scene4));
	        b8.setOnAction(gp->primaryStage.setScene(scene5));
	        b9.setOnAction(gp->primaryStage.setScene(scene6));
	        b0.setOnAction(gp->primaryStage.setScene(scene7));
	        
	        EventHandler<ActionEvent> event2 = new EventHandler<ActionEvent>() {
	            public void handle(ActionEvent e)
	            {
	            	String x=new String();
	            	Boolean y;
	            	x=te2.getText();
	            	y=v.Vpass(x);
	            	if(y==true)
	                	te5.setText("Registered");
	                else
	                {
	                	te5.setText("Retry");
	                	te2.clear();
	                }
	            }
	        };
	        bu2.setOnAction(event2);
	        
	        EventHandler<ActionEvent> event3 = new EventHandler<ActionEvent>() {
	            public void handle(ActionEvent e)
	            {
	            	String z=new String();
	            	Boolean m;
	            	z=te3.getText();
	            	m=v.Vchallan(z);
	            	if(m==true)
	                	te6.setText("Registered");
	                else
	                {
	                	te6.setText("Retry");
	                	te3.clear();
	                }
	            }
	        };
	        bu3.setOnAction(event3);
	        
	        FileInputStream input=null;
			try {
				input=new FileInputStream("D:\\EApp2.jpg");
			}
			catch(FileNotFoundException e1) {
				e1.printStackTrace();
			}
	   
			Image image = new Image(input);
			//Creating the image view
			BackgroundImage bg = new BackgroundImage(image,BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
			//Setting image to the image view
			Background back = new Background(bg);
			g.setBackground(back);
			g1.setBackground(back);
			g2.setBackground(back);
			g3.setBackground(back);
			g4.setBackground(back);
			g5.setBackground(back);
			g6.setBackground(back);
			g7.setBackground(back);
			
			
	   
	        
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("ESeva App");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
