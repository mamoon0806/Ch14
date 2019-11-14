//Qazi Ulhaq 11/14

package edu.seminolestate.studentanalysis;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.chart.*;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import java.text.NumberFormat; 

public class StudentAnalysis extends Application{
	
	NumberFormat nf = NumberFormat.getPercentInstance();
	int width = 500;
	int height = 500;
	
	int freshman = 100;
	int sophomore = 120;
	int junior = 140;
	int senior = 140;
	int graduate = 50;
	
	 public static void main(String[] args) {
	        launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Percent of Students by Class!");
		
		Text title = new Text(50, 50, "Percent of Students by Class");
		title.setFont(new Font("Chiller", 25));
		
		Text fresh = new Text(0, 400, "freshman - " + nf.format((double)freshman/(freshman+sophomore+junior+senior+graduate)));
		fresh.setFont(new Font("Chiller", 15));
		fresh.setFill(Color.RED);
		
		Text soph = new Text(100, 400, "freshman - " + nf.format((double)sophomore/(freshman+sophomore+junior+senior+graduate)));
		soph.setFont(new Font("Chiller", 15));
		soph.setFill(Color.BLUE);
		
		Text jun = new Text(190, 400, "freshman - " + nf.format((double)junior/(freshman+sophomore+junior+senior+graduate)));
		jun.setFont(new Font("Chiller", 15));
		jun.setFill(Color.YELLOW);
		
		Text sen = new Text(280, 400, "freshman - " + nf.format((double)senior/(freshman+sophomore+junior+senior+graduate)));
		sen.setFont(new Font("Chiller", 15));
		sen.setFill(Color.ORANGE);
		
		Text grad = new Text(370, 400, "freshman - " + nf.format((double)graduate/(freshman+sophomore+junior+senior+graduate)));
		grad.setFont(new Font("Chiller", 15));
		grad.setFill(Color.WHITE);
		
		//Slice 1
		Arc arc1 = new Arc(width/2, width/2, height/4, height/4, 0, (((double)freshman/(freshman+sophomore+junior+senior+graduate)) * 360));
	    arc1.setType(ArcType.ROUND);
	    arc1.setFill(Color.RED);
	    
	    //Slice 2
	    Arc arc2 = new Arc(width/2, width/2, height/4, height/4, (((double)freshman/(freshman+sophomore+junior+senior+graduate)) * 360), 
	    		(((double)sophomore/(freshman+sophomore+junior+senior+graduate)) * 360));
	    arc2.setType(ArcType.ROUND);
	    arc2.setFill(Color.BLUE);
	    
	  //Slice 3
	    Arc arc3 = new Arc(width/2, width/2, height/4, height/4, (((double)freshman/(freshman+sophomore+junior+senior+graduate)) * 360 + (((double)sophomore/(freshman+sophomore+junior+senior+graduate)) * 360)), 
	    		(((double)junior/(freshman+sophomore+junior+senior+graduate)) * 360));
	    arc3.setType(ArcType.ROUND);
	    arc3.setFill(Color.YELLOW);
	    
	  //Slice 4
	    Arc arc4 = new Arc(width/2, width/2, height/4, height/4, ((((double)junior/(freshman+sophomore+junior+senior+graduate)) * 360) + ((double)freshman/(freshman+sophomore+junior+senior+graduate)) * 360 + (((double)sophomore/(freshman+sophomore+junior+senior+graduate)) * 360)), 
	    		(((double)senior/(freshman+sophomore+junior+senior+graduate)) * 360));
	    arc4.setType(ArcType.ROUND);
	    arc4.setFill(Color.ORANGE);
	    
	    //Slice 5
	    Arc arc5 = new Arc(width/2, width/2, height/4, height/4, (((double)senior/(freshman+sophomore+junior+senior+graduate)) * 360) + (((double)junior/(freshman+sophomore+junior+senior+graduate)) * 360) + ((double)freshman/(freshman+sophomore+junior+senior+graduate)) * 360 + (((double)sophomore/(freshman+sophomore+junior+senior+graduate)) * 360), 
	    		(((double)graduate/(freshman+sophomore+junior+senior+graduate)) * 360));
	    arc5.setType(ArcType.ROUND);
	    arc5.setFill(Color.WHITE);
	    
		Group root = new Group();
		
		root.getChildren().add(arc1);
		root.getChildren().add(arc2);
		root.getChildren().add(arc3);
		root.getChildren().add(arc4);
		root.getChildren().add(arc5);
		root.getChildren().add(title);
		root.getChildren().add(fresh);
		root.getChildren().add(soph);
		root.getChildren().add(jun);
		root.getChildren().add(sen);
		root.getChildren().add(grad);
		
		
		Scene scene = new Scene(root , width, height);
		
		primaryStage.setScene(scene);
		
		primaryStage.show();
		
	}
	
}
