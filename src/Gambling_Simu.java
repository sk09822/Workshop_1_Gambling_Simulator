
public class Gambling_Simu {
	
//Use Case 1
    
    public static final int BET_STAKE = 100;
    public static final int BET_AMT = 1;
    
    //Use Case 2

    public void WinOrLoose(){
        System.out.println("Use Case 2");
        double random_num = Math.random();
        int remaining_amt = BET_STAKE;
        if (random_num>0.5){
            remaining_amt += BET_AMT;
            System.out.println("The Gambler wins the bet and he has $"
            +remaining_amt+ " with him after one bet.");
        }else if (random_num<=0.5){
            remaining_amt -= BET_AMT;
            System.out.println("The Gambler loses the bet and he has $"
            +remaining_amt+ " with him after one bet.");
        } 
    }
    //Use Case 3

    public void dayResign(){

        System.out.println("Use Case 3 Result");
               //Margin = 50%
               double max_margin = BET_STAKE + (0.5*BET_STAKE);
               double min_margin = BET_STAKE - (0.5*BET_STAKE);
               double avail_amt = BET_STAKE;
               while ((avail_amt<max_margin) && (avail_amt>min_margin)){
                       double random_num = Math.random();
                       if (random_num>0.5){
                               avail_amt += BET_AMT;
                       }else if (random_num<=0.5){
                               avail_amt -= BET_AMT;
                       }
               }
               System.out.println("The gambler resigns for the day after he has $"
                       + avail_amt + " with him.");
               return;
               }

    //Use Case 4

    public void forDays(){
        System.out.println("Use Case 4");
       
        int NO_OF_BETS = 100;
        double upper_margin = 0.5*BET_STAKE;
        double lower_margin = -0.5*BET_STAKE;
        double total_amt_won_lost = 0;
        
        for (int i=0;i<20;i++){
            double daily_amt_won_lost = 0;
            int bets_played = 0;
        
            while ((daily_amt_won_lost<upper_margin) && (daily_amt_won_lost>lower_margin)
                    && (bets_played < NO_OF_BETS)){
                double random_num = Math.random();
                bets_played++;
                
                if (random_num>0.5){
                    daily_amt_won_lost += BET_AMT;
                }else if (random_num<=0.5){
                    daily_amt_won_lost -= BET_AMT;
                }
            }
            total_amt_won_lost += daily_amt_won_lost;   
        }
        
     
        if (total_amt_won_lost>0){
            System.out.println("The total amount won in 20 days = "+ total_amt_won_lost);
        }
        else if (total_amt_won_lost==0){
            System.out.println("There is no net gain in last 20 days");
        }
        else if (total_amt_won_lost<0){
            System.out.println("The total amount lost in last 20 days = "+ Math.abs(total_amt_won_lost));
        }
    }
    //Use Case 5

    public void forMonth (){
        System.out.println("Use Case 5");

        int NO_OF_BETS = 100;
        double upper_margin = 0.5*BET_STAKE;
        double lower_margin = -0.5*BET_STAKE;
       
      
        for (int i=1;i<31;i++){
            double daily_amt_won_lost = 0;
            int bets_played = 0;
        
            while ((daily_amt_won_lost<upper_margin) && (daily_amt_won_lost>lower_margin)
                    && (bets_played < NO_OF_BETS)){
                double random_num = Math.random();
                bets_played++;
               
                if (random_num>0.5){
                    daily_amt_won_lost += BET_AMT;
                }else if (random_num<=0.5){
                    daily_amt_won_lost -= BET_AMT;
                }
            }
            
          
            if (daily_amt_won_lost>0){
                System.out.println("The amount won on day "+ i + " = $"+daily_amt_won_lost);
            }
            else if (daily_amt_won_lost==0){
                System.out.println("There is no net gain or loss on day "+ i);
            }
            else if (daily_amt_won_lost<0){
                System.out.println("The amount lost on day "+ i + " = $" + Math.abs(daily_amt_won_lost));
            }
        }
    }
    
   //Use Case 6

public void luckyUnluckyDay(){
    System.out.println("Use Case 6");
        int NO_OF_BETS = 100;
        double upper_margin = 0.5*BET_STAKE;
        double lower_margin = -0.5*BET_STAKE;
        int lucky_day = 0;
        double lucky_day_amt = 0;
        int unluck_day = 0;
        double unlucky_day_amt = 0;        
        
        for (int i=1;i<31;i++){
            double daily_amt_won_lost = 0;
            int bets_played = 0;
            
           
            while ((daily_amt_won_lost<upper_margin) && (daily_amt_won_lost>lower_margin)
                    && (bets_played < NO_OF_BETS)){
                double random_num = Math.random();
                bets_played++;
                
                if (random_num>0.5){
                    daily_amt_won_lost += BET_AMT;
                }else if (random_num<=0.5){
                    daily_amt_won_lost -= BET_AMT;
                }
            }
            
            if (lucky_day_amt<daily_amt_won_lost){
                lucky_day_amt = daily_amt_won_lost;
                lucky_day = i;
            }
            if (unlucky_day_amt>daily_amt_won_lost){
                unlucky_day_amt = daily_amt_won_lost;
                unluck_day = i;
            }
        }
       
            System.out.println("The luckiest day for gambler is "+ lucky_day + 
                    "th day, on which he won $"+lucky_day_amt);
            System.out.println(" And the unluckiest day for gambler is "+ unluck_day + 
                    "th day, on which he lost $"+Math.abs(unlucky_day_amt));
}
    
   //Use Case 7
    
    public void stopGambling(){

        System.out.println("Use Case 7");
        int NO_OF_BETS = 100;
        double upper_margin = 0.5* BET_STAKE;
        double lower_margin = -0.5* BET_STAKE;
        double total_amt_won_lost = 0;
 
       for (int i=1;i<31;i++){
            double daily_amt_won_lost = 0;
            int bets_played = 0;
            
            while ((daily_amt_won_lost<upper_margin) && (daily_amt_won_lost>lower_margin)
                    && (bets_played < NO_OF_BETS)){
                double random_num = Math.random();
                bets_played++;
                
                if (random_num>0.5){
                    daily_amt_won_lost += BET_AMT;
                }else if (random_num<=0.5){
                    daily_amt_won_lost -= BET_AMT;
                }
            }
        
            total_amt_won_lost += daily_amt_won_lost;   
        }
        if (total_amt_won_lost>0){
          
            double random_num1 = Math.random();
             if (random_num1>0.5){
                System.out.println("The gambler has won $"+ total_amt_won_lost+
                        " last month and he should play in this month too");
            } 
             else if (random_num1<=0.5){
                System.out.println("The gambler has won $"+ total_amt_won_lost+
                        " last month and he should stop gambling now.");
            }
        }
             else if (total_amt_won_lost<=0){
                System.out.println("The gambler has lost in last month $" 
                        + Math.abs(total_amt_won_lost)+
                        " and to avoid further losses he should stop playing now.");
        }
    }

    
    public static void main(String []args){
        Gambling_Simu g = new Gambling_Simu();
        g.WinOrLoose();
        g.dayResign();
        g.forDays();
        g.forMonth();
        g.luckyUnluckyDay();
        g.stopGambling();
             
    }
}


